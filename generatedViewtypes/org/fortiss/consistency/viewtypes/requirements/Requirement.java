/**
 */
package org.fortiss.consistency.viewtypes.requirements;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getRequirementsId <em>Requirements Id</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Requirements Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements Id</em>' attribute.
	 * @see #setRequirementsId(String)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_RequirementsId()
	 * @model
	 * @generated
	 */
	String getRequirementsId();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getRequirementsId <em>Requirements Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements Id</em>' attribute.
	 * @see #getRequirementsId()
	 * @generated
	 */
	void setRequirementsId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.viewtypes.requirements.Priority}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.fortiss.consistency.viewtypes.requirements.Priority
	 * @see #setPriority(Priority)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.fortiss.consistency.viewtypes.requirements.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.fortiss.consistency.viewtypes.requirements.RequirementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementStatus
	 * @see #setStatus(RequirementStatus)
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementsPackage#getRequirement_Status()
	 * @model
	 * @generated
	 */
	RequirementStatus getStatus();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.requirements.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.fortiss.consistency.viewtypes.requirements.RequirementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequirementStatus value);

} // Requirement
