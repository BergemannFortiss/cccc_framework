/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.ConsistencyPackage
 * @generated
 */
public interface ConsistencyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsistencyFactory eINSTANCE = org.fortiss.consistency.model.impl.ConsistencyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Element Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Element Information</em>'.
	 * @generated
	 */
	BasicElementInformation createBasicElementInformation();

	/**
	 * Returns a new object of class '<em>Relation Target Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Target Information</em>'.
	 * @generated
	 */
	RelationTargetInformation createRelationTargetInformation();

	/**
	 * Returns a new object of class '<em>Abstract Element Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Element Relation</em>'.
	 * @generated
	 */
	AbstractElementRelation createAbstractElementRelation();

	/**
	 * Returns a new object of class '<em>Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Element</em>'.
	 * @generated
	 */
	RuleElement createRuleElement();

	/**
	 * Returns a new object of class '<em>Rule Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Condition</em>'.
	 * @generated
	 */
	RuleCondition createRuleCondition();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	ConsistencyRule createConsistencyRule();

	/**
	 * Returns a new object of class '<em>Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation</em>'.
	 * @generated
	 */
	ConsistencyViolation createConsistencyViolation();

	/**
	 * Returns a new object of class '<em>Context Wrapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Wrapper</em>'.
	 * @generated
	 */
	ContextWrapper createContextWrapper();

	/**
	 * Returns a new object of class '<em>Confidentiality Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidentiality Status</em>'.
	 * @generated
	 */
	ConfidentialityStatus createConfidentialityStatus();

	/**
	 * Returns a new object of class '<em>Feedback Level Clearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Level Clearance</em>'.
	 * @generated
	 */
	FeedbackLevelClearance createFeedbackLevelClearance();

	/**
	 * Returns a new object of class '<em>Clearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clearance</em>'.
	 * @generated
	 */
	Clearance createClearance();

	/**
	 * Returns a new object of class '<em>Exception Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Entry</em>'.
	 * @generated
	 */
	ExceptionEntry createExceptionEntry();

	/**
	 * Returns a new object of class '<em>Exception Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Attribute</em>'.
	 * @generated
	 */
	ExceptionAttribute createExceptionAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConsistencyPackage getConsistencyPackage();

} //ConsistencyFactory
