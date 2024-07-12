/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.ConsistencyViolation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing a container for a consistency check trigger feedback (message).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerFeedback#getEvaluatedRulesCounter <em>Evaluated Rules Counter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerFeedback#getPerformedEvaluationsCounter <em>Performed Evaluations Counter</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.communication.TriggerFeedback#getFoundViolations <em>Found Violations</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerFeedback()
 * @model
 * @generated
 */
public interface TriggerFeedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Evaluated Rules Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluated Rules Counter</em>' attribute.
	 * @see #setEvaluatedRulesCounter(int)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerFeedback_EvaluatedRulesCounter()
	 * @model
	 * @generated
	 */
	int getEvaluatedRulesCounter();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.TriggerFeedback#getEvaluatedRulesCounter <em>Evaluated Rules Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluated Rules Counter</em>' attribute.
	 * @see #getEvaluatedRulesCounter()
	 * @generated
	 */
	void setEvaluatedRulesCounter(int value);

	/**
	 * Returns the value of the '<em><b>Performed Evaluations Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performed Evaluations Counter</em>' attribute.
	 * @see #setPerformedEvaluationsCounter(int)
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerFeedback_PerformedEvaluationsCounter()
	 * @model
	 * @generated
	 */
	int getPerformedEvaluationsCounter();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.communication.TriggerFeedback#getPerformedEvaluationsCounter <em>Performed Evaluations Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performed Evaluations Counter</em>' attribute.
	 * @see #getPerformedEvaluationsCounter()
	 * @generated
	 */
	void setPerformedEvaluationsCounter(int value);

	/**
	 * Returns the value of the '<em><b>Found Violations</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.model.ConsistencyViolation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Found Violations</em>' containment reference list.
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#getTriggerFeedback_FoundViolations()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ConsistencyViolation> getFoundViolations();

} // TriggerFeedback
