/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.fortiss.consistency.viewtypes.basics.BasicsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitectureElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architectureElements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/viewtypes/architectureElements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.viewtypes.architectureElements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureElementsPackage eINSTANCE = org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = BasicsPackage.INAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__COMMENT = BasicsPackage.INAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__CONTAINED_ELEMENTS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_OPERATION_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getArchitectureElement()
	 * @generated
	 */
	int ARCHITECTURE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__NAME = BasicsPackage.INAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__COMMENT = BasicsPackage.INAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bidirectional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__INPUT_CONNECTORS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_FEATURE_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_ELEMENT_OPERATION_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = BasicsPackage.INAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMENT = BasicsPackage.INAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__DEFAULT_VALUE = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connected Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTED_CONNECTORS = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = BasicsPackage.INAMED_COMMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.InputConnectorImpl <em>Input Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.InputConnectorImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getInputConnector()
	 * @generated
	 */
	int INPUT_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__COMMENT = CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__DEFAULT_VALUE = CONNECTOR__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Connected Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__CONNECTED_CONNECTORS = CONNECTOR__CONNECTED_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Connected Output Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.OutputConnectorImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getOutputConnector()
	 * @generated
	 */
	int OUTPUT_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__COMMENT = CONNECTOR__COMMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__TYPE = CONNECTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__DEFAULT_VALUE = CONNECTOR__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Connected Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__CONNECTED_CONNECTORS = CONNECTOR__CONNECTED_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Connected Input Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalArchitectureImpl <em>Logical Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalArchitectureImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getLogicalArchitecture()
	 * @generated
	 */
	int LOGICAL_ARCHITECTURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__NAME = ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__COMMENT = ARCHITECTURE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE__CONTAINED_ELEMENTS = ARCHITECTURE__CONTAINED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Logical Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ARCHITECTURE_OPERATION_COUNT = ARCHITECTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalElementImpl <em>Logical Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalElementImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getLogicalElement()
	 * @generated
	 */
	int LOGICAL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__COMMENT = ARCHITECTURE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__CONTAINED_ELEMENTS = ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Bidirectional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__BIDIRECTIONAL_CONNECTORS = ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__INPUT_CONNECTORS = ARCHITECTURE_ELEMENT__INPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__OUTPUT_CONNECTORS = ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT__BEHAVIOR = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ELEMENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.BehaviorSpecificationImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getBehaviorSpecification()
	 * @generated
	 */
	int BEHAVIOR_SPECIFICATION = 7;

	/**
	 * The number of structural features of the '<em>Behavior Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Behavior Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.StateAutomatonImpl <em>State Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.StateAutomatonImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getStateAutomaton()
	 * @generated
	 */
	int STATE_AUTOMATON = 8;

	/**
	 * The number of structural features of the '<em>State Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_AUTOMATON_FEATURE_COUNT = BEHAVIOR_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_AUTOMATON_OPERATION_COUNT = BEHAVIOR_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.CodeSegmentImpl <em>Code Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.CodeSegmentImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getCodeSegment()
	 * @generated
	 */
	int CODE_SEGMENT = 9;

	/**
	 * The number of structural features of the '<em>Code Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SEGMENT_FEATURE_COUNT = BEHAVIOR_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SEGMENT_OPERATION_COUNT = BEHAVIOR_SPECIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskArchitectureImpl <em>Task Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.TaskArchitectureImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getTaskArchitecture()
	 * @generated
	 */
	int TASK_ARCHITECTURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARCHITECTURE__NAME = ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARCHITECTURE__COMMENT = ARCHITECTURE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARCHITECTURE__CONTAINED_ELEMENTS = ARCHITECTURE__CONTAINED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Task Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARCHITECTURE_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ARCHITECTURE_OPERATION_COUNT = ARCHITECTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl <em>Task Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getTaskElement()
	 * @generated
	 */
	int TASK_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__COMMENT = ARCHITECTURE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__CONTAINED_ELEMENTS = ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Bidirectional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__BIDIRECTIONAL_CONNECTORS = ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__INPUT_CONNECTORS = ARCHITECTURE_ELEMENT__INPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__OUTPUT_CONNECTORS = ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Required Ram Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__REQUIRED_RAM_MEMORY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Flash Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT__REQUIRED_FLASH_MEMORY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ELEMENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = ARCHITECTURE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__COMMENT = ARCHITECTURE__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__CONTAINED_ELEMENTS = ARCHITECTURE__CONTAINED_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = ARCHITECTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = ARCHITECTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl <em>Platform Execution Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl
	 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getPlatformExecutionElement()
	 * @generated
	 */
	int PLATFORM_EXECUTION_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__NAME = ARCHITECTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__COMMENT = ARCHITECTURE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__CONTAINED_ELEMENTS = ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Bidirectional Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__BIDIRECTIONAL_CONNECTORS = ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Input Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__INPUT_CONNECTORS = ARCHITECTURE_ELEMENT__INPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Output Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__OUTPUT_CONNECTORS = ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS;

	/**
	 * The feature id for the '<em><b>Provided Ram Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Flash Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acquisition Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Platform Execution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT_FEATURE_COUNT = ARCHITECTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Platform Execution Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_EXECUTION_ELEMENT_OPERATION_COUNT = ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.Architecture#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Architecture#getContainedElements()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_ContainedElements();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement <em>Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement
	 * @generated
	 */
	EClass getArchitectureElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getContainedElements()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EReference getArchitectureElement_ContainedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getBidirectionalConnectors <em>Bidirectional Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bidirectional Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getBidirectionalConnectors()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EReference getArchitectureElement_BidirectionalConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getInputConnectors <em>Input Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getInputConnectors()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EReference getArchitectureElement_InputConnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getOutputConnectors <em>Output Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement#getOutputConnectors()
	 * @see #getArchitectureElement()
	 * @generated
	 */
	EReference getArchitectureElement_OutputConnectors();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Connector#getDefaultValue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_DefaultValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector#getConnectedConnectors <em>Connected Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Connector#getConnectedConnectors()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectedConnectors();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Connector</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.InputConnector
	 * @generated
	 */
	EClass getInputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector#getConnectedOutputConnectors <em>Connected Output Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Output Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.InputConnector#getConnectedOutputConnectors()
	 * @see #getInputConnector()
	 * @generated
	 */
	EReference getInputConnector_ConnectedOutputConnectors();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Connector</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.OutputConnector
	 * @generated
	 */
	EClass getOutputConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector#getConnectedInputConnectors <em>Connected Input Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connected Input Connectors</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.OutputConnector#getConnectedInputConnectors()
	 * @see #getOutputConnector()
	 * @generated
	 */
	EReference getOutputConnector_ConnectedInputConnectors();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalArchitecture <em>Logical Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Architecture</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.LogicalArchitecture
	 * @generated
	 */
	EClass getLogicalArchitecture();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.LogicalElement
	 * @generated
	 */
	EClass getLogicalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalElement#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.LogicalElement#getBehavior()
	 * @see #getLogicalElement()
	 * @generated
	 */
	EReference getLogicalElement_Behavior();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification <em>Behavior Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Specification</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification
	 * @generated
	 */
	EClass getBehaviorSpecification();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.StateAutomaton <em>State Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Automaton</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.StateAutomaton
	 * @generated
	 */
	EClass getStateAutomaton();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.CodeSegment <em>Code Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Segment</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.CodeSegment
	 * @generated
	 */
	EClass getCodeSegment();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskArchitecture <em>Task Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Architecture</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskArchitecture
	 * @generated
	 */
	EClass getTaskArchitecture();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement <em>Task Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskElement
	 * @generated
	 */
	EClass getTaskElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredRamMemory <em>Required Ram Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Ram Memory</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredRamMemory()
	 * @see #getTaskElement()
	 * @generated
	 */
	EAttribute getTaskElement_RequiredRamMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredFlashMemory <em>Required Flash Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Flash Memory</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredFlashMemory()
	 * @see #getTaskElement()
	 * @generated
	 */
	EAttribute getTaskElement_RequiredFlashMemory();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement <em>Platform Execution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform Execution Element</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement
	 * @generated
	 */
	EClass getPlatformExecutionElement();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedRamMemory <em>Provided Ram Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Ram Memory</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedRamMemory()
	 * @see #getPlatformExecutionElement()
	 * @generated
	 */
	EAttribute getPlatformExecutionElement_ProvidedRamMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedFlashMemory <em>Provided Flash Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Flash Memory</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedFlashMemory()
	 * @see #getPlatformExecutionElement()
	 * @generated
	 */
	EAttribute getPlatformExecutionElement_ProvidedFlashMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getAcquisitionCost <em>Acquisition Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquisition Cost</em>'.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getAcquisitionCost()
	 * @see #getPlatformExecutionElement()
	 * @generated
	 */
	EAttribute getPlatformExecutionElement_AcquisitionCost();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureElementsFactory getArchitectureElementsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__CONTAINED_ELEMENTS = eINSTANCE.getArchitecture_ContainedElements();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl <em>Architecture Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getArchitectureElement()
		 * @generated
		 */
		EClass ARCHITECTURE_ELEMENT = eINSTANCE.getArchitectureElement();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_ELEMENT__CONTAINED_ELEMENTS = eINSTANCE.getArchitectureElement_ContainedElements();

		/**
		 * The meta object literal for the '<em><b>Bidirectional Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_ELEMENT__BIDIRECTIONAL_CONNECTORS = eINSTANCE.getArchitectureElement_BidirectionalConnectors();

		/**
		 * The meta object literal for the '<em><b>Input Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_ELEMENT__INPUT_CONNECTORS = eINSTANCE.getArchitectureElement_InputConnectors();

		/**
		 * The meta object literal for the '<em><b>Output Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_ELEMENT__OUTPUT_CONNECTORS = eINSTANCE.getArchitectureElement_OutputConnectors();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ConnectorImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__DEFAULT_VALUE = eINSTANCE.getConnector_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Connected Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTED_CONNECTORS = eINSTANCE.getConnector_ConnectedConnectors();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.InputConnectorImpl <em>Input Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.InputConnectorImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getInputConnector()
		 * @generated
		 */
		EClass INPUT_CONNECTOR = eINSTANCE.getInputConnector();

		/**
		 * The meta object literal for the '<em><b>Connected Output Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_CONNECTOR__CONNECTED_OUTPUT_CONNECTORS = eINSTANCE.getInputConnector_ConnectedOutputConnectors();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.OutputConnectorImpl <em>Output Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.OutputConnectorImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getOutputConnector()
		 * @generated
		 */
		EClass OUTPUT_CONNECTOR = eINSTANCE.getOutputConnector();

		/**
		 * The meta object literal for the '<em><b>Connected Input Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_CONNECTOR__CONNECTED_INPUT_CONNECTORS = eINSTANCE.getOutputConnector_ConnectedInputConnectors();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalArchitectureImpl <em>Logical Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalArchitectureImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getLogicalArchitecture()
		 * @generated
		 */
		EClass LOGICAL_ARCHITECTURE = eINSTANCE.getLogicalArchitecture();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalElementImpl <em>Logical Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.LogicalElementImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getLogicalElement()
		 * @generated
		 */
		EClass LOGICAL_ELEMENT = eINSTANCE.getLogicalElement();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_ELEMENT__BEHAVIOR = eINSTANCE.getLogicalElement_Behavior();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.BehaviorSpecificationImpl <em>Behavior Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.BehaviorSpecificationImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getBehaviorSpecification()
		 * @generated
		 */
		EClass BEHAVIOR_SPECIFICATION = eINSTANCE.getBehaviorSpecification();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.StateAutomatonImpl <em>State Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.StateAutomatonImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getStateAutomaton()
		 * @generated
		 */
		EClass STATE_AUTOMATON = eINSTANCE.getStateAutomaton();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.CodeSegmentImpl <em>Code Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.CodeSegmentImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getCodeSegment()
		 * @generated
		 */
		EClass CODE_SEGMENT = eINSTANCE.getCodeSegment();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskArchitectureImpl <em>Task Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.TaskArchitectureImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getTaskArchitecture()
		 * @generated
		 */
		EClass TASK_ARCHITECTURE = eINSTANCE.getTaskArchitecture();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl <em>Task Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.TaskElementImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getTaskElement()
		 * @generated
		 */
		EClass TASK_ELEMENT = eINSTANCE.getTaskElement();

		/**
		 * The meta object literal for the '<em><b>Required Ram Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ELEMENT__REQUIRED_RAM_MEMORY = eINSTANCE.getTaskElement_RequiredRamMemory();

		/**
		 * The meta object literal for the '<em><b>Required Flash Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ELEMENT__REQUIRED_FLASH_MEMORY = eINSTANCE.getTaskElement_RequiredFlashMemory();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl <em>Platform Execution Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.PlatformExecutionElementImpl
		 * @see org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsPackageImpl#getPlatformExecutionElement()
		 * @generated
		 */
		EClass PLATFORM_EXECUTION_ELEMENT = eINSTANCE.getPlatformExecutionElement();

		/**
		 * The meta object literal for the '<em><b>Provided Ram Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_EXECUTION_ELEMENT__PROVIDED_RAM_MEMORY = eINSTANCE.getPlatformExecutionElement_ProvidedRamMemory();

		/**
		 * The meta object literal for the '<em><b>Provided Flash Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_EXECUTION_ELEMENT__PROVIDED_FLASH_MEMORY = eINSTANCE.getPlatformExecutionElement_ProvidedFlashMemory();

		/**
		 * The meta object literal for the '<em><b>Acquisition Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM_EXECUTION_ELEMENT__ACQUISITION_COST = eINSTANCE.getPlatformExecutionElement_AcquisitionCost();

	}

} //ArchitectureElementsPackage
