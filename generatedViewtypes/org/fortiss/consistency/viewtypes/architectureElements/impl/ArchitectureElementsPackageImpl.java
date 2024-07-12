/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.consistency.viewtypes.architectureElements.Architecture;
import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement;
import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsFactory;
import org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage;
import org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification;
import org.fortiss.consistency.viewtypes.architectureElements.CodeSegment;
import org.fortiss.consistency.viewtypes.architectureElements.Connector;
import org.fortiss.consistency.viewtypes.architectureElements.InputConnector;
import org.fortiss.consistency.viewtypes.architectureElements.LogicalArchitecture;
import org.fortiss.consistency.viewtypes.architectureElements.LogicalElement;
import org.fortiss.consistency.viewtypes.architectureElements.OutputConnector;
import org.fortiss.consistency.viewtypes.architectureElements.Platform;
import org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement;
import org.fortiss.consistency.viewtypes.architectureElements.StateAutomaton;
import org.fortiss.consistency.viewtypes.architectureElements.TaskArchitecture;
import org.fortiss.consistency.viewtypes.architectureElements.TaskElement;

import org.fortiss.consistency.viewtypes.basics.BasicsPackage;

import org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl;

import org.fortiss.consistency.viewtypes.types.TypesPackage;

import org.fortiss.consistency.viewtypes.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureElementsPackageImpl extends EPackageImpl implements ArchitectureElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateAutomatonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformExecutionElementEClass = null;

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
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArchitectureElementsPackageImpl() {
		super(eNS_URI, ArchitectureElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArchitectureElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArchitectureElementsPackage init() {
		if (isInited) return (ArchitectureElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchitectureElementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArchitectureElementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArchitectureElementsPackageImpl theArchitectureElementsPackage = registeredArchitectureElementsPackage instanceof ArchitectureElementsPackageImpl ? (ArchitectureElementsPackageImpl)registeredArchitectureElementsPackage : new ArchitectureElementsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicsPackage.eNS_URI);
		BasicsPackageImpl theBasicsPackage = (BasicsPackageImpl)(registeredPackage instanceof BasicsPackageImpl ? registeredPackage : BasicsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theArchitectureElementsPackage.createPackageContents();
		theBasicsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theArchitectureElementsPackage.initializePackageContents();
		theBasicsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchitectureElementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArchitectureElementsPackage.eNS_URI, theArchitectureElementsPackage);
		return theArchitectureElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitecture() {
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitecture_ContainedElements() {
		return (EReference)architectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureElement() {
		return architectureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureElement_ContainedElements() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureElement_BidirectionalConnectors() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureElement_InputConnectors() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureElement_OutputConnectors() {
		return (EReference)architectureElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_DefaultValue() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ConnectedConnectors() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputConnector() {
		return inputConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputConnector_ConnectedOutputConnectors() {
		return (EReference)inputConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputConnector() {
		return outputConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputConnector_ConnectedInputConnectors() {
		return (EReference)outputConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalArchitecture() {
		return logicalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalElement() {
		return logicalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicalElement_Behavior() {
		return (EReference)logicalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorSpecification() {
		return behaviorSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateAutomaton() {
		return stateAutomatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSegment() {
		return codeSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskArchitecture() {
		return taskArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskElement() {
		return taskElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskElement_RequiredRamMemory() {
		return (EAttribute)taskElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaskElement_RequiredFlashMemory() {
		return (EAttribute)taskElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatform() {
		return platformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformExecutionElement() {
		return platformExecutionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformExecutionElement_ProvidedRamMemory() {
		return (EAttribute)platformExecutionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformExecutionElement_ProvidedFlashMemory() {
		return (EAttribute)platformExecutionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlatformExecutionElement_AcquisitionCost() {
		return (EAttribute)platformExecutionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElementsFactory getArchitectureElementsFactory() {
		return (ArchitectureElementsFactory)getEFactoryInstance();
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
		architectureEClass = createEClass(ARCHITECTURE);
		createEReference(architectureEClass, ARCHITECTURE__CONTAINED_ELEMENTS);

		architectureElementEClass = createEClass(ARCHITECTURE_ELEMENT);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__INPUT_CONNECTORS);
		createEReference(architectureElementEClass, ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEReference(connectorEClass, CONNECTOR__DEFAULT_VALUE);
		createEReference(connectorEClass, CONNECTOR__CONNECTED_CONNECTORS);

		inputConnectorEClass = createEClass(INPUT_CONNECTOR);
		createEReference(inputConnectorEClass, INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS);

		outputConnectorEClass = createEClass(OUTPUT_CONNECTOR);
		createEReference(outputConnectorEClass, OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS);

		logicalArchitectureEClass = createEClass(LOGICAL_ARCHITECTURE);

		logicalElementEClass = createEClass(LOGICAL_ELEMENT);
		createEReference(logicalElementEClass, LOGICAL_ELEMENT__BEHAVIOR);

		behaviorSpecificationEClass = createEClass(BEHAVIOR_SPECIFICATION);

		stateAutomatonEClass = createEClass(STATE_AUTOMATON);

		codeSegmentEClass = createEClass(CODE_SEGMENT);

		taskArchitectureEClass = createEClass(TASK_ARCHITECTURE);

		taskElementEClass = createEClass(TASK_ELEMENT);
		createEAttribute(taskElementEClass, TASK_ELEMENT__REQUIRED_RAM_MEMORY);
		createEAttribute(taskElementEClass, TASK_ELEMENT__REQUIRED_FLASH_MEMORY);

		platformEClass = createEClass(PLATFORM);

		platformExecutionElementEClass = createEClass(PLATFORM_EXECUTION_ELEMENT);
		createEAttribute(platformExecutionElementEClass, PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY);
		createEAttribute(platformExecutionElementEClass, PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY);
		createEAttribute(platformExecutionElementEClass, PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST);
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
		BasicsPackage theBasicsPackage = (BasicsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		architectureEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		architectureElementEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		connectorEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		inputConnectorEClass.getESuperTypes().add(this.getConnector());
		outputConnectorEClass.getESuperTypes().add(this.getConnector());
		logicalArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		logicalElementEClass.getESuperTypes().add(this.getArchitectureElement());
		stateAutomatonEClass.getESuperTypes().add(this.getBehaviorSpecification());
		codeSegmentEClass.getESuperTypes().add(this.getBehaviorSpecification());
		taskArchitectureEClass.getESuperTypes().add(this.getArchitecture());
		taskElementEClass.getESuperTypes().add(this.getArchitectureElement());
		platformEClass.getESuperTypes().add(this.getArchitecture());
		platformExecutionElementEClass.getESuperTypes().add(this.getArchitectureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(architectureEClass, Architecture.class, "Architecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitecture_ContainedElements(), this.getArchitectureElement(), null, "containedElements", null, 0, -1, Architecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureElementEClass, ArchitectureElement.class, "ArchitectureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureElement_ContainedElements(), this.getArchitectureElement(), null, "containedElements", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_BidirectionalConnectors(), this.getConnector(), null, "bidirectionalConnectors", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_InputConnectors(), this.getInputConnector(), null, "inputConnectors", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureElement_OutputConnectors(), this.getOutputConnector(), null, "outputConnectors", null, 0, -1, ArchitectureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Type(), theTypesPackage.getIType(), null, "type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_DefaultValue(), theTypesPackage.getIValue(), null, "defaultValue", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_ConnectedConnectors(), this.getConnector(), null, "connectedConnectors", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputConnectorEClass, InputConnector.class, "InputConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputConnector_ConnectedOutputConnectors(), this.getOutputConnector(), null, "connectedOutputConnectors", null, 0, -1, InputConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputConnectorEClass, OutputConnector.class, "OutputConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputConnector_ConnectedInputConnectors(), this.getInputConnector(), null, "connectedInputConnectors", null, 0, -1, OutputConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalArchitectureEClass, LogicalArchitecture.class, "LogicalArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalElementEClass, LogicalElement.class, "LogicalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalElement_Behavior(), this.getBehaviorSpecification(), null, "behavior", null, 0, -1, LogicalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorSpecificationEClass, BehaviorSpecification.class, "BehaviorSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateAutomatonEClass, StateAutomaton.class, "StateAutomaton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSegmentEClass, CodeSegment.class, "CodeSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskArchitectureEClass, TaskArchitecture.class, "TaskArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskElementEClass, TaskElement.class, "TaskElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskElement_RequiredRamMemory(), ecorePackage.getEDouble(), "requiredRamMemory", null, 0, 1, TaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskElement_RequiredFlashMemory(), ecorePackage.getEDouble(), "requiredFlashMemory", null, 0, 1, TaskElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(platformExecutionElementEClass, PlatformExecutionElement.class, "PlatformExecutionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatformExecutionElement_ProvidedRamMemory(), ecorePackage.getEDouble(), "providedRamMemory", null, 0, 1, PlatformExecutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformExecutionElement_ProvidedFlashMemory(), ecorePackage.getEDouble(), "providedFlashMemory", null, 0, 1, PlatformExecutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformExecutionElement_AcquisitionCost(), ecorePackage.getEDouble(), "acquisitionCost", null, 0, 1, PlatformExecutionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ArchitectureElementsPackageImpl
