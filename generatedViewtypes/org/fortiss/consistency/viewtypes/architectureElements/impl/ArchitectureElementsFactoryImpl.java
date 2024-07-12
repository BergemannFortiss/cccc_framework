/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.consistency.viewtypes.architectureElements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchitectureElementsFactoryImpl extends EFactoryImpl implements ArchitectureElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchitectureElementsFactory init() {
		try {
			ArchitectureElementsFactory theArchitectureElementsFactory = (ArchitectureElementsFactory)EPackage.Registry.INSTANCE.getEFactory(ArchitectureElementsPackage.eNS_URI);
			if (theArchitectureElementsFactory != null) {
				return theArchitectureElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchitectureElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElementsFactoryImpl() {
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
			case ArchitectureElementsPackage.ARCHITECTURE: return createArchitecture();
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT: return createArchitectureElement();
			case ArchitectureElementsPackage.CONNECTOR: return createConnector();
			case ArchitectureElementsPackage.INPUT_CONNECTOR: return createInputConnector();
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR: return createOutputConnector();
			case ArchitectureElementsPackage.LOGICAL_ARCHITECTURE: return createLogicalArchitecture();
			case ArchitectureElementsPackage.LOGICAL_ELEMENT: return createLogicalElement();
			case ArchitectureElementsPackage.BEHAVIOR_SPECIFICATION: return createBehaviorSpecification();
			case ArchitectureElementsPackage.STATE_AUTOMATON: return createStateAutomaton();
			case ArchitectureElementsPackage.CODE_SEGMENT: return createCodeSegment();
			case ArchitectureElementsPackage.TASK_ARCHITECTURE: return createTaskArchitecture();
			case ArchitectureElementsPackage.TASK_ELEMENT: return createTaskElement();
			case ArchitectureElementsPackage.PLATFORM: return createPlatform();
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT: return createPlatformExecutionElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElement createArchitectureElement() {
		ArchitectureElementImpl architectureElement = new ArchitectureElementImpl();
		return architectureElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputConnector createInputConnector() {
		InputConnectorImpl inputConnector = new InputConnectorImpl();
		return inputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputConnector createOutputConnector() {
		OutputConnectorImpl outputConnector = new OutputConnectorImpl();
		return outputConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalArchitecture createLogicalArchitecture() {
		LogicalArchitectureImpl logicalArchitecture = new LogicalArchitectureImpl();
		return logicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalElement createLogicalElement() {
		LogicalElementImpl logicalElement = new LogicalElementImpl();
		return logicalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSpecification createBehaviorSpecification() {
		BehaviorSpecificationImpl behaviorSpecification = new BehaviorSpecificationImpl();
		return behaviorSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAutomaton createStateAutomaton() {
		StateAutomatonImpl stateAutomaton = new StateAutomatonImpl();
		return stateAutomaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSegment createCodeSegment() {
		CodeSegmentImpl codeSegment = new CodeSegmentImpl();
		return codeSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskArchitecture createTaskArchitecture() {
		TaskArchitectureImpl taskArchitecture = new TaskArchitectureImpl();
		return taskArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskElement createTaskElement() {
		TaskElementImpl taskElement = new TaskElementImpl();
		return taskElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformExecutionElement createPlatformExecutionElement() {
		PlatformExecutionElementImpl platformExecutionElement = new PlatformExecutionElementImpl();
		return platformExecutionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElementsPackage getArchitectureElementsPackage() {
		return (ArchitectureElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchitectureElementsPackage getPackage() {
		return ArchitectureElementsPackage.eINSTANCE;
	}

} //ArchitectureElementsFactoryImpl
