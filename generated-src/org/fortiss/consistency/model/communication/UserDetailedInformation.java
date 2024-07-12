/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Detailed Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element containing full/detailed information about a user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getRole <em>Role</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getCompany <em>Company</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getUsedTool <em>Used Tool</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getTriggerTime <em>Trigger Time</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation()
 * @model
 * @generated
 */
public interface UserDetailedInformation extends UserInitialInformation {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy</em>' attribute.
	 * @see #setHierarchy(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_Hierarchy()
	 * @model
	 * @generated
	 */
	String getHierarchy();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getHierarchy <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy</em>' attribute.
	 * @see #getHierarchy()
	 * @generated
	 */
	void setHierarchy(String value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' attribute.
	 * @see #setDepartment(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_Department()
	 * @model
	 * @generated
	 */
	String getDepartment();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getDepartment <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' attribute.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(String value);

	/**
	 * Returns the value of the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' attribute.
	 * @see #setCompany(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_Company()
	 * @model
	 * @generated
	 */
	String getCompany();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getCompany <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' attribute.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(String value);

	/**
	 * Returns the value of the '<em><b>Used Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Tool</em>' attribute.
	 * @see #setUsedTool(String)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_UsedTool()
	 * @model
	 * @generated
	 */
	String getUsedTool();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getUsedTool <em>Used Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Tool</em>' attribute.
	 * @see #getUsedTool()
	 * @generated
	 */
	void setUsedTool(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Time</em>' attribute.
	 * @see #setTriggerTime(Date)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getUserDetailedInformation_TriggerTime()
	 * @model
	 * @generated
	 */
	Date getTriggerTime();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getTriggerTime <em>Trigger Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Time</em>' attribute.
	 * @see #getTriggerTime()
	 * @generated
	 */
	void setTriggerTime(Date value);

} // UserDetailedInformation
