/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.UserBaseAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Base Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserBaseAttributesImpl extends EObjectImpl implements UserBaseAttributes {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserBaseAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.USER_BASE_ATTRIBUTES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_BASE_ATTRIBUTES__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_BASE_ATTRIBUTES__HIERARCHY, oldHierarchy, hierarchy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_BASE_ATTRIBUTES__DEPARTMENT, oldDepartment, department));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.USER_BASE_ATTRIBUTES__COMPANY, oldCompany, company));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.USER_BASE_ATTRIBUTES__ROLE:
				return getRole();
			case CommunicationPackage.USER_BASE_ATTRIBUTES__HIERARCHY:
				return getHierarchy();
			case CommunicationPackage.USER_BASE_ATTRIBUTES__DEPARTMENT:
				return getDepartment();
			case CommunicationPackage.USER_BASE_ATTRIBUTES__COMPANY:
				return getCompany();
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
			case CommunicationPackage.USER_BASE_ATTRIBUTES__ROLE:
				setRole((String)newValue);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__HIERARCHY:
				setHierarchy((String)newValue);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__DEPARTMENT:
				setDepartment((String)newValue);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__COMPANY:
				setCompany((String)newValue);
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
			case CommunicationPackage.USER_BASE_ATTRIBUTES__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__HIERARCHY:
				setHierarchy(HIERARCHY_EDEFAULT);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__DEPARTMENT:
				setDepartment(DEPARTMENT_EDEFAULT);
				return;
			case CommunicationPackage.USER_BASE_ATTRIBUTES__COMPANY:
				setCompany(COMPANY_EDEFAULT);
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
			case CommunicationPackage.USER_BASE_ATTRIBUTES__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CommunicationPackage.USER_BASE_ATTRIBUTES__HIERARCHY:
				return HIERARCHY_EDEFAULT == null ? hierarchy != null : !HIERARCHY_EDEFAULT.equals(hierarchy);
			case CommunicationPackage.USER_BASE_ATTRIBUTES__DEPARTMENT:
				return DEPARTMENT_EDEFAULT == null ? department != null : !DEPARTMENT_EDEFAULT.equals(department);
			case CommunicationPackage.USER_BASE_ATTRIBUTES__COMPANY:
				return COMPANY_EDEFAULT == null ? company != null : !COMPANY_EDEFAULT.equals(company);
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
		result.append(')');
		return result.toString();
	}

} //UserBaseAttributesImpl
