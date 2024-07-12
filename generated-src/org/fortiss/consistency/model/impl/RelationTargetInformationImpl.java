/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.RelationTargetInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Target Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.RelationTargetInformationImpl#getBasicInformation <em>Basic Information</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.RelationTargetInformationImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.RelationTargetInformationImpl#getRelationComment <em>Relation Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationTargetInformationImpl extends EObjectImpl implements RelationTargetInformation {
	/**
	 * The cached value of the '{@link #getBasicInformation() <em>Basic Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicInformation()
	 * @generated
	 * @ordered
	 */
	protected BasicElementInformation basicInformation;

	/**
	 * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected String relationType = RELATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationComment() <em>Relation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationComment()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationComment() <em>Relation Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationComment()
	 * @generated
	 * @ordered
	 */
	protected String relationComment = RELATION_COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTargetInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.RELATION_TARGET_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicElementInformation getBasicInformation() {
		if (basicInformation != null && basicInformation.eIsProxy()) {
			InternalEObject oldBasicInformation = (InternalEObject)basicInformation;
			basicInformation = (BasicElementInformation)eResolveProxy(oldBasicInformation);
			if (basicInformation != oldBasicInformation) {
				InternalEObject newBasicInformation = (InternalEObject)basicInformation;
				NotificationChain msgs = oldBasicInformation.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, null, null);
				if (newBasicInformation.eInternalContainer() == null) {
					msgs = newBasicInformation.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, oldBasicInformation, basicInformation));
			}
		}
		return basicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicElementInformation basicGetBasicInformation() {
		return basicInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicInformation(BasicElementInformation newBasicInformation, NotificationChain msgs) {
		BasicElementInformation oldBasicInformation = basicInformation;
		basicInformation = newBasicInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, oldBasicInformation, newBasicInformation);
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
	public void setBasicInformation(BasicElementInformation newBasicInformation) {
		if (newBasicInformation != basicInformation) {
			NotificationChain msgs = null;
			if (basicInformation != null)
				msgs = ((InternalEObject)basicInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, null, msgs);
			if (newBasicInformation != null)
				msgs = ((InternalEObject)newBasicInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, null, msgs);
			msgs = basicSetBasicInformation(newBasicInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION, newBasicInformation, newBasicInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationType() {
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationType(String newRelationType) {
		String oldRelationType = relationType;
		relationType = newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_TYPE, oldRelationType, relationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationComment() {
		return relationComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationComment(String newRelationComment) {
		String oldRelationComment = relationComment;
		relationComment = newRelationComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_COMMENT, oldRelationComment, relationComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION:
				return basicSetBasicInformation(null, msgs);
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
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION:
				if (resolve) return getBasicInformation();
				return basicGetBasicInformation();
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_TYPE:
				return getRelationType();
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_COMMENT:
				return getRelationComment();
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
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION:
				setBasicInformation((BasicElementInformation)newValue);
				return;
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_TYPE:
				setRelationType((String)newValue);
				return;
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_COMMENT:
				setRelationComment((String)newValue);
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
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION:
				setBasicInformation((BasicElementInformation)null);
				return;
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_TYPE:
				setRelationType(RELATION_TYPE_EDEFAULT);
				return;
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_COMMENT:
				setRelationComment(RELATION_COMMENT_EDEFAULT);
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
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__BASIC_INFORMATION:
				return basicInformation != null;
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_TYPE:
				return RELATION_TYPE_EDEFAULT == null ? relationType != null : !RELATION_TYPE_EDEFAULT.equals(relationType);
			case ConsistencyPackage.RELATION_TARGET_INFORMATION__RELATION_COMMENT:
				return RELATION_COMMENT_EDEFAULT == null ? relationComment != null : !RELATION_COMMENT_EDEFAULT.equals(relationComment);
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
		result.append(" (relationType: ");
		result.append(relationType);
		result.append(", relationComment: ");
		result.append(relationComment);
		result.append(')');
		return result.toString();
	}

} //RelationTargetInformationImpl
