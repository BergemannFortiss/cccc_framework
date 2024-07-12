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

import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ConsistencyViolation;
import org.fortiss.consistency.model.ConsistencyViolationType;
import org.fortiss.consistency.model.ContextWrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getViolationType <em>Violation Type</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getViolationTypeExplanation <em>Violation Type Explanation</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getViolatedRule <em>Violated Rule</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl#getUsedContextData <em>Used Context Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsistencyViolationImpl extends EObjectImpl implements ConsistencyViolation {
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
	 * The default value of the '{@link #getViolationType() <em>Violation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsistencyViolationType VIOLATION_TYPE_EDEFAULT = ConsistencyViolationType.FOUND_INCONSISTENCY;

	/**
	 * The cached value of the '{@link #getViolationType() <em>Violation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationType()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyViolationType violationType = VIOLATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViolationTypeExplanation() <em>Violation Type Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationTypeExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String VIOLATION_TYPE_EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViolationTypeExplanation() <em>Violation Type Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolationTypeExplanation()
	 * @generated
	 * @ordered
	 */
	protected String violationTypeExplanation = VIOLATION_TYPE_EXPLANATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViolatedRule() <em>Violated Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViolatedRule()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyRule violatedRule;

	/**
	 * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected String cause = CAUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsedContextData() <em>Used Context Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedContextData()
	 * @generated
	 * @ordered
	 */
	protected ContextWrapper usedContextData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsistencyViolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.CONSISTENCY_VIOLATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyViolationType getViolationType() {
		return violationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViolationType(ConsistencyViolationType newViolationType) {
		ConsistencyViolationType oldViolationType = violationType;
		violationType = newViolationType == null ? VIOLATION_TYPE_EDEFAULT : newViolationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE, oldViolationType, violationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getViolationTypeExplanation() {
		return violationTypeExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViolationTypeExplanation(String newViolationTypeExplanation) {
		String oldViolationTypeExplanation = violationTypeExplanation;
		violationTypeExplanation = newViolationTypeExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION, oldViolationTypeExplanation, violationTypeExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyRule getViolatedRule() {
		if (violatedRule != null && violatedRule.eIsProxy()) {
			InternalEObject oldViolatedRule = (InternalEObject)violatedRule;
			violatedRule = (ConsistencyRule)eResolveProxy(oldViolatedRule);
			if (violatedRule != oldViolatedRule) {
				InternalEObject newViolatedRule = (InternalEObject)violatedRule;
				NotificationChain msgs = oldViolatedRule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, null, null);
				if (newViolatedRule.eInternalContainer() == null) {
					msgs = newViolatedRule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, oldViolatedRule, violatedRule));
			}
		}
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyRule basicGetViolatedRule() {
		return violatedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViolatedRule(ConsistencyRule newViolatedRule, NotificationChain msgs) {
		ConsistencyRule oldViolatedRule = violatedRule;
		violatedRule = newViolatedRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, oldViolatedRule, newViolatedRule);
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
	public void setViolatedRule(ConsistencyRule newViolatedRule) {
		if (newViolatedRule != violatedRule) {
			NotificationChain msgs = null;
			if (violatedRule != null)
				msgs = ((InternalEObject)violatedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, null, msgs);
			if (newViolatedRule != null)
				msgs = ((InternalEObject)newViolatedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, null, msgs);
			msgs = basicSetViolatedRule(newViolatedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE, newViolatedRule, newViolatedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCause(String newCause) {
		String oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextWrapper getUsedContextData() {
		if (usedContextData != null && usedContextData.eIsProxy()) {
			InternalEObject oldUsedContextData = (InternalEObject)usedContextData;
			usedContextData = (ContextWrapper)eResolveProxy(oldUsedContextData);
			if (usedContextData != oldUsedContextData) {
				InternalEObject newUsedContextData = (InternalEObject)usedContextData;
				NotificationChain msgs = oldUsedContextData.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, null, null);
				if (newUsedContextData.eInternalContainer() == null) {
					msgs = newUsedContextData.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, oldUsedContextData, usedContextData));
			}
		}
		return usedContextData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextWrapper basicGetUsedContextData() {
		return usedContextData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedContextData(ContextWrapper newUsedContextData, NotificationChain msgs) {
		ContextWrapper oldUsedContextData = usedContextData;
		usedContextData = newUsedContextData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, oldUsedContextData, newUsedContextData);
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
	public void setUsedContextData(ContextWrapper newUsedContextData) {
		if (newUsedContextData != usedContextData) {
			NotificationChain msgs = null;
			if (usedContextData != null)
				msgs = ((InternalEObject)usedContextData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, null, msgs);
			if (newUsedContextData != null)
				msgs = ((InternalEObject)newUsedContextData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, null, msgs);
			msgs = basicSetUsedContextData(newUsedContextData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA, newUsedContextData, newUsedContextData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE:
				return basicSetViolatedRule(null, msgs);
			case ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA:
				return basicSetUsedContextData(null, msgs);
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
			case ConsistencyPackage.CONSISTENCY_VIOLATION__NAME:
				return getName();
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE:
				return getViolationType();
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION:
				return getViolationTypeExplanation();
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE:
				if (resolve) return getViolatedRule();
				return basicGetViolatedRule();
			case ConsistencyPackage.CONSISTENCY_VIOLATION__CAUSE:
				return getCause();
			case ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA:
				if (resolve) return getUsedContextData();
				return basicGetUsedContextData();
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
			case ConsistencyPackage.CONSISTENCY_VIOLATION__NAME:
				setName((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE:
				setViolationType((ConsistencyViolationType)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION:
				setViolationTypeExplanation((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE:
				setViolatedRule((ConsistencyRule)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__CAUSE:
				setCause((String)newValue);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA:
				setUsedContextData((ContextWrapper)newValue);
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
			case ConsistencyPackage.CONSISTENCY_VIOLATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE:
				setViolationType(VIOLATION_TYPE_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION:
				setViolationTypeExplanation(VIOLATION_TYPE_EXPLANATION_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE:
				setViolatedRule((ConsistencyRule)null);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA:
				setUsedContextData((ContextWrapper)null);
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
			case ConsistencyPackage.CONSISTENCY_VIOLATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE:
				return violationType != VIOLATION_TYPE_EDEFAULT;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION:
				return VIOLATION_TYPE_EXPLANATION_EDEFAULT == null ? violationTypeExplanation != null : !VIOLATION_TYPE_EXPLANATION_EDEFAULT.equals(violationTypeExplanation);
			case ConsistencyPackage.CONSISTENCY_VIOLATION__VIOLATED_RULE:
				return violatedRule != null;
			case ConsistencyPackage.CONSISTENCY_VIOLATION__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case ConsistencyPackage.CONSISTENCY_VIOLATION__USED_CONTEXT_DATA:
				return usedContextData != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", violationType: ");
		result.append(violationType);
		result.append(", violationTypeExplanation: ");
		result.append(violationTypeExplanation);
		result.append(", cause: ");
		result.append(cause);
		result.append(')');
		return result.toString();
	}

} //ConsistencyViolationImpl
