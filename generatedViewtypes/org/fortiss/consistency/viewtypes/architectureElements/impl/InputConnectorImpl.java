/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.InputConnector;
import org.fortiss.consistency.viewtypes.architectureElements.OutputConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.InputConnectorImpl#getConnectedOutputConnectors <em>Connected Output Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputConnectorImpl extends ConnectorImpl implements InputConnector {
	/**
	 * The cached value of the '{@link #getConnectedOutputConnectors() <em>Connected Output Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedOutputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputConnector> connectedOutputConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.INPUT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputConnector> getConnectedOutputConnectors() {
		if (connectedOutputConnectors == null) {
			connectedOutputConnectors = new EObjectContainmentEList<OutputConnector>(OutputConnector.class, this, ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS);
		}
		return connectedOutputConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS:
				return ((InternalEList<?>)getConnectedOutputConnectors()).basicRemove(otherEnd, msgs);
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
			case ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS:
				return getConnectedOutputConnectors();
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
			case ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS:
				getConnectedOutputConnectors().clear();
				getConnectedOutputConnectors().addAll((Collection<? extends OutputConnector>)newValue);
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
			case ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS:
				getConnectedOutputConnectors().clear();
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
			case ArchitectureElementsPackage.INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS:
				return connectedOutputConnectors != null && !connectedOutputConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputConnectorImpl
