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
package org.fortiss.consistency.security.clearance;

import static java.util.Collections.emptyList;
import static org.fortiss.consistency.model.ClearanceBasis.ALL;
import static org.fortiss.consistency.model.FeedbackLevel.CAUSE_WARNING;
import static org.fortiss.consistency.model.FeedbackLevel.FULL_WARNING;
import static org.fortiss.consistency.model.FeedbackLevel.INCONSISTENCY_WARNING;
import static org.fortiss.consistency.model.FeedbackLevel.RULE_WARNING;
import static org.fortiss.consistency.model.MatchType.IDENTICAL_VALUE;
import static org.fortiss.consistency.model.MatchType.MAXIMUM_VALUE;
import static org.fortiss.consistency.model.MatchType.MINIMUM_VALUE;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.model.Clearance;
import org.fortiss.consistency.model.ClearanceBasis;
import org.fortiss.consistency.model.ConfidentialityStatus;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ExceptionAttribute;
import org.fortiss.consistency.model.ExceptionEntry;
import org.fortiss.consistency.model.FeedbackLevel;
import org.fortiss.consistency.model.FeedbackLevelClearance;
import org.fortiss.consistency.model.MatchType;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserDetailedInformation;
import org.fortiss.consistency.model.communication.UserToken;

/**
 * Class containing all methods relevant for managing clearance within the consistency checking
 * process. This is mainly needed for the access control to the consistency rules and the final
 * feedback filtering.
 * 
 * @author bergemann
 */
public class ClearanceManager {

	/** The configuration that has all the basic consistency information. */
	protected ConsistencyConfiguration config;

	/**
	 * Constructor.
	 * 
	 * Since this class might be used by different actors (not only the C4, but also by some
	 * adapters), it is important to not use the general static configuration from the C4, but be
	 * parameterizable regarding the correct config!
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class.
	 */
	public ClearanceManager(ConsistencyConfiguration config) {
		this.config = config;
	}

	/**
	 * Returns the user attributes that were registered for the given user token.
	 * 
	 * @param token
	 *            The user token of the user for who the attributes are requested.
	 * @return The user attributes of the given user.
	 */
	public UserBaseAttributes getBaseAttributesBasesOnToken(UserToken token) {
		HashMap<String, UserBaseAttributes> attributesPerToken = config.getUserAttributes();
		String tokenString = token.getToken();
		if(attributesPerToken.containsKey(tokenString)) {
			return attributesPerToken.get(tokenString);
		}
		return null;
	}

	/**
	 * Returns whether the user based on the given user information (user attributes) has the
	 * clearance for the given rule, i.e., if the user is allowed to access and let the rule be
	 * executed for consistency checking.
	 * 
	 * @param userInfo
	 *            The user information of the user by who the clearance is requested.
	 * @param rule
	 *            The rule for which clearance is requested.
	 * @return True if the given user has the clearance for the given rule, otherwise false.
	 */
	public boolean hasClearanceForRule(UserDetailedInformation userInfo, ConsistencyRule rule) {
		if(rule == null) {
			// No given rule means no given clearance definition and for this everyone has
			// clearance.
			return true;
		}

		ConfidentialityStatus confidentialityStatus = rule.getConfidentialityStatus();
		if(confidentialityStatus == null) {
			// No confidentiality status is defined, therefore also no rule clearance definition.
			// Everybody has always clearance.
			return true;
		}

		Clearance ruleClearanceDefinition = confidentialityStatus.getRuleClearance();
		if(ruleClearanceDefinition == null) {
			// No rule clearance definition. Everybody has always clearance.
			return true;
		}

		if(userInfo == null) {
			return false;
		}

		// Now decide based on the user information since clearance definition is given.
		return hasClearance(userInfo, ruleClearanceDefinition);
	}

	/**
	 * Returns the highest feedback level for which the user based on the given user information
	 * (user attributes) has clearance for this specific given consistency rule. This means the
	 * returned feedback level is the detail level of the consistency feedback which is allowed
	 * to be sent to the user.
	 * 
	 * @param userInfo
	 *            The user information of the user for who the the highest feedback clearance is
	 *            requested.
	 * @param rule
	 *            The rule for which the feedback level clearance is requested.
	 * @return The highest cleared feedback level for the given user (for the given rule).
	 */
	public FeedbackLevel getHighestClearedFeedbackLevel(UserDetailedInformation userInfo,
			ConsistencyRule rule) {
		FeedbackLevel lowestLevel = INCONSISTENCY_WARNING;
		FeedbackLevel highestLevel = FULL_WARNING;

		if(rule == null) {
			// No given rule means no given clearance definition and for this everyone has
			// clearance for the highest level.
			return highestLevel;
		}

		ConfidentialityStatus confidentialityStatus = rule.getConfidentialityStatus();
		if(confidentialityStatus == null) {
			// No confidentiality status is defined, therefore also no feedback clearance
			// definition.
			// Everybody has always clearance.
			return highestLevel;
		}

		FeedbackLevelClearance feedbackClearanceDefinition =
				confidentialityStatus.getFeedbackLevelClearance();
		if(feedbackClearanceDefinition == null) {
			// No feedback clearance definition. Everybody has always clearance.
			return highestLevel;
		}

		// This cannot be combined with "rule == null" above, because a missing user info should
		// only lead to a low level when the given rule has really a clearance definition.
		if(userInfo == null) {
			return lowestLevel;
		}

		// Check all levels beginning with the highest. As soon as one is satisfied, it can be
		// returned as the highest.
		List<AbstractMap.SimpleEntry<FeedbackLevel, Clearance>> descendingFeedbackClearancePairs =
				new ArrayList<>();
		descendingFeedbackClearancePairs.add(new AbstractMap.SimpleEntry<>(FULL_WARNING,
				feedbackClearanceDefinition.getFullWarningClearance()));
		descendingFeedbackClearancePairs.add(new AbstractMap.SimpleEntry<>(CAUSE_WARNING,
				feedbackClearanceDefinition.getCauseWarningClearance()));
		descendingFeedbackClearancePairs.add(new AbstractMap.SimpleEntry<>(RULE_WARNING,
				feedbackClearanceDefinition.getRuleWarningClearance()));
		descendingFeedbackClearancePairs.add(new AbstractMap.SimpleEntry<>(INCONSISTENCY_WARNING,
				feedbackClearanceDefinition.getInconsistencyWarningClearance()));

		for(AbstractMap.SimpleEntry<FeedbackLevel, Clearance> currentClearancePair : descendingFeedbackClearancePairs) {
			Clearance currentClearanceDefinition = currentClearancePair.getValue();
			boolean hasClearance = hasClearance(userInfo, currentClearanceDefinition);
			if(hasClearance) {
				FeedbackLevel satisfiedFeedbackLevel = currentClearancePair.getKey();
				return satisfiedFeedbackLevel;
			}
		}

		return lowestLevel;
	}

	/**
	 * Returns whether the user based on the given user information (user attributes) has the
	 * clearance based on the given clearance definition.
	 * 
	 * @param userInfo
	 *            The user information of the user by who the clearance is requested.
	 * @param clearanceDefinition
	 *            The definition of the requested clearance.
	 * @return True if the given user has the clearance for the given definition, otherwise false.
	 */
	private boolean hasClearance(UserDetailedInformation userInfo, Clearance clearanceDefinition) {
		ClearanceBasis basis = clearanceDefinition.getBasisForClearance();
		List<ExceptionEntry> exceptionEntries = clearanceDefinition.getExceptionEntries();
		// Clearance has a start point: assuming all of clearance or no one.
		boolean hasBasisClearance = basis.equals(ALL);
		// Check whether there are any exceptions to this clearance basis.
		for(ExceptionEntry exceptionEntry : exceptionEntries) {
			List<ExceptionAttribute> specifiedAttributes = exceptionEntry.getExceptionAttributes();
			boolean isException = true;
			// The user is only an exception if the info matches all contained attributes in
			// at least one exception entry.
			for(ExceptionAttribute attribute : specifiedAttributes) {
				boolean hasMatchingAttribute = isInfoMatchingAttribute(userInfo, attribute);
				if(!hasMatchingAttribute) {
					isException = false;
					break;
				}
			}
			if(isException) {
				// If it is an exception, the opposite of the basis clearance should be used.
				return !hasBasisClearance;
			}
		}
		// If no exception entry was a match, the basis can be used for the clearance decision.
		return hasBasisClearance;
	}

	/**
	 * Returns whether the user based on the given user information (user attributes) matches
	 * the given exception attribute and therefore can be seen as exception (to probably a
	 * clearance definition).
	 * 
	 * @param userInfo
	 *            The user information that should match the attribute.
	 * @param attribute
	 *            The exception attribute that is used as match comparison.
	 * @return True if the user information is matching the attribute, otherwise false.
	 */
	private boolean isInfoMatchingAttribute(UserDetailedInformation userInfo,
			ExceptionAttribute attribute) {

		List<EStructuralFeature> allFeatures = userInfo.eClass().getEAllStructuralFeatures();
		for(EStructuralFeature feature : allFeatures) {
			if(attribute.getAttributeName().equals(feature.getName())) {
				Object actualAttributeValueObject = userInfo.eGet(feature);
				if(actualAttributeValueObject instanceof String) {
					String actualAttributeValue = (String)actualAttributeValueObject;

					MatchType matchType = attribute.getMatchType();
					String requiredAttributeValue = attribute.getAttributeValue();
					List<String> correctAttributeValues = getAllMatchingAttributeValues(attribute,
							requiredAttributeValue, matchType);

					return correctAttributeValues.contains(actualAttributeValue);
				}
			}
		}

		return false;
	}

	/**
	 * Returns all possible attribute values from the given exception attribute that would
	 * match the given attribute value that should be used as comparison / baseline based on
	 * the match type.
	 * 
	 * @param attribute
	 *            The exception attribute of which the values should be checked/matched.
	 * @param comparisonAttributeValue
	 *            The attribute value used as comparison / baseline.
	 * @param matchType
	 *            The type of match (relation), e.g., max, min, identical.
	 * @return A list with all found matching attribute values (as strings).
	 */
	private List<String> getAllMatchingAttributeValues(ExceptionAttribute attribute,
			String comparisonAttributeValue, MatchType matchType) {
		HashMap<String, List<String>> attributes = config.getAllPossibleClearanceAttributes();
		if(attributes == null) {
			return emptyList();
		}
		String attributeName = attribute.getAttributeName();
		if(attributeName == null) {
			return emptyList();
		}
		if(attributes.containsKey(attributeName)) {
			List<String> allAttributeValues = attributes.get(attributeName);
			int index = allAttributeValues.indexOf(comparisonAttributeValue);
			if(index >= 0) {
				switch(matchType.getValue()) {
					case IDENTICAL_VALUE:
						return allAttributeValues.subList(index, index + 1);
					case MINIMUM_VALUE:
						return allAttributeValues.subList(index, allAttributeValues.size());
					case MAXIMUM_VALUE:
						return allAttributeValues.subList(0, index + 1);
				}
			}
		}

		return emptyList();
	}
}
