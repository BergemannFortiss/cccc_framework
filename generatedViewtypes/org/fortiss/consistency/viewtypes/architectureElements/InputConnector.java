/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector#getConnectedOutputConnectors <em>Connected Output Connectors</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getInputConnector()
 * @model
 * @generated
 */
public interface InputConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Connected Output Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Output Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getInputConnector_ConnectedOutputConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputConnector> getConnectedOutputConnectors();

} // InputConnector
