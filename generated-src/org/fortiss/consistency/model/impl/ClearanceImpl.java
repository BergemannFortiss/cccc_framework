/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.Clearance;
import org.fortiss.consistency.model.ClearanceBasis;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ExceptionEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ClearanceImpl#getBasisForClearance <em>Basis For Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ClearanceImpl#getExceptionEntries <em>Exception Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClearanceImpl extends EObjectImpl implements Clearance {
	/**
	 * The default value of the '{@link #getBasisForClearance() <em>Basis For Clearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisForClearance()
	 * @generated
	 * @ordered
	 */
	protected static final ClearanceBasis BASIS_FOR_CLEARANCE_EDEFAULT = ClearanceBasis.NONE;

	/**
	 * The cached value of the '{@link #getBasisForClearance() <em>Basis For Clearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisForClearance()
	 * @generated
	 * @ordered
	 */
	protected ClearanceBasis basisForClearance = BASIS_FOR_CLEARANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExceptionEntries() <em>Exception Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionEntry> exceptionEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.CLEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClearanceBasis getBasisForClearance() {
		return basisForClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasisForClearance(ClearanceBasis newBasisForClearance) {
		ClearanceBasis oldBasisForClearance = basisForClearance;
		basisForClearance = newBasisForClearance == null ? BASIS_FOR_CLEARANCE_EDEFAULT : newBasisForClearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CLEARANCE__BASIS_FOR_CLEARANCE, oldBasisForClearance, basisForClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionEntry> getExceptionEntries() {
		if (exceptionEntries == null) {
			exceptionEntries = new EObjectContainmentEList.Resolving<ExceptionEntry>(ExceptionEntry.class, this, ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES);
		}
		return exceptionEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES:
				return ((InternalEList<?>)getExceptionEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsistencyPackage.CLEARANCE__BASIS_FOR_CLEARANCE:
				return getBasisForClearance();
			case ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES:
				return getExceptionEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConsistencyPackage.CLEARANCE__BASIS_FOR_CLEARANCE:
				setBasisForClearance((ClearanceBasis)newValue);
				return;
			case ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES:
				getExceptionEntries().clear();
				getExceptionEntries().addAll((Collection<? extends ExceptionEntry>)newValue);
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
			case ConsistencyPackage.CLEARANCE__BASIS_FOR_CLEARANCE:
				setBasisForClearance(BASIS_FOR_CLEARANCE_EDEFAULT);
				return;
			case ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES:
				getExceptionEntries().clear();
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
			case ConsistencyPackage.CLEARANCE__BASIS_FOR_CLEARANCE:
				return basisForClearance != BASIS_FOR_CLEARANCE_EDEFAULT;
			case ConsistencyPackage.CLEARANCE__EXCEPTION_ENTRIES:
				return exceptionEntries != null && !exceptionEntries.isEmpty();
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
		result.append(" (basisForClearance: ");
		result.append(basisForClearance);
		result.append(')');
		return result.toString();
	}

} //ClearanceImpl
