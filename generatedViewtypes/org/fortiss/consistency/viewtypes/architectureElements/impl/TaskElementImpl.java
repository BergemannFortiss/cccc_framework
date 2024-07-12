/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.TaskElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl#getRequiredRamMemory <em>Required Ram Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl#getRequiredFlashMemory <em>Required Flash Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskElementImpl extends ArchitectureElementImpl implements TaskElement {
	/**
	 * The default value of the '{@link #getRequiredRamMemory() <em>Required Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRamMemory()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_RAM_MEMORY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequiredRamMemory() <em>Required Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredRamMemory()
	 * @generated
	 * @ordered
	 */
	protected double requiredRamMemory = REQUIRED_RAM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredFlashMemory() <em>Required Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFlashMemory()
	 * @generated
	 * @ordered
	 */
	protected static final double REQUIRED_FLASH_MEMORY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRequiredFlashMemory() <em>Required Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFlashMemory()
	 * @generated
	 * @ordered
	 */
	protected double requiredFlashMemory = REQUIRED_FLASH_MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.TASK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequiredRamMemory() {
		return requiredRamMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredRamMemory(double newRequiredRamMemory) {
		double oldRequiredRamMemory = requiredRamMemory;
		requiredRamMemory = newRequiredRamMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_RAM_MEMORY, oldRequiredRamMemory, requiredRamMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRequiredFlashMemory() {
		return requiredFlashMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredFlashMemory(double newRequiredFlashMemory) {
		double oldRequiredFlashMemory = requiredFlashMemory;
		requiredFlashMemory = newRequiredFlashMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_FLASH_MEMORY, oldRequiredFlashMemory, requiredFlashMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_RAM_MEMORY:
				return getRequiredRamMemory();
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_FLASH_MEMORY:
				return getRequiredFlashMemory();
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
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_RAM_MEMORY:
				setRequiredRamMemory((Double)newValue);
				return;
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_FLASH_MEMORY:
				setRequiredFlashMemory((Double)newValue);
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
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_RAM_MEMORY:
				setRequiredRamMemory(REQUIRED_RAM_MEMORY_EDEFAULT);
				return;
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_FLASH_MEMORY:
				setRequiredFlashMemory(REQUIRED_FLASH_MEMORY_EDEFAULT);
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
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_RAM_MEMORY:
				return requiredRamMemory != REQUIRED_RAM_MEMORY_EDEFAULT;
			case ArchitectureElementsPackage.TASK_ELEMENT__REQUIRED_FLASH_MEMORY:
				return requiredFlashMemory != REQUIRED_FLASH_MEMORY_EDEFAULT;
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
		result.append(" (requiredRamMemory: ");
		result.append(requiredRamMemory);
		result.append(", requiredFlashMemory: ");
		result.append(requiredFlashMemory);
		result.append(')');
		return result.toString();
	}

} //TaskElementImpl
