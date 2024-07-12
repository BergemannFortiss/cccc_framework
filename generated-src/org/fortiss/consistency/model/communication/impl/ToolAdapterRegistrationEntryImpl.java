/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Adapter Registration Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl#getAdapterIdentifier <em>Adapter Identifier</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl#getFullAdapterName <em>Full Adapter Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl#getAdapterDataServerHostAddress <em>Adapter Data Server Host Address</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl#getAdapterDataServerPort <em>Adapter Data Server Port</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl#getSerializedAdapterPublicKey <em>Serialized Adapter Public Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolAdapterRegistrationEntryImpl extends EObjectImpl implements ToolAdapterRegistrationEntry {
	/**
	 * The default value of the '{@link #getAdapterIdentifier() <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterIdentifier() <em>Adapter Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String adapterIdentifier = ADAPTER_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullAdapterName() <em>Full Adapter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullAdapterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_ADAPTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullAdapterName() <em>Full Adapter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullAdapterName()
	 * @generated
	 * @ordered
	 */
	protected String fullAdapterName = FULL_ADAPTER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdapterDataServerHostAddress() <em>Adapter Data Server Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterDataServerHostAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTER_DATA_SERVER_HOST_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdapterDataServerHostAddress() <em>Adapter Data Server Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterDataServerHostAddress()
	 * @generated
	 * @ordered
	 */
	protected String adapterDataServerHostAddress = ADAPTER_DATA_SERVER_HOST_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdapterDataServerPort() <em>Adapter Data Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterDataServerPort()
	 * @generated
	 * @ordered
	 */
	protected static final int ADAPTER_DATA_SERVER_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAdapterDataServerPort() <em>Adapter Data Server Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapterDataServerPort()
	 * @generated
	 * @ordered
	 */
	protected int adapterDataServerPort = ADAPTER_DATA_SERVER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerializedAdapterPublicKey() <em>Serialized Adapter Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedAdapterPublicKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIALIZED_ADAPTER_PUBLIC_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerializedAdapterPublicKey() <em>Serialized Adapter Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializedAdapterPublicKey()
	 * @generated
	 * @ordered
	 */
	protected String serializedAdapterPublicKey = SERIALIZED_ADAPTER_PUBLIC_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToolAdapterRegistrationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.TOOL_ADAPTER_REGISTRATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdapterIdentifier() {
		return adapterIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterIdentifier(String newAdapterIdentifier) {
		String oldAdapterIdentifier = adapterIdentifier;
		adapterIdentifier = newAdapterIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER, oldAdapterIdentifier, adapterIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullAdapterName() {
		return fullAdapterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullAdapterName(String newFullAdapterName) {
		String oldFullAdapterName = fullAdapterName;
		fullAdapterName = newFullAdapterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME, oldFullAdapterName, fullAdapterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdapterDataServerHostAddress() {
		return adapterDataServerHostAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterDataServerHostAddress(String newAdapterDataServerHostAddress) {
		String oldAdapterDataServerHostAddress = adapterDataServerHostAddress;
		adapterDataServerHostAddress = newAdapterDataServerHostAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS, oldAdapterDataServerHostAddress, adapterDataServerHostAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAdapterDataServerPort() {
		return adapterDataServerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdapterDataServerPort(int newAdapterDataServerPort) {
		int oldAdapterDataServerPort = adapterDataServerPort;
		adapterDataServerPort = newAdapterDataServerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT, oldAdapterDataServerPort, adapterDataServerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerializedAdapterPublicKey() {
		return serializedAdapterPublicKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerializedAdapterPublicKey(String newSerializedAdapterPublicKey) {
		String oldSerializedAdapterPublicKey = serializedAdapterPublicKey;
		serializedAdapterPublicKey = newSerializedAdapterPublicKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY, oldSerializedAdapterPublicKey, serializedAdapterPublicKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER:
				return getAdapterIdentifier();
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME:
				return getFullAdapterName();
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS:
				return getAdapterDataServerHostAddress();
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT:
				return getAdapterDataServerPort();
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY:
				return getSerializedAdapterPublicKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER:
				setAdapterIdentifier((String)newValue);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME:
				setFullAdapterName((String)newValue);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS:
				setAdapterDataServerHostAddress((String)newValue);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT:
				setAdapterDataServerPort((Integer)newValue);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY:
				setSerializedAdapterPublicKey((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER:
				setAdapterIdentifier(ADAPTER_IDENTIFIER_EDEFAULT);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME:
				setFullAdapterName(FULL_ADAPTER_NAME_EDEFAULT);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS:
				setAdapterDataServerHostAddress(ADAPTER_DATA_SERVER_HOST_ADDRESS_EDEFAULT);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT:
				setAdapterDataServerPort(ADAPTER_DATA_SERVER_PORT_EDEFAULT);
				return;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY:
				setSerializedAdapterPublicKey(SERIALIZED_ADAPTER_PUBLIC_KEY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER:
				return ADAPTER_IDENTIFIER_EDEFAULT == null ? adapterIdentifier != null : !ADAPTER_IDENTIFIER_EDEFAULT.equals(adapterIdentifier);
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME:
				return FULL_ADAPTER_NAME_EDEFAULT == null ? fullAdapterName != null : !FULL_ADAPTER_NAME_EDEFAULT.equals(fullAdapterName);
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS:
				return ADAPTER_DATA_SERVER_HOST_ADDRESS_EDEFAULT == null ? adapterDataServerHostAddress != null : !ADAPTER_DATA_SERVER_HOST_ADDRESS_EDEFAULT.equals(adapterDataServerHostAddress);
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT:
				return adapterDataServerPort != ADAPTER_DATA_SERVER_PORT_EDEFAULT;
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY:
				return SERIALIZED_ADAPTER_PUBLIC_KEY_EDEFAULT == null ? serializedAdapterPublicKey != null : !SERIALIZED_ADAPTER_PUBLIC_KEY_EDEFAULT.equals(serializedAdapterPublicKey);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adapterIdentifier: ");
		result.append(adapterIdentifier);
		result.append(", fullAdapterName: ");
		result.append(fullAdapterName);
		result.append(", adapterDataServerHostAddress: ");
		result.append(adapterDataServerHostAddress);
		result.append(", adapterDataServerPort: ");
		result.append(adapterDataServerPort);
		result.append(", serializedAdapterPublicKey: ");
		result.append(serializedAdapterPublicKey);
		result.append(')');
		return result.toString();
	}

} //ToolAdapterRegistrationEntryImpl
