/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.fortiss.consistency.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.ConsistencyPackage
 * @generated
 */
public class ConsistencySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConsistencyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencySwitch() {
		if (modelPackage == null) {
			modelPackage = ConsistencyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConsistencyPackage.IHAS_ID: {
				IHasId iHasId = (IHasId)theEObject;
				T result = caseIHasId(iHasId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.IHAS_NAME: {
				IHasName iHasName = (IHasName)theEObject;
				T result = caseIHasName(iHasName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.IHAS_COMMENT: {
				IHasComment iHasComment = (IHasComment)theEObject;
				T result = caseIHasComment(iHasComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.IHAS_ID_AND_NAME: {
				IHasIdAndName iHasIdAndName = (IHasIdAndName)theEObject;
				T result = caseIHasIdAndName(iHasIdAndName);
				if (result == null) result = caseIHasId(iHasIdAndName);
				if (result == null) result = caseIHasName(iHasIdAndName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION: {
				BasicElementInformation basicElementInformation = (BasicElementInformation)theEObject;
				T result = caseBasicElementInformation(basicElementInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.RELATION_TARGET_INFORMATION: {
				RelationTargetInformation relationTargetInformation = (RelationTargetInformation)theEObject;
				T result = caseRelationTargetInformation(relationTargetInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION: {
				AbstractElementRelation abstractElementRelation = (AbstractElementRelation)theEObject;
				T result = caseAbstractElementRelation(abstractElementRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.RULE_ELEMENT: {
				RuleElement ruleElement = (RuleElement)theEObject;
				T result = caseRuleElement(ruleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.RULE_CONDITION: {
				RuleCondition ruleCondition = (RuleCondition)theEObject;
				T result = caseRuleCondition(ruleCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.CONSISTENCY_RULE: {
				ConsistencyRule consistencyRule = (ConsistencyRule)theEObject;
				T result = caseConsistencyRule(consistencyRule);
				if (result == null) result = caseIHasIdAndName(consistencyRule);
				if (result == null) result = caseIHasComment(consistencyRule);
				if (result == null) result = caseIHasId(consistencyRule);
				if (result == null) result = caseIHasName(consistencyRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.CONSISTENCY_VIOLATION: {
				ConsistencyViolation consistencyViolation = (ConsistencyViolation)theEObject;
				T result = caseConsistencyViolation(consistencyViolation);
				if (result == null) result = caseIHasName(consistencyViolation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.CONTEXT_WRAPPER: {
				ContextWrapper contextWrapper = (ContextWrapper)theEObject;
				T result = caseContextWrapper(contextWrapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.STRING_TO_ELEMENT_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, EObject> stringToElementMapEntry = (Map.Entry<String, EObject>)theEObject;
				T result = caseStringToElementMapEntry(stringToElementMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.CONFIDENTIALITY_STATUS: {
				ConfidentialityStatus confidentialityStatus = (ConfidentialityStatus)theEObject;
				T result = caseConfidentialityStatus(confidentialityStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE: {
				FeedbackLevelClearance feedbackLevelClearance = (FeedbackLevelClearance)theEObject;
				T result = caseFeedbackLevelClearance(feedbackLevelClearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.CLEARANCE: {
				Clearance clearance = (Clearance)theEObject;
				T result = caseClearance(clearance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.EXCEPTION_ENTRY: {
				ExceptionEntry exceptionEntry = (ExceptionEntry)theEObject;
				T result = caseExceptionEntry(exceptionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConsistencyPackage.EXCEPTION_ATTRIBUTE: {
				ExceptionAttribute exceptionAttribute = (ExceptionAttribute)theEObject;
				T result = caseExceptionAttribute(exceptionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasId(IHasId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasName(IHasName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasComment(IHasComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHas Id And Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHas Id And Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHasIdAndName(IHasIdAndName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Element Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Element Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicElementInformation(BasicElementInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Target Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Target Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationTargetInformation(RelationTargetInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractElementRelation(AbstractElementRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleElement(RuleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleCondition(RuleCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsistencyRule(ConsistencyRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsistencyViolation(ConsistencyViolation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Wrapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextWrapper(ContextWrapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Element Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Element Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToElementMapEntry(Map.Entry<String, EObject> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidentiality Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidentiality Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidentialityStatus(ConfidentialityStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feedback Level Clearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feedback Level Clearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeedbackLevelClearance(FeedbackLevelClearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clearance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clearance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearance(Clearance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionEntry(ExceptionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionAttribute(ExceptionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConsistencySwitch
