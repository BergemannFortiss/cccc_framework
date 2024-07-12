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
 * An implementation of the model object '<em><b>Output Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.OutputConnectorImpl#getConnectedInputConnectors <em>Connected Input Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputConnectorImpl extends ConnectorImpl implements OutputConnector {
	/**
	 * The cached value of the '{@link #getConnectedInputConnectors() <em>Connected Input Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedInputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<InputConnector> connectedInputConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.OUTPUT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputConnector> getConnectedInputConnectors() {
		if (connectedInputConnectors == null) {
			connectedInputConnectors = new EObjectContainmentEList<InputConnector>(InputConnector.class, this, ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS);
		}
		return connectedInputConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS:
				return ((InternalEList<?>)getConnectedInputConnectors()).basicRemove(otherEnd, msgs);
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
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS:
				return getConnectedInputConnectors();
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
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS:
				getConnectedInputConnectors().clear();
				getConnectedInputConnectors().addAll((Collection<? extends InputConnector>)newValue);
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
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS:
				getConnectedInputConnectors().clear();
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
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS:
				return connectedInputConnectors != null && !connectedInputConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputConnectorImpl
