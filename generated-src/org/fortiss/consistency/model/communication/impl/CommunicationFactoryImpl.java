/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.consistency.model.communication.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationFactoryImpl extends EFactoryImpl implements CommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationFactory init() {
		try {
			CommunicationFactory theCommunicationFactory = (CommunicationFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationPackage.eNS_URI);
			if (theCommunicationFactory != null) {
				return theCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactoryImpl() {
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
			case CommunicationPackage.TOOL_ADAPTER_REGISTRATION_ENTRY: return createToolAdapterRegistrationEntry();
			case CommunicationPackage.USER_TOKEN: return createUserToken();
			case CommunicationPackage.USER_BASE_ATTRIBUTES: return createUserBaseAttributes();
			case CommunicationPackage.USER_HIDDEN_INFORMATION: return createUserHiddenInformation();
			case CommunicationPackage.USER_INITIAL_INFORMATION: return createUserInitialInformation();
			case CommunicationPackage.USER_DETAILED_INFORMATION: return createUserDetailedInformation();
			case CommunicationPackage.TRIGGER_REQUEST: return createTriggerRequest();
			case CommunicationPackage.TRIGGER_FEEDBACK: return createTriggerFeedback();
			case CommunicationPackage.MODEL_DATA_REQUEST: return createModelDataRequest();
			case CommunicationPackage.MODEL_DATA_FEEDBACK: return createModelDataFeedback();
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
			case CommunicationPackage.REQUEST_FULFILLMENT:
				return createRequestFulfillmentFromString(eDataType, initialValue);
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
			case CommunicationPackage.REQUEST_FULFILLMENT:
				return convertRequestFulfillmentToString(eDataType, instanceValue);
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
	public ToolAdapterRegistrationEntry createToolAdapterRegistrationEntry() {
		ToolAdapterRegistrationEntryImpl toolAdapterRegistrationEntry = new ToolAdapterRegistrationEntryImpl();
		return toolAdapterRegistrationEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserToken createUserToken() {
		UserTokenImpl userToken = new UserTokenImpl();
		return userToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserBaseAttributes createUserBaseAttributes() {
		UserBaseAttributesImpl userBaseAttributes = new UserBaseAttributesImpl();
		return userBaseAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserHiddenInformation createUserHiddenInformation() {
		UserHiddenInformationImpl userHiddenInformation = new UserHiddenInformationImpl();
		return userHiddenInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInitialInformation createUserInitialInformation() {
		UserInitialInformationImpl userInitialInformation = new UserInitialInformationImpl();
		return userInitialInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDetailedInformation createUserDetailedInformation() {
		UserDetailedInformationImpl userDetailedInformation = new UserDetailedInformationImpl();
		return userDetailedInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerRequest createTriggerRequest() {
		TriggerRequestImpl triggerRequest = new TriggerRequestImpl();
		return triggerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerFeedback createTriggerFeedback() {
		TriggerFeedbackImpl triggerFeedback = new TriggerFeedbackImpl();
		return triggerFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelDataRequest createModelDataRequest() {
		ModelDataRequestImpl modelDataRequest = new ModelDataRequestImpl();
		return modelDataRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelDataFeedback createModelDataFeedback() {
		ModelDataFeedbackImpl modelDataFeedback = new ModelDataFeedbackImpl();
		return modelDataFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFulfillment createRequestFulfillmentFromString(EDataType eDataType, String initialValue) {
		RequestFulfillment result = RequestFulfillment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestFulfillmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPackage getCommunicationPackage() {
		return (CommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPackage getPackage() {
		return CommunicationPackage.eINSTANCE;
	}

} //CommunicationFactoryImpl
