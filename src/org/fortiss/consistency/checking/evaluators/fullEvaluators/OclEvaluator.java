/*-------------------------------------------------------------------------+
| Copyright 2024 fortiss GmbH                                              |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+--------------------------------------------------------------------------*/
package org.fortiss.consistency.checking.evaluators.fullEvaluators;

import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createClassFeatureBasedOnName;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createContextWrapperDummy;
import static org.fortiss.consistency.utils.ConsistencyUtils.getAllRuleElementsOfRule;
import static org.fortiss.consistency.utils.ConsistencyUtils.getClassFromString;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Package;
import org.eclipse.ocl.pivot.PropertyCallExp;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.fortiss.consistency.checking.evaluators.BaseRuleEvaluator;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.EvaluatorException;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ContextWrapper;
import org.fortiss.consistency.model.RuleCondition;
import org.fortiss.consistency.model.RuleElement;
import org.fortiss.consistency.model.views.ClassFeature;

/**
 * A class implementing an OCL rule evaluator based on the existing rule evaluator interface and
 * the base class of it. It used the Eclipse OCL library to be able to evaluate consistency rules
 * whose conditions are written in OCL format.
 *
 * @author bergemann
 */
public class OclEvaluator extends BaseRuleEvaluator {

	/** The (display) name of the evaluator. */
	private static final String OCL_EVALUATOR_NAME = "OCL Evaluator";

	/**
	 * The character(s) that are used to declare a identifier of an element inside a consistency
	 * rule (by placing them in front and after the identifier).
	 */
	private static final String IDENTIFIER_LIMITERS_IN_RULES = "#";

	/** The created OCL instance in which the evaluation can be executed. */
	private final OCL oclInstance;

	/** The current OCL expression for a consistency rule (used when the evaluation is called). */
	private ExpressionInOCL oclExpression;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class,
	 *            especially the available metamodels.
	 */
	public OclEvaluator(ConsistencyConfiguration config) {
		super(config);

		EPackage.Registry packageRegistry = new EPackageRegistryImpl();
		for(EPackage metamodelPackage : availableMetamodels) {
			packageRegistry.put(metamodelPackage.getNsURI(), metamodelPackage);
		}

		// It is also possible to create an OCL instance by replacing "packageRegistry" with
		// "org.eclipse.ocl.pivot.resource.ProjectManager.CLASS_PATH". In this case, OCL would
		// register everything itself by taking all found metamodels/types/classes from the official
		// class path. However, as long as the creation with the own registry works, it is faster to
		// use this reduced instantiation.
		oclInstance = OCL.newInstance(packageRegistry);
		oclExpression = null;

		// Add all given metamodels to the OCL environment as Pivot Packages to be able to resolve
		// later names of their classes within OCL Pivot methods. This could also have been done
		// indirectly by executing "oclInstance.createOCLHelper(metamodelPackage);".
		MetamodelManager metaModelManager = oclInstance.getMetamodelManager();
		for(EPackage metamodelPackage : availableMetamodels) {
			try {
				metaModelManager.getASOfEcore(Package.class, metamodelPackage);
			} catch(Exception e) {
				config.logError("It was not possible to parse the meta model package '" +
						metamodelPackage.getName() +
						"' as OCL Pivot Package, which is why this meta model and all of" +
						" its classes cannot be resolved by the current OCL environment!" +
						"\nOriginal error message:\n" + e.getMessage());
			}
		}
	}

	/**
	 * This is a dummy constructor that does not need anything but also does not set up or do
	 * anything. It should only be used to get quickly a dummy OCL evaluator instance to perform the
	 * setup task.
	 */
	public OclEvaluator() {
		super(null);
		oclInstance = null;
	}

	/** {@inheritDoc} */
	@Override
	public String getEvaluatorName() {
		return OCL_EVALUATOR_NAME;
	}

	/** {@inheritDoc} */
	@Override
	public void performInitialSetup() {
		EssentialOCLStandaloneSetup.doSetup();
	}

	/** {@inheritDoc} */
	@Override
	public void dispose() {
		oclInstance.dispose();
	}

	/** {@inheritDoc} */
	@Override
	public void setRuleExpression(ConsistencyRule rule) throws EvaluatorException {
		RuleCondition condition = rule.getRuleCondition();
		String modifiedRuleExpression = condition.getOriginalExpression();
		List<RuleElement> ruleElements = getAllRuleElementsOfRule(rule);
		for(RuleElement ruleElement : ruleElements) {
			String identifier = ruleElement.getNameInRule();
			Class<?> elementClass;
			try {
				elementClass = getJavaClass(ruleElement.getElementClassString());
			} catch(ClassNotFoundException e) {
				throw createStandardEvaluatorException("the creation of a (parsed) rule expression",
						"--> This class could not be found: " +
								ruleElement.getElementClassString());
			}
			modifiedRuleExpression = getRuleExpressionWithCorrectIdentifierAndTypes(
					modifiedRuleExpression, identifier, elementClass);
		}
		condition.setModifiedExpression(modifiedRuleExpression);
		currentRule = rule;
		ContextWrapper context = createContextWrapperDummy();
		try {
			oclExpression = oclInstance.createInvariant(context.eClass(), modifiedRuleExpression);
		} catch(Exception e) {
			throw createStandardEvaluatorException("the creation of a (parsed) rule expression",
					"--> Original OCL exception:\n" + e.getClass().getName() + ": " +
							e.getMessage());
		}
	}

	/**
	 * Returns the given rule expression in a modified way so that it can be parsed to an OCL
	 * expression.
	 */
	private String getRuleExpressionWithCorrectIdentifierAndTypes(String ruleExpression,
			String identifier, Class<?> elementClass) {
		String packagePath = elementClass.getPackageName();
		String reducedPackageName = packagePath.substring(packagePath.lastIndexOf('.') + 1);
		String oclType = reducedPackageName + "::" + elementClass.getSimpleName();
		return ruleExpression.replaceAll(
				IDENTIFIER_LIMITERS_IN_RULES + identifier + IDENTIFIER_LIMITERS_IN_RULES,
				"self.contextElements.at('" + identifier + "').oclAsType(" + oclType + ")");
	}

	/** {@inheritDoc} */
	@Override
	public boolean evaluateCurrentRule(EObject contextObject) throws EvaluatorException {
		if(oclExpression == null) {
			throw createStandardEvaluatorException("the evaluation of a rule expression",
					"--> Cause: The OCL evaluator was asked to evaluate a context object on the currently existing rule, but no rule was created/parse until now for this evaluator instance.");
		}
		try {
			return oclInstance.check(contextObject, oclExpression);
		} catch(Exception e) {
			throw createStandardEvaluatorExceptionWithExpressionInfo(
					"the evaluation of a rule expression", contextObject,
					"--> Original OCL exception:\n" + e.getMessage());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @throws ClassNotFoundException
	 */
	@Override
	public List<ClassFeature> getClassFeaturesFromCurrentRule()
			throws EvaluatorException, ClassNotFoundException {
		String action = "the extraction of class features from a rule";
		if(oclExpression == null || currentRule == null) {
			throw createStandardEvaluatorException(action,
					"--> Cause: The OCL evaluator was asked to extract class features from a rule, but no rule was created/parse until now for this evaluator instance.");
		}

		List<ClassFeature> classFeatures = new ArrayList<>();

		oclExpression.allOwnedElements();
		for(Element element : oclExpression.allOwnedElements()) {
			if(element instanceof PropertyCallExp &&
					((PropertyCallExp)element).getName() != "contextElements") {
				PropertyCallExp prop = (PropertyCallExp)element;
				String featureName = prop.getName();

				Type owningType = prop.getSpecializedReferredPropertyOwningType();
				String owningTypeFullName = getFullTypeName(owningType);

				ClassFeature classFeature = createClassFeatureBasedOnName(featureName,
						owningTypeFullName, super.availableMetamodels);
				boolean classFeatureAlreadyExists = false;
				for(ClassFeature existentClassFeature : classFeatures) {
					if(areSameClassFeatures(existentClassFeature, classFeature)) {
						classFeatureAlreadyExists = true;
					}
				}
				if(!classFeatureAlreadyExists) {
					classFeatures.add(classFeature);
				}
			}
		}

		return classFeatures;
	}

	/**
	 * Evaluates if both given class features are identical based on their attributes, even if they
	 * are not the identical object.
	 * 
	 * @param feature1
	 *            First class features that should be compared.
	 * @param feature2
	 *            Second class features that should be compared.
	 * 
	 * @return True if both class features are identical.
	 */
	private boolean areSameClassFeatures(ClassFeature feature1, ClassFeature feature2) {
		return feature1.getFeatureName().equals(feature2.getFeatureName()) &&
				feature1.getFeatureClassString().equals(feature2.getFeatureClassString()) &&
				feature1.getOwningClassString().equals(feature2.getOwningClassString()) &&
				!(feature1.isIsReference() ^ feature2.isIsReference());
	}

	/**
	 * Returns the full name of the given type, including its whole package path.
	 * 
	 * @param type
	 *            The type of which the full name is wanted.
	 * 
	 * @return The full type name.
	 * 
	 * @throws ClassNotFoundException
	 */
	private String getFullTypeName(Type type) throws ClassNotFoundException {
		String typeName = type.getName();
		EObject typeContainer = type.eContainer();
		if(typeContainer instanceof Package) {
			Package pack = (Package)typeContainer;
			String packageName = pack.getName();
			String packageNsPrefix = pack.getNsPrefix();
			String typePackageName = "";
			if(packageNsPrefix.endsWith(packageName)) {
				typePackageName = pack.getNsPrefix();
			} else {
				typePackageName = getJavaClass(packageName).getCanonicalName();
			}
			String delimitier = ".";
			typeName = String.join(delimitier, typePackageName, typeName);
		}
		return typeName;
	}

	/**
	 * Returns the Java class corresponding to the OCL type/class given via its name.
	 * 
	 * @param oclClassName
	 *            The name of the OCL type/class for which the Java class should be found.
	 * 
	 * @return The found Java class for the given OCL class name.
	 * 
	 * @throws ClassNotFoundException
	 */
	private Class<?> getJavaClass(String oclClassName) throws ClassNotFoundException {
		// OCL uses "Real" as (class) name for Double
		if(oclClassName.equals("Real")) {
			oclClassName = "Double";
		}
		return getClassFromString(oclClassName, super.availableMetamodels);
	}
}
