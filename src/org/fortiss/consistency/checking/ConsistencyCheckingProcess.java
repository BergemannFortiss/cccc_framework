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
package org.fortiss.consistency.checking;

import static java.util.concurrent.CompletableFuture.supplyAsync;
import static java.util.concurrent.Executors.newFixedThreadPool;
import static org.fortiss.consistency.model.FeedbackLevel.CAUSE_WARNING;
import static org.fortiss.consistency.model.FeedbackLevel.INCONSISTENCY_WARNING;
import static org.fortiss.consistency.model.FeedbackLevel.RULE_WARNING;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createBlockedViolation;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createConsistencyView;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createConsistencyViewtypeWithLists;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createExceptionViolation;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createInconsistencyViolation;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createModelDataRequest;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.createTriggerFeedback;
import static org.fortiss.consistency.utils.ConsistencyModelElementFactory.generateConsistencyUUID;
import static org.fortiss.consistency.utils.ConsistencyUtils.appendCausingException;
import static org.fortiss.consistency.utils.ConsistencyUtils.createContextWrapperBasedOnData;
import static org.fortiss.consistency.utils.ConsistencyUtils.getAllLinkedInstancesOf;
import static org.fortiss.consistency.utils.ConsistencyUtils.getAllRuleElementsOfRule;
import static org.fortiss.consistency.utils.ConsistencyUtils.getAllSuperClassesOf;
import static org.fortiss.consistency.utils.ConsistencyUtils.getClassFromString;
import static org.fortiss.consistency.utils.ConsistencyUtils.getElementClassFromInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.fortiss.consistency.checking.evaluators.IRuleEvaluator;
import org.fortiss.consistency.communication.DataRequester;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.EvaluatorException;
import org.fortiss.consistency.exceptions.FailedDataRequestException;
import org.fortiss.consistency.exceptions.MissingDataException;
import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ConsistencyViolation;
import org.fortiss.consistency.model.ContextWrapper;
import org.fortiss.consistency.model.FeedbackLevel;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.RuleElement;
import org.fortiss.consistency.model.communication.ModelDataFeedback;
import org.fortiss.consistency.model.communication.ModelDataRequest;
import org.fortiss.consistency.model.communication.TriggerFeedback;
import org.fortiss.consistency.model.communication.UserDetailedInformation;
import org.fortiss.consistency.model.views.ClassFeature;
import org.fortiss.consistency.model.views.ConsistencyView;
import org.fortiss.consistency.model.views.ConsistencyViewtype;
import org.fortiss.consistency.security.clearance.ClearanceManager;

/**
 * This could be seen as main class of the CCCC, because it holds the consistency checking process
 * that performs and controls most of the steps of consistency checking.
 *
 * @author bergemann
 */
public class ConsistencyCheckingProcess {

	/** The configuration that has all the basic consistency information. */
	private ConsistencyConfiguration config;
	/** The metamodels that are available for this process (for types in rules, etc.). */
	private final List<EPackage> metamodelPackages;
	/** The rule evaluator that should be used for consistency checks. */
	private final IRuleEvaluator evaluator;
	/** The internal UUID of the current consistency checking process. */
	private final String processUuid;
	/** The user information of the user who has started/requested this process. */
	private final UserDetailedInformation userInfo;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class.
	 * @param triggeringAdapterIdentifier
	 *            The adapter via which the process was triggered.
	 * @param userInfo
	 *            Information about the user who has triggered this process.
	 */
	public ConsistencyCheckingProcess(ConsistencyConfiguration config,
			String triggeringAdapterIdentifier, UserDetailedInformation userInfo) {
		this.config = config;
		this.processUuid = generateConsistencyUUID();
		config.logInternal("The consistency adapter of " + triggeringAdapterIdentifier +
				" has triggered a consistency checking process (UUID: " + processUuid +
				"). User behind this request: " + userInfo);
		this.userInfo = userInfo;
		this.metamodelPackages = config.getAllAvailableMetamodels();
		this.evaluator = config.getNewDeepEvaluatorInstance();
	}

