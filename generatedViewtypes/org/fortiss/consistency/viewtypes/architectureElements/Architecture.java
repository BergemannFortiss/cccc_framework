/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.Architecture#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getArchitecture_ContainedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitectureElement> getContainedElements();

} // Architecture
