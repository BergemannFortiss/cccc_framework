/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.fortiss.consistency.viewtypes.architectureElements.*;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;
import org.fortiss.consistency.viewtypes.basics.INamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage
 * @generated
 */
public class ArchitectureElementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitectureElementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElementsSwitch() {
		if (modelPackage == null) {
			modelPackage = ArchitectureElementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArchitectureElementsPackage.ARCHITECTURE: {
				Architecture architecture = (Architecture)theEObject;
				T result = caseArchitecture(architecture);
				if (result == null) result = caseINamedCommentedElement(architecture);
				if (result == null) result = caseINamedElement(architecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.ARCHITECTURE_ELEMENT: {
				ArchitectureElement architectureElement = (ArchitectureElement)theEObject;
				T result = caseArchitectureElement(architectureElement);
				if (result == null) result = caseINamedCommentedElement(architectureElement);
				if (result == null) result = caseINamedElement(architectureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseINamedCommentedElement(connector);
				if (result == null) result = caseINamedElement(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.INPUT_CONNECTOR: {
				InputConnector inputConnector = (InputConnector)theEObject;
				T result = caseInputConnector(inputConnector);
				if (result == null) result = caseConnector(inputConnector);
				if (result == null) result = caseINamedCommentedElement(inputConnector);
				if (result == null) result = caseINamedElement(inputConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.OUTPUT_CONNECTOR: {
				OutputConnector outputConnector = (OutputConnector)theEObject;
				T result = caseOutputConnector(outputConnector);
				if (result == null) result = caseConnector(outputConnector);
				if (result == null) result = caseINamedCommentedElement(outputConnector);
				if (result == null) result = caseINamedElement(outputConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.LOGICAL_ARCHITECTURE: {
				LogicalArchitecture logicalArchitecture = (LogicalArchitecture)theEObject;
				T result = caseLogicalArchitecture(logicalArchitecture);
				if (result == null) result = caseArchitecture(logicalArchitecture);
				if (result == null) result = caseINamedCommentedElement(logicalArchitecture);
				if (result == null) result = caseINamedElement(logicalArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.LOGICAL_ELEMENT: {
				LogicalElement logicalElement = (LogicalElement)theEObject;
				T result = caseLogicalElement(logicalElement);
				if (result == null) result = caseArchitectureElement(logicalElement);
				if (result == null) result = caseINamedCommentedElement(logicalElement);
				if (result == null) result = caseINamedElement(logicalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.BEHAVIOR_SPECIFICATION: {
				BehaviorSpecification behaviorSpecification = (BehaviorSpecification)theEObject;
				T result = caseBehaviorSpecification(behaviorSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.STATE_AUTOMATON: {
				StateAutomaton stateAutomaton = (StateAutomaton)theEObject;
				T result = caseStateAutomaton(stateAutomaton);
				if (result == null) result = caseBehaviorSpecification(stateAutomaton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.CODE_SEGMENT: {
				CodeSegment codeSegment = (CodeSegment)theEObject;
				T result = caseCodeSegment(codeSegment);
				if (result == null) result = caseBehaviorSpecification(codeSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.TASK_ARCHITECTURE: {
				TaskArchitecture taskArchitecture = (TaskArchitecture)theEObject;
				T result = caseTaskArchitecture(taskArchitecture);
				if (result == null) result = caseArchitecture(taskArchitecture);
				if (result == null) result = caseINamedCommentedElement(taskArchitecture);
				if (result == null) result = caseINamedElement(taskArchitecture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.TASK_ELEMENT: {
				TaskElement taskElement = (TaskElement)theEObject;
				T result = caseTaskElement(taskElement);
				if (result == null) result = caseArchitectureElement(taskElement);
				if (result == null) result = caseINamedCommentedElement(taskElement);
				if (result == null) result = caseINamedElement(taskElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = caseArchitecture(platform);
				if (result == null) result = caseINamedCommentedElement(platform);
				if (result == null) result = caseINamedElement(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArchitectureElementsPackage.PLATFORM_EXECUTION_ELEMENT: {
				PlatformExecutionElement platformExecutionElement = (PlatformExecutionElement)theEObject;
				T result = casePlatformExecutionElement(platformExecutionElement);
				if (result == null) result = caseArchitectureElement(platformExecutionElement);
				if (result == null) result = caseINamedCommentedElement(platformExecutionElement);
				if (result == null) result = caseINamedElement(platformExecutionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitecture(Architecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureElement(ArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputConnector(InputConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputConnector(OutputConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalArchitecture(LogicalArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalElement(LogicalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehaviorSpecification(BehaviorSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Automaton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Automaton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateAutomaton(StateAutomaton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSegment(CodeSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Architecture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskArchitecture(TaskArchitecture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskElement(TaskElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatform(Platform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Platform Execution Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform Execution Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlatformExecutionElement(PlatformExecutionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedElement(INamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INamed Commented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INamed Commented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINamedCommentedElement(INamedCommentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArchitectureElementsSwitch
