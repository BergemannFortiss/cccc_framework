/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ContextWrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ContextWrapperImpl#getContextElements <em>Context Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextWrapperImpl extends EObjectImpl implements ContextWrapper {
	/**
	 * The cached value of the '{@link #getContextElements() <em>Context Elements</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextElements()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EObject> contextElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextWrapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.CONTEXT_WRAPPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, EObject> getContextElements() {
		if (contextElements == null) {
			contextElements = new EcoreEMap<String,EObject>(ConsistencyPackage.Literals.STRING_TO_ELEMENT_MAP_ENTRY, StringToElementMapEntryImpl.class, this, ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS);
		}
		return contextElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS:
				return ((InternalEList<?>)getContextElements()).basicRemove(otherEnd, msgs);
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
			case ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS:
				if (coreType) return getContextElements();
				else return getContextElements().map();
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
			case ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS:
				((EStructuralFeature.Setting)getContextElements()).set(newValue);
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
			case ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS:
				getContextElements().clear();
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
			case ConsistencyPackage.CONTEXT_WRAPPER__CONTEXT_ELEMENTS:
				return contextElements != null && !contextElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextWrapperImpl
