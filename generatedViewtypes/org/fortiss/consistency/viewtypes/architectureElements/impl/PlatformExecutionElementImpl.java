/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Execution Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl#getProvidedRamMemory <em>Provided Ram Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl#getProvidedFlashMemory <em>Provided Flash Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl#getAcquisitionCost <em>Acquisition Cost</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformExecutionElementImpl extends ArchitectureElementImpl implements PlatformExecutionElement {
	/**
	 * The default value of the '{@link #getProvidedRamMemory() <em>Provided Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRamMemory()
	 * @generated
	 * @ordered
	 */
	protected static final double PROVIDED_RAM_MEMORY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProvidedRamMemory() <em>Provided Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedRamMemory()
	 * @generated
	 * @ordered
	 */
	protected double providedRamMemory = PROVIDED_RAM_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvidedFlashMemory() <em>Provided Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFlashMemory()
	 * @generated
	 * @ordered
	 */
	protected static final double PROVIDED_FLASH_MEMORY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProvidedFlashMemory() <em>Provided Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFlashMemory()
	 * @generated
	 * @ordered
	 */
	protected double providedFlashMemory = PROVIDED_FLASH_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcquisitionCost() <em>Acquisition Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionCost()
	 * @generated
	 * @ordered
	 */
	protected static final double ACQUISITION_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAcquisitionCost() <em>Acquisition Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquisitionCost()
	 * @generated
	 * @ordered
	 */
	protected double acquisitionCost = ACQUISITION_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformExecutionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitectureElementsPackage.Literals.PLATFORM_EXECUTION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProvidedRamMemory() {
		return providedRamMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedRamMemory(double newProvidedRamMemory) {
		double oldProvidedRamMemory = providedRamMemory;
		providedRamMemory = newProvidedRamMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY, oldProvidedRamMemory, providedRamMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProvidedFlashMemory() {
		return providedFlashMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedFlashMemory(double newProvidedFlashMemory) {
		double oldProvidedFlashMemory = providedFlashMemory;
		providedFlashMemory = newProvidedFlashMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY, oldProvidedFlashMemory, providedFlashMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAcquisitionCost() {
		return acquisitionCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquisitionCost(double newAcquisitionCost) {
		double oldAcquisitionCost = acquisitionCost;
		acquisitionCost = newAcquisitionCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST, oldAcquisitionCost, acquisitionCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY:
				return getProvidedRamMemory();
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY:
				return getProvidedFlashMemory();
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST:
				return getAcquisitionCost();
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
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY:
				setProvidedRamMemory((Double)newValue);
				return;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY:
				setProvidedFlashMemory((Double)newValue);
				return;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST:
				setAcquisitionCost((Double)newValue);
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
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY:
				setProvidedRamMemory(PROVIDED_RAM_MEMORY_EDEFAULT);
				return;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY:
				setProvidedFlashMemory(PROVIDED_FLASH_MEMORY_EDEFAULT);
				return;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST:
				setAcquisitionCost(ACQUISITION_COST_EDEFAULT);
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
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY:
				return providedRamMemory != PROVIDED_RAM_MEMORY_EDEFAULT;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY:
				return providedFlashMemory != PROVIDED_FLASH_MEMORY_EDEFAULT;
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST:
				return acquisitionCost != ACQUISITION_COST_EDEFAULT;
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
		result.append(" (providedRamMemory: ");
		result.append(providedRamMemory);
		result.append(", providedFlashMemory: ");
		result.append(providedFlashMemory);
		result.append(", acquisitionCost: ");
		result.append(acquisitionCost);
		result.append(')');
		return result.toString();
	}

} //PlatformExecutionElementImpl
