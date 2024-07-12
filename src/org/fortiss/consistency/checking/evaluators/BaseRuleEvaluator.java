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

import org.eclipse.emf.ecore.EPackage;
import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.EvaluatorException;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.RuleCondition;

/**
 * A base class for a rule evaluator that can be extended by actual evaluator implementations and
 * provides additional useful methods like standardized exceptions.
 *
 * @author bergemann
 */
public abstract class BaseRuleEvaluator implements IRuleEvaluator {

	/**
	 * All metamodels from which classes, attributes, etc. might be used inside the consistency
	 * rules. Will be provided by instance creation (constructor call).
	 */
	protected List<EPackage> availableMetamodels;

	/**
	 * The current {@link ConsistencyRule} on which the evaluator should work/evaluate. This
	 * can/should be set via the setRuleExpression method of the interface.
	 */
	protected ConsistencyRule currentRule;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class,
	 *            especially the available metamodels.
	 */
	public BaseRuleEvaluator(ConsistencyConfiguration config) {
		if(config == null) {
			this.availableMetamodels = null;
		} else {
			this.availableMetamodels = config.getAllAvailableMetamodels();
		}
		this.currentRule = null;
	}

	/**
	 * Returns a {@link EvaluatorException} with a standardized message based on the given action.
	 * The message will automatically add more information about the current rule expression if
	 * possible. More details can be provided and will be added to the end.
	 * 
	 * @param actionCausingException
	 *            The action during which the exception occurred.
	 * @param contextObject
	 *            The context object to get some more background information into the exception
	 *            message.
	 * @param moreDetails
	 *            Possible more details for the end of the exception message.
	 * @return The created standard evaluation exception.
	 */
	protected EvaluatorException createStandardEvaluatorExceptionWithExpressionInfo(
			String actionCausingException, Object contextObject, String moreDetails) {
		String originalExpression =
				"No rule expression can be displayed, because no rule was set yet";
		String modifiedExpression =
				"No rule expression can be displayed, because no rule was set yet";
		if(currentRule != null && currentRule.getRuleCondition() != null) {
			RuleCondition ruleCondition = currentRule.getRuleCondition();
			if(ruleCondition.getOriginalExpression() != null) {
				originalExpression = currentRule.getRuleCondition().getOriginalExpression();
			}
			if(ruleCondition.getModifiedExpression() != null) {
				modifiedExpression = currentRule.getRuleCondition().getModifiedExpression();
			}
		}
		String expressionInfo = "- Context: '" + contextObject.toString() +
				"'\n\t- Original expression (made by user): '" + originalExpression +
				"'\n\t- Modified expression used within the evaluator: '" + modifiedExpression +
				"'\n";

		return createStandardEvaluatorException(actionCausingException,
				expressionInfo + moreDetails);
	}

	/**
	 * Returns a {@link EvaluatorException} with a standardized message based on the given action.
	 * More details can be provided and will be added to the end.
	 * 
	 * @param actionCausingException
	 *            The action during which the exception occurred.
	 * @param moreDetails
	 *            Possible more details for the end of the exception message.
	 * @return The created standard evaluation exception.
	 */
	protected EvaluatorException createStandardEvaluatorException(String actionCausingException,
			String moreDetails) {
		return new EvaluatorException(
				"The " + getEvaluatorName() + " experienced an exception during " +
						actionCausingException + ".\n\t" + moreDetails);
	}
}
