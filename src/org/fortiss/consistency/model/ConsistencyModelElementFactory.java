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
package org.fortiss.consistency.model;

import static org.eclipse.emf.ecore.util.EcoreUtil.generateUUID;
import static org.fortiss.consistency.model.ConsistencyViolationType.BLOCKED_ACCESS;
import static org.fortiss.consistency.model.ConsistencyViolationType.EXPERIENCED_EXCEPTION;
import static org.fortiss.consistency.model.ConsistencyViolationType.FOUND_INCONSISTENCY;
import static org.fortiss.consistency.utils.ConsistencyUtils.getClassifierByName;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.fortiss.consistency.model.communication.CommunicationFactory;
import org.fortiss.consistency.model.communication.ModelDataFeedback;
import org.fortiss.consistency.model.communication.ModelDataRequest;
import org.fortiss.consistency.model.communication.RequestFulfillment;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.fortiss.consistency.model.communication.TriggerFeedback;
import org.fortiss.consistency.model.communication.TriggerRequest;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserDetailedInformation;
import org.fortiss.consistency.model.communication.UserHiddenInformation;
import org.fortiss.consistency.model.communication.UserInitialInformation;
import org.fortiss.consistency.model.communication.UserToken;
import org.fortiss.consistency.model.views.ClassFeature;
import org.fortiss.consistency.model.views.ConsistencyView;
import org.fortiss.consistency.model.views.ConsistencyViewtype;
import org.fortiss.consistency.model.views.ViewsFactory;

/**
 * This class provides the creation methods for all custom elements related to consistency
 * (checking). So to speak, it is a factory for all element types of the consistency metamodel
 * defined for this consistency checking instance.
 * In addition, it contains also support generation methods for IDs, tokens, etc.
 * 
 * @author bergemann
 */
public class ConsistencyModelElementFactory {

	/** A cryptographically strong random number generator. */
	private static final SecureRandom SECURE_RANDOM = new SecureRandom();
	/** An encoder for Base64 encoding. */
	private static final Base64.Encoder BASE_64_ENCODER = Base64.getUrlEncoder();

	/**
	 * Generates a UUID that is usable for consistency elements.
	 * 
	 * @return The generated UUID as string.
	 */
	public static String generateConsistencyUUID() {
		String uuid = generateUUID();
		// "-" might be used later as separator --> replace it with random char.
		Random randomStream = new Random();
		char replacementCharacter = (char)(randomStream.nextInt(26) + 'a');
		return uuid.replace('-', replacementCharacter);
	}

	/**
	 * Generates a unique identifier based on the given element information so that each element
	 * (with this information) can safely be identified and distinguished from others.
	 *
	 * @param info
	 *            The information about the element used for the identifier.
	 * @return The generated unique identifier as string.
	 */
	public static String generateUniqueIdentifierBasedOnElemInfo(BasicElementInformation info) {
		return info.getSourceTool() + "#" + info.getSourceModel() + "#" + info.getElementId() +
				"#" + info.getElementName();
	}

	/**
	 * Generates a string token based on an random number generator and encoded with Base64.
	 * 
	 * @return The generated token.
	 */
	public static String generateToken() {
		byte[] randomBytes = new byte[24];
		SECURE_RANDOM.nextBytes(randomBytes);
		return BASE_64_ENCODER.encodeToString(randomBytes);
	}

	/**
	 * Creates a {@link UserToken} with the given token as {@link String}.
	 * 
	 * @param userToken
	 *            The user token as {@link String}.
	 * @return The user token element.
	 */
	public static UserToken createUserToken(String userToken) {
		UserToken token = CommunicationFactory.eINSTANCE.createUserToken();
		token.setToken(userToken);
		return token;
	}

	/**
	 * Creates a {@link ConsistencyRule} with a UUID.
	 *
	 * @return The created rule.
	 */
	public static ConsistencyRule createConsistencyRule() {
		ConsistencyRule rule = ConsistencyFactory.eINSTANCE.createConsistencyRule();
		rule.setUuid(generateConsistencyUUID());
		return rule;
	}

	/**
	 * Creates a {@link ConsistencyRule} with a UUID and a given name and comment.
	 * 
	 * @param name
	 *            The wanted name for the rule.
	 * @param comment
	 *            The wanted comment for the rule (can just be an empty string).
	 *
	 * @return The created rule.
	 */
	public static ConsistencyRule createConsistencyRule(String name, String comment) {
		ConsistencyRule rule = createConsistencyRule();
		rule.setName(name);
		rule.setComment(comment);
		return rule;
	}

	/**
	 * Creates a {@link ConsistencyRule} with all possible attributes added.
	 * 
	 * @param name
	 *            The wanted name for the rule.
	 * @param comment
	 *            The wanted comment for the rule (can just be an empty string).
	 * @param scopeClassStrings
	 *            All the classes that represent the scope of this rule (as strings).
	 * @param contextCases
	 *            Each context case for this rule.
	 * @param ruleCondition
	 *            The condition of the rule.
	 * @param confidentialityStatus
	 *            The confidentiality status of the rule if it exists.
	 *
	 * @return The created rule.
	 */
	public static ConsistencyRule createConsistencyRule(String name, String comment,
			List<String> scopeClassStrings, List<AbstractElementRelation> contextCases,
			String ruleCondition, ConfidentialityStatus confidentialityStatus) {
		ConsistencyRule rule = createConsistencyRule(name, comment);
		rule.getRuleScope().addAll(scopeClassStrings);
		rule.getRuleContext().addAll(contextCases);
		rule.setRuleCondition(createRuleCondition(ruleCondition));
		rule.setConfidentialityStatus(confidentialityStatus);
		return rule;
	}

	/**
	 * Creates a {@link RuleCondition} with a given expression (as {@link String}). The expression
	 * will be set at first for both attributes; originalExpression and setModifiedExpression. If
	 * one of them should be different, this can be changed after creation.
	 * 
	 * @param expression
	 *            The rule condition expression as string.
	 *
	 * @return The created rule condition.
	 */
	public static RuleCondition createRuleCondition(String expression) {
		RuleCondition condition = ConsistencyFactory.eINSTANCE.createRuleCondition();
		condition.setOriginalExpression(expression);
		condition.setModifiedExpression(expression);
		return condition;
	}

	/**
	 * Creates a {@link AbstractElementRelation} with a given source element and at least one target
	 * element. The relation points from the source to the target(s).
	 * 
	 * @param sourceElement
	 *            The source element of this relation.
	 * @param targetElements
	 *            The target element(s) of this relation.
	 *
	 * @return The created relation.
	 */
	public static AbstractElementRelation createAbstractElementRelation(RuleElement sourceElement,
			List<RuleElement> targetElements) {
		AbstractElementRelation relation =
				ConsistencyFactory.eINSTANCE.createAbstractElementRelation();
		relation.setSourceElement(sourceElement);
		relation.getTargetElements().addAll(targetElements);
		return relation;
	}

	/**
	 * Creates a {@link RuleElement} with the given name/identifier in its rule and its class (given
	 * as {@link String}).
	 * 
	 * @param nameInRule
	 *            The name/identifier of the element inside its rule.
	 * @param elementClassString
	 *            The class of the element as string.
	 * @return The created rule element.
	 */
	public static RuleElement createRuleElement(String nameInRule, String elementClassString) {
		RuleElement element = ConsistencyFactory.eINSTANCE.createRuleElement();
		element.setNameInRule(nameInRule);
		element.setElementClassString(elementClassString);
		return element;
	}

	/**
	 * Creates a {@link ConsistencyViewtype} with a given name and a given map of its containing
	 * classes (given as {@link String}) to all of their selected class features.
	 * This class features in the map are given as normal {@link List}.
	 * 
	 * @param classMap
	 *            The map of the classes to their class features.
	 * @param name
	 *            The name of the viewtype.
	 * @return The created viewtype.
	 */
	public static ConsistencyViewtype createConsistencyViewtypeWithLists(
			Map<String, List<ClassFeature>> classMap, String name) {
		Map<String, EList<ClassFeature>> transformedMap = new HashMap<>();
		for(String key : classMap.keySet()) {
			List<ClassFeature> value = classMap.get(key);
			EList<ClassFeature> transformedValue = new BasicEList<>(value);
			transformedMap.put(key, transformedValue);
		}
		return createConsistencyViewtypeWithELists(transformedMap, name);
	}

	/**
	 * Creates a {@link ConsistencyViewtype} with a given name and a given map of its containing
	 * classes (given as {@link String}) to all of their selected class features.
	 * This class features in the map are given as {@link EList}.
	 * 
	 * @param classMap
	 *            The map of the classes to their class features.
	 * @param name
	 *            The name of the viewtype.
	 * @return The created viewtype.
	 */
	public static ConsistencyViewtype createConsistencyViewtypeWithELists(
			Map<String, EList<ClassFeature>> classMap, String name) {
		ConsistencyViewtype viewtype = ViewsFactory.eINSTANCE.createConsistencyViewtype();
		viewtype.setUuid(generateConsistencyUUID());
		viewtype.setName(name);
		viewtype.getContainedClasses().putAll(classMap);
		return viewtype;
	}

	/**
	 * Creates a {@link ConsistencyView} with a given name and a given list of EObject that the view
	 * contains.
	 * 
	 * @param viewContent
	 *            The view content, i.e., the viewable model elements.
	 * @param name
	 *            The name of the view.
	 * @return The created view.
	 */
	public static ConsistencyView createConsistencyView(List<EObject> viewContent, String name) {
		ConsistencyView view = ViewsFactory.eINSTANCE.createConsistencyView();
		view.setUuid(generateConsistencyUUID());
		view.setName(name);
		view.getContent().addAll(viewContent);
		return view;
	}

	/**
	 * Creates a {@link ConsistencyViolation} based on all of its possible attributes and referenes
	 * given, which is its name, its type, an explanation of the type, its violated rule, its cause,
	 * and the used context data.
	 * 
	 * @param violationName
	 *            The name of the violation.
	 * @param type
	 *            The type of the violation.
	 * @param typeExplanation
	 *            An explanation of the violation type.
	 * @param rule
	 *            The violated rule.
	 * @param cause
	 *            The cause of the violation.
	 * @param usedData
	 *            The used context data causing the violation.
	 * @return The created violation.
	 */
	public static ConsistencyViolation createFullConsistencyViolation(String violationName,
			ConsistencyViolationType type, String typeExplanation, ConsistencyRule rule,
			String cause, ContextWrapper usedData) {
		ConsistencyViolation violation = ConsistencyFactory.eINSTANCE.createConsistencyViolation();
		violation.setName(violationName);
		violation.setViolationType(type);
		violation.setViolationTypeExplanation(typeExplanation);
		violation.setViolatedRule(rule);
		violation.setCause(cause);
		violation.setUsedContextData(usedData);
		return violation;
	}

	/**
	 * Creates a {@link ConsistencyViolation} due to an inconsistency with a given name, violated
	 * rule, cause, and used context data.
	 * 
	 * @param violationName
	 *            The name of the violation.
	 * @param rule
	 *            The violated rule.
	 * @param cause
	 *            The cause of the violation.
	 * @param usedData
	 *            The used context data causing the violation.
	 * @return The created violation.
	 */
	public static ConsistencyViolation createInconsistencyViolation(String violationName,
			ConsistencyRule rule, String cause, ContextWrapper usedData) {
		ConsistencyViolationType type = FOUND_INCONSISTENCY;
		String explanation =
				"This violation is given because an inconsistency was found for the given rule" +
						" (representing a specific consistency relation) when evaluated on the given model element.";
		ConsistencyViolation violation = createFullConsistencyViolation(violationName, type,
				explanation, rule, cause, usedData);
		return violation;
	}

	/**
	 * Creates a {@link ConsistencyViolation} due to an exception with a given name, violated rule,
	 * and cause.
	 * 
	 * @param violationName
	 *            The name of the violation.
	 * @param rule
	 *            The violated rule.
	 * @param cause
	 *            The cause of the violation.
	 * @return The created violation.
	 */
	public static ConsistencyViolation createExceptionViolation(String violationName,
			ConsistencyRule rule, String cause) {
		ConsistencyViolationType type = EXPERIENCED_EXCEPTION;
		String explanation =
				"This violation does not mean that there is an inconsistency but it can also not" +
						" be guaranteed that there is not an inconsistency, because during the" +
						" consistency checking process of this specific given rule on the given" +
						" model element an exception occured that prevented a succesful checking." +
						" A final consistency evaluation can therefore not be given.";
		ConsistencyViolation violation =
				createFullConsistencyViolation(violationName, type, explanation, rule, cause, null);
		return violation;
	}

	/**
	 * Creates a {@link ConsistencyViolation} due to a blocked authorization with a given name,
	 * violated rule, and cause.
	 * 
	 * @param violationName
	 *            The name of the violation.
	 * @param rule
	 *            The violated rule.
	 * @param cause
	 *            The cause of the violation.
	 * @return The created violation.
	 */
	public static ConsistencyViolation createBlockedViolation(String violationName,
			ConsistencyRule rule, String cause) {
		ConsistencyViolationType type = BLOCKED_ACCESS;
		String explanation =
				"This violation means that the requester is not authorized to get feedback on the" +
						" status of a related rule on the requested model element(s)." +
						" A final consistency evaluation can and should therefore not be given.";
		ConsistencyViolation violation =
				createFullConsistencyViolation(violationName, type, explanation, rule, cause, null);
		return violation;
	}

	/**
	 * Creates a {@link BasicElementInformation} with all of its needed attributes given.
	 * 
	 * @param elementClass
	 *            The class if the element.
	 * @param elementName
	 *            The name of the element.
	 * @param elementId
	 *            The ID of the element.
	 * @param sourceModel
	 *            The model containing the element.
	 * @param sourceTool
	 *            The tool used for the model containing the element.
	 * @return The created element information.
	 */
	public static BasicElementInformation createFullBasicElementInformation(String elementClass,
			String elementName, String elementId, String sourceModel, String sourceTool) {
		BasicElementInformation info = ConsistencyFactory.eINSTANCE.createBasicElementInformation();
		info.setElementClassString(elementClass);
		info.setElementName(elementName);
		info.setElementId(elementId);
		info.setSourceModel(sourceModel);
		info.setSourceTool(sourceTool);
		return info;
	}

	/**
	 * Creates a {@link RelationTargetInformation} with all of its needed attributes given.
	 * 
	 * @param elementInfo
	 *            The basic information about the element.
	 * @param relationType
	 *            The type of the relation.
	 * @param relationComment
	 *            A comment about the relation.
	 * @return The created relation information.
	 */
	public static RelationTargetInformation createRelationTargetInformation(
			BasicElementInformation elementInfo, String relationType, String relationComment) {
		RelationTargetInformation info =
				ConsistencyFactory.eINSTANCE.createRelationTargetInformation();
		info.setBasicInformation(elementInfo);
		info.setRelationType(relationType);
		info.setRelationComment(relationComment);
		return info;
	}

	/**
	 * Creates a {@link ContextWrapper} with a given map of context element identifier (given as
	 * {@link String}) to element (given as {@link EObject}).
	 * 
	 * @param contextElements
	 *            All context elements.
	 * @return The created context wrapper.
	 */
	public static ContextWrapper createContextWrapper(Map<String, EObject> contextElements) {
		ContextWrapper wrapper = ConsistencyFactory.eINSTANCE.createContextWrapper();
		wrapper.getContextElements().putAll(contextElements);
		return wrapper;
	}

	/**
	 * Creates a {@link ContextWrapper} without any internal information/data. Can be used as dummy.
	 * 
	 * @return The created context wrapper.
	 */
	public static ContextWrapper createContextWrapperDummy() {
		return ConsistencyFactory.eINSTANCE.createContextWrapper();
	}

	/**
	 * Creates a {@link ClassFeature} with all of its needed attributes given.
	 * 
	 * @param featureName
	 *            The name of the class feature.
	 * @param featureClassString
	 *            The class of the feature (of the attribute or reference).
	 * @param isReference
	 *            The flag whether it is a reference (or otherwise an attribute).
	 * @param owningClassString
	 *            The class owning the feature.
	 * @return The created class feature.
	 */
	public static ClassFeature createClassFeature(String featureName, String featureClassString,
			boolean isReference, String owningClassString) {
		ClassFeature attribute = ViewsFactory.eINSTANCE.createClassFeature();
		attribute.setFeatureName(featureName);
		attribute.setFeatureClassString(featureClassString);
		attribute.setIsReference(isReference);
		attribute.setOwningClassString(owningClassString);
		return attribute;
	}

	/**
	 * Creates a {@link ClassFeature} based on the given name and the available metamodels. If the
	 * wanted class feature could be found inside the given metamodels (with the help of its given
	 * name), it will be turned into a {@link ClassFeature} and returned, otherwise null will be
	 * returned.
	 * 
	 * @param featureName
	 *            The name of the class feature.
	 * @param owningClassString
	 *            The class owning the feature.
	 * @param availableMetaModels
	 *            All metamodels in which the class feature should be searched.
	 * @return The created class feature.
	 */
	public static ClassFeature createClassFeatureBasedOnName(String featureName,
			String owningClassString, List<EPackage> availableMetaModels) {
		if(availableMetaModels != null) {
			EClassifier classifier = getClassifierByName(owningClassString, availableMetaModels);
			if(classifier != null) {
				EClass metaClass = (EClass)classifier;
				EStructuralFeature wantedFeature = metaClass.getEStructuralFeature(featureName);
				if(wantedFeature != null) {
					String featureClassString =
							wantedFeature.getEType().getInstanceClass().getName();
					boolean isReference = false;
					if(wantedFeature instanceof EReference) {
						isReference = true;
					}
					return createClassFeature(featureName, featureClassString, isReference,
							owningClassString);
				}
			}
		}
		return null;
	}

	/**
	 * Creates a {@link ModelDataRequest} with all of its needed attributes given.
	 * 
	 * @param viewtype
	 *            The viewtype for the request.
	 * @param neededElementsInfo
	 *            The information about the requested elements.
	 * @param targetedAdapter
	 *            The adapter to which the request should be sent.
	 * @param requestingUser
	 *            The user who is causing the request.
	 * @return The created data request container.
	 */
	public static ModelDataRequest createModelDataRequest(ConsistencyViewtype viewtype,
			List<BasicElementInformation> neededElementsInfo, String targetedAdapter,
			UserDetailedInformation requestingUser) {
		ModelDataRequest request = CommunicationFactory.eINSTANCE.createModelDataRequest();
		request.setRequestIdentifier(generateConsistencyUUID());
		request.setTargetedAdapter(targetedAdapter);
		request.setViewtype(viewtype);
		request.getNeededElementsInfo().addAll(neededElementsInfo);
		request.setUser(requestingUser);
		return request;
	}

	/**
	 * Creates a {@link ModelDataFeedback} with all of its needed attributes given.
	 * 
	 * @param levelOfRequestFulfillment
	 *            How much the request was fulfilled.
	 * @param providedDataView
	 *            The provided data wrapped as view.
	 * @return The created data feedback container.
	 */
	public static ModelDataFeedback createModelDataFeedback(
			RequestFulfillment levelOfRequestFulfillment, ConsistencyView providedDataView) {
		ModelDataFeedback feedback = CommunicationFactory.eINSTANCE.createModelDataFeedback();
		feedback.setRequestFulfillment(levelOfRequestFulfillment);
		feedback.setProvidedData(providedDataView);
		return feedback;
	}

	/**
	 * Creates a {@link TriggerRequest} with all of its needed attributes given.
	 * 
	 * @param checkElementsInfo
	 *            Information about the elements that should be used as starting point for the
	 *            checks, e.g., elements that have changed.
	 * @param sourceIdentifier
	 *            The adapter from which the request is sent.
	 * @param requestingUser
	 *            The user who is causing the request.
	 * @return The created trigger request container.
	 */
	public static TriggerRequest createTriggerRequest(
			List<BasicElementInformation> checkElementsInfo, String sourceIdentifier,
			UserInitialInformation requestingUser) {
		TriggerRequest request = CommunicationFactory.eINSTANCE.createTriggerRequest();
		request.setAdapterIdentifier(sourceIdentifier);
		request.setUser(requestingUser);
		request.getElementsToBeCheckedInfo().addAll(checkElementsInfo);
		return request;
	}

	/**
	 * Creates a {@link TriggerFeedback} with all of its needed attributes given.
	 * 
	 * @param evaluatedRulesCounter
	 *            The number of rules that were evaluated for this feedback.
	 * @param performedEvaluationsCounter
	 *            The number of evaluations that were performed for this feedback (can be higher
	 *            than the rules counter, since different contexts (model elements) can be evaluated
	 *            on the same rule).
	 * @param violations
	 *            All found violations.
	 * @return The created trigger feedback container.
	 */
	public static TriggerFeedback createTriggerFeedback(int evaluatedRulesCounter,
			int performedEvaluationsCounter, List<ConsistencyViolation> violations) {
		TriggerFeedback feedback = CommunicationFactory.eINSTANCE.createTriggerFeedback();
		feedback.setEvaluatedRulesCounter(evaluatedRulesCounter);
		feedback.setPerformedEvaluationsCounter(performedEvaluationsCounter);
		feedback.getFoundViolations().addAll(violations);
		return feedback;
	}

	/**
	 * Creates a {@link ToolAdapterRegistrationEntry} with all of its needed attributes given.
	 * 
	 * @param adapterIdentifier
	 *            The identifier of the tool adapter.
	 * @param fullName
	 *            The full name of the tool.
	 * @param dataServerHostAddress
	 *            The address to reach to data server of this adapter.
	 * @param dataServerPort
	 *            The port of the data server of this adapter.
	 * @param serializedPublicKey
	 *            The public key of this adapter.
	 * @return The created entry for a registered adapter.
	 */
	public static ToolAdapterRegistrationEntry createToolAdapterRegistrationEntry(
			String adapterIdentifier, String fullName, String dataServerHostAddress,
			int dataServerPort, String serializedPublicKey) {
		ToolAdapterRegistrationEntry entry =
				CommunicationFactory.eINSTANCE.createToolAdapterRegistrationEntry();
		entry.setAdapterIdentifier(adapterIdentifier);
		entry.setFullAdapterName(fullName);
		entry.setAdapterDataServerHostAddress(dataServerHostAddress);
		entry.setAdapterDataServerPort(dataServerPort);
		entry.setSerializedAdapterPublicKey(serializedPublicKey);
		return entry;
	}

	/**
	 * Creates a {@link UserBaseAttributes} with all of its needed attributes given.
	 * 
	 * @param role
	 *            The role of the user.
	 * @param hierarchy
	 *            The hierarchy of the user.
	 * @param department
	 *            The department of the user.
	 * @param company
	 *            The company of the user.
	 * @return The created basic user attributes.
	 */
	public static UserBaseAttributes createUserBaseAttributes(String role, String hierarchy,
			String department, String company) {
		UserBaseAttributes attributes = CommunicationFactory.eINSTANCE.createUserBaseAttributes();
		attributes.setRole(role);
		attributes.setHierarchy(hierarchy);
		attributes.setDepartment(department);
		attributes.setCompany(company);
		return attributes;
	}

	/**
	 * Creates a {@link UserHiddenInformation} with all of its needed attributes given.
	 * 
	 * @param userToken
	 *            The user token of the user.
	 * @param userName
	 *            The name of the user.
	 * @param baseAttributes
	 *            The basic attributes of the user.
	 * @return The created hidden user information.
	 */
	public static UserHiddenInformation createUserHiddenInformation(String userToken,
			String userName, UserBaseAttributes baseAttributes) {
		UserHiddenInformation info = CommunicationFactory.eINSTANCE.createUserHiddenInformation();
		info.setUserToken(createUserToken(userToken));
		info.setUserName(userName);
		info.setBaseAttributes(baseAttributes);
		return info;
	}

	/**
	 * Creates a {@link UserInitialInformation} with all of its needed attributes given.
	 * 
	 * @param userToken
	 *            The user token of the user.
	 * @param location
	 *            The location from which the user has logged in.
	 * @return The created initial user information.
	 */
	public static UserInitialInformation createUserInitialInformation(String userToken,
			String location) {
		UserInitialInformation info = CommunicationFactory.eINSTANCE.createUserInitialInformation();
		info.setUserToken(createUserToken(userToken));
		info.setCurrentLocation(location);
		return info;
	}

	/**
	 * Creates a {@link UserDetailedInformation} with all of its needed attributes given.
	 * 
	 * @param baseInfo
	 *            The initial base information of the user.
	 * @param baseAttributes
	 *            The basic attributes of the user.
	 * @param usedTool
	 *            The tool that the user currently users (from which the consistency check is
	 *            requested).
	 * @param time
	 *            The time when the user has requested the check.
	 * @return The created detailed/full user information.
	 */
	public static UserDetailedInformation createUserDetailedInformation(
			UserInitialInformation baseInfo, UserBaseAttributes baseAttributes, String usedTool,
			Date time) {
		UserDetailedInformation info =
				CommunicationFactory.eINSTANCE.createUserDetailedInformation();
		if(baseInfo != null) {
			info.setUserToken(baseInfo.getUserToken());
			info.setCurrentLocation(baseInfo.getCurrentLocation());
		}
		if(baseAttributes != null) {
			info.setRole(baseAttributes.getRole());
			info.setHierarchy(baseAttributes.getHierarchy());
			info.setDepartment(baseAttributes.getDepartment());
			info.setCompany(baseAttributes.getCompany());
		}
		info.setUsedTool(usedTool);
		info.setTriggerTime(time);
		return info;
	}

