/**
 */
package org.fortiss.consistency.viewtypes.geometryElements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.viewtypes.basics.impl.INamedCommentedElementImpl;

import org.fortiss.consistency.viewtypes.geometryElements.GeometryElement;
import org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage;
import org.fortiss.consistency.viewtypes.geometryElements.Origin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.impl.GeometryElementImpl#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometryElementImpl extends INamedCommentedElementImpl implements GeometryElement {
	/**
	 * The cached value of the '{@link #getContainedElements() <em>Contained Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GeometryElement> containedElements;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Materials</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<String> materials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryElementsPackage.Literals.GEOMETRY_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeometryElement> getContainedElements() {
		if (containedElements == null) {
			containedElements = new EObjectContainmentEList<GeometryElement>(GeometryElement.class, this, GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS);
		}
		return containedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryElementsPackage.GEOMETRY_ELEMENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Origin newOrigin, NotificationChain msgs) {
		Origin oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Origin newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMaterials() {
		if (materials == null) {
			materials = new EDataTypeUniqueEList<String>(String.class, this, GeometryElementsPackage.GEOMETRY_ELEMENT__MATERIALS);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS:
				return ((InternalEList<?>)getContainedElements()).basicRemove(otherEnd, msgs);
			case GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN:
				return basicSetOrigin(null, msgs);
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
			case GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS:
				return getContainedElements();
			case GeometryElementsPackage.GEOMETRY_ELEMENT__WEIGHT:
				return getWeight();
			case GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN:
				return getOrigin();
			case GeometryElementsPackage.GEOMETRY_ELEMENT__MATERIALS:
				return getMaterials();
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
			case GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				getContainedElements().addAll((Collection<? extends GeometryElement>)newValue);
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__WEIGHT:
				setWeight((Double)newValue);
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__MATERIALS:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends String>)newValue);
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
			case GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS:
				getContainedElements().clear();
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN:
				setOrigin((Origin)null);
				return;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__MATERIALS:
				getMaterials().clear();
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
			case GeometryElementsPackage.GEOMETRY_ELEMENT__CONTAINED_ELEMENTS:
				return containedElements != null && !containedElements.isEmpty();
			case GeometryElementsPackage.GEOMETRY_ELEMENT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__ORIGIN:
				return origin != null;
			case GeometryElementsPackage.GEOMETRY_ELEMENT__MATERIALS:
				return materials != null && !materials.isEmpty();
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", materials: ");
		result.append(materials);
		result.append(')');
		return result.toString();
	}

} //GeometryElementImpl
