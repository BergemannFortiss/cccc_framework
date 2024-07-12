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

import org.fortiss.consistency.model.Clearance;
import org.fortiss.consistency.model.ConfidentialityStatus;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.FeedbackLevelClearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confidentiality Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ConfidentialityStatusImpl#getRuleClearance <em>Rule Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConfidentialityStatusImpl#getFeedbackLevelClearance <em>Feedback Level Clearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfidentialityStatusImpl extends EObjectImpl implements ConfidentialityStatus {
	/**
	 * The cached value of the '{@link #getRuleClearance() <em>Rule Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleClearance()
	 * @generated
	 * @ordered
	 */
	protected Clearance ruleClearance;

	/**
	 * The cached value of the '{@link #getFeedbackLevelClearance() <em>Feedback Level Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 * @ordered
	 */
	protected FeedbackLevelClearance feedbackLevelClearance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfidentialityStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.CONFIDENTIALITY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance getRuleClearance() {
		if (ruleClearance != null && ruleClearance.eIsProxy()) {
			InternalEObject oldRuleClearance = (InternalEObject)ruleClearance;
			ruleClearance = (Clearance)eResolveProxy(oldRuleClearance);
			if (ruleClearance != oldRuleClearance) {
				InternalEObject newRuleClearance = (InternalEObject)ruleClearance;
				NotificationChain msgs = oldRuleClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, null, null);
				if (newRuleClearance.eInternalContainer() == null) {
					msgs = newRuleClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, oldRuleClearance, ruleClearance));
			}
		}
		return ruleClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance basicGetRuleClearance() {
		return ruleClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleClearance(Clearance newRuleClearance, NotificationChain msgs) {
		Clearance oldRuleClearance = ruleClearance;
		ruleClearance = newRuleClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, oldRuleClearance, newRuleClearance);
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
	public void setRuleClearance(Clearance newRuleClearance) {
		if (newRuleClearance != ruleClearance) {
			NotificationChain msgs = null;
			if (ruleClearance != null)
				msgs = ((InternalEObject)ruleClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, null, msgs);
			if (newRuleClearance != null)
				msgs = ((InternalEObject)newRuleClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, null, msgs);
			msgs = basicSetRuleClearance(newRuleClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE, newRuleClearance, newRuleClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackLevelClearance getFeedbackLevelClearance() {
		if (feedbackLevelClearance != null && feedbackLevelClearance.eIsProxy()) {
			InternalEObject oldFeedbackLevelClearance = (InternalEObject)feedbackLevelClearance;
			feedbackLevelClearance = (FeedbackLevelClearance)eResolveProxy(oldFeedbackLevelClearance);
			if (feedbackLevelClearance != oldFeedbackLevelClearance) {
				InternalEObject newFeedbackLevelClearance = (InternalEObject)feedbackLevelClearance;
				NotificationChain msgs = oldFeedbackLevelClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, null, null);
				if (newFeedbackLevelClearance.eInternalContainer() == null) {
					msgs = newFeedbackLevelClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, oldFeedbackLevelClearance, feedbackLevelClearance));
			}
		}
		return feedbackLevelClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackLevelClearance basicGetFeedbackLevelClearance() {
		return feedbackLevelClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedbackLevelClearance(FeedbackLevelClearance newFeedbackLevelClearance, NotificationChain msgs) {
		FeedbackLevelClearance oldFeedbackLevelClearance = feedbackLevelClearance;
		feedbackLevelClearance = newFeedbackLevelClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, oldFeedbackLevelClearance, newFeedbackLevelClearance);
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
	public void setFeedbackLevelClearance(FeedbackLevelClearance newFeedbackLevelClearance) {
		if (newFeedbackLevelClearance != feedbackLevelClearance) {
			NotificationChain msgs = null;
			if (feedbackLevelClearance != null)
				msgs = ((InternalEObject)feedbackLevelClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, null, msgs);
			if (newFeedbackLevelClearance != null)
				msgs = ((InternalEObject)newFeedbackLevelClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, null, msgs);
			msgs = basicSetFeedbackLevelClearance(newFeedbackLevelClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE, newFeedbackLevelClearance, newFeedbackLevelClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE:
				return basicSetRuleClearance(null, msgs);
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE:
				return basicSetFeedbackLevelClearance(null, msgs);
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
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE:
				if (resolve) return getRuleClearance();
				return basicGetRuleClearance();
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE:
				if (resolve) return getFeedbackLevelClearance();
				return basicGetFeedbackLevelClearance();
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
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE:
				setRuleClearance((Clearance)newValue);
				return;
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE:
				setFeedbackLevelClearance((FeedbackLevelClearance)newValue);
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
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE:
				setRuleClearance((Clearance)null);
				return;
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE:
				setFeedbackLevelClearance((FeedbackLevelClearance)null);
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
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__RULE_CLEARANCE:
				return ruleClearance != null;
			case ConsistencyPackage.CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE:
				return feedbackLevelClearance != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfidentialityStatusImpl
