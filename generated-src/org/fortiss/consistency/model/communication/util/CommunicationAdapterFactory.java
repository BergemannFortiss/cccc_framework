/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.fortiss.consistency.model.communication.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.communication.CommunicationPackage
 * @generated
 */
public class CommunicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationPackage.eINSTANCE;
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
	protected CommunicationSwitch<Adapter> modelSwitch =
		new CommunicationSwitch<Adapter>() {
			@Override
			public Adapter caseToolAdapterRegistrationEntry(ToolAdapterRegistrationEntry object) {
				return createToolAdapterRegistrationEntryAdapter();
			}
			@Override
			public Adapter caseUserToken(UserToken object) {
				return createUserTokenAdapter();
			}
			@Override
			public Adapter caseUserBaseAttributes(UserBaseAttributes object) {
				return createUserBaseAttributesAdapter();
			}
			@Override
			public Adapter caseUserHiddenInformation(UserHiddenInformation object) {
				return createUserHiddenInformationAdapter();
			}
			@Override
			public Adapter caseUserInitialInformation(UserInitialInformation object) {
				return createUserInitialInformationAdapter();
			}
			@Override
			public Adapter caseUserDetailedInformation(UserDetailedInformation object) {
				return createUserDetailedInformationAdapter();
			}
			@Override
			public Adapter caseTriggerRequest(TriggerRequest object) {
				return createTriggerRequestAdapter();
			}
			@Override
			public Adapter caseTriggerFeedback(TriggerFeedback object) {
				return createTriggerFeedbackAdapter();
			}
			@Override
			public Adapter caseModelDataRequest(ModelDataRequest object) {
				return createModelDataRequestAdapter();
			}
			@Override
			public Adapter caseModelDataFeedback(ModelDataFeedback object) {
				return createModelDataFeedbackAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry <em>Tool Adapter Registration Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry
	 * @generated
	 */
	public Adapter createToolAdapterRegistrationEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.UserToken <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.UserToken
	 * @generated
	 */
	public Adapter createUserTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.UserBaseAttributes <em>User Base Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes
	 * @generated
	 */
	public Adapter createUserBaseAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.UserHiddenInformation <em>User Hidden Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.UserHiddenInformation
	 * @generated
	 */
	public Adapter createUserHiddenInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.UserInitialInformation <em>User Initial Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.UserInitialInformation
	 * @generated
	 */
	public Adapter createUserInitialInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.UserDetailedInformation <em>User Detailed Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation
	 * @generated
	 */
	public Adapter createUserDetailedInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.TriggerRequest <em>Trigger Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.TriggerRequest
	 * @generated
	 */
	public Adapter createTriggerRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.TriggerFeedback <em>Trigger Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.TriggerFeedback
	 * @generated
	 */
	public Adapter createTriggerFeedbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.ModelDataRequest <em>Model Data Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest
	 * @generated
	 */
	public Adapter createModelDataRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.fortiss.consistency.model.communication.ModelDataFeedback <em>Model Data Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.fortiss.consistency.model.communication.ModelDataFeedback
	 * @generated
	 */
	public Adapter createModelDataFeedbackAdapter() {
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

} //CommunicationAdapterFactory
