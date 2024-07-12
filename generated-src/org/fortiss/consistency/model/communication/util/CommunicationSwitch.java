/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.fortiss.consistency.model.communication.*;

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
 * @see org.fortiss.consistency.model.communication.CommunicationPackage
 * @generated
 */
public class CommunicationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSwitch() {
		if (modelPackage == null) {
			modelPackage = CommunicationPackage.eINSTANCE;
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
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY: {
				ToolAdapterRegistrationEntry toolAdapterRegistrationEntry = (ToolAdapterRegistrationEntry)theEObject;
				T result = caseToolAdapterRegistrationEntry(toolAdapterRegistrationEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.USER_TOKEN: {
				UserToken userToken = (UserToken)theEObject;
				T result = caseUserToken(userToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.USER_BASE_ATTRIBUTES: {
				UserBaseAttributes userBaseAttributes = (UserBaseAttributes)theEObject;
				T result = caseUserBaseAttributes(userBaseAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.USER_HIDDEN_INFORMATION: {
				UserHiddenInformation userHiddenInformation = (UserHiddenInformation)theEObject;
				T result = caseUserHiddenInformation(userHiddenInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.USER_INITIAL_INFORMATION: {
				UserInitialInformation userInitialInformation = (UserInitialInformation)theEObject;
				T result = caseUserInitialInformation(userInitialInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.USER_DETAILED_INFORMATION: {
				UserDetailedInformation userDetailedInformation = (UserDetailedInformation)theEObject;
				T result = caseUserDetailedInformation(userDetailedInformation);
				if (result == null) result = caseUserInitialInformation(userDetailedInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.TRIGGER_REQUEST: {
				TriggerRequest triggerRequest = (TriggerRequest)theEObject;
				T result = caseTriggerRequest(triggerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.TRIGGER_FEEDBACK: {
				TriggerFeedback triggerFeedback = (TriggerFeedback)theEObject;
				T result = caseTriggerFeedback(triggerFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.MODEL_DATA_REQUEST: {
				ModelDataRequest modelDataRequest = (ModelDataRequest)theEObject;
				T result = caseModelDataRequest(modelDataRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.MODEL_DATA_FEEDBACK: {
				ModelDataFeedback modelDataFeedback = (ModelDataFeedback)theEObject;
				T result = caseModelDataFeedback(modelDataFeedback);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Adapter Registration Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Adapter Registration Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolAdapterRegistrationEntry(ToolAdapterRegistrationEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserToken(UserToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Base Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Base Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserBaseAttributes(UserBaseAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Hidden Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Hidden Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserHiddenInformation(UserHiddenInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Initial Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Initial Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInitialInformation(UserInitialInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Detailed Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Detailed Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDetailedInformation(UserDetailedInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerRequest(TriggerRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerFeedback(TriggerFeedback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Data Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Data Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDataRequest(ModelDataRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Data Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Data Feedback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDataFeedback(ModelDataFeedback object) {
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

} //CommunicationSwitch
