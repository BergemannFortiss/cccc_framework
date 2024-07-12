/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.BasicElementInformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a container for a consistency check trigger request (message).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerRequest#getAdapterIdentifier <em>Adapter Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerRequest#getUser <em>User</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerRequest#getElementsToBeCheckedInfo <em>Elements To Be Checked Info</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerRequest()
 * @model
 * @generated
 */
public interface TriggerRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapter Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Identifier</em>' attribute.
	 * @see #setAdapterIdentifier(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerRequest_AdapterIdentifier()
	 * @model
	 * @generated
	 */
	String getAdapterIdentifier();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.TriggerRequest#getAdapterIdentifier <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Identifier</em>' attribute.
	 * @see #getAdapterIdentifier()
	 * @generated
	 */
	void setAdapterIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(UserInitialInformation)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerRequest_User()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	UserInitialInformation getUser();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.TriggerRequest#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(UserInitialInformation value);

	/**
	 * Returns the value of the '<em><b>Elements To Be Checked Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.BasicElementInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements To Be Checked Info</em>' containment reference list.
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerRequest_ElementsToBeCheckedInfo()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<BasicElementInformation> getElementsToBeCheckedInfo();

} // TriggerRequest
