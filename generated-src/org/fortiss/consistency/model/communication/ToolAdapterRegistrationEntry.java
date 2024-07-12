/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Adapter Registration Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing an entry for a registered tool adapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterIdentifier <em>Adapter Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getFullAdapterName <em>Full Adapter Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerHostAddress <em>Adapter Data Server Host Address</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerPort <em>Adapter Data Server Port</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getSerializedAdapterPublicKey <em>Serialized Adapter Public Key</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry()
 * @model
 * @generated
 */
public interface ToolAdapterRegistrationEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Adapter Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Identifier</em>' attribute.
	 * @see #setAdapterIdentifier(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry_AdapterIdentifier()
	 * @model
	 * @generated
	 */
	String getAdapterIdentifier();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterIdentifier <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Identifier</em>' attribute.
	 * @see #getAdapterIdentifier()
	 * @generated
	 */
	void setAdapterIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Full Adapter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Adapter Name</em>' attribute.
	 * @see #setFullAdapterName(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry_FullAdapterName()
	 * @model
	 * @generated
	 */
	String getFullAdapterName();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getFullAdapterName <em>Full Adapter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Adapter Name</em>' attribute.
	 * @see #getFullAdapterName()
	 * @generated
	 */
	void setFullAdapterName(String value);

	/**
	 * Returns the value of the '<em><b>Adapter Data Server Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Data Server Host Address</em>' attribute.
	 * @see #setAdapterDataServerHostAddress(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry_AdapterDataServerHostAddress()
	 * @model
	 * @generated
	 */
	String getAdapterDataServerHostAddress();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerHostAddress <em>Adapter Data Server Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Data Server Host Address</em>' attribute.
	 * @see #getAdapterDataServerHostAddress()
	 * @generated
	 */
	void setAdapterDataServerHostAddress(String value);

	/**
	 * Returns the value of the '<em><b>Adapter Data Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Data Server Port</em>' attribute.
	 * @see #setAdapterDataServerPort(int)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry_AdapterDataServerPort()
	 * @model
	 * @generated
	 */
	int getAdapterDataServerPort();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerPort <em>Adapter Data Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Data Server Port</em>' attribute.
	 * @see #getAdapterDataServerPort()
	 * @generated
	 */
	void setAdapterDataServerPort(int value);

	/**
	 * Returns the value of the '<em><b>Serialized Adapter Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key must be serialized as UTF8 string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serialized Adapter Public Key</em>' attribute.
	 * @see #setSerializedAdapterPublicKey(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getToolAdapterRegistrationEntry_SerializedAdapterPublicKey()
	 * @model
	 * @generated
	 */
	String getSerializedAdapterPublicKey();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getSerializedAdapterPublicKey <em>Serialized Adapter Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialized Adapter Public Key</em>' attribute.
	 * @see #getSerializedAdapterPublicKey()
	 * @generated
	 */
	void setSerializedAdapterPublicKey(String value);

} // ToolAdapterRegistrationEntry
