/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.consistency.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsistencyFactoryImpl extends EFactoryImpl implements ConsistencyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConsistencyFactory init() {
		try {
			ConsistencyFactory theConsistencyFactory = (ConsistencyFactory)EPackage.Registry.INSTANCE.getEFactory(ConsistencyPackage.eNS_URI);
			if (theConsistencyFactory != null) {
				return theConsistencyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConsistencyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION: return createBasicElementInformation();
			case ConsistencyPackage.RELATION_TARGET_INFORMATION: return createRelationTargetInformation();
			case ConsistencyPackage.ABSTRACT_ELEMENT_RELATION: return createAbstractElementRelation();
			case ConsistencyPackage.RULE_ELEMENT: return createRuleElement();
			case ConsistencyPackage.RULE_CONDITION: return createRuleCondition();
			case ConsistencyPackage.CONSISTENCY_RULE: return createConsistencyRule();
			case ConsistencyPackage.CONSISTENCY_VIOLATION: return createConsistencyViolation();
			case ConsistencyPackage.CONTEXT_WRAPPER: return createContextWrapper();
			case ConsistencyPackage.STRING_TO_ELEMENT_MAP_ENTRY: return (EObject)createStringToElementMapEntry();
			case ConsistencyPackage.CONFIDENTIALITY_STATUS: return createConfidentialityStatus();
			case ConsistencyPackage.FEEDBACK_LEVEL_CLEARANCE: return createFeedbackLevelClearance();
			case ConsistencyPackage.CLEARANCE: return createClearance();
			case ConsistencyPackage.EXCEPTION_ENTRY: return createExceptionEntry();
			case ConsistencyPackage.EXCEPTION_ATTRIBUTE: return createExceptionAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConsistencyPackage.CONSISTENCY_VIOLATION_TYPE:
				return createConsistencyViolationTypeFromString(eDataType, initialValue);
			case ConsistencyPackage.FEEDBACK_LEVEL:
				return createFeedbackLevelFromString(eDataType, initialValue);
			case ConsistencyPackage.CLEARANCE_BASIS:
				return createClearanceBasisFromString(eDataType, initialValue);
			case ConsistencyPackage.MATCH_TYPE:
				return createMatchTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConsistencyPackage.CONSISTENCY_VIOLATION_TYPE:
				return convertConsistencyViolationTypeToString(eDataType, instanceValue);
			case ConsistencyPackage.FEEDBACK_LEVEL:
				return convertFeedbackLevelToString(eDataType, instanceValue);
			case ConsistencyPackage.CLEARANCE_BASIS:
				return convertClearanceBasisToString(eDataType, instanceValue);
			case ConsistencyPackage.MATCH_TYPE:
				return convertMatchTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicElementInformation createBasicElementInformation() {
		BasicElementInformationImpl basicElementInformation = new BasicElementInformationImpl();
		return basicElementInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationTargetInformation createRelationTargetInformation() {
		RelationTargetInformationImpl relationTargetInformation = new RelationTargetInformationImpl();
		return relationTargetInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractElementRelation createAbstractElementRelation() {
		AbstractElementRelationImpl abstractElementRelation = new AbstractElementRelationImpl();
		return abstractElementRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleElement createRuleElement() {
		RuleElementImpl ruleElement = new RuleElementImpl();
		return ruleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuleCondition createRuleCondition() {
		RuleConditionImpl ruleCondition = new RuleConditionImpl();
		return ruleCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyRule createConsistencyRule() {
		ConsistencyRuleImpl consistencyRule = new ConsistencyRuleImpl();
		return consistencyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyViolation createConsistencyViolation() {
		ConsistencyViolationImpl consistencyViolation = new ConsistencyViolationImpl();
		return consistencyViolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextWrapper createContextWrapper() {
		ContextWrapperImpl contextWrapper = new ContextWrapperImpl();
		return contextWrapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObject> createStringToElementMapEntry() {
		StringToElementMapEntryImpl stringToElementMapEntry = new StringToElementMapEntryImpl();
		return stringToElementMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidentialityStatus createConfidentialityStatus() {
		ConfidentialityStatusImpl confidentialityStatus = new ConfidentialityStatusImpl();
		return confidentialityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeedbackLevelClearance createFeedbackLevelClearance() {
		FeedbackLevelClearanceImpl feedbackLevelClearance = new FeedbackLevelClearanceImpl();
		return feedbackLevelClearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clearance createClearance() {
		ClearanceImpl clearance = new ClearanceImpl();
		return clearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionEntry createExceptionEntry() {
		ExceptionEntryImpl exceptionEntry = new ExceptionEntryImpl();
		return exceptionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionAttribute createExceptionAttribute() {
		ExceptionAttributeImpl exceptionAttribute = new ExceptionAttributeImpl();
		return exceptionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyViolationType createConsistencyViolationTypeFromString(EDataType eDataType, String initialValue) {
		ConsistencyViolationType result = ConsistencyViolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConsistencyViolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackLevel createFeedbackLevelFromString(EDataType eDataType, String initialValue) {
		FeedbackLevel result = FeedbackLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedbackLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearanceBasis createClearanceBasisFromString(EDataType eDataType, String initialValue) {
		ClearanceBasis result = ClearanceBasis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClearanceBasisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchType createMatchTypeFromString(EDataType eDataType, String initialValue) {
		MatchType result = MatchType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyPackage getConsistencyPackage() {
		return (ConsistencyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConsistencyPackage getPackage() {
		return ConsistencyPackage.eINSTANCE;
	}

} //ConsistencyFactoryImpl