	/** Stops the whole checking process and cleans up. */
	public void stop() {
		evaluator.dispose();
	}

	/**
	 * Checks for inconsistency based on the given model elements, i.e., they are used as starting
	 * point to filter the consistency rules to know what must be evaluated. A list is returned with
	 * all found violations (inconsistencies or experienced exceptions).
	 * 
	 * @param initialElementsInfo
	 *            A list of information about model elements that should be used as starting point
	 *            for identifying what should be checked for inconsistency.
	 * @return A list of found consistency violations.
	 */
	public TriggerFeedback checkConsistency(List<BasicElementInformation> initialElementsInfo) {
		HashMap<ConsistencyRule, List<BasicElementInformation>> rulesToCheck;

		// 1. Identify which rules should be evaluated based on the given elements.
		try {
			rulesToCheck = identifyRelatedRules(initialElementsInfo);
		} catch(ClassNotFoundException e) {
			String ownMessage =
					"All rule evaluations were skipped, because a needed class from the initial element information could not be found.";
			ConsistencyViolation exceptionViolation = createExceptionViolation(
					"Overall Check Violation", null, appendCausingException(ownMessage, e));
			List<ConsistencyViolation> overallViolation = new ArrayList<>();
			overallViolation.add(exceptionViolation);
			int evaluatedRulesCounter = 0;
			int performedEvaluationsCounter = 0;
			TriggerFeedback feedback = createTriggerFeedback(evaluatedRulesCounter,
					performedEvaluationsCounter, overallViolation);
			return feedback;
		}

		// 2. Check the identified rules by evaluating them with later identified data.
		List<ConsistencyViolation> foundViolations = checkSpecificRules(rulesToCheck);

		// 3. Filter feedback (found violations) by user attributes.
		int hiddenCounter = 0;
		ClearanceManager clearanceManager = config.getClearanceManager();
		String internalLoggingOfViolations = "";
		for(ConsistencyViolation violation : foundViolations) {
			boolean restrictedFeedback = false;
			FeedbackLevel highestFeedbackLevel = clearanceManager
					.getHighestClearedFeedbackLevel(userInfo, violation.getViolatedRule());
			if(highestFeedbackLevel == INCONSISTENCY_WARNING) {
				violation.setName("Hidden");
				violation.setViolatedRule(null);
				restrictedFeedback = true;
			}
			if(highestFeedbackLevel == INCONSISTENCY_WARNING ||
					highestFeedbackLevel == RULE_WARNING) {
				violation.setCause("Hidden");
				restrictedFeedback = true;
			}
			if(highestFeedbackLevel == INCONSISTENCY_WARNING ||
					highestFeedbackLevel == RULE_WARNING || highestFeedbackLevel == CAUSE_WARNING) {
				violation.setUsedContextData(null);
				restrictedFeedback = true;
			}
			if(restrictedFeedback) {
				hiddenCounter++;
			}

			internalLoggingOfViolations += "############";
			internalLoggingOfViolations += "\n- Violation name: '" + violation.getName() + "'.";
			internalLoggingOfViolations +=
					"\n- Violation type: '" + violation.getViolationType() + "'.";
			internalLoggingOfViolations += "\n- Violation type explanation: '" +
					violation.getViolationTypeExplanation() + "'.";
			ConsistencyRule rule = violation.getViolatedRule();
			if(rule == null) {
				internalLoggingOfViolations += "\n- Violation rule: 'Not available'.";
			} else {
				internalLoggingOfViolations += "\n- Violation rule name: '" + rule.getName() + "'.";
				internalLoggingOfViolations +=
						"\n- Violation rule comment: '" + rule.getComment() + "'.";
				internalLoggingOfViolations += "\n- Violation rule original condition: '" +
						rule.getRuleCondition().getOriginalExpression() + "'.";
				internalLoggingOfViolations += "\n- Violation rule modified condition: '" +
						rule.getRuleCondition().getModifiedExpression() + "'.";
			}
			internalLoggingOfViolations += "\n- Violation cause: '" + violation.getCause() + "'.";
			ContextWrapper wrapper = violation.getUsedContextData();
			internalLoggingOfViolations += "\n- Violation context data: ";
			if(wrapper == null) {
				internalLoggingOfViolations += "'Not available'.";
			} else {
				EMap<String, EObject> contextElementsMap = wrapper.getContextElements();
				for(Entry<String, EObject> entry : contextElementsMap.entrySet()) {
					internalLoggingOfViolations += "\n\t* Identifier in rule: '" + entry.getKey() +
							"', Object: '" + entry.getValue() + "'.";
				}
			}
		}

		config.logInfo("Consistency feedback for consistency checking process '" + processUuid +
				"': Found violations: " + foundViolations.size());
		config.logInternal(
				"Filtering found violations for authorized feedback resulted in (partly) hiding " +
						hiddenCounter + " violations.");
		if(!internalLoggingOfViolations.isBlank()) {
			config.logInternal("Internal logging of found violations:\n" +
					internalLoggingOfViolations + "\n############");
		}

		int evaluatedRulesCounter = rulesToCheck.size();
		int performedEvaluationsCounter = rulesToCheck.values().size();
		TriggerFeedback feedback = createTriggerFeedback(evaluatedRulesCounter,
				performedEvaluationsCounter, foundViolations);
		return feedback;
	}

