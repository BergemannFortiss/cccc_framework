/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback Level Clearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element representing the clearance definitions for feedback levels of a consistency rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.FeedbackLevelClearance#getInconsistencyWarningClearance <em>Inconsistency Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.FeedbackLevelClearance#getRuleWarningClearance <em>Rule Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.FeedbackLevelClearance#getCauseWarningClearance <em>Cause Warning Clearance</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.FeedbackLevelClearance#getFullWarningClearance <em>Full Warning Clearance</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevelClearance()
 * @model
 * @generated
 */
public interface FeedbackLevelClearance extends EObject {
	/**
	 * Returns the value of the '<em><b>Inconsistency Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inconsistency Warning Clearance</em>' containment reference.
	 * @see #setInconsistencyWarningClearance(Clearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevelClearance_InconsistencyWarningClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Clearance getInconsistencyWarningClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getInconsistencyWarningClearance <em>Inconsistency Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inconsistency Warning Clearance</em>' containment reference.
	 * @see #getInconsistencyWarningClearance()
	 * @generated
	 */
	void setInconsistencyWarningClearance(Clearance value);

	/**
	 * Returns the value of the '<em><b>Rule Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Warning Clearance</em>' containment reference.
	 * @see #setRuleWarningClearance(Clearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevelClearance_RuleWarningClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Clearance getRuleWarningClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getRuleWarningClearance <em>Rule Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Warning Clearance</em>' containment reference.
	 * @see #getRuleWarningClearance()
	 * @generated
	 */
	void setRuleWarningClearance(Clearance value);

	/**
	 * Returns the value of the '<em><b>Cause Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Warning Clearance</em>' containment reference.
	 * @see #setCauseWarningClearance(Clearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevelClearance_CauseWarningClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Clearance getCauseWarningClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getCauseWarningClearance <em>Cause Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Warning Clearance</em>' containment reference.
	 * @see #getCauseWarningClearance()
	 * @generated
	 */
	void setCauseWarningClearance(Clearance value);

	/**
	 * Returns the value of the '<em><b>Full Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Warning Clearance</em>' containment reference.
	 * @see #setFullWarningClearance(Clearance)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getFeedbackLevelClearance_FullWarningClearance()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Clearance getFullWarningClearance();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getFullWarningClearance <em>Full Warning Clearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Warning Clearance</em>' containment reference.
	 * @see #getFullWarningClearance()
	 * @generated
	 */
	void setFullWarningClearance(Clearance value);

} // FeedbackLevelClearance
