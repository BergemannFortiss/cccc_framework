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
package org.fortiss.consistency.checking.evaluators;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.fortiss.consistency.exceptions.EvaluatorException;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.views.ClassFeature;

/**
 * Interface that is used within the consistency process to evaluate rules (whether given model
 * elements fulfill them).
 * 
 * @author bergemann
 */
public interface IRuleEvaluator {

	/**
	 * Sets up the evaluator environment so that the evaluator can be used as wanted. This is done
	 * once in the beginning when the consistency process is started.
	 */
	public void performInitialSetup();

	/** Disposes the current evaluator instance. */
	public void dispose();

	/**
	 * Creates an internal rule expression for the evaluator that it will use from then on when
	 * other evaluator methods need to operate on a rule until this method is called again. The
	 * creation is based on the original rule expression {@link String} given via the
	 * {@link ConsistencyRule}. If this {@link String} must be modified before parsing it into the
	 * actual expression object, this method will do this and set the corresponding entry of the
	 * given {@link ConsistencyRule}.
	 * 
	 * @param rule
	 *            The {@link ConsistencyRule} that contains all the information for parsing the rule
	 *            expression.
	 * @throws EvaluatorException
	 *             If no expression could be created/parsed.
	 */
	public void setRuleExpression(ConsistencyRule rule) throws EvaluatorException;

	/**
	 * Evaluate whether the current rule (that should be created/parsed previously) is satisfied by
	 * a given context object.
	 * 
	 * @param contextObject
	 *            The context object that should fulfill/satisfy the current rule expression.
	 * @return The result of the evaluation. True if the contextObject fulfills the rule, otherwise
	 *         false.
	 * @throws EvaluatorException
	 *             If the context object could not be evaluated on the current rule.
	 */
	public boolean evaluateCurrentRule(EObject contextObject) throws EvaluatorException;

	/**
	 * Extracts all {@link ClassFeature}s from the current rule (that should be created/parsed
	 * previously), i.e., all features (attributes, references) that are used/needed for the used
	 * object classes in the rule expression.
	 * 
	 * @return List of {@link ClassFeature}s needed in the current rule expression.
	 * @throws EvaluatorException
	 *             If no class features can be extracted from the current rule.
	 * @throws ClassNotFoundException
	 *             If a class is missing.
	 */
	public List<ClassFeature> getClassFeaturesFromCurrentRule()
			throws EvaluatorException, ClassNotFoundException;

	/**
	 * Returns the name of the implemented evaluator. This is mainly used as identifier within
	 * exception messages.
	 * 
	 * @return The name of the rule evaluator.
	 */
	public String getEvaluatorName();
}
