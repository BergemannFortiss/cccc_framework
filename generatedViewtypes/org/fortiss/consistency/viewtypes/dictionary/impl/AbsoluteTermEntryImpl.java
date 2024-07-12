/**
 */
package org.fortiss.consistency.viewtypes.dictionary.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry;
import org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage;

import org.fortiss.consistency.viewtypes.types.IValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Absolute Term Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.dictionary.impl.AbsoluteTermEntryImpl#getAbsoluteTerm <em>Absolute Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbsoluteTermEntryImpl extends DictionaryElementImpl implements AbsoluteTermEntry {
	/**
	 * The cached value of the '{@link #getAbsoluteTerm() <em>Absolute Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteTerm()
	 * @generated
	 * @ordered
	 */
	protected IValue absoluteTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbsoluteTermEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DictionaryPackage.Literals.ABSOLUTE_TERM_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IValue getAbsoluteTerm() {
		return absoluteTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbsoluteTerm(IValue newAbsoluteTerm, NotificationChain msgs) {
		IValue oldAbsoluteTerm = absoluteTerm;
		absoluteTerm = newAbsoluteTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM, oldAbsoluteTerm, newAbsoluteTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteTerm(IValue newAbsoluteTerm) {
		if (newAbsoluteTerm != absoluteTerm) {
			NotificationChain msgs = null;
			if (absoluteTerm != null)
				msgs = ((InternalEObject)absoluteTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM, null, msgs);
			if (newAbsoluteTerm != null)
				msgs = ((InternalEObject)newAbsoluteTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM, null, msgs);
			msgs = basicSetAbsoluteTerm(newAbsoluteTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM, newAbsoluteTerm, newAbsoluteTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM:
				return basicSetAbsoluteTerm(null, msgs);
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
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM:
				return getAbsoluteTerm();
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
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM:
				setAbsoluteTerm((IValue)newValue);
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
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM:
				setAbsoluteTerm((IValue)null);
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
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM:
				return absoluteTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //AbsoluteTermEntryImpl
