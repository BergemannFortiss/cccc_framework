/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.consistency.model.AbstractElementRelation;
import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.Clearance;
import org.fortiss.consistency.model.ClearanceBasis;
import org.fortiss.consistency.model.ConfidentialityStatus;
import org.fortiss.consistency.model.ConsistencyFactory;
import org.fortiss.consistency.model.ConsistencyPackage;
import org.fortiss.consistency.model.ConsistencyRule;
import org.fortiss.consistency.model.ConsistencyViolation;
import org.fortiss.consistency.model.ConsistencyViolationType;
import org.fortiss.consistency.model.ContextWrapper;
import org.fortiss.consistency.model.ExceptionAttribute;
import org.fortiss.consistency.model.ExceptionEntry;
import org.fortiss.consistency.model.FeedbackLevel;
import org.fortiss.consistency.model.FeedbackLevelClearance;
import org.fortiss.consistency.model.IHasComment;
import org.fortiss.consistency.model.IHasId;
import org.fortiss.consistency.model.IHasIdAndName;
import org.fortiss.consistency.model.IHasName;
import org.fortiss.consistency.model.MatchType;
import org.fortiss.consistency.model.RelationTargetInformation;
import org.fortiss.consistency.model.RuleCondition;
import org.fortiss.consistency.model.RuleElement;

import org.fortiss.consistency.model.communication.CommunicationPackage;

import org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl;

import org.fortiss.consistency.model.views.ViewsPackage;

import org.fortiss.consistency.model.views.impl.ViewsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsistencyPackageImpl extends EPackageImpl implements ConsistencyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHasIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHasNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHasCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHasIdAndNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicElementInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTargetInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consistencyRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consistencyViolationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextWrapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToElementMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidentialityStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackLevelClearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consistencyViolationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedbackLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clearanceBasisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum matchTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.fortiss.consistency.model.ConsistencyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConsistencyPackageImpl() {
		super(eNS_URI, ConsistencyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConsistencyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConsistencyPackage init() {
		if (isInited) return (ConsistencyPackage)EPackage.Registry.INSTANCE.getEPackage(ConsistencyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConsistencyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConsistencyPackageImpl theConsistencyPackage = registeredConsistencyPackage instanceof ConsistencyPackageImpl ? (ConsistencyPackageImpl)registeredConsistencyPackage : new ConsistencyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(registeredPackage instanceof CommunicationPackageImpl ? registeredPackage : CommunicationPackage.eINSTANCE);

		// Create package meta-data objects
		theConsistencyPackage.createPackageContents();
		theViewsPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();

		// Initialize created meta-data
		theConsistencyPackage.initializePackageContents();
		theViewsPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConsistencyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConsistencyPackage.eNS_URI, theConsistencyPackage);
		return theConsistencyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIHasId() {
		return iHasIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIHasId_Uuid() {
		return (EAttribute)iHasIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIHasName() {
		return iHasNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIHasName_Name() {
		return (EAttribute)iHasNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIHasComment() {
		return iHasCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIHasComment_Comment() {
		return (EAttribute)iHasCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIHasIdAndName() {
		return iHasIdAndNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicElementInformation() {
		return basicElementInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicElementInformation_ElementClassString() {
		return (EAttribute)basicElementInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicElementInformation_ElementName() {
		return (EAttribute)basicElementInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicElementInformation_ElementId() {
		return (EAttribute)basicElementInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicElementInformation_SourceModel() {
		return (EAttribute)basicElementInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicElementInformation_SourceTool() {
		return (EAttribute)basicElementInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationTargetInformation() {
		return relationTargetInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationTargetInformation_BasicInformation() {
		return (EReference)relationTargetInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationTargetInformation_RelationType() {
		return (EAttribute)relationTargetInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationTargetInformation_RelationComment() {
		return (EAttribute)relationTargetInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractElementRelation() {
		return abstractElementRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractElementRelation_SourceElement() {
		return (EReference)abstractElementRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractElementRelation_TargetElements() {
		return (EReference)abstractElementRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleElement() {
		return ruleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleElement_NameInRule() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleElement_ElementClassString() {
		return (EAttribute)ruleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleCondition() {
		return ruleConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleCondition_OriginalExpression() {
		return (EAttribute)ruleConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleCondition_ModifiedExpression() {
		return (EAttribute)ruleConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsistencyRule() {
		return consistencyRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsistencyRule_RuleScope() {
		return (EAttribute)consistencyRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsistencyRule_RuleContext() {
		return (EReference)consistencyRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsistencyRule_RuleCondition() {
		return (EReference)consistencyRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsistencyRule_ConfidentialityStatus() {
		return (EReference)consistencyRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsistencyViolation() {
		return consistencyViolationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsistencyViolation_ViolationType() {
		return (EAttribute)consistencyViolationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsistencyViolation_ViolationTypeExplanation() {
		return (EAttribute)consistencyViolationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsistencyViolation_ViolatedRule() {
		return (EReference)consistencyViolationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConsistencyViolation_Cause() {
		return (EAttribute)consistencyViolationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsistencyViolation_UsedContextData() {
		return (EReference)consistencyViolationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextWrapper() {
		return contextWrapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextWrapper_ContextElements() {
		return (EReference)contextWrapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToElementMapEntry() {
		return stringToElementMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToElementMapEntry_Key() {
		return (EAttribute)stringToElementMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringToElementMapEntry_Value() {
		return (EReference)stringToElementMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidentialityStatus() {
		return confidentialityStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfidentialityStatus_RuleClearance() {
		return (EReference)confidentialityStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfidentialityStatus_FeedbackLevelClearance() {
		return (EReference)confidentialityStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeedbackLevelClearance() {
		return feedbackLevelClearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackLevelClearance_InconsistencyWarningClearance() {
		return (EReference)feedbackLevelClearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackLevelClearance_RuleWarningClearance() {
		return (EReference)feedbackLevelClearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackLevelClearance_CauseWarningClearance() {
		return (EReference)feedbackLevelClearanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeedbackLevelClearance_FullWarningClearance() {
		return (EReference)feedbackLevelClearanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClearance() {
		return clearanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClearance_BasisForClearance() {
		return (EAttribute)clearanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClearance_ExceptionEntries() {
		return (EReference)clearanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionEntry() {
		return exceptionEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExceptionEntry_ExceptionAttributes() {
		return (EReference)exceptionEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionAttribute() {
		return exceptionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionAttribute_AttributeName() {
		return (EAttribute)exceptionAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionAttribute_AttributeValue() {
		return (EAttribute)exceptionAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionAttribute_MatchType() {
		return (EAttribute)exceptionAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConsistencyViolationType() {
		return consistencyViolationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFeedbackLevel() {
		return feedbackLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClearanceBasis() {
		return clearanceBasisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMatchType() {
		return matchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsistencyFactory getConsistencyFactory() {
		return (ConsistencyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iHasIdEClass = createEClass(IHAS_ID);
		createEAttribute(iHasIdEClass, IHAS_ID__UUID);

		iHasNameEClass = createEClass(IHAS_NAME);
		createEAttribute(iHasNameEClass, IHAS_NAME__NAME);

		iHasCommentEClass = createEClass(IHAS_COMMENT);
		createEAttribute(iHasCommentEClass, IHAS_COMMENT__COMMENT);

		iHasIdAndNameEClass = createEClass(IHAS_ID_AND_NAME);

		basicElementInformationEClass = createEClass(BASIC_ELEMENT_INFORMATION);
		createEAttribute(basicElementInformationEClass, BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING);
		createEAttribute(basicElementInformationEClass, BASIC_ELEMENT_INFORMATION__ELEMENT_NAME);
		createEAttribute(basicElementInformationEClass, BASIC_ELEMENT_INFORMATION__ELEMENT_ID);
		createEAttribute(basicElementInformationEClass, BASIC_ELEMENT_INFORMATION__SOURCE_MODEL);
		createEAttribute(basicElementInformationEClass, BASIC_ELEMENT_INFORMATION__SOURCE_TOOL);

		relationTargetInformationEClass = createEClass(RELATION_TARGET_INFORMATION);
		createEReference(relationTargetInformationEClass, RELATION_TARGET_INFORMATION__BASIC_INFORMATION);
		createEAttribute(relationTargetInformationEClass, RELATION_TARGET_INFORMATION__RELATION_TYPE);
		createEAttribute(relationTargetInformationEClass, RELATION_TARGET_INFORMATION__RELATION_COMMENT);

		abstractElementRelationEClass = createEClass(ABSTRACT_ELEMENT_RELATION);
		createEReference(abstractElementRelationEClass, ABSTRACT_ELEMENT_RELATION__SOURCE_ELEMENT);
		createEReference(abstractElementRelationEClass, ABSTRACT_ELEMENT_RELATION__TARGET_ELEMENTS);

		ruleElementEClass = createEClass(RULE_ELEMENT);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__NAME_IN_RULE);
		createEAttribute(ruleElementEClass, RULE_ELEMENT__ELEMENT_CLASS_STRING);

		ruleConditionEClass = createEClass(RULE_CONDITION);
		createEAttribute(ruleConditionEClass, RULE_CONDITION__ORIGINAL_EXPRESSION);
		createEAttribute(ruleConditionEClass, RULE_CONDITION__MODIFIED_EXPRESSION);

		consistencyRuleEClass = createEClass(CONSISTENCY_RULE);
		createEAttribute(consistencyRuleEClass, CONSISTENCY_RULE__RULE_SCOPE);
		createEReference(consistencyRuleEClass, CONSISTENCY_RULE__RULE_CONTEXT);
		createEReference(consistencyRuleEClass, CONSISTENCY_RULE__RULE_CONDITION);
		createEReference(consistencyRuleEClass, CONSISTENCY_RULE__CONFIDENTIALITY_STATUS);

		consistencyViolationEClass = createEClass(CONSISTENCY_VIOLATION);
		createEAttribute(consistencyViolationEClass, CONSISTENCY_VIOLATION__VIOLATION_TYPE);
		createEAttribute(consistencyViolationEClass, CONSISTENCY_VIOLATION__VIOLATION_TYPE_EXPLANATION);
		createEReference(consistencyViolationEClass, CONSISTENCY_VIOLATION__VIOLATED_RULE);
		createEAttribute(consistencyViolationEClass, CONSISTENCY_VIOLATION__CAUSE);
		createEReference(consistencyViolationEClass, CONSISTENCY_VIOLATION__USED_CONTEXT_DATA);

		contextWrapperEClass = createEClass(CONTEXT_WRAPPER);
		createEReference(contextWrapperEClass, CONTEXT_WRAPPER__CONTEXT_ELEMENTS);

		stringToElementMapEntryEClass = createEClass(STRING_TO_ELEMENT_MAP_ENTRY);
		createEAttribute(stringToElementMapEntryEClass, STRING_TO_ELEMENT_MAP_ENTRY__KEY);
		createEReference(stringToElementMapEntryEClass, STRING_TO_ELEMENT_MAP_ENTRY__VALUE);

		confidentialityStatusEClass = createEClass(CONFIDENTIALITY_STATUS);
		createEReference(confidentialityStatusEClass, CONFIDENTIALITY_STATUS__RULE_CLEARANCE);
		createEReference(confidentialityStatusEClass, CONFIDENTIALITY_STATUS__FEEDBACK_LEVEL_CLEARANCE);

		feedbackLevelClearanceEClass = createEClass(FEEDBACK_LEVEL_CLEARANCE);
		createEReference(feedbackLevelClearanceEClass, FEEDBACK_LEVEL_CLEARANCE__INCONSISTENCY_WARNING_CLEARANCE);
		createEReference(feedbackLevelClearanceEClass, FEEDBACK_LEVEL_CLEARANCE__RULE_WARNING_CLEARANCE);
		createEReference(feedbackLevelClearanceEClass, FEEDBACK_LEVEL_CLEARANCE__CAUSE_WARNING_CLEARANCE);
		createEReference(feedbackLevelClearanceEClass, FEEDBACK_LEVEL_CLEARANCE__FULL_WARNING_CLEARANCE);

		clearanceEClass = createEClass(CLEARANCE);
		createEAttribute(clearanceEClass, CLEARANCE__BASIS_FOR_CLEARANCE);
		createEReference(clearanceEClass, CLEARANCE__EXCEPTION_ENTRIES);

		exceptionEntryEClass = createEClass(EXCEPTION_ENTRY);
		createEReference(exceptionEntryEClass, EXCEPTION_ENTRY__EXCEPTION_ATTRIBUTES);

		exceptionAttributeEClass = createEClass(EXCEPTION_ATTRIBUTE);
		createEAttribute(exceptionAttributeEClass, EXCEPTION_ATTRIBUTE__ATTRIBUTE_NAME);
		createEAttribute(exceptionAttributeEClass, EXCEPTION_ATTRIBUTE__ATTRIBUTE_VALUE);
		createEAttribute(exceptionAttributeEClass, EXCEPTION_ATTRIBUTE__MATCH_TYPE);

		// Create enums
		consistencyViolationTypeEEnum = createEEnum(CONSISTENCY_VIOLATION_TYPE);
		feedbackLevelEEnum = createEEnum(FEEDBACK_LEVEL);
		clearanceBasisEEnum = createEEnum(CLEARANCE_BASIS);
		matchTypeEEnum = createEEnum(MATCH_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ViewsPackage theViewsPackage = (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theViewsPackage);
		getESubpackages().add(theCommunicationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iHasIdAndNameEClass.getESuperTypes().add(this.getIHasId());
		iHasIdAndNameEClass.getESuperTypes().add(this.getIHasName());
		consistencyRuleEClass.getESuperTypes().add(this.getIHasIdAndName());
		consistencyRuleEClass.getESuperTypes().add(this.getIHasComment());
		consistencyViolationEClass.getESuperTypes().add(this.getIHasName());

		// Initialize classes and features; add operations and parameters
		initEClass(iHasIdEClass, IHasId.class, "IHasId", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIHasId_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, IHasId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iHasNameEClass, IHasName.class, "IHasName", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIHasName_Name(), ecorePackage.getEString(), "name", null, 0, 1, IHasName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iHasCommentEClass, IHasComment.class, "IHasComment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIHasComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, IHasComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iHasIdAndNameEClass, IHasIdAndName.class, "IHasIdAndName", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicElementInformationEClass, BasicElementInformation.class, "BasicElementInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicElementInformation_ElementClassString(), ecorePackage.getEString(), "elementClassString", null, 0, 1, BasicElementInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicElementInformation_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, BasicElementInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicElementInformation_ElementId(), ecorePackage.getEString(), "elementId", null, 0, 1, BasicElementInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicElementInformation_SourceModel(), ecorePackage.getEString(), "sourceModel", null, 0, 1, BasicElementInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicElementInformation_SourceTool(), ecorePackage.getEString(), "sourceTool", null, 0, 1, BasicElementInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationTargetInformationEClass, RelationTargetInformation.class, "RelationTargetInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationTargetInformation_BasicInformation(), this.getBasicElementInformation(), null, "basicInformation", null, 0, 1, RelationTargetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationTargetInformation_RelationType(), ecorePackage.getEString(), "relationType", null, 0, 1, RelationTargetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationTargetInformation_RelationComment(), ecorePackage.getEString(), "relationComment", null, 0, 1, RelationTargetInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementRelationEClass, AbstractElementRelation.class, "AbstractElementRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractElementRelation_SourceElement(), this.getRuleElement(), null, "sourceElement", null, 0, 1, AbstractElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractElementRelation_TargetElements(), this.getRuleElement(), null, "targetElements", null, 0, -1, AbstractElementRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleElementEClass, RuleElement.class, "RuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleElement_NameInRule(), ecorePackage.getEString(), "nameInRule", null, 0, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleElement_ElementClassString(), ecorePackage.getEString(), "elementClassString", null, 0, 1, RuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleConditionEClass, RuleCondition.class, "RuleCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleCondition_OriginalExpression(), ecorePackage.getEString(), "originalExpression", null, 0, 1, RuleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRuleCondition_ModifiedExpression(), ecorePackage.getEString(), "modifiedExpression", null, 0, 1, RuleCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consistencyRuleEClass, ConsistencyRule.class, "ConsistencyRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsistencyRule_RuleScope(), ecorePackage.getEString(), "ruleScope", null, 0, -1, ConsistencyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistencyRule_RuleContext(), this.getAbstractElementRelation(), null, "ruleContext", null, 0, -1, ConsistencyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistencyRule_RuleCondition(), this.getRuleCondition(), null, "ruleCondition", null, 0, 1, ConsistencyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistencyRule_ConfidentialityStatus(), this.getConfidentialityStatus(), null, "confidentialityStatus", null, 0, 1, ConsistencyRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consistencyViolationEClass, ConsistencyViolation.class, "ConsistencyViolation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsistencyViolation_ViolationType(), this.getConsistencyViolationType(), "violationType", null, 0, 1, ConsistencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsistencyViolation_ViolationTypeExplanation(), ecorePackage.getEString(), "violationTypeExplanation", null, 0, 1, ConsistencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistencyViolation_ViolatedRule(), this.getConsistencyRule(), null, "violatedRule", null, 0, 1, ConsistencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsistencyViolation_Cause(), ecorePackage.getEString(), "cause", null, 0, 1, ConsistencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsistencyViolation_UsedContextData(), this.getContextWrapper(), null, "usedContextData", null, 0, 1, ConsistencyViolation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextWrapperEClass, ContextWrapper.class, "ContextWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextWrapper_ContextElements(), this.getStringToElementMapEntry(), null, "contextElements", null, 0, -1, ContextWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToElementMapEntryEClass, Map.Entry.class, "StringToElementMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToElementMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToElementMapEntry_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confidentialityStatusEClass, ConfidentialityStatus.class, "ConfidentialityStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfidentialityStatus_RuleClearance(), this.getClearance(), null, "ruleClearance", null, 0, 1, ConfidentialityStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfidentialityStatus_FeedbackLevelClearance(), this.getFeedbackLevelClearance(), null, "feedbackLevelClearance", null, 0, 1, ConfidentialityStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackLevelClearanceEClass, FeedbackLevelClearance.class, "FeedbackLevelClearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedbackLevelClearance_InconsistencyWarningClearance(), this.getClearance(), null, "inconsistencyWarningClearance", null, 0, 1, FeedbackLevelClearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackLevelClearance_RuleWarningClearance(), this.getClearance(), null, "ruleWarningClearance", null, 0, 1, FeedbackLevelClearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackLevelClearance_CauseWarningClearance(), this.getClearance(), null, "causeWarningClearance", null, 0, 1, FeedbackLevelClearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackLevelClearance_FullWarningClearance(), this.getClearance(), null, "fullWarningClearance", null, 0, 1, FeedbackLevelClearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clearanceEClass, Clearance.class, "Clearance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClearance_BasisForClearance(), this.getClearanceBasis(), "basisForClearance", null, 0, 1, Clearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClearance_ExceptionEntries(), this.getExceptionEntry(), null, "exceptionEntries", null, 0, -1, Clearance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEntryEClass, ExceptionEntry.class, "ExceptionEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionEntry_ExceptionAttributes(), this.getExceptionAttribute(), null, "exceptionAttributes", null, 0, -1, ExceptionEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionAttributeEClass, ExceptionAttribute.class, "ExceptionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, ExceptionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExceptionAttribute_AttributeValue(), ecorePackage.getEString(), "attributeValue", null, 0, 1, ExceptionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExceptionAttribute_MatchType(), this.getMatchType(), "matchType", null, 0, 1, ExceptionAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(consistencyViolationTypeEEnum, ConsistencyViolationType.class, "ConsistencyViolationType");
		addEEnumLiteral(consistencyViolationTypeEEnum, ConsistencyViolationType.FOUND_INCONSISTENCY);
		addEEnumLiteral(consistencyViolationTypeEEnum, ConsistencyViolationType.EXPERIENCED_EXCEPTION);
		addEEnumLiteral(consistencyViolationTypeEEnum, ConsistencyViolationType.BLOCKED_ACCESS);

		initEEnum(feedbackLevelEEnum, FeedbackLevel.class, "FeedbackLevel");
		addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.INCONSISTENCY_WARNING);
		addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.RULE_WARNING);
		addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.CAUSE_WARNING);
		addEEnumLiteral(feedbackLevelEEnum, FeedbackLevel.FULL_WARNING);

		initEEnum(clearanceBasisEEnum, ClearanceBasis.class, "ClearanceBasis");
		addEEnumLiteral(clearanceBasisEEnum, ClearanceBasis.NONE);
		addEEnumLiteral(clearanceBasisEEnum, ClearanceBasis.ALL);

		initEEnum(matchTypeEEnum, MatchType.class, "MatchType");
		addEEnumLiteral(matchTypeEEnum, MatchType.IDENTICAL);
		addEEnumLiteral(matchTypeEEnum, MatchType.MINIMUM);
		addEEnumLiteral(matchTypeEEnum, MatchType.MAXIMUM);

		// Create resource
		createResource(eNS_URI);
	}

} //ConsistencyPackageImpl
