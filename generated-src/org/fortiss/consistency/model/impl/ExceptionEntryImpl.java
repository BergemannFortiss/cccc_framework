/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ExceptionAttribute;
import org.fortiss.consistency.model.ExceptionEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ExceptionEntryImpl#getExceptionAttributes <em>Exception Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionEntryImpl extends EObjectImpl implements ExceptionEntry {
	/**
	 * The cached value of the '{@link #getExceptionAttributes() <em>Exception Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionAttribute> exceptionAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.EXCEPTION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExceptionAttribute> getExceptionAttributes() {
		if (exceptionAttributes == null) {
			exceptionAttributes = new EObjectContainmentEList.Resolving<ExceptionAttribute>(ExceptionAttribute.class, this, ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES);
		}
		return exceptionAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES:
				return ((InternalEList<?>)getExceptionAttributes()).basicRemove(otherEnd, msgs);
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
			case ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES:
				return getExceptionAttributes();
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
			case ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES:
				getExceptionAttributes().clear();
				getExceptionAttributes().addAll((Collection<? extends ExceptionAttribute>)newValue);
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
			case ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES:
				getExceptionAttributes().clear();
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
			case ConsistencyPackage.EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES:
				return exceptionAttributes != null && !exceptionAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExceptionEntryImpl
