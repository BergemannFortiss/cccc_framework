/**
 */
package org.fortiss.consistency.viewtypes.architectureElements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.viewtypes.architectureElements.*;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;
import org.fortiss.consistency.viewtypes.basics.INamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage
 * @generated
 */
public class ArchitectureElementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArchitectureElementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureElementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArchitectureElementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureElementsSwitch<Adapter> modelSwitch =
		new ArchitectureElementsSwitch<Adapter>() {
			@Override
			public Adapter caseArchitecture(Architecture object) {
				return createArchitectureAdapter();
			}
			@Override
			public Adapter caseArchitectureElement(ArchitectureElement object) {
				return createArchitectureElementAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseInputConnector(InputConnector object) {
				return createInputConnectorAdapter();
			}
			@Override
			public Adapter caseOutputConnector(OutputConnector object) {
				return createOutputConnectorAdapter();
			}
			@Override
			public Adapter caseLogicalArchitecture(LogicalArchitecture object) {
				return createLogicalArchitectureAdapter();
			}
			@Override
			public Adapter caseLogicalElement(LogicalElement object) {
				return createLogicalElementAdapter();
			}
			@Override
			public Adapter caseBehaviorSpecification(BehaviorSpecification object) {
				return createBehaviorSpecificationAdapter();
			}
			@Override
			public Adapter caseStateAutomaton(StateAutomaton object) {
				return createStateAutomatonAdapter();
			}
			@Override
			public Adapter caseCodeSegment(CodeSegment object) {
				return createCodeSegmentAdapter();
			}
			@Override
			public Adapter caseTaskArchitecture(TaskArchitecture object) {
				return createTaskArchitectureAdapter();
			}
			@Override
			public Adapter caseTaskElement(TaskElement object) {
				return createTaskElementAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter casePlatformExecutionElement(PlatformExecutionElement object) {
				return createPlatformExecutionElementAdapter();
			}
			@Override
			public Adapter caseINamedElement(INamedElement object) {
				return createINamedElementAdapter();
			}
			@Override
			public Adapter caseINamedCommentedElement(INamedCommentedElement object) {
				return createINamedCommentedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement <em>Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElement
	 * @generated
	 */
	public Adapter createArchitectureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.InputConnector <em>Input Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.InputConnector
	 * @generated
	 */
	public Adapter createInputConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.OutputConnector <em>Output Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.OutputConnector
	 * @generated
	 */
	public Adapter createOutputConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalArchitecture <em>Logical Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.LogicalArchitecture
	 * @generated
	 */
	public Adapter createLogicalArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.LogicalElement <em>Logical Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.LogicalElement
	 * @generated
	 */
	public Adapter createLogicalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification <em>Behavior Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.BehaviorSpecification
	 * @generated
	 */
	public Adapter createBehaviorSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.StateAutomaton <em>State Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.StateAutomaton
	 * @generated
	 */
	public Adapter createStateAutomatonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.CodeSegment <em>Code Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.CodeSegment
	 * @generated
	 */
	public Adapter createCodeSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskArchitecture <em>Task Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskArchitecture
	 * @generated
	 */
	public Adapter createTaskArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement <em>Task Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.TaskElement
	 * @generated
	 */
	public Adapter createTaskElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement <em>Platform Execution Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement
	 * @generated
	 */
	public Adapter createPlatformExecutionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.basics.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedElement
	 * @generated
	 */
	public Adapter createINamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.viewtypes.basics.INamedCommentedElement <em>INamed Commented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.viewtypes.basics.INamedCommentedElement
	 * @generated
	 */
	public Adapter createINamedCommentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArchitectureElementsAdapterFactory
