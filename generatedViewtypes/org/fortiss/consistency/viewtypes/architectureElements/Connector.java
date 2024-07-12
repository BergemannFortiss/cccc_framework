/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

import org.fortiss.consistency.viewtypes.types.IType;
import org.fortiss.consistency.viewtypes.types.IValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getConnectedConnectors <em>Connected Connectors</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(IType)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getConnector_Type()
	 * @model containment="true"
	 * @generated
	 */
	IType getType();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(IValue)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getConnector_DefaultValue()
	 * @model containment="true"
	 * @generated
	 */
	IValue getDefaultValue();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(IValue value);

	/**
	 * Returns the value of the '<em><b>Connected Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getConnector_ConnectedConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectedConnectors();

} // Connector
