/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalElement#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getLogicalElement()
 * @model
 * @generated
 */
public interface LogicalElement extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getLogicalElement_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<BehaviorSpecification> getBehavior();

} // LogicalElement
