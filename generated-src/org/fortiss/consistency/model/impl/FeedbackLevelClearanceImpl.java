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
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.FeedbackLevelClearance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Level Clearance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl#getInconsistencyWarningClearance <em>Inconsistency Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl#getRuleWarningClearance <em>Rule Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl#getCauseWarningClearance <em>Cause Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl#getFullWarningClearance <em>Full Warning Clearance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackLevelClearanceImpl extends EObjectImpl implements FeedbackLevelClearance {
	/**
	 * The cached value of the '{@link #getInconsistencyWarningClearance() <em>Inconsistency Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInconsistencyWarningClearance()
	 * @generated
	 * @ordered
	 */
	protected Clearance inconsistencyWarningClearance;

	/**
	 * The cached value of the '{@link #getRuleWarningClearance() <em>Rule Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleWarningClearance()
	 * @generated
	 * @ordered
	 */
	protected Clearance ruleWarningClearance;

	/**
	 * The cached value of the '{@link #getCauseWarningClearance() <em>Cause Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseWarningClearance()
	 * @generated
	 * @ordered
	 */
	protected Clearance causeWarningClearance;

	/**
	 * The cached value of the '{@link #getFullWarningClearance() <em>Full Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullWarningClearance()
	 * @generated
	 * @ordered
	 */
	protected Clearance fullWarningClearance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackLevelClearanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.FEEDBACK_LEVEL_CLEARANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance getInconsistencyWarningClearance() {
		if (inconsistencyWarningClearance != null && inconsistencyWarningClearance.eIsProxy()) {
			InternalEObject oldInconsistencyWarningClearance = (InternalEObject)inconsistencyWarningClearance;
			inconsistencyWarningClearance = (Clearance)eResolveProxy(oldInconsistencyWarningClearance);
			if (inconsistencyWarningClearance != oldInconsistencyWarningClearance) {
				InternalEObject newInconsistencyWarningClearance = (InternalEObject)inconsistencyWarningClearance;
				NotificationChain msgs = oldInconsistencyWarningClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, null, null);
				if (newInconsistencyWarningClearance.eInternalContainer() == null) {
					msgs = newInconsistencyWarningClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, oldInconsistencyWarningClearance, inconsistencyWarningClearance));
			}
		}
		return inconsistencyWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance basicGetInconsistencyWarningClearance() {
		return inconsistencyWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInconsistencyWarningClearance(Clearance newInconsistencyWarningClearance, NotificationChain msgs) {
		Clearance oldInconsistencyWarningClearance = inconsistencyWarningClearance;
		inconsistencyWarningClearance = newInconsistencyWarningClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, oldInconsistencyWarningClearance, newInconsistencyWarningClearance);
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
	public void setInconsistencyWarningClearance(Clearance newInconsistencyWarningClearance) {
		if (newInconsistencyWarningClearance != inconsistencyWarningClearance) {
			NotificationChain msgs = null;
			if (inconsistencyWarningClearance != null)
				msgs = ((InternalEObject)inconsistencyWarningClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, null, msgs);
			if (newInconsistencyWarningClearance != null)
				msgs = ((InternalEObject)newInconsistencyWarningClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, null, msgs);
			msgs = basicSetInconsistencyWarningClearance(newInconsistencyWarningClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE, newInconsistencyWarningClearance, newInconsistencyWarningClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance getRuleWarningClearance() {
		if (ruleWarningClearance != null && ruleWarningClearance.eIsProxy()) {
			InternalEObject oldRuleWarningClearance = (InternalEObject)ruleWarningClearance;
			ruleWarningClearance = (Clearance)eResolveProxy(oldRuleWarningClearance);
			if (ruleWarningClearance != oldRuleWarningClearance) {
				InternalEObject newRuleWarningClearance = (InternalEObject)ruleWarningClearance;
				NotificationChain msgs = oldRuleWarningClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, null, null);
				if (newRuleWarningClearance.eInternalContainer() == null) {
					msgs = newRuleWarningClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, oldRuleWarningClearance, ruleWarningClearance));
			}
		}
		return ruleWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance basicGetRuleWarningClearance() {
		return ruleWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleWarningClearance(Clearance newRuleWarningClearance, NotificationChain msgs) {
		Clearance oldRuleWarningClearance = ruleWarningClearance;
		ruleWarningClearance = newRuleWarningClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, oldRuleWarningClearance, newRuleWarningClearance);
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
	public void setRuleWarningClearance(Clearance newRuleWarningClearance) {
		if (newRuleWarningClearance != ruleWarningClearance) {
			NotificationChain msgs = null;
			if (ruleWarningClearance != null)
				msgs = ((InternalEObject)ruleWarningClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, null, msgs);
			if (newRuleWarningClearance != null)
				msgs = ((InternalEObject)newRuleWarningClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, null, msgs);
			msgs = basicSetRuleWarningClearance(newRuleWarningClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE, newRuleWarningClearance, newRuleWarningClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance getCauseWarningClearance() {
		if (causeWarningClearance != null && causeWarningClearance.eIsProxy()) {
			InternalEObject oldCauseWarningClearance = (InternalEObject)causeWarningClearance;
			causeWarningClearance = (Clearance)eResolveProxy(oldCauseWarningClearance);
			if (causeWarningClearance != oldCauseWarningClearance) {
				InternalEObject newCauseWarningClearance = (InternalEObject)causeWarningClearance;
				NotificationChain msgs = oldCauseWarningClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, null, null);
				if (newCauseWarningClearance.eInternalContainer() == null) {
					msgs = newCauseWarningClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, oldCauseWarningClearance, causeWarningClearance));
			}
		}
		return causeWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance basicGetCauseWarningClearance() {
		return causeWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCauseWarningClearance(Clearance newCauseWarningClearance, NotificationChain msgs) {
		Clearance oldCauseWarningClearance = causeWarningClearance;
		causeWarningClearance = newCauseWarningClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, oldCauseWarningClearance, newCauseWarningClearance);
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
	public void setCauseWarningClearance(Clearance newCauseWarningClearance) {
		if (newCauseWarningClearance != causeWarningClearance) {
			NotificationChain msgs = null;
			if (causeWarningClearance != null)
				msgs = ((InternalEObject)causeWarningClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, null, msgs);
			if (newCauseWarningClearance != null)
				msgs = ((InternalEObject)newCauseWarningClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, null, msgs);
			msgs = basicSetCauseWarningClearance(newCauseWarningClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE, newCauseWarningClearance, newCauseWarningClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance getFullWarningClearance() {
		if (fullWarningClearance != null && fullWarningClearance.eIsProxy()) {
			InternalEObject oldFullWarningClearance = (InternalEObject)fullWarningClearance;
			fullWarningClearance = (Clearance)eResolveProxy(oldFullWarningClearance);
			if (fullWarningClearance != oldFullWarningClearance) {
				InternalEObject newFullWarningClearance = (InternalEObject)fullWarningClearance;
				NotificationChain msgs = oldFullWarningClearance.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, null, null);
				if (newFullWarningClearance.eInternalContainer() == null) {
					msgs = newFullWarningClearance.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, oldFullWarningClearance, fullWarningClearance));
			}
		}
		return fullWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clearance basicGetFullWarningClearance() {
		return fullWarningClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullWarningClearance(Clearance newFullWarningClearance, NotificationChain msgs) {
		Clearance oldFullWarningClearance = fullWarningClearance;
		fullWarningClearance = newFullWarningClearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, oldFullWarningClearance, newFullWarningClearance);
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
	public void setFullWarningClearance(Clearance newFullWarningClearance) {
		if (newFullWarningClearance != fullWarningClearance) {
			NotificationChain msgs = null;
			if (fullWarningClearance != null)
				msgs = ((InternalEObject)fullWarningClearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, null, msgs);
			if (newFullWarningClearance != null)
				msgs = ((InternalEObject)newFullWarningClearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, null, msgs);
			msgs = basicSetFullWarningClearance(newFullWarningClearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE, newFullWarningClearance, newFullWarningClearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE:
				return basicSetInconsistencyWarningClearance(null, msgs);
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE:
				return basicSetRuleWarningClearance(null, msgs);
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE:
				return basicSetCauseWarningClearance(null, msgs);
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE:
				return basicSetFullWarningClearance(null, msgs);
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
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE:
				if (resolve) return getInconsistencyWarningClearance();
				return basicGetInconsistencyWarningClearance();
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE:
				if (resolve) return getRuleWarningClearance();
				return basicGetRuleWarningClearance();
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE:
				if (resolve) return getCauseWarningClearance();
				return basicGetCauseWarningClearance();
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE:
				if (resolve) return getFullWarningClearance();
				return basicGetFullWarningClearance();
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
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE:
				setInconsistencyWarningClearance((Clearance)newValue);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE:
				setRuleWarningClearance((Clearance)newValue);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE:
				setCauseWarningClearance((Clearance)newValue);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE:
				setFullWarningClearance((Clearance)newValue);
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
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE:
				setInconsistencyWarningClearance((Clearance)null);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE:
				setRuleWarningClearance((Clearance)null);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE:
				setCauseWarningClearance((Clearance)null);
				return;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE:
				setFullWarningClearance((Clearance)null);
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
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE:
				return inconsistencyWarningClearance != null;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE:
				return ruleWarningClearance != null;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE:
				return causeWarningClearance != null;
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE:
				return fullWarningClearance != null;
		}
		return super.eIsSet(featureID);
	}

} //FeedbackLevelClearanceImpl
