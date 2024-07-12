/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.ConsistencyFactory
 * @model kind="package"
 * @generated
 */
public interface ConsistencyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConsistencyPackage eINSTANCE = org.fortiss.consistency.model.impl.ConsistencyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.IHasId <em>IHas Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.IHasId
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasId()
	 * @generated
	 */
	int IHAS_ID = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_ID__UUID = 0;

	/**
	 * The number of structural features of the '<em>IHas Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_ID_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.IHasName <em>IHas Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.IHasName
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasName()
	 * @generated
	 */
	int IHAS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>IHas Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_NAME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.IHasComment <em>IHas Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.IHasComment
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasComment()
	 * @generated
	 */
	int IHAS_COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_COMMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>IHas Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_COMMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.IHasIdAndName <em>IHas Id And Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.IHasIdAndName
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasIdAndName()
	 * @generated
	 */
	int IHAS_ID_AND_NAME = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_ID_AND_NAME__UUID = IHAS_ID__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_ID_AND_NAME__NAME = IHAS_ID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IHas Id And Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHAS_ID_AND_NAME_FEATURE_COUNT = IHAS_ID_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl <em>Basic Element Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.BasicElementInformationImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getBasicElementInformation()
	 * @generated
	 */
	int BASIC_ELEMENT_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Element Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION__ELEMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION__SOURCE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Source Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION__SOURCE_TOOL = 4;

	/**
	 * The number of structural features of the '<em>Basic Element Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEMENT_INFORMATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.RelationTargetInformationImpl <em>Relation Target Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.RelationTargetInformationImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRelationTargetInformation()
	 * @generated
	 */
	int RELATION_TARGET_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Basic Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_INFORMATION__BASIC_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_INFORMATION__RELATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Relation Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_INFORMATION__RELATION_COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Relation Target Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TARGET_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.AbstractElementRelationImpl <em>Abstract Element Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.AbstractElementRelationImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getAbstractElementRelation()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Abstract Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_RELATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.RuleElementImpl <em>Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.RuleElementImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRuleElement()
	 * @generated
	 */
	int RULE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name In Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__NAME_IN_RULE = 0;

	/**
	 * The feature id for the '<em><b>Element Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__ELEMENT_CLASS_STRING = 1;

	/**
	 * The number of structural features of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.RuleConditionImpl <em>Rule Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.RuleConditionImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRuleCondition()
	 * @generated
	 */
	int RULE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Original Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__ORIGINAL_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Modified Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__MODIFIED_EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Rule Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ConsistencyRuleImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyRule()
	 * @generated
	 */
	int CONSISTENCY_RULE = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__UUID = IHAS_ID_AND_NAME__UUID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__NAME = IHAS_ID_AND_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__COMMENT = IHAS_ID_AND_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rule Scope</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__RULE_SCOPE = IHAS_ID_AND_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__RULE_CONTEXT = IHAS_ID_AND_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__RULE_CONDITION = IHAS_ID_AND_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Confidentiality Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE__CONFIDENTIALITY_STATUS = IHAS_ID_AND_NAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_RULE_FEATURE_COUNT = IHAS_ID_AND_NAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl <em>Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ConsistencyViolationImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyViolation()
	 * @generated
	 */
	int CONSISTENCY_VIOLATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__NAME = IHAS_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Violation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__VIOLATION_TYPE = IHAS_NAME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Violation Type Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION = IHAS_NAME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Violated Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__VIOLATED_RULE = IHAS_NAME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__CAUSE = IHAS_NAME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Context Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION__USED_CONTEXT_DATA = IHAS_NAME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_VIOLATION_FEATURE_COUNT = IHAS_NAME_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ContextWrapperImpl <em>Context Wrapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ContextWrapperImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getContextWrapper()
	 * @generated
	 */
	int CONTEXT_WRAPPER = 11;

	/**
	 * The feature id for the '<em><b>Context Elements</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_WRAPPER__CONTEXT_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Context Wrapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_WRAPPER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.StringToElementMapEntryImpl <em>String To Element Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.StringToElementMapEntryImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getStringToElementMapEntry()
	 * @generated
	 */
	int STRING_TO_ELEMENT_MAP_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ELEMENT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ELEMENT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Element Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_ELEMENT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ConfidentialityStatusImpl <em>Confidentiality Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ConfidentialityStatusImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConfidentialityStatus()
	 * @generated
	 */
	int CONFIDENTIALITY_STATUS = 13;

	/**
	 * The feature id for the '<em><b>Rule Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_STATUS__RULE_CLEARANCE = 0;

	/**
	 * The feature id for the '<em><b>Feedback Level Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE = 1;

	/**
	 * The number of structural features of the '<em>Confidentiality Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENTIALITY_STATUS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl <em>Feedback Level Clearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getFeedbackLevelClearance()
	 * @generated
	 */
	int FEEDBACK_LEVEL_CLEARANCE = 14;

	/**
	 * The feature id for the '<em><b>Inconsistency Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE = 0;

	/**
	 * The feature id for the '<em><b>Rule Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE = 1;

	/**
	 * The feature id for the '<em><b>Cause Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE = 2;

	/**
	 * The feature id for the '<em><b>Full Warning Clearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE = 3;

	/**
	 * The number of structural features of the '<em>Feedback Level Clearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_LEVEL_CLEARANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ClearanceImpl <em>Clearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ClearanceImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getClearance()
	 * @generated
	 */
	int CLEARANCE = 15;

	/**
	 * The feature id for the '<em><b>Basis For Clearance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE__BASIS_FOR_CLEARANCE = 0;

	/**
	 * The feature id for the '<em><b>Exception Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE__EXCEPTION_ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Clearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ExceptionEntryImpl <em>Exception Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ExceptionEntryImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getExceptionEntry()
	 * @generated
	 */
	int EXCEPTION_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Exception Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Exception Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.impl.ExceptionAttributeImpl <em>Exception Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.impl.ExceptionAttributeImpl
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getExceptionAttribute()
	 * @generated
	 */
	int EXCEPTION_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ATTRIBUTE__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ATTRIBUTE__ATTRIBUTE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Match Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ATTRIBUTE__MATCH_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Exception Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.ConsistencyViolationType <em>Violation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.ConsistencyViolationType
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyViolationType()
	 * @generated
	 */
	int CONSISTENCY_VIOLATION_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.FeedbackLevel <em>Feedback Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.FeedbackLevel
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getFeedbackLevel()
	 * @generated
	 */
	int FEEDBACK_LEVEL = 19;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.ClearanceBasis <em>Clearance Basis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.ClearanceBasis
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getClearanceBasis()
	 * @generated
	 */
	int CLEARANCE_BASIS = 20;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.MatchType <em>Match Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.MatchType
	 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getMatchType()
	 * @generated
	 */
	int MATCH_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.IHasId <em>IHas Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHas Id</em>'.
	 * @see org.fortiss.consistency.model.IHasId
	 * @generated
	 */
	EClass getIHasId();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.IHasId#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.fortiss.consistency.model.IHasId#getUuid()
	 * @see #getIHasId()
	 * @generated
	 */
	EAttribute getIHasId_Uuid();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.IHasName <em>IHas Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHas Name</em>'.
	 * @see org.fortiss.consistency.model.IHasName
	 * @generated
	 */
	EClass getIHasName();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.IHasName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.fortiss.consistency.model.IHasName#getName()
	 * @see #getIHasName()
	 * @generated
	 */
	EAttribute getIHasName_Name();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.IHasComment <em>IHas Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHas Comment</em>'.
	 * @see org.fortiss.consistency.model.IHasComment
	 * @generated
	 */
	EClass getIHasComment();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.IHasComment#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.fortiss.consistency.model.IHasComment#getComment()
	 * @see #getIHasComment()
	 * @generated
	 */
	EAttribute getIHasComment_Comment();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.IHasIdAndName <em>IHas Id And Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHas Id And Name</em>'.
	 * @see org.fortiss.consistency.model.IHasIdAndName
	 * @generated
	 */
	EClass getIHasIdAndName();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.BasicElementInformation <em>Basic Element Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Element Information</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation
	 * @generated
	 */
	EClass getBasicElementInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.BasicElementInformation#getElementClassString <em>Element Class String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Class String</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation#getElementClassString()
	 * @see #getBasicElementInformation()
	 * @generated
	 */
	EAttribute getBasicElementInformation_ElementClassString();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.BasicElementInformation#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation#getElementName()
	 * @see #getBasicElementInformation()
	 * @generated
	 */
	EAttribute getBasicElementInformation_ElementName();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.BasicElementInformation#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation#getElementId()
	 * @see #getBasicElementInformation()
	 * @generated
	 */
	EAttribute getBasicElementInformation_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.BasicElementInformation#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Model</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation#getSourceModel()
	 * @see #getBasicElementInformation()
	 * @generated
	 */
	EAttribute getBasicElementInformation_SourceModel();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.BasicElementInformation#getSourceTool <em>Source Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Tool</em>'.
	 * @see org.fortiss.consistency.model.BasicElementInformation#getSourceTool()
	 * @see #getBasicElementInformation()
	 * @generated
	 */
	EAttribute getBasicElementInformation_SourceTool();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.RelationTargetInformation <em>Relation Target Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Target Information</em>'.
	 * @see org.fortiss.consistency.model.RelationTargetInformation
	 * @generated
	 */
	EClass getRelationTargetInformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.RelationTargetInformation#getBasicInformation <em>Basic Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Information</em>'.
	 * @see org.fortiss.consistency.model.RelationTargetInformation#getBasicInformation()
	 * @see #getRelationTargetInformation()
	 * @generated
	 */
	EReference getRelationTargetInformation_BasicInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see org.fortiss.consistency.model.RelationTargetInformation#getRelationType()
	 * @see #getRelationTargetInformation()
	 * @generated
	 */
	EAttribute getRelationTargetInformation_RelationType();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RelationTargetInformation#getRelationComment <em>Relation Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Comment</em>'.
	 * @see org.fortiss.consistency.model.RelationTargetInformation#getRelationComment()
	 * @see #getRelationTargetInformation()
	 * @generated
	 */
	EAttribute getRelationTargetInformation_RelationComment();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.AbstractElementRelation <em>Abstract Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Relation</em>'.
	 * @see org.fortiss.consistency.model.AbstractElementRelation
	 * @generated
	 */
	EClass getAbstractElementRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.AbstractElementRelation#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Element</em>'.
	 * @see org.fortiss.consistency.model.AbstractElementRelation#getSourceElement()
	 * @see #getAbstractElementRelation()
	 * @generated
	 */
	EReference getAbstractElementRelation_SourceElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.AbstractElementRelation#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Elements</em>'.
	 * @see org.fortiss.consistency.model.AbstractElementRelation#getTargetElements()
	 * @see #getAbstractElementRelation()
	 * @generated
	 */
	EReference getAbstractElementRelation_TargetElements();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element</em>'.
	 * @see org.fortiss.consistency.model.RuleElement
	 * @generated
	 */
	EClass getRuleElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RuleElement#getNameInRule <em>Name In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name In Rule</em>'.
	 * @see org.fortiss.consistency.model.RuleElement#getNameInRule()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_NameInRule();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RuleElement#getElementClassString <em>Element Class String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Class String</em>'.
	 * @see org.fortiss.consistency.model.RuleElement#getElementClassString()
	 * @see #getRuleElement()
	 * @generated
	 */
	EAttribute getRuleElement_ElementClassString();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.RuleCondition <em>Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Condition</em>'.
	 * @see org.fortiss.consistency.model.RuleCondition
	 * @generated
	 */
	EClass getRuleCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RuleCondition#getOriginalExpression <em>Original Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Expression</em>'.
	 * @see org.fortiss.consistency.model.RuleCondition#getOriginalExpression()
	 * @see #getRuleCondition()
	 * @generated
	 */
	EAttribute getRuleCondition_OriginalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.RuleCondition#getModifiedExpression <em>Modified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Expression</em>'.
	 * @see org.fortiss.consistency.model.RuleCondition#getModifiedExpression()
	 * @see #getRuleCondition()
	 * @generated
	 */
	EAttribute getRuleCondition_ModifiedExpression();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ConsistencyRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyRule
	 * @generated
	 */
	EClass getConsistencyRule();

	/**
	 * Returns the meta object for the attribute list '{@link org.fortiss.consistency.model.ConsistencyRule#getRuleScope <em>Rule Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rule Scope</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyRule#getRuleScope()
	 * @see #getConsistencyRule()
	 * @generated
	 */
	EAttribute getConsistencyRule_RuleScope();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.ConsistencyRule#getRuleContext <em>Rule Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Context</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyRule#getRuleContext()
	 * @see #getConsistencyRule()
	 * @generated
	 */
	EReference getConsistencyRule_RuleContext();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConsistencyRule#getRuleCondition <em>Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Condition</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyRule#getRuleCondition()
	 * @see #getConsistencyRule()
	 * @generated
	 */
	EReference getConsistencyRule_RuleCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConsistencyRule#getConfidentialityStatus <em>Confidentiality Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confidentiality Status</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyRule#getConfidentialityStatus()
	 * @see #getConsistencyRule()
	 * @generated
	 */
	EReference getConsistencyRule_ConfidentialityStatus();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ConsistencyViolation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation
	 * @generated
	 */
	EClass getConsistencyViolation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationType <em>Violation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Violation Type</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation#getViolationType()
	 * @see #getConsistencyViolation()
	 * @generated
	 */
	EAttribute getConsistencyViolation_ViolationType();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolationTypeExplanation <em>Violation Type Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Violation Type Explanation</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation#getViolationTypeExplanation()
	 * @see #getConsistencyViolation()
	 * @generated
	 */
	EAttribute getConsistencyViolation_ViolationTypeExplanation();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConsistencyViolation#getViolatedRule <em>Violated Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Violated Rule</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation#getViolatedRule()
	 * @see #getConsistencyViolation()
	 * @generated
	 */
	EReference getConsistencyViolation_ViolatedRule();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ConsistencyViolation#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation#getCause()
	 * @see #getConsistencyViolation()
	 * @generated
	 */
	EAttribute getConsistencyViolation_Cause();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConsistencyViolation#getUsedContextData <em>Used Context Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Context Data</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolation#getUsedContextData()
	 * @see #getConsistencyViolation()
	 * @generated
	 */
	EReference getConsistencyViolation_UsedContextData();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ContextWrapper <em>Context Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Wrapper</em>'.
	 * @see org.fortiss.consistency.model.ContextWrapper
	 * @generated
	 */
	EClass getContextWrapper();

	/**
	 * Returns the meta object for the map '{@link org.fortiss.consistency.model.ContextWrapper#getContextElements <em>Context Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Context Elements</em>'.
	 * @see org.fortiss.consistency.model.ContextWrapper#getContextElements()
	 * @see #getContextWrapper()
	 * @generated
	 */
	EReference getContextWrapper_ContextElements();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Element Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Element Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.eclipse.emf.ecore.EObject" valueContainment="true" valueResolveProxies="true"
	 * @generated
	 */
	EClass getStringToElementMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToElementMapEntry()
	 * @generated
	 */
	EAttribute getStringToElementMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToElementMapEntry()
	 * @generated
	 */
	EReference getStringToElementMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ConfidentialityStatus <em>Confidentiality Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidentiality Status</em>'.
	 * @see org.fortiss.consistency.model.ConfidentialityStatus
	 * @generated
	 */
	EClass getConfidentialityStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConfidentialityStatus#getRuleClearance <em>Rule Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Clearance</em>'.
	 * @see org.fortiss.consistency.model.ConfidentialityStatus#getRuleClearance()
	 * @see #getConfidentialityStatus()
	 * @generated
	 */
	EReference getConfidentialityStatus_RuleClearance();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.ConfidentialityStatus#getFeedbackLevelClearance <em>Feedback Level Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feedback Level Clearance</em>'.
	 * @see org.fortiss.consistency.model.ConfidentialityStatus#getFeedbackLevelClearance()
	 * @see #getConfidentialityStatus()
	 * @generated
	 */
	EReference getConfidentialityStatus_FeedbackLevelClearance();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.FeedbackLevelClearance <em>Feedback Level Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Level Clearance</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance
	 * @generated
	 */
	EClass getFeedbackLevelClearance();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getInconsistencyWarningClearance <em>Inconsistency Warning Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inconsistency Warning Clearance</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance#getInconsistencyWarningClearance()
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 */
	EReference getFeedbackLevelClearance_InconsistencyWarningClearance();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getRuleWarningClearance <em>Rule Warning Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule Warning Clearance</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance#getRuleWarningClearance()
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 */
	EReference getFeedbackLevelClearance_RuleWarningClearance();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getCauseWarningClearance <em>Cause Warning Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cause Warning Clearance</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance#getCauseWarningClearance()
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 */
	EReference getFeedbackLevelClearance_CauseWarningClearance();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.FeedbackLevelClearance#getFullWarningClearance <em>Full Warning Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Full Warning Clearance</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevelClearance#getFullWarningClearance()
	 * @see #getFeedbackLevelClearance()
	 * @generated
	 */
	EReference getFeedbackLevelClearance_FullWarningClearance();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.Clearance <em>Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance</em>'.
	 * @see org.fortiss.consistency.model.Clearance
	 * @generated
	 */
	EClass getClearance();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.Clearance#getBasisForClearance <em>Basis For Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basis For Clearance</em>'.
	 * @see org.fortiss.consistency.model.Clearance#getBasisForClearance()
	 * @see #getClearance()
	 * @generated
	 */
	EAttribute getClearance_BasisForClearance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.Clearance#getExceptionEntries <em>Exception Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Entries</em>'.
	 * @see org.fortiss.consistency.model.Clearance#getExceptionEntries()
	 * @see #getClearance()
	 * @generated
	 */
	EReference getClearance_ExceptionEntries();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ExceptionEntry <em>Exception Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Entry</em>'.
	 * @see org.fortiss.consistency.model.ExceptionEntry
	 * @generated
	 */
	EClass getExceptionEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.ExceptionEntry#getExceptionAttributes <em>Exception Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exception Attributes</em>'.
	 * @see org.fortiss.consistency.model.ExceptionEntry#getExceptionAttributes()
	 * @see #getExceptionEntry()
	 * @generated
	 */
	EReference getExceptionEntry_ExceptionAttributes();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.ExceptionAttribute <em>Exception Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Attribute</em>'.
	 * @see org.fortiss.consistency.model.ExceptionAttribute
	 * @generated
	 */
	EClass getExceptionAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see org.fortiss.consistency.model.ExceptionAttribute#getAttributeName()
	 * @see #getExceptionAttribute()
	 * @generated
	 */
	EAttribute getExceptionAttribute_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ExceptionAttribute#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value</em>'.
	 * @see org.fortiss.consistency.model.ExceptionAttribute#getAttributeValue()
	 * @see #getExceptionAttribute()
	 * @generated
	 */
	EAttribute getExceptionAttribute_AttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.ExceptionAttribute#getMatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Type</em>'.
	 * @see org.fortiss.consistency.model.ExceptionAttribute#getMatchType()
	 * @see #getExceptionAttribute()
	 * @generated
	 */
	EAttribute getExceptionAttribute_MatchType();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.consistency.model.ConsistencyViolationType <em>Violation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Violation Type</em>'.
	 * @see org.fortiss.consistency.model.ConsistencyViolationType
	 * @generated
	 */
	EEnum getConsistencyViolationType();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.consistency.model.FeedbackLevel <em>Feedback Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Level</em>'.
	 * @see org.fortiss.consistency.model.FeedbackLevel
	 * @generated
	 */
	EEnum getFeedbackLevel();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.consistency.model.ClearanceBasis <em>Clearance Basis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Clearance Basis</em>'.
	 * @see org.fortiss.consistency.model.ClearanceBasis
	 * @generated
	 */
	EEnum getClearanceBasis();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.consistency.model.MatchType <em>Match Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Type</em>'.
	 * @see org.fortiss.consistency.model.MatchType
	 * @generated
	 */
	EEnum getMatchType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConsistencyFactory getConsistencyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.IHasId <em>IHas Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.IHasId
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasId()
		 * @generated
		 */
		EClass IHAS_ID = eINSTANCE.getIHasId();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IHAS_ID__UUID = eINSTANCE.getIHasId_Uuid();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.IHasName <em>IHas Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.IHasName
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasName()
		 * @generated
		 */
		EClass IHAS_NAME = eINSTANCE.getIHasName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IHAS_NAME__NAME = eINSTANCE.getIHasName_Name();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.IHasComment <em>IHas Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.IHasComment
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasComment()
		 * @generated
		 */
		EClass IHAS_COMMENT = eINSTANCE.getIHasComment();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IHAS_COMMENT__COMMENT = eINSTANCE.getIHasComment_Comment();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.IHasIdAndName <em>IHas Id And Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.IHasIdAndName
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getIHasIdAndName()
		 * @generated
		 */
		EClass IHAS_ID_AND_NAME = eINSTANCE.getIHasIdAndName();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl <em>Basic Element Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.BasicElementInformationImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getBasicElementInformation()
		 * @generated
		 */
		EClass BASIC_ELEMENT_INFORMATION = eINSTANCE.getBasicElementInformation();

		/**
		 * The meta object literal for the '<em><b>Element Class String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING = eINSTANCE.getBasicElementInformation_ElementClassString();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ELEMENT_INFORMATION__ELEMENT_NAME = eINSTANCE.getBasicElementInformation_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ELEMENT_INFORMATION__ELEMENT_ID = eINSTANCE.getBasicElementInformation_ElementId();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ELEMENT_INFORMATION__SOURCE_MODEL = eINSTANCE.getBasicElementInformation_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Source Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ELEMENT_INFORMATION__SOURCE_TOOL = eINSTANCE.getBasicElementInformation_SourceTool();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.RelationTargetInformationImpl <em>Relation Target Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.RelationTargetInformationImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRelationTargetInformation()
		 * @generated
		 */
		EClass RELATION_TARGET_INFORMATION = eINSTANCE.getRelationTargetInformation();

		/**
		 * The meta object literal for the '<em><b>Basic Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TARGET_INFORMATION__BASIC_INFORMATION = eINSTANCE.getRelationTargetInformation_BasicInformation();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TARGET_INFORMATION__RELATION_TYPE = eINSTANCE.getRelationTargetInformation_RelationType();

		/**
		 * The meta object literal for the '<em><b>Relation Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TARGET_INFORMATION__RELATION_COMMENT = eINSTANCE.getRelationTargetInformation_RelationComment();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.AbstractElementRelationImpl <em>Abstract Element Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.AbstractElementRelationImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getAbstractElementRelation()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT_RELATION = eINSTANCE.getAbstractElementRelation();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT = eINSTANCE.getAbstractElementRelation_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS = eINSTANCE.getAbstractElementRelation_TargetElements();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.RuleElementImpl <em>Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.RuleElementImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRuleElement()
		 * @generated
		 */
		EClass RULE_ELEMENT = eINSTANCE.getRuleElement();

		/**
		 * The meta object literal for the '<em><b>Name In Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__NAME_IN_RULE = eINSTANCE.getRuleElement_NameInRule();

		/**
		 * The meta object literal for the '<em><b>Element Class String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENT__ELEMENT_CLASS_STRING = eINSTANCE.getRuleElement_ElementClassString();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.RuleConditionImpl <em>Rule Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.RuleConditionImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getRuleCondition()
		 * @generated
		 */
		EClass RULE_CONDITION = eINSTANCE.getRuleCondition();

		/**
		 * The meta object literal for the '<em><b>Original Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_CONDITION__ORIGINAL_EXPRESSION = eINSTANCE.getRuleCondition_OriginalExpression();

		/**
		 * The meta object literal for the '<em><b>Modified Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_CONDITION__MODIFIED_EXPRESSION = eINSTANCE.getRuleCondition_ModifiedExpression();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ConsistencyRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ConsistencyRuleImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyRule()
		 * @generated
		 */
		EClass CONSISTENCY_RULE = eINSTANCE.getConsistencyRule();

		/**
		 * The meta object literal for the '<em><b>Rule Scope</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSISTENCY_RULE__RULE_SCOPE = eINSTANCE.getConsistencyRule_RuleScope();

		/**
		 * The meta object literal for the '<em><b>Rule Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_RULE__RULE_CONTEXT = eINSTANCE.getConsistencyRule_RuleContext();

		/**
		 * The meta object literal for the '<em><b>Rule Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_RULE__RULE_CONDITION = eINSTANCE.getConsistencyRule_RuleCondition();

		/**
		 * The meta object literal for the '<em><b>Confidentiality Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_RULE__CONFIDENTIALITY_STATUS = eINSTANCE.getConsistencyRule_ConfidentialityStatus();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ConsistencyViolationImpl <em>Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ConsistencyViolationImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyViolation()
		 * @generated
		 */
		EClass CONSISTENCY_VIOLATION = eINSTANCE.getConsistencyViolation();

		/**
		 * The meta object literal for the '<em><b>Violation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSISTENCY_VIOLATION__VIOLATION_TYPE = eINSTANCE.getConsistencyViolation_ViolationType();

		/**
		 * The meta object literal for the '<em><b>Violation Type Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION = eINSTANCE.getConsistencyViolation_ViolationTypeExplanation();

		/**
		 * The meta object literal for the '<em><b>Violated Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_VIOLATION__VIOLATED_RULE = eINSTANCE.getConsistencyViolation_ViolatedRule();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSISTENCY_VIOLATION__CAUSE = eINSTANCE.getConsistencyViolation_Cause();

		/**
		 * The meta object literal for the '<em><b>Used Context Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSISTENCY_VIOLATION__USED_CONTEXT_DATA = eINSTANCE.getConsistencyViolation_UsedContextData();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ContextWrapperImpl <em>Context Wrapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ContextWrapperImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getContextWrapper()
		 * @generated
		 */
		EClass CONTEXT_WRAPPER = eINSTANCE.getContextWrapper();

		/**
		 * The meta object literal for the '<em><b>Context Elements</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_WRAPPER__CONTEXT_ELEMENTS = eINSTANCE.getContextWrapper_ContextElements();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.StringToElementMapEntryImpl <em>String To Element Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.StringToElementMapEntryImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getStringToElementMapEntry()
		 * @generated
		 */
		EClass STRING_TO_ELEMENT_MAP_ENTRY = eINSTANCE.getStringToElementMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_ELEMENT_MAP_ENTRY__KEY = eINSTANCE.getStringToElementMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_ELEMENT_MAP_ENTRY__VALUE = eINSTANCE.getStringToElementMapEntry_Value();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ConfidentialityStatusImpl <em>Confidentiality Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ConfidentialityStatusImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConfidentialityStatus()
		 * @generated
		 */
		EClass CONFIDENTIALITY_STATUS = eINSTANCE.getConfidentialityStatus();

		/**
		 * The meta object literal for the '<em><b>Rule Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_STATUS__RULE_CLEARANCE = eINSTANCE.getConfidentialityStatus_RuleClearance();

		/**
		 * The meta object literal for the '<em><b>Feedback Level Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE = eINSTANCE.getConfidentialityStatus_FeedbackLevelClearance();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl <em>Feedback Level Clearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.FeedbackLevelClearanceImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getFeedbackLevelClearance()
		 * @generated
		 */
		EClass FEEDBACK_LEVEL_CLEARANCE = eINSTANCE.getFeedbackLevelClearance();

		/**
		 * The meta object literal for the '<em><b>Inconsistency Warning Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE = eINSTANCE.getFeedbackLevelClearance_InconsistencyWarningClearance();

		/**
		 * The meta object literal for the '<em><b>Rule Warning Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE = eINSTANCE.getFeedbackLevelClearance_RuleWarningClearance();

		/**
		 * The meta object literal for the '<em><b>Cause Warning Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE = eINSTANCE.getFeedbackLevelClearance_CauseWarningClearance();

		/**
		 * The meta object literal for the '<em><b>Full Warning Clearance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE = eINSTANCE.getFeedbackLevelClearance_FullWarningClearance();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ClearanceImpl <em>Clearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ClearanceImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getClearance()
		 * @generated
		 */
		EClass CLEARANCE = eINSTANCE.getClearance();

		/**
		 * The meta object literal for the '<em><b>Basis For Clearance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE__BASIS_FOR_CLEARANCE = eINSTANCE.getClearance_BasisForClearance();

		/**
		 * The meta object literal for the '<em><b>Exception Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLEARANCE__EXCEPTION_ENTRIES = eINSTANCE.getClearance_ExceptionEntries();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ExceptionEntryImpl <em>Exception Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ExceptionEntryImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getExceptionEntry()
		 * @generated
		 */
		EClass EXCEPTION_ENTRY = eINSTANCE.getExceptionEntry();

		/**
		 * The meta object literal for the '<em><b>Exception Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES = eINSTANCE.getExceptionEntry_ExceptionAttributes();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.impl.ExceptionAttributeImpl <em>Exception Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.impl.ExceptionAttributeImpl
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getExceptionAttribute()
		 * @generated
		 */
		EClass EXCEPTION_ATTRIBUTE = eINSTANCE.getExceptionAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getExceptionAttribute_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getExceptionAttribute_AttributeValue();

		/**
		 * The meta object literal for the '<em><b>Match Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION_ATTRIBUTE__MATCH_TYPE = eINSTANCE.getExceptionAttribute_MatchType();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.ConsistencyViolationType <em>Violation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.ConsistencyViolationType
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getConsistencyViolationType()
		 * @generated
		 */
		EEnum CONSISTENCY_VIOLATION_TYPE = eINSTANCE.getConsistencyViolationType();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.FeedbackLevel <em>Feedback Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.FeedbackLevel
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getFeedbackLevel()
		 * @generated
		 */
		EEnum FEEDBACK_LEVEL = eINSTANCE.getFeedbackLevel();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.ClearanceBasis <em>Clearance Basis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.ClearanceBasis
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getClearanceBasis()
		 * @generated
		 */
		EEnum CLEARANCE_BASIS = eINSTANCE.getClearanceBasis();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.MatchType <em>Match Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.MatchType
		 * @see org.fortiss.consistency.model.impl.ConsistencyPackageImpl#getMatchType()
		 * @generated
		 */
		EEnum MATCH_TYPE = eINSTANCE.getMatchType();

	}

} //ConsistencyPackage
