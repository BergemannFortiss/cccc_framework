/**
 */
package org.fortiss.consistency.viewtypes.requirements;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.RequirementList#getContainedRequirements <em>Contained Requirements</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirementList()
 * @model
 * @generated
 */
public interface RequirementList extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Contained Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.requirements.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Requirements</em>' reference list.
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirementList_ContainedRequirements()
	 * @model
	 * @generated
	 */
	EList<Requirement> getContainedRequirements();

} // RequirementList
