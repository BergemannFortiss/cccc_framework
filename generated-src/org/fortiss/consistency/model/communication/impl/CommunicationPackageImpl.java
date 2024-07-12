/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.consistency.model.ConsistencyPackage;

import org.fortiss.consistency.model.communication.CommunicationFactory;
import org.fortiss.consistency.model.communication.CommunicationPackage;
import org.fortiss.consistency.model.communication.ModelDataFeedback;
import org.fortiss.consistency.model.communication.ModelDataRequest;
import org.fortiss.consistency.model.communication.RequestFulfillment;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;
import org.fortiss.consistency.model.communication.TriggerFeedback;
import org.fortiss.consistency.model.communication.TriggerRequest;
import org.fortiss.consistency.model.communication.UserBaseAttributes;
import org.fortiss.consistency.model.communication.UserDetailedInformation;
import org.fortiss.consistency.model.communication.UserHiddenInformation;
import org.fortiss.consistency.model.communication.UserInitialInformation;
import org.fortiss.consistency.model.communication.UserToken;

import org.fortiss.consistency.model.impl.ConsistencyPackageImpl;

import org.fortiss.consistency.model.views.ViewsPackage;

import org.fortiss.consistency.model.views.impl.ViewsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationPackageImpl extends EPackageImpl implements CommunicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolAdapterRegistrationEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userBaseAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userHiddenInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInitialInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDetailedInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDataRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDataFeedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestFulfillmentEEnum = null;

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
	 * @see org.fortiss.consistency.model.communication.CommunicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationPackageImpl() {
		super(eNS_URI, CommunicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationPackage init() {
		if (isInited) return (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationPackageImpl theCommunicationPackage = registeredCommunicationPackage instanceof CommunicationPackageImpl ? (CommunicationPackageImpl)registeredCommunicationPackage : new CommunicationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConsistencyPackage.eNS_URI);
		ConsistencyPackageImpl theConsistencyPackage = (ConsistencyPackageImpl)(registeredPackage instanceof ConsistencyPackageImpl ? registeredPackage : ConsistencyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(registeredPackage instanceof ViewsPackageImpl ? registeredPackage : ViewsPackage.eINSTANCE);

		// Create package meta-data objects
		theCommunicationPackage.createPackageContents();
		theConsistencyPackage.createPackageContents();
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationPackage.initializePackageContents();
		theConsistencyPackage.initializePackageContents();
		theViewsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationPackage.eNS_URI, theCommunicationPackage);
		return theCommunicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolAdapterRegistrationEntry() {
		return toolAdapterRegistrationEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolAdapterRegistrationEntry_AdapterIdentifier() {
		return (EAttribute)toolAdapterRegistrationEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolAdapterRegistrationEntry_FullAdapterName() {
		return (EAttribute)toolAdapterRegistrationEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolAdapterRegistrationEntry_AdapterDataServerHostAddress() {
		return (EAttribute)toolAdapterRegistrationEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolAdapterRegistrationEntry_AdapterDataServerPort() {
		return (EAttribute)toolAdapterRegistrationEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolAdapterRegistrationEntry_SerializedAdapterPublicKey() {
		return (EAttribute)toolAdapterRegistrationEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserToken() {
		return userTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserToken_Token() {
		return (EAttribute)userTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserBaseAttributes() {
		return userBaseAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBaseAttributes_Role() {
		return (EAttribute)userBaseAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBaseAttributes_Hierarchy() {
		return (EAttribute)userBaseAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBaseAttributes_Department() {
		return (EAttribute)userBaseAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserBaseAttributes_Company() {
		return (EAttribute)userBaseAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserHiddenInformation() {
		return userHiddenInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserHiddenInformation_UserName() {
		return (EAttribute)userHiddenInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserHiddenInformation_UserToken() {
		return (EReference)userHiddenInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserHiddenInformation_BaseAttributes() {
		return (EReference)userHiddenInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserInitialInformation() {
		return userInitialInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserInitialInformation_UserToken() {
		return (EReference)userInitialInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserInitialInformation_CurrentLocation() {
		return (EAttribute)userInitialInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserDetailedInformation() {
		return userDetailedInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_Role() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_Hierarchy() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_Department() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_Company() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_UsedTool() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserDetailedInformation_TriggerTime() {
		return (EAttribute)userDetailedInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerRequest() {
		return triggerRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerRequest_AdapterIdentifier() {
		return (EAttribute)triggerRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerRequest_User() {
		return (EReference)triggerRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerRequest_ElementsToBeCheckedInfo() {
		return (EReference)triggerRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerFeedback() {
		return triggerFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerFeedback_EvaluatedRulesCounter() {
		return (EAttribute)triggerFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerFeedback_PerformedEvaluationsCounter() {
		return (EAttribute)triggerFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerFeedback_FoundViolations() {
		return (EReference)triggerFeedbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelDataRequest() {
		return modelDataRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelDataRequest_RequestIdentifier() {
		return (EAttribute)modelDataRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelDataRequest_TargetedAdapter() {
		return (EAttribute)modelDataRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDataRequest_Viewtype() {
		return (EReference)modelDataRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDataRequest_NeededElementsInfo() {
		return (EReference)modelDataRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDataRequest_User() {
		return (EReference)modelDataRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelDataFeedback() {
		return modelDataFeedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelDataFeedback_RequestFulfillment() {
		return (EAttribute)modelDataFeedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDataFeedback_ProvidedData() {
		return (EReference)modelDataFeedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequestFulfillment() {
		return requestFulfillmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationFactory getCommunicationFactory() {
		return (CommunicationFactory)getEFactoryInstance();
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
		toolAdapterRegistrationEntryEClass = createEClass(TOOL_ADAPTER_REGISTRATION_ENTRY);
		createEAttribute(toolAdapterRegistrationEntryEClass, TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER);
		createEAttribute(toolAdapterRegistrationEntryEClass, TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME);
		createEAttribute(toolAdapterRegistrationEntryEClass, TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS);
		createEAttribute(toolAdapterRegistrationEntryEClass, TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT);
		createEAttribute(toolAdapterRegistrationEntryEClass, TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY);

		userTokenEClass = createEClass(USER_TOKEN);
		createEAttribute(userTokenEClass, USER_TOKEN__TOKEN);

		userBaseAttributesEClass = createEClass(USER_BASE_ATTRIBUTES);
		createEAttribute(userBaseAttributesEClass, USER_BASE_ATTRIBUTES__ROLE);
		createEAttribute(userBaseAttributesEClass, USER_BASE_ATTRIBUTES__HIERARCHY);
		createEAttribute(userBaseAttributesEClass, USER_BASE_ATTRIBUTES__DEPARTMENT);
		createEAttribute(userBaseAttributesEClass, USER_BASE_ATTRIBUTES__COMPANY);

		userHiddenInformationEClass = createEClass(USER_HIDDEN_INFORMATION);
		createEAttribute(userHiddenInformationEClass, USER_HIDDEN_INFORMATION__USER_NAME);
		createEReference(userHiddenInformationEClass, USER_HIDDEN_INFORMATION__USER_TOKEN);
		createEReference(userHiddenInformationEClass, USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES);

		userInitialInformationEClass = createEClass(USER_INITIAL_INFORMATION);
		createEReference(userInitialInformationEClass, USER_INITIAL_INFORMATION__USER_TOKEN);
		createEAttribute(userInitialInformationEClass, USER_INITIAL_INFORMATION__CURRENT_LOCATION);

		userDetailedInformationEClass = createEClass(USER_DETAILED_INFORMATION);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__ROLE);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__HIERARCHY);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__DEPARTMENT);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__COMPANY);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__USED_TOOL);
		createEAttribute(userDetailedInformationEClass, USER_DETAILED_INFORMATION__TRIGGER_TIME);

		triggerRequestEClass = createEClass(TRIGGER_REQUEST);
		createEAttribute(triggerRequestEClass, TRIGGER_REQUEST__ADAPTER_IDENTIFIER);
		createEReference(triggerRequestEClass, TRIGGER_REQUEST__USER);
		createEReference(triggerRequestEClass, TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO);

		triggerFeedbackEClass = createEClass(TRIGGER_FEEDBACK);
		createEAttribute(triggerFeedbackEClass, TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER);
		createEAttribute(triggerFeedbackEClass, TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER);
		createEReference(triggerFeedbackEClass, TRIGGER_FEEDBACK__FOUND_VIOLATIONS);

		modelDataRequestEClass = createEClass(MODEL_DATA_REQUEST);
		createEAttribute(modelDataRequestEClass, MODEL_DATA_REQUEST__REQUEST_IDENTIFIER);
		createEAttribute(modelDataRequestEClass, MODEL_DATA_REQUEST__TARGETED_ADAPTER);
		createEReference(modelDataRequestEClass, MODEL_DATA_REQUEST__VIEWTYPE);
		createEReference(modelDataRequestEClass, MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO);
		createEReference(modelDataRequestEClass, MODEL_DATA_REQUEST__USER);

		modelDataFeedbackEClass = createEClass(MODEL_DATA_FEEDBACK);
		createEAttribute(modelDataFeedbackEClass, MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT);
		createEReference(modelDataFeedbackEClass, MODEL_DATA_FEEDBACK__PROVIDED_DATA);

		// Create enums
		requestFulfillmentEEnum = createEEnum(REQUEST_FULFILLMENT);
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
		ConsistencyPackage theConsistencyPackage = (ConsistencyPackage)EPackage.Registry.INSTANCE.getEPackage(ConsistencyPackage.eNS_URI);
		ViewsPackage theViewsPackage = (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userDetailedInformationEClass.getESuperTypes().add(this.getUserInitialInformation());

		// Initialize classes and features; add operations and parameters
		initEClass(toolAdapterRegistrationEntryEClass, ToolAdapterRegistrationEntry.class, "ToolAdapterRegistrationEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToolAdapterRegistrationEntry_AdapterIdentifier(), ecorePackage.getEString(), "adapterIdentifier", null, 0, 1, ToolAdapterRegistrationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolAdapterRegistrationEntry_FullAdapterName(), ecorePackage.getEString(), "fullAdapterName", null, 0, 1, ToolAdapterRegistrationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolAdapterRegistrationEntry_AdapterDataServerHostAddress(), ecorePackage.getEString(), "adapterDataServerHostAddress", null, 0, 1, ToolAdapterRegistrationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolAdapterRegistrationEntry_AdapterDataServerPort(), ecorePackage.getEInt(), "adapterDataServerPort", null, 0, 1, ToolAdapterRegistrationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToolAdapterRegistrationEntry_SerializedAdapterPublicKey(), ecorePackage.getEString(), "serializedAdapterPublicKey", null, 0, 1, ToolAdapterRegistrationEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTokenEClass, UserToken.class, "UserToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserToken_Token(), ecorePackage.getEString(), "token", null, 0, 1, UserToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userBaseAttributesEClass, UserBaseAttributes.class, "UserBaseAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserBaseAttributes_Role(), ecorePackage.getEString(), "role", null, 0, 1, UserBaseAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBaseAttributes_Hierarchy(), ecorePackage.getEString(), "hierarchy", null, 0, 1, UserBaseAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBaseAttributes_Department(), ecorePackage.getEString(), "department", null, 0, 1, UserBaseAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserBaseAttributes_Company(), ecorePackage.getEString(), "company", null, 0, 1, UserBaseAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userHiddenInformationEClass, UserHiddenInformation.class, "UserHiddenInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserHiddenInformation_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, UserHiddenInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserHiddenInformation_UserToken(), this.getUserToken(), null, "userToken", null, 0, 1, UserHiddenInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserHiddenInformation_BaseAttributes(), this.getUserBaseAttributes(), null, "baseAttributes", null, 0, 1, UserHiddenInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInitialInformationEClass, UserInitialInformation.class, "UserInitialInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserInitialInformation_UserToken(), this.getUserToken(), null, "userToken", null, 0, 1, UserInitialInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInitialInformation_CurrentLocation(), ecorePackage.getEString(), "currentLocation", null, 0, 1, UserInitialInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDetailedInformationEClass, UserDetailedInformation.class, "UserDetailedInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDetailedInformation_Role(), ecorePackage.getEString(), "role", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDetailedInformation_Hierarchy(), ecorePackage.getEString(), "hierarchy", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDetailedInformation_Department(), ecorePackage.getEString(), "department", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDetailedInformation_Company(), ecorePackage.getEString(), "company", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDetailedInformation_UsedTool(), ecorePackage.getEString(), "usedTool", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserDetailedInformation_TriggerTime(), ecorePackage.getEDate(), "triggerTime", null, 0, 1, UserDetailedInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerRequestEClass, TriggerRequest.class, "TriggerRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerRequest_AdapterIdentifier(), ecorePackage.getEString(), "adapterIdentifier", null, 0, 1, TriggerRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerRequest_User(), this.getUserInitialInformation(), null, "user", null, 0, 1, TriggerRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerRequest_ElementsToBeCheckedInfo(), theConsistencyPackage.getBasicElementInformation(), null, "elementsToBeCheckedInfo", null, 0, -1, TriggerRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerFeedbackEClass, TriggerFeedback.class, "TriggerFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriggerFeedback_EvaluatedRulesCounter(), ecorePackage.getEInt(), "evaluatedRulesCounter", null, 0, 1, TriggerFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriggerFeedback_PerformedEvaluationsCounter(), ecorePackage.getEInt(), "performedEvaluationsCounter", null, 0, 1, TriggerFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerFeedback_FoundViolations(), theConsistencyPackage.getConsistencyViolation(), null, "foundViolations", null, 0, -1, TriggerFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelDataRequestEClass, ModelDataRequest.class, "ModelDataRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelDataRequest_RequestIdentifier(), ecorePackage.getEString(), "requestIdentifier", null, 0, 1, ModelDataRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDataRequest_TargetedAdapter(), ecorePackage.getEString(), "targetedAdapter", null, 0, 1, ModelDataRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelDataRequest_Viewtype(), theViewsPackage.getConsistencyViewtype(), null, "viewtype", null, 0, 1, ModelDataRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelDataRequest_NeededElementsInfo(), theConsistencyPackage.getBasicElementInformation(), null, "neededElementsInfo", null, 0, -1, ModelDataRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelDataRequest_User(), this.getUserDetailedInformation(), null, "user", null, 0, 1, ModelDataRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelDataFeedbackEClass, ModelDataFeedback.class, "ModelDataFeedback", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelDataFeedback_RequestFulfillment(), this.getRequestFulfillment(), "requestFulfillment", null, 0, 1, ModelDataFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelDataFeedback_ProvidedData(), theViewsPackage.getConsistencyView(), null, "providedData", null, 0, 1, ModelDataFeedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(requestFulfillmentEEnum, RequestFulfillment.class, "RequestFulfillment");
		addEEnumLiteral(requestFulfillmentEEnum, RequestFulfillment.FULLY_PROVIDED);
		addEEnumLiteral(requestFulfillmentEEnum, RequestFulfillment.PARTIALLY_PROVIDED);
		addEEnumLiteral(requestFulfillmentEEnum, RequestFulfillment.REJECTED);
	}

} //CommunicationPackageImpl