	/**
	 * Creates a {@link ConfidentialityStatus} with all of its needed attributes given.
	 * 
	 * @param ruleClearance
	 *            The clearance definition for the rule.
	 * @param feedbackLevelClearance
	 *            The clearance definition(s) for the feedback level.
	 * @return The created confidentiality status of a rule.
	 */
	public static ConfidentialityStatus createConfidentialityStatus(Clearance ruleClearance,
			FeedbackLevelClearance feedbackLevelClearance) {
		ConfidentialityStatus status = ConsistencyFactory.eINSTANCE.createConfidentialityStatus();
		status.setRuleClearance(ruleClearance);
		status.setFeedbackLevelClearance(feedbackLevelClearance);
		return status;
	}

	/**
	 * Creates a {@link FeedbackLevelClearance} with all of its needed attributes given.
	 * 
	 * @param inconsistencyWarningClearance
	 *            The clearance definition for the basic inconsistency warning.
	 * @param ruleWarningClearance
	 *            The clearance definition for the inconsistency warning including rule info.
	 * @param causeWarningClearance
	 *            The clearance definition for the inconsistency warning including rule and cause
	 *            info.
	 * @param fullWarningClearance
	 *            The clearance definition for the full inconsistency warning with all details.
	 * @return The created feedback level clearance definition.
	 */
	public static FeedbackLevelClearance createFeedbackLevelClearance(
			Clearance inconsistencyWarningClearance, Clearance ruleWarningClearance,
			Clearance causeWarningClearance, Clearance fullWarningClearance) {
		FeedbackLevelClearance feedbackLevelClearance =
				ConsistencyFactory.eINSTANCE.createFeedbackLevelClearance();
		feedbackLevelClearance.setInconsistencyWarningClearance(inconsistencyWarningClearance);
		feedbackLevelClearance.setRuleWarningClearance(ruleWarningClearance);
		feedbackLevelClearance.setCauseWarningClearance(causeWarningClearance);
		feedbackLevelClearance.setFullWarningClearance(fullWarningClearance);
		return feedbackLevelClearance;
	}

	/**
	 * Creates a {@link Clearance} with all of its needed attributes given.
	 * 
	 * @param basis
	 *            The basis of the clearance definition (starting point).
	 * @param exceptionEntries
	 *            All exceptions of this clearance.
	 * @return The created clearance definition.
	 */
	public static Clearance createClearance(ClearanceBasis basis,
			List<ExceptionEntry> exceptionEntries) {
		Clearance clearance = ConsistencyFactory.eINSTANCE.createClearance();
		clearance.setBasisForClearance(basis);
		clearance.getExceptionEntries().addAll(exceptionEntries);
		return clearance;
	}

	/**
	 * Creates an {@link ExceptionEntry} with all of its needed attributes given.
	 * 
	 * @param exceptionAttriutes
	 *            All attributes for this exception.
	 * @return The created entry for a clearance exception.
	 */
	public static ExceptionEntry createExceptionEntry(List<ExceptionAttribute> exceptionAttriutes) {
		ExceptionEntry exceptionEntry = ConsistencyFactory.eINSTANCE.createExceptionEntry();
		exceptionEntry.getExceptionAttributes().addAll(exceptionAttriutes);
		return exceptionEntry;
	}

	/**
	 * Creates an {@link ExceptionAttribute} with all of its needed attributes given.
	 * 
	 * @param name
	 *            The name of the attribute.
	 * @param value
	 *            The value of the attribute.
	 * @param matchType
	 *            The match type of the attribute for comparison.
	 * @return The created clearance exception attribute.
	 */
	public static ExceptionAttribute createExceptionAttribute(String name, String value,
			MatchType matchType) {
		ExceptionAttribute exceptionAttriute =
				ConsistencyFactory.eINSTANCE.createExceptionAttribute();
		exceptionAttriute.setAttributeName(name);
		exceptionAttriute.setAttributeValue(value);
		exceptionAttriute.setMatchType(matchType);
		return exceptionAttriute;
	}
}
