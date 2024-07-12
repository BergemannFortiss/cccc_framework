/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector#getConnectedInputConnectors <em>Connected Input Connectors</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getOutputConnector()
 * @model
 * @generated
 */
public interface OutputConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Connected Input Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected Input Connectors</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getOutputConnector_ConnectedInputConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputConnector> getConnectedInputConnectors();

} // OutputConnector
