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

import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement;
import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.Connector;
import org.fortiss.consistency.viewtypes.architectureElements.InputConnector;
import org.fortiss.consistency.viewtypes.architectureElements.OutputConnector;

import org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl#getBidirectionalConnectors <em>Bidirectional Connectors</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl#getInputConnectors <em>Input Connectors</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl#getOutputConnectors <em>Output Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureElementImpl extends INamedCommentedElementImpl implements ArchitectureElement {
	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitectureElement> containedElements;

	/**
	 * The cached value of the '{@link #getBidirectionalConnectors() <em>Bidirectional Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectionalConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> bidirectionalConnectors;

	/**
	 * The cached value of the '{@link #getInputConnectors() <em>Input Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<InputConnector> inputConnectors;

	/**
	 * The cached value of the '{@link #getOutputConnectors() <em>Output Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputConnector> outputConnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.ARCHITECTURE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureElement> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentEList<ArchitectureElement>(ArchitectureElement.class, this, ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getBidirectionalConnectors() {
		if (bidirectionalConnectors == null) {
			bidirectionalConnectors = new EObjectContainmentEList<Connector>(Connector.class, this, ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS);
		}
		return bidirectionalConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputConnector> getInputConnectors() {
		if (inputConnectors == null) {
			inputConnectors = new EObjectContainmentEList<InputConnector>(InputConnector.class, this, ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS);
		}
		return inputConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputConnector> getOutputConnectors() {
		if (outputConnectors == null) {
			outputConnectors = new EObjectContainmentEList<OutputConnector>(OutputConnector.class, this, ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS);
		}
		return outputConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS:
				return ((InternalEList<?>)getBidirectionalConnectors()).basicRemove(otherEnd, msgs);
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS:
				return ((InternalEList<?>)getInputConnectors()).basicRemove(otherEnd, msgs);
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS:
				return ((InternalEList<?>)getOutputConnectors()).basicRemove(otherEnd, msgs);
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
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS:
				return getContainedElements();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS:
				return getBidirectionalConnectors();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS:
				return getInputConnectors();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS:
				return getOutputConnectors();
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
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends ArchitectureElement>)newValue);
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS:
				getBidirectionalConnectors().clear();
				getBidirectionalConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS:
				getInputConnectors().clear();
				getInputConnectors().addAll((Collection<? extends InputConnector>)newValue);
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS:
				getOutputConnectors().clear();
				getOutputConnectors().addAll((Collection<? extends OutputConnector>)newValue);
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
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS:
				getBidirectionalConnectors().clear();
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS:
				getInputConnectors().clear();
				return;
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS:
				getOutputConnectors().clear();
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
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS:
				return bidirectionalConnectors != null && !bidirectionalConnectors.isEmpty();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__INPUT_CONNECTORS:
				return inputConnectors != null && !inputConnectors.isEmpty();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS:
				return outputConnectors != null && !outputConnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureElementImpl
