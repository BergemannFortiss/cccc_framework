/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Hidden Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element containing hidden information about a user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserToken <em>User Token</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getBaseAttributes <em>Base Attributes</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserHiddenInformation()
 * @model
 * @generated
 */
public interface UserHiddenInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserHiddenInformation_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>User Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Token</em>' containment reference.
	 * @see #setUserToken(UserToken)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserHiddenInformation_UserToken()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserToken getUserToken();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserToken <em>User Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Token</em>' containment reference.
	 * @see #getUserToken()
	 * @generated
	 */
	void setUserToken(UserToken value);

	/**
	 * Returns the value of the '<em><b>Base Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Attributes</em>' containment reference.
	 * @see #setBaseAttributes(UserBaseAttributes)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserHiddenInformation_BaseAttributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserBaseAttributes getBaseAttributes();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getBaseAttributes <em>Base Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Attributes</em>' containment reference.
	 * @see #getBaseAttributes()
	 * @generated
	 */
	void setBaseAttributes(UserBaseAttributes value);

} // UserHiddenInformation
