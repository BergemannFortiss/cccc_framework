/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.views.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.IHasName;

import org.fortiss.consistency.model.views.ClassFeature;
import org.fortiss.consistency.model.views.ConsistencyViewtype;
import org.fortiss.consistency.model.views.ViewsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consistency Viewtype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.views.impl.ConsistencyViewtypeImpl#getContainedClasses <em>Contained Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsistencyViewtypeImpl extends EObjectImpl implements ConsistencyViewtype {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainedClasses() <em>Contained Classes</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedClasses()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, EList<ClassFeature>> containedClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsistencyViewtypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.CONSISTENCY_VIEWTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONSISTENCY_VIEWTYPE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.CONSISTENCY_VIEWTYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, EList<ClassFeature>> getContainedClasses() {
		if (containedClasses == null) {
			containedClasses = new EcoreEMap<String,EList<ClassFeature>>(ViewsPackage.Literals.CLASS_STRING_TO_CLASS_FEATURES_MAP_ENTRY, ClassStringToClassFeaturesMapEntryImpl.class, this, ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES);
		}
		return containedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES:
				return ((InternalEList<?>)getContainedClasses()).basicRemove(otherEnd, msgs);
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
			case ViewsPackage.CONSISTENCY_VIEWTYPE__UUID:
				return getUuid();
			case ViewsPackage.CONSISTENCY_VIEWTYPE__NAME:
				return getName();
			case ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES:
				if (coreType) return getContainedClasses();
				else return getContainedClasses().map();
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
			case ViewsPackage.CONSISTENCY_VIEWTYPE__UUID:
				setUuid((String)newValue);
				return;
			case ViewsPackage.CONSISTENCY_VIEWTYPE__NAME:
				setName((String)newValue);
				return;
			case ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES:
				((EStructuralFeature.Setting)getContainedClasses()).set(newValue);
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
			case ViewsPackage.CONSISTENCY_VIEWTYPE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ViewsPackage.CONSISTENCY_VIEWTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES:
				getContainedClasses().clear();
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
			case ViewsPackage.CONSISTENCY_VIEWTYPE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ViewsPackage.CONSISTENCY_VIEWTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ViewsPackage.CONSISTENCY_VIEWTYPE__CONTAINED_CLASSES:
				return containedClasses != null && !containedClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IHasName.class) {
			switch (derivedFeatureID) {
				case ViewsPackage.CONSISTENCY_VIEWTYPE__NAME: return ConsistencyPackage.IHAS_NAME__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IHasName.class) {
			switch (baseFeatureID) {
				case ConsistencyPackage.IHAS_NAME__NAME: return ViewsPackage.CONSISTENCY_VIEWTYPE__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConsistencyViewtypeImpl
