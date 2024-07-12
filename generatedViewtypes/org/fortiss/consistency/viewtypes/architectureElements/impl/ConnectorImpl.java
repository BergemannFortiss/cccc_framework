/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.Connector;

import org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl;

import org.fortiss.consistency.viewtypes.types.IType;
import org.fortiss.consistency.viewtypes.types.IValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl#getConnectedConnectors <em>Connected Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends INamedCommentedElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IType type;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected IValue defaultValue;

	/**
	 * The cached value of the '{@link #getConnectedConnectors() <em>Connected Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectedConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(IType newType, NotificationChain msgs) {
		IType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.CONNECTOR__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureElementsPackage.CONNECTOR__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureElementsPackage.CONNECTOR__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.CONNECTOR__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IValue getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(IValue newDefaultValue, NotificationChain msgs) {
		IValue oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(IValue newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectedConnectors() {
		if (connectedConnectors == null) {
			connectedConnectors = new EObjectContainmentEList<Connector>(Connector.class, this, ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS);
		}
		return connectedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureElementsPackage.CONNECTOR__TYPE:
				return basicSetType(null, msgs);
			case ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS:
				return ((InternalEList<?>)getConnectedConnectors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureElementsPackage.CONNECTOR__TYPE:
				return getType();
			case ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE:
				return getDefaultValue();
			case ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS:
				return getConnectedConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArchitectureElementsPackage.CONNECTOR__TYPE:
				setType((IType)newValue);
				return;
			case ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE:
				setDefaultValue((IValue)newValue);
				return;
			case ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS:
				getConnectedConnectors().clear();
				getConnectedConnectors().addAll((Collection<? extends Connector>)newValue);
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
			case ArchitectureElementsPackage.CONNECTOR__TYPE:
				setType((IType)null);
				return;
			case ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE:
				setDefaultValue((IValue)null);
				return;
			case ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS:
				getConnectedConnectors().clear();
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
			case ArchitectureElementsPackage.CONNECTOR__TYPE:
				return type != null;
			case ArchitectureElementsPackage.CONNECTOR__DEFAULT_VALUE:
				return defaultValue != null;
			case ArchitectureElementsPackage.CONNECTOR__CONNECTED_CONNECTORS:
				return connectedConnectors != null && !connectedConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
