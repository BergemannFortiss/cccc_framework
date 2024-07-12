/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage
 * @generated
 */
public interface ArchitectureElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitectureElementsFactory eINSTANCE = org.fortiss.consistency.viewtypes.architectureElements.impl.ArchitectureElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns a new object of class '<em>Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Element</em>'.
	 * @generated
	 */
	ArchitectureElement createArchitectureElement();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Connector</em>'.
	 * @generated
	 */
	InputConnector createInputConnector();

	/**
	 * Returns a new object of class '<em>Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Connector</em>'.
	 * @generated
	 */
	OutputConnector createOutputConnector();

	/**
	 * Returns a new object of class '<em>Logical Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Architecture</em>'.
	 * @generated
	 */
	LogicalArchitecture createLogicalArchitecture();

	/**
	 * Returns a new object of class '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Element</em>'.
	 * @generated
	 */
	LogicalElement createLogicalElement();

	/**
	 * Returns a new object of class '<em>Behavior Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavior Specification</em>'.
	 * @generated
	 */
	BehaviorSpecification createBehaviorSpecification();

	/**
	 * Returns a new object of class '<em>State Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Automaton</em>'.
	 * @generated
	 */
	StateAutomaton createStateAutomaton();

	/**
	 * Returns a new object of class '<em>Code Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Segment</em>'.
	 * @generated
	 */
	CodeSegment createCodeSegment();

	/**
	 * Returns a new object of class '<em>Task Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Architecture</em>'.
	 * @generated
	 */
	TaskArchitecture createTaskArchitecture();

	/**
	 * Returns a new object of class '<em>Task Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Element</em>'.
	 * @generated
	 */
	TaskElement createTaskElement();

	/**
	 * Returns a new object of class '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform</em>'.
	 * @generated
	 */
	Platform createPlatform();

	/**
	 * Returns a new object of class '<em>Platform Execution Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Platform Execution Element</em>'.
	 * @generated
	 */
	PlatformExecutionElement createPlatformExecutionElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArchitectureElementsPackage getArchitectureElementsPackage();

} //ArchitectureElementsFactory
