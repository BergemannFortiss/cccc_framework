/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getBidirectionalConnectors <em>Bidirectional Connectors</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getInputConnectors <em>Input Connectors</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getOutputConnectors <em>Output Connectors</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitectureElement()
 * @model
 * @generated
 */
public interface ArchitectureElement extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitectureElement_ContainedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureElement> getContainedElements();

	/**
	 * Returns the value of the '<em><b>Bidirectional Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitectureElement_BidirectionalConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getBidirectionalConnectors();

	/**
	 * Returns the value of the '<em><b>Input Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitectureElement_InputConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputConnector> getInputConnectors();

	/**
	 * Returns the value of the '<em><b>Output Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitectureElement_OutputConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputConnector> getOutputConnectors();

} // ArchitectureElement
