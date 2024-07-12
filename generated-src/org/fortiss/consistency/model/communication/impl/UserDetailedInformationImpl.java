/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.UserDetailedInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Detailed Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getUsedTool <em>Used Tool</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl#getTriggerTime <em>Trigger Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserDetailedInformationImpl extends UserInitialInformationImpl implements UserDetailedInformation {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchy()
	 * @generated
	 * @ordered
	 */
	protected String hierarchy = HIERARCHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPARTMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepartment() <em>Department</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartment()
	 * @generated
	 * @ordered
	 */
	protected String department = DEPARTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompany() <em>Company</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompany()
	 * @generated
	 * @ordered
	 */
	protected String company = COMPANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedTool() <em>Used Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTool()
	 * @generated
	 * @ordered
	 */
	protected static final String USED_TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedTool() <em>Used Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedTool()
	 * @generated
	 * @ordered
	 */
	protected String usedTool = USED_TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerTime() <em>Trigger Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRIGGER_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerTime() <em>Trigger Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerTime()
	 * @generated
	 * @ordered
	 */
	protected Date triggerTime = TRIGGER_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDetailedInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.USER_DETAILED_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHierarchy() {
		return hierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHierarchy(String newHierarchy) {
		String oldHierarchy = hierarchy;
		hierarchy = newHierarchy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__HIERARCHY, oldHierarchy, hierarchy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDepartment() {
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(String newDepartment) {
		String oldDepartment = department;
		department = newDepartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__DEPARTMENT, oldDepartment, department));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompany() {
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompany(String newCompany) {
		String oldCompany = company;
		company = newCompany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsedTool() {
		return usedTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedTool(String newUsedTool) {
		String oldUsedTool = usedTool;
		usedTool = newUsedTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__USED_TOOL, oldUsedTool, usedTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTriggerTime() {
		return triggerTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerTime(Date newTriggerTime) {
		Date oldTriggerTime = triggerTime;
		triggerTime = newTriggerTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_DETAILED_INFORMATION__TRIGGER_TIME, oldTriggerTime, triggerTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.USER_DETAILED_INFORMATION__ROLE:
				return getRole();
			case CommunicationPackage.USER_DETAILED_INFORMATION__HIERARCHY:
				return getHierarchy();
			case CommunicationPackage.USER_DETAILED_INFORMATION__DEPARTMENT:
				return getDepartment();
			case CommunicationPackage.USER_DETAILED_INFORMATION__COMPANY:
				return getCompany();
			case CommunicationPackage.USER_DETAILED_INFORMATION__USED_TOOL:
				return getUsedTool();
			case CommunicationPackage.USER_DETAILED_INFORMATION__TRIGGER_TIME:
				return getTriggerTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationPackage.USER_DETAILED_INFORMATION__ROLE:
				setRole((String)newValue);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__HIERARCHY:
				setHierarchy((String)newValue);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__COMPANY:
				setCompany((String)newValue);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__USED_TOOL:
				setUsedTool((String)newValue);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__TRIGGER_TIME:
				setTriggerTime((Date)newValue);
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
			case CommunicationPackage.USER_DETAILED_INFORMATION__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__HIERARCHY:
				setHierarchy(HIERARCHY_EDEFAULT);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__DEPARTMENT:
				setDepartment(DEPARTMENT_EDEFAULT);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__COMPANY:
				setCompany(COMPANY_EDEFAULT);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__USED_TOOL:
				setUsedTool(USED_TOOL_EDEFAULT);
				return;
			case CommunicationPackage.USER_DETAILED_INFORMATION__TRIGGER_TIME:
				setTriggerTime(TRIGGER_TIME_EDEFAULT);
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
			case CommunicationPackage.USER_DETAILED_INFORMATION__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CommunicationPackage.USER_DETAILED_INFORMATION__HIERARCHY:
				return HIERARCHY_EDEFAULT == null ? hierarchy != null : !HIERARCHY_EDEFAULT.equals(hierarchy);
			case CommunicationPackage.USER_DETAILED_INFORMATION__DEPARTMENT:
				return DEPARTMENT_EDEFAULT == null ? department != null : !DEPARTMENT_EDEFAULT.equals(department);
			case CommunicationPackage.USER_DETAILED_INFORMATION__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
			case CommunicationPackage.USER_DETAILED_INFORMATION__USED_TOOL:
				return USED_TOOL_EDEFAULT == null ? usedTool != null : !USED_TOOL_EDEFAULT.equals(usedTool);
			case CommunicationPackage.USER_DETAILED_INFORMATION__TRIGGER_TIME:
				return TRIGGER_TIME_EDEFAULT == null ? triggerTime != null : !TRIGGER_TIME_EDEFAULT.equals(triggerTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (role: ");
		result.append(role);
		result.append(", hierarchy: ");
		result.append(hierarchy);
		result.append(", department: ");
		result.append(department);
		result.append(", company: ");
		result.append(company);
		result.append(", usedTool: ");
		result.append(usedTool);
		result.append(", triggerTime: ");
		result.append(triggerTime);
		result.append(')');
		return result.toString();
	}

} //UserDetailedInformationImpl
