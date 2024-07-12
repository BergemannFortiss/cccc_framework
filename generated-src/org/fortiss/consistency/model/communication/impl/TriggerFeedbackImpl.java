/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

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

import org.fortiss.consistency.model.ConsistencyViolation;

import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.TriggerFeedback;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl#getEvaluatedRulesCounter <em>Evaluated Rules Counter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl#getPerformedEvaluationsCounter <em>Performed Evaluations Counter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl#getFoundViolations <em>Found Violations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerFeedbackImpl extends EObjectImpl implements TriggerFeedback {
	/**
	 * The default value of the '{@link #getEvaluatedRulesCounter() <em>Evaluated Rules Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedRulesCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int EVALUATED_RULES_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEvaluatedRulesCounter() <em>Evaluated Rules Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluatedRulesCounter()
	 * @generated
	 * @ordered
	 */
	protected int evaluatedRulesCounter = EVALUATED_RULES_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformedEvaluationsCounter() <em>Performed Evaluations Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedEvaluationsCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int PERFORMED_EVALUATIONS_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerformedEvaluationsCounter() <em>Performed Evaluations Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedEvaluationsCounter()
	 * @generated
	 * @ordered
	 */
	protected int performedEvaluationsCounter = PERFORMED_EVALUATIONS_COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFoundViolations() <em>Found Violations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundViolations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConsistencyViolation> foundViolations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerFeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.TRIGGER_FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEvaluatedRulesCounter() {
		return evaluatedRulesCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvaluatedRulesCounter(int newEvaluatedRulesCounter) {
		int oldEvaluatedRulesCounter = evaluatedRulesCounter;
		evaluatedRulesCounter = newEvaluatedRulesCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER, oldEvaluatedRulesCounter, evaluatedRulesCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPerformedEvaluationsCounter() {
		return performedEvaluationsCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedEvaluationsCounter(int newPerformedEvaluationsCounter) {
		int oldPerformedEvaluationsCounter = performedEvaluationsCounter;
		performedEvaluationsCounter = newPerformedEvaluationsCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER, oldPerformedEvaluationsCounter, performedEvaluationsCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsistencyViolation> getFoundViolations() {
		if (foundViolations == null) {
			foundViolations = new EObjectContainmentEList.Resolving<ConsistencyViolation>(ConsistencyViolation.class, this, CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS);
		}
		return foundViolations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS:
				return ((InternalEList<?>)getFoundViolations()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER:
				return getEvaluatedRulesCounter();
			case CommunicationPackage.TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER:
				return getPerformedEvaluationsCounter();
			case CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS:
				return getFoundViolations();
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
			case CommunicationPackage.TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER:
				setEvaluatedRulesCounter((Integer)newValue);
				return;
			case CommunicationPackage.TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER:
				setPerformedEvaluationsCounter((Integer)newValue);
				return;
			case CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS:
				getFoundViolations().clear();
				getFoundViolations().addAll((Collection<? extends ConsistencyViolation>)newValue);
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
			case CommunicationPackage.TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER:
				setEvaluatedRulesCounter(EVALUATED_RULES_COUNTER_EDEFAULT);
				return;
			case CommunicationPackage.TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER:
				setPerformedEvaluationsCounter(PERFORMED_EVALUATIONS_COUNTER_EDEFAULT);
				return;
			case CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS:
				getFoundViolations().clear();
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
			case CommunicationPackage.TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER:
				return evaluatedRulesCounter != EVALUATED_RULES_COUNTER_EDEFAULT;
			case CommunicationPackage.TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER:
				return performedEvaluationsCounter != PERFORMED_EVALUATIONS_COUNTER_EDEFAULT;
			case CommunicationPackage.TRIGGER_FEEDBACK__FOUND_VIOLATIONS:
				return foundViolations != null && !foundViolations.isEmpty();
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
		result.append(" (evaluatedRulesCounter: ");
		result.append(evaluatedRulesCounter);
		result.append(", performedEvaluationsCounter: ");
		result.append(performedEvaluationsCounter);
		result.append(')');
		return result.toString();
	}

} //TriggerFeedbackImpl
