/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.communication.CommunicationPackage
 * @generated
 */
public interface CommunicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationFactory eINSTANCE = org.fortiss.consistency.model.communication.impl.CommunicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tool Adapter Registration Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Adapter Registration Entry</em>'.
	 * @generated
	 */
	ToolAdapterRegistrationEntry createToolAdapterRegistrationEntry();

	/**
	 * Returns a new object of class '<em>User Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Token</em>'.
	 * @generated
	 */
	UserToken createUserToken();

	/**
	 * Returns a new object of class '<em>User Base Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Base Attributes</em>'.
	 * @generated
	 */
	UserBaseAttributes createUserBaseAttributes();

	/**
	 * Returns a new object of class '<em>User Hidden Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Hidden Information</em>'.
	 * @generated
	 */
	UserHiddenInformation createUserHiddenInformation();

	/**
	 * Returns a new object of class '<em>User Initial Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Initial Information</em>'.
	 * @generated
	 */
	UserInitialInformation createUserInitialInformation();

	/**
	 * Returns a new object of class '<em>User Detailed Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Detailed Information</em>'.
	 * @generated
	 */
	UserDetailedInformation createUserDetailedInformation();

	/**
	 * Returns a new object of class '<em>Trigger Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Request</em>'.
	 * @generated
	 */
	TriggerRequest createTriggerRequest();

	/**
	 * Returns a new object of class '<em>Trigger Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Feedback</em>'.
	 * @generated
	 */
	TriggerFeedback createTriggerFeedback();

	/**
	 * Returns a new object of class '<em>Model Data Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Data Request</em>'.
	 * @generated
	 */
	ModelDataRequest createModelDataRequest();

	/**
	 * Returns a new object of class '<em>Model Data Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Data Feedback</em>'.
	 * @generated
	 */
	ModelDataFeedback createModelDataFeedback();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommunicationPackage getCommunicationPackage();

} //CommunicationFactory
