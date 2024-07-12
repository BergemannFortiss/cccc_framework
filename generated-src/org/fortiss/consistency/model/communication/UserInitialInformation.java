/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Initial Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element containing initial information about a user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.UserInitialInformation#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserInitialInformation#getCurrentLocation <em>Current Location</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserInitialInformation()
 * @model
 * @generated
 */
public interface UserInitialInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>User Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token</em>' containment reference.
	 * @see #setUserToken(UserToken)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserInitialInformation_UserToken()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserToken getUserToken();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserInitialInformation#getUserToken <em>User Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Token</em>' containment reference.
	 * @see #getUserToken()
	 * @generated
	 */
	void setUserToken(UserToken value);

	/**
	 * Returns the value of the '<em><b>Current Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Location</em>' attribute.
	 * @see #setCurrentLocation(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserInitialInformation_CurrentLocation()
	 * @model
	 * @generated
	 */
	String getCurrentLocation();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserInitialInformation#getCurrentLocation <em>Current Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Location</em>' attribute.
	 * @see #getCurrentLocation()
	 * @generated
	 */
	void setCurrentLocation(String value);

} // UserInitialInformation