	/**
	 * Identifies (and returns) all consistency rules that should be evaluated based on the given
	 * information about model elements that should be used as starting point for the filtering.
	 * 
	 * @param initialElementsToCheckInfo
	 *            The elements that should be used as starting points to filter the rules.
	 * @return The identified rules as map with the rules and their starting point elements.
	 * 
	 * @throws ClassNotFoundException
	 */
	private HashMap<ConsistencyRule, List<BasicElementInformation>>
			identifyRelatedRules(List<BasicElementInformation> initialElementsToCheckInfo)
					throws ClassNotFoundException {
		HashMap<ConsistencyRule, List<BasicElementInformation>> filteredRulesWithInfo =
				new HashMap<>();

		// 1. Get from all rules their type scope to have the possibility to known later all the
		// important/related rules based on a specific element type.
		List<ConsistencyRule> allRules = config.getAllConsistencyRules();
		config.logInfo("Loaded consistency rules: " + allRules.size());

		HashMap<String, List<ConsistencyRule>> rulesBasedOnScopeClasses = new HashMap<>();
		for(ConsistencyRule rule : allRules) {
			for(String classString : rule.getRuleScope()) {
				if(rulesBasedOnScopeClasses.containsKey(classString)) {
					rulesBasedOnScopeClasses.get(classString).add(rule);
				} else {
					rulesBasedOnScopeClasses.put(classString,
							new ArrayList<ConsistencyRule>(Arrays.asList(rule)));
				}
			}
		}

		// 2. Get the related rules based on the type of the initial elements that should be
		// checked.
		ClearanceManager clearanceManager = config.getClearanceManager();
		for(BasicElementInformation singleElementInfo : initialElementsToCheckInfo) {
			String classString = singleElementInfo.getElementClassString();

			Class<?> originalClass = getClassFromString(classString, metamodelPackages);
			// The class itself will also be present in the following list:
			List<Class<?>> superClasses = getAllSuperClassesOf(originalClass);

			List<ConsistencyRule> relatedRules = new ArrayList<>();
			for(Class<?> superClass : superClasses) {
				List<ConsistencyRule> foundList =
						rulesBasedOnScopeClasses.get(superClass.getCanonicalName());
				if(foundList != null && !foundList.isEmpty()) {
					relatedRules.addAll(foundList);
				}
			}
			if(!relatedRules.isEmpty()) {
				for(ConsistencyRule relatedRule : relatedRules) {
					boolean hasClearance =
							clearanceManager.hasClearanceForRule(userInfo, relatedRule);
					if(hasClearance) {
						if(filteredRulesWithInfo.containsKey(relatedRule)) {
							filteredRulesWithInfo.get(relatedRule).add(singleElementInfo);
						} else {
							List<BasicElementInformation> newElementInfoList = new ArrayList<>();
							newElementInfoList.add(singleElementInfo);
							filteredRulesWithInfo.put(relatedRule, newElementInfoList);
						}
					}
				}
			}
		}

		config.logInfo("Consistency rules before checking (after filtering): " +
				filteredRulesWithInfo.size());
		return filteredRulesWithInfo;
	}

	/**
	 * Checks the given consistency rules based on the given elements as starting point. This
	 * includes identifying the needed data, requesting it from adapters, and then evaluating the
	 * rule condition with the received data to get possible violations.
	 * 
	 * @param rulesToCheckWithElements
	 *            A map of all rules that should be checked with their starting point elements for
	 *            which they should be evaluated.
	 * @return A list of found violations. Empty list if no violations were found.
	 */
	private List<ConsistencyViolation> checkSpecificRules(
			HashMap<ConsistencyRule, List<BasicElementInformation>> rulesToCheckWithElements) {
		List<ConsistencyViolation> foundViolations = new ArrayList<>();

		// Iterate through all rules to separately evaluate them.
		for(Entry<ConsistencyRule, List<BasicElementInformation>> entry : rulesToCheckWithElements
				.entrySet()) {
			ConsistencyRule rule = entry.getKey();
			List<BasicElementInformation> initialElementsToCheck = entry.getValue();

			// 1. Set up the rule.
			String violationName = "Violation of rule '" + rule.getName() + "'";
			try {
				evaluator.setRuleExpression(rule);
			} catch(EvaluatorException e) {
				String ownMessage = "Rule was skipped, because it could not be parsed.";
				ConsistencyViolation parseViolation = createExceptionViolation(violationName, rule,
						appendCausingException(ownMessage, e));
				foundViolations.add(parseViolation);
				continue;
			}

			// 2. Evaluate the rule for each starting point element.
			for(BasicElementInformation initialElementToCheck : initialElementsToCheck) {
				config.logInfo("- Checking consistency rule ['" + rule.getName() +
						"' - comment: '" + rule.getComment() + "'] on initial element '" +
						initialElementToCheck.getElementName() + "' ...");

				// 2.1. Identify the needed data for this single evaluation.
				List<BasicElementInformation> neededElementsInfo;
				try {
					neededElementsInfo = identifyNeededElements(rule, initialElementToCheck);
				} catch(ClassNotFoundException e) {
					String ownMessage =
							"Rule evaluation on '" + initialElementToCheck.getElementName() +
									"' was skipped, because a needed class could not be found.";
					ConsistencyViolation exceptionViolation = createExceptionViolation(
							violationName, rule, appendCausingException(ownMessage, e));
					foundViolations.add(exceptionViolation);
					continue;
				}

				// 2.2. Create a minimal viewtype to be able to request only the identified data.
				ConsistencyViewtype viewtype;
				try {
					viewtype = createMinimalViewtype(rule);
				} catch(Exception e) {
					String ownMessage = "Rule evaluation on '" +
							initialElementToCheck.getElementName() +
							"' was skipped, because a minimal viewtype could not be created for it.";
					ConsistencyViolation exceptionViolation = createExceptionViolation(
							violationName, rule, appendCausingException(ownMessage, e));
					foundViolations.add(exceptionViolation);
					continue;
				}

				// 2.3. Request the identified data from the adapters.
				ConsistencyView dataView;
				try {
					dataView = getDataForSingleRuleCheck(neededElementsInfo, viewtype);
				} catch(FailedDataRequestException e) {
					String ownMessage = "Rule evaluation on '" +
							initialElementToCheck.getElementName() +
							"' was skipped, because minimal required data could not (fully) be requested.";
					ConsistencyViolation exceptionViolation = createExceptionViolation(
							violationName, rule, appendCausingException(ownMessage, e));
					foundViolations.add(exceptionViolation);
					continue;
				} catch(MissingDataException e) {
					ConsistencyViolation blockedViolation = createBlockedViolation(violationName,
							rule,
							"Rule evaluation was skipped, because at least some required data was not provided. Cause: " +
									e.getMessage());
					foundViolations.add(blockedViolation);
					continue;
				}

				// 2.4. Finally, evaluate the rule with the received data and collect violations.
				ConsistencyViolation possibleViolation =
						checkSingleRule(rule, dataView, violationName);
				if(possibleViolation != null) {
					foundViolations.add(possibleViolation);
				}
			}
		}

		return foundViolations;
	}

	/**
	 * Identifies (and returns) all model elements of which data is needed for evaluating the given
	 * consistency rule on the given initial elements that should be checked.
	 * 
	 * @param rule
	 *            The consistency rule for which evaluation the elements need to be identified.
	 * @param initialElementToCheck
	 *            The model elements that should be checked by the rule and are used here as
	 *            starting point.
	 * @return A list with information about all model elements of which data is needed for the rule
	 *         evaluation.
	 * 
	 * @throws ClassNotFoundException
	 */
	private List<BasicElementInformation> identifyNeededElements(ConsistencyRule rule,
			BasicElementInformation initialElementToCheck) throws ClassNotFoundException {

		List<BasicElementInformation> neededElements = new ArrayList<>();
		// The element data of the initial element is always needed.
		neededElements.add(initialElementToCheck);

		// 1. Detect the element types needed for this specific rule.
		Class<?> initialElementType =
				getElementClassFromInfo(initialElementToCheck, metamodelPackages);
		List<AbstractElementRelation> relations = rule.getRuleContext();
		// Use a set to prevent duplicates.
		Set<Class<?>> neededElementTypes = new HashSet<>();
		for(AbstractElementRelation relation : relations) {
			Class<?> sourceType = getClassFromString(
					relation.getSourceElement().getElementClassString(), metamodelPackages);
			if(sourceType.isAssignableFrom(initialElementType)) {
				List<Class<?>> targetElementTypes = new ArrayList<>();
				List<RuleElement> targetElements = relation.getTargetElements();
				for(RuleElement targetElement : targetElements) {
					targetElementTypes.add(getClassFromString(targetElement.getElementClassString(),
							metamodelPackages));
				}
				neededElementTypes.addAll(targetElementTypes);
			}
		}

		// 2. Get all elements linked to the source, i.e., to the initial elements.
		HashMap<String, List<RelationTargetInformation>> allGlobalLinks =
				config.getAllGlobalElementLinks();
		List<BasicElementInformation> allLinkedElementsToSource =
				getAllLinkedInstancesOf(initialElementToCheck, allGlobalLinks);

		// 3. Filter these elements by the previously detected types needed for this specific rule.
		for(BasicElementInformation linkedElement : allLinkedElementsToSource) {
			Class<?> linkedElementType = getElementClassFromInfo(linkedElement, metamodelPackages);
			if(neededElementTypes.contains(linkedElementType)) {
				neededElements.add(EcoreUtil.copy(linkedElement));
			}
		}

		return neededElements;
	}

	/**
	 * Creates (and returns) a minimal viewtype of the needed types/data for evaluating the given
	 * consistency rule. The viewtype is based on the defined general consistency viewtypes and
	 * reduced so much that it only contains the description of the data that is needed for this
	 * specific rule.
	 * 
	 * @param rule
	 *            The consistency rule for which the minimal viewtype should be created.
	 * @return A minimal viewtype as plan for requesting the needed data for this rule.
	 * 
	 * @throws EvaluatorException
	 * @throws ClassNotFoundException
	 */
	private ConsistencyViewtype createMinimalViewtype(ConsistencyRule rule)
			throws EvaluatorException, ClassNotFoundException {

		// 1. Get all class features needed for the given rule.
		List<ClassFeature> classFeatures = evaluator.getClassFeaturesFromCurrentRule();

		// 2. Group the found class features based on the same owningClass.
		Map<String, List<ClassFeature>> neededFeaturesPerNeededClass = new HashMap<>();
		for(ClassFeature classFeature : classFeatures) {
			String neededClassString = classFeature.getOwningClassString();
			if(neededFeaturesPerNeededClass.containsKey(neededClassString)) {
				List<ClassFeature> features = neededFeaturesPerNeededClass.get(neededClassString);
				boolean featureAlreadyExists = false;
				for(ClassFeature existingFeature : features) {
					if(existingFeature.getFeatureName().equals(classFeature.getFeatureName())) {
						featureAlreadyExists = true;
						continue;
					}
				}
				if(!featureAlreadyExists) {
					features.add(classFeature);
				}
			} else {
				List<ClassFeature> newFeatureList = new ArrayList<>();
				newFeatureList.add(classFeature);
				neededFeaturesPerNeededClass.put(neededClassString, newFeatureList);
			}
		}

		// 3. Create the minimal viewtype by only stating the found/needed class features and
		// ignore/skip everything else.
		String viewtypeName =
				"Minimal viewtype for rule '" + rule.getName() + "' [UUID: " + rule.getUuid() + "]";
		return createConsistencyViewtypeWithLists(neededFeaturesPerNeededClass, viewtypeName);
	}

	/**
	 * Requests for a rule check the needed data specified by the given element information and the
	 * given viewtype. The data is requested by the related consistency adapters and then returned
	 * in sum as one data view containing all requested data. If not all data could be received that
	 * is needed for the rule check, an exception is thrown.
	 * 
	 * @param neededElementsInfo
	 *            The information of the elements of which the data is needed.
	 * @param viewtype
	 *            A viewtype describing the types, attributes, etc. of the needed data.
	 * @return A data view containing all needed data.
	 * 
	 * @throws FailedDataRequestException
	 * @throws MissingDataException
	 */
	private ConsistencyView getDataForSingleRuleCheck(
			List<BasicElementInformation> neededElementsInfo, ConsistencyViewtype viewtype)
			throws FailedDataRequestException, MissingDataException {

		// 1. Identify which tool adapters need to be contacted for which data.
		Map<String, List<BasicElementInformation>> neededElementsPerToolAdapter = new HashMap<>();
		for(BasicElementInformation neededElementInfo : neededElementsInfo) {
			String adapterIdentifier = neededElementInfo.getSourceTool();
			if(neededElementsPerToolAdapter.containsKey(adapterIdentifier)) {
				neededElementsPerToolAdapter.get(adapterIdentifier).add(neededElementInfo);
			} else {
				List<BasicElementInformation> newListForNewTool = new ArrayList<>();
				newListForNewTool.add(neededElementInfo);
				neededElementsPerToolAdapter.put(adapterIdentifier, newListForNewTool);
			}
		}

		// 2. Create the data requests.
		List<ModelDataRequest> dataRequests = new ArrayList<>();
		for(Entry<String, List<BasicElementInformation>> entry : neededElementsPerToolAdapter
				.entrySet()) {
			String adapterIdentifier = entry.getKey();
			List<BasicElementInformation> neededElementsOfOneAdapter = entry.getValue();

			ModelDataRequest requestBody = createModelDataRequest(EcoreUtil.copy(viewtype),
					neededElementsOfOneAdapter, adapterIdentifier, EcoreUtil.copy(userInfo));
			dataRequests.add(requestBody);
		}

		// 3. Request the needed data from each tool adapter separately (in parallel).
		ExecutorService sendingRequestPool = newFixedThreadPool(dataRequests.size());
		List<CompletableFuture<ModelDataFeedback>> futures = new ArrayList<>();
		for(ModelDataRequest dataRequest : dataRequests) {
			CompletableFuture<ModelDataFeedback> future = supplyAsync(() -> {
				try {
					DataRequester requester = new DataRequester(config);
					return requester.requestDataFromAdapter(dataRequest);
				} catch(Exception actualException) {
					String ownExceptionMessage = "Could not request data from tool adapter '" +
							dataRequest.getTargetedAdapter() +
							"' due to exception during pre-processing, actual communication, or post-processing of the request attempt.";
					String completeMessage =
							appendCausingException(ownExceptionMessage, actualException);
					config.logError(completeMessage);
					// Only CompletionException can be thrown here (everything else cannot be
					// handled by CompletableFuture). Therefore, we need to wrap out actual message
					// into this wrapper exception.
					FailedDataRequestException failedRequestException =
							new FailedDataRequestException(completeMessage);
					throw new CompletionException(failedRequestException);
				}
			}, sendingRequestPool);
			futures.add(future);
		}

		// 4. Wait for all requests to complete (or get null due to timeouts or exceptions).
		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
		List<ModelDataFeedback> combinedFutureResult;
		try {
			combinedFutureResult =
					futures.stream().map(CompletableFuture::join).collect(Collectors.toList());
		} catch(CompletionException completionException) {
			// Get the actual exception out of the CompletionException wrapper.
			throw new FailedDataRequestException(completionException.getCause().getMessage());
		}

		// 5. Merge all received views to one overall on which the evaluator can work.
		ConsistencyView overallView = null;
		for(ModelDataFeedback dataFeedback : combinedFutureResult) {
			ConsistencyView receivedView = dataFeedback.getProvidedData();
			if(receivedView == null) {
				// If one single minimal data view is missing, there is not enough information to
				// evaluate the current rule, which is why we can directly stop further computation.
				throw new MissingDataException(
						"The received minimal data view is null, what prevents this rule evaluation.");
			}
			if(overallView == null) {
				overallView = createConsistencyView(receivedView.getContent(), "Overall view");
			} else {
				overallView.getContent().addAll(receivedView.getContent());
			}
		}

		return overallView;
	}

	/**
	 * Checks the given rule by evaluating its condition with the data from the given data view. A
	 * violation is returned (with the given name) when the rule is evaluated as not satisfied.
	 * 
	 * @param rule
	 *            The consistency rule that should be checked/evaluated.
	 * @param dataView
	 *            The data view that contains all data for the evaluation.
	 * @param violationName
	 *            The name of the violation if the evaluations results in a violation.
	 * @return The violation if one could be found/evaluated, otherwise null.
	 */
	private ConsistencyViolation checkSingleRule(ConsistencyRule rule, ConsistencyView dataView,
			String violationName) {

		// 1. Create a context wrapper with all needed data on which the evaluator can then operate.
		ContextWrapper contextWrapper;
		List<RuleElement> ruleElements = getAllRuleElementsOfRule(rule);
		try {
			contextWrapper =
					createContextWrapperBasedOnData(dataView, ruleElements, metamodelPackages);
		} catch(MissingDataException missingDataException) {
			String ownExceptionMessage =
					"The context is incomplete, because a previously identified element was not received by the " +
							config.getConsistencyCheckerIdentifier() +
							", which is why this rule was not evaluated.";
			return createExceptionViolation(violationName, rule,
					appendCausingException(ownExceptionMessage, missingDataException));
		} catch(ClassNotFoundException classNotFoundException) {
			String ownExceptionMessage =
					"The context is incomplete, because a class could not be found for its creation, which is why this rule was not evaluated.";
			return createExceptionViolation(violationName, rule,
					appendCausingException(ownExceptionMessage, classNotFoundException));
		}

		// 2. Let the separate evaluator evaluate the rule.
		try {
			boolean ruleConditionIsFulfilled = evaluator.evaluateCurrentRule(contextWrapper);

			if(ruleConditionIsFulfilled) {
				return null;
			}
			return createInconsistencyViolation(violationName, rule,
					"The evaluator has evaluated the given rule with the given context data and the latter could not satisfy the rule, which is why this inconsistency warning is raised. The cause why the context data does not satisfy the rule can currently not be given.",
					contextWrapper);
		} catch(EvaluatorException evaluatorException) {
			String ownExceptionMessage =
					"Rule condition could not be executed/evaluated due to exception. Please, check your inserted rule expressions.";
			return createExceptionViolation(violationName, rule,
					appendCausingException(ownExceptionMessage, evaluatorException));
		}
	}
}
