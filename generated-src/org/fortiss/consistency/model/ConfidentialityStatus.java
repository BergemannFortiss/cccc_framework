/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidentiality Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing the confidentiality status of a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.ConfidentialityStatus#getRuleClearance <em>Rule Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.ConfidentialityStatus#getFeedbackLevelClearance <em>Feedback Level Clearance</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getConfidentialityStatus()
 * @model
 * @generated
 */
public interface ConfidentialityStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Clearance</em>' containment reference.
	 * @see #setRuleClearance(Clearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConfidentialityStatus_RuleClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Clearance getRuleClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConfidentialityStatus#getRuleClearance <em>Rule Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Clearance</em>' containment reference.
	 * @see #getRuleClearance()
	 * @generated
	 */
	void setRuleClearance(Clearance value);

	/**
	 * Returns the value of the '<em><b>Feedback Level Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback Level Clearance</em>' containment reference.
	 * @see #setFeedbackLevelClearance(FeedbackLevelClearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getConfidentialityStatus_FeedbackLevelClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	FeedbackLevelClearance getFeedbackLevelClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.ConfidentialityStatus#getFeedbackLevelClearance <em>Feedback Level Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback Level Clearance</em>' containment reference.
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 */
	void setFeedbackLevelClearance(FeedbackLevelClearance value);

} // ConfidentialityStatus
