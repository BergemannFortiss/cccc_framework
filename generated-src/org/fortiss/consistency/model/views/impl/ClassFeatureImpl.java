/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.views.ClassFeature;
import org.fortiss.consistency.model.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl#getOwningClassString <em>Owning Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl#getFeatureClassString <em>Feature Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ClassFeatureImpl#isIsReference <em>Is Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassFeatureImpl extends EObjectImpl implements ClassFeature {
	/**
	 * The default value of the '{@link #getOwningClassString() <em>Owning Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassString()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_CLASS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningClassString() <em>Owning Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningClassString()
	 * @generated
	 * @ordered
	 */
	protected String owningClassString = OWNING_CLASS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureClassString() <em>Feature Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClassString()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_CLASS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureClassString() <em>Feature Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureClassString()
	 * @generated
	 * @ordered
	 */
	protected String featureClassString = FEATURE_CLASS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReference() <em>Is Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReference()
	 * @generated
	 * @ordered
	 */
	protected boolean isReference = IS_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CLASS_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwningClassString() {
		return owningClassString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningClassString(String newOwningClassString) {
		String oldOwningClassString = owningClassString;
		owningClassString = newOwningClassString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_FEATURE__OWNING_CLASS_STRING, oldOwningClassString, owningClassString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_FEATURE__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureClassString() {
		return featureClassString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureClassString(String newFeatureClassString) {
		String oldFeatureClassString = featureClassString;
		featureClassString = newFeatureClassString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_FEATURE__FEATURE_CLASS_STRING, oldFeatureClassString, featureClassString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsReference() {
		return isReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReference(boolean newIsReference) {
		boolean oldIsReference = isReference;
		isReference = newIsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CLASS_FEATURE__IS_REFERENCE, oldIsReference, isReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean equals(final ClassFeature obj) {
		return obj.getFeatureName() == this.getFeatureName() && obj.getFeatureClassString() == this.getFeatureClassString() && obj.getOwningClassString() == this.getOwningClassString() && (obj.isIsReference() == this.isIsReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.CLASS_FEATURE__OWNING_CLASS_STRING:
				return getOwningClassString();
			case ViewsPackage.CLASS_FEATURE__FEATURE_NAME:
				return getFeatureName();
			case ViewsPackage.CLASS_FEATURE__FEATURE_CLASS_STRING:
				return getFeatureClassString();
			case ViewsPackage.CLASS_FEATURE__IS_REFERENCE:
				return isIsReference();
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
			case ViewsPackage.CLASS_FEATURE__OWNING_CLASS_STRING:
				setOwningClassString((String)newValue);
				return;
			case ViewsPackage.CLASS_FEATURE__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case ViewsPackage.CLASS_FEATURE__FEATURE_CLASS_STRING:
				setFeatureClassString((String)newValue);
				return;
			case ViewsPackage.CLASS_FEATURE__IS_REFERENCE:
				setIsReference((Boolean)newValue);
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
			case ViewsPackage.CLASS_FEATURE__OWNING_CLASS_STRING:
				setOwningClassString(OWNING_CLASS_STRING_EDEFAULT);
				return;
			case ViewsPackage.CLASS_FEATURE__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case ViewsPackage.CLASS_FEATURE__FEATURE_CLASS_STRING:
				setFeatureClassString(FEATURE_CLASS_STRING_EDEFAULT);
				return;
			case ViewsPackage.CLASS_FEATURE__IS_REFERENCE:
				setIsReference(IS_REFERENCE_EDEFAULT);
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
			case ViewsPackage.CLASS_FEATURE__OWNING_CLASS_STRING:
				return OWNING_CLASS_STRING_EDEFAULT == null ? owningClassString != null : !OWNING_CLASS_STRING_EDEFAULT.equals(owningClassString);
			case ViewsPackage.CLASS_FEATURE__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case ViewsPackage.CLASS_FEATURE__FEATURE_CLASS_STRING:
				return FEATURE_CLASS_STRING_EDEFAULT == null ? featureClassString != null : !FEATURE_CLASS_STRING_EDEFAULT.equals(featureClassString);
			case ViewsPackage.CLASS_FEATURE__IS_REFERENCE:
				return isReference != IS_REFERENCE_EDEFAULT;
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
		result.append(" (owningClassString: ");
		result.append(owningClassString);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", featureClassString: ");
		result.append(featureClassString);
		result.append(", isReference: ");
		result.append(isReference);
		result.append(')');
		return result.toString();
	}

} //ClassFeatureImpl
