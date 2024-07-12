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

import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.RuleElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Element Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.AbstractElementRelationImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.AbstractElementRelationImpl#getTargetElements <em>Target Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractElementRelationImpl extends EObjectImpl implements AbstractElementRelation {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected RuleElement sourceElement;

	/**
	 * The cached value of the '{@link #getTargetElements() <em>Target Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleElement> targetElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.ABSTRACT_ELEMENT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleElement getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (RuleElement)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				InternalEObject newSourceElement = (InternalEObject)sourceElement;
				NotificationChain msgs = oldSourceElement.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, null, null);
				if (newSourceElement.eInternalContainer() == null) {
					msgs = newSourceElement.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceElement(RuleElement newSourceElement, NotificationChain msgs) {
		RuleElement oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, oldSourceElement, newSourceElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceElement(RuleElement newSourceElement) {
		if (newSourceElement != sourceElement) {
			NotificationChain msgs = null;
			if (sourceElement != null)
				msgs = ((InternalEObject)sourceElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, null, msgs);
			if (newSourceElement != null)
				msgs = ((InternalEObject)newSourceElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, null, msgs);
			msgs = basicSetSourceElement(newSourceElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT, newSourceElement, newSourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RuleElement> getTargetElements() {
		if (targetElements == null) {
			targetElements = new EObjectContainmentEList.Resolving<RuleElement>(RuleElement.class, this, ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS);
		}
		return targetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT:
				return basicSetSourceElement(null, msgs);
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS:
				return ((InternalEList<?>)getTargetElements()).basicRemove(otherEnd, msgs);
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
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS:
				return getTargetElements();
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
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT:
				setSourceElement((RuleElement)newValue);
				return;
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS:
				getTargetElements().clear();
				getTargetElements().addAll((Collection<? extends RuleElement>)newValue);
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
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT:
				setSourceElement((RuleElement)null);
				return;
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS:
				getTargetElements().clear();
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
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT:
				return sourceElement != null;
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS:
				return targetElements != null && !targetElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractElementRelationImpl
