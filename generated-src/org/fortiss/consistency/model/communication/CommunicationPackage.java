/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.communication;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.model.communication.CommunicationFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.fortiss.org/consistency/model/communication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.fortiss.consistency.model.communication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPackage eINSTANCE = org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl <em>Tool Adapter Registration Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getToolAdapterRegistrationEntry()
	 * @generated
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Adapter Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Full Adapter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Adapter Data Server Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Adapter Data Server Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT = 3;

	/**
	 * The feature id for the '<em><b>Serialized Adapter Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY = 4;

	/**
	 * The number of structural features of the '<em>Tool Adapter Registration Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_ADAPTER_REGISTRATION_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.UserTokenImpl <em>User Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.UserTokenImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserToken()
	 * @generated
	 */
	int USER_TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TOKEN__TOKEN = 0;

	/**
	 * The number of structural features of the '<em>User Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TOKEN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl <em>User Base Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserBaseAttributes()
	 * @generated
	 */
	int USER_BASE_ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_ATTRIBUTES__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_ATTRIBUTES__HIERARCHY = 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_ATTRIBUTES__DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_ATTRIBUTES__COMPANY = 3;

	/**
	 * The number of structural features of the '<em>User Base Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_BASE_ATTRIBUTES_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl <em>User Hidden Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserHiddenInformation()
	 * @generated
	 */
	int USER_HIDDEN_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIDDEN_INFORMATION__USER_NAME = 0;

	/**
	 * The feature id for the '<em><b>User Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIDDEN_INFORMATION__USER_TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Base Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>User Hidden Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_HIDDEN_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl <em>User Initial Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserInitialInformation()
	 * @generated
	 */
	int USER_INITIAL_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>User Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INITIAL_INFORMATION__USER_TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Current Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INITIAL_INFORMATION__CURRENT_LOCATION = 1;

	/**
	 * The number of structural features of the '<em>User Initial Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INITIAL_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl <em>User Detailed Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserDetailedInformation()
	 * @generated
	 */
	int USER_DETAILED_INFORMATION = 5;

	/**
	 * The feature id for the '<em><b>User Token</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__USER_TOKEN = USER_INITIAL_INFORMATION__USER_TOKEN;

	/**
	 * The feature id for the '<em><b>Current Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__CURRENT_LOCATION = USER_INITIAL_INFORMATION__CURRENT_LOCATION;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__ROLE = USER_INITIAL_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__HIERARCHY = USER_INITIAL_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__DEPARTMENT = USER_INITIAL_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Company</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__COMPANY = USER_INITIAL_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Used Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__USED_TOOL = USER_INITIAL_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trigger Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION__TRIGGER_TIME = USER_INITIAL_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User Detailed Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DETAILED_INFORMATION_FEATURE_COUNT = USER_INITIAL_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.TriggerRequestImpl <em>Trigger Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.TriggerRequestImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getTriggerRequest()
	 * @generated
	 */
	int TRIGGER_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Adapter Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_REQUEST__ADAPTER_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_REQUEST__USER = 1;

	/**
	 * The feature id for the '<em><b>Elements To Be Checked Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO = 2;

	/**
	 * The number of structural features of the '<em>Trigger Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getTriggerFeedback()
	 * @generated
	 */
	int TRIGGER_FEEDBACK = 7;

	/**
	 * The feature id for the '<em><b>Evaluated Rules Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER = 0;

	/**
	 * The feature id for the '<em><b>Performed Evaluations Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Found Violations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEEDBACK__FOUND_VIOLATIONS = 2;

	/**
	 * The number of structural features of the '<em>Trigger Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEEDBACK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl <em>Model Data Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getModelDataRequest()
	 * @generated
	 */
	int MODEL_DATA_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Request Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST__REQUEST_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Targeted Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST__TARGETED_ADAPTER = 1;

	/**
	 * The feature id for the '<em><b>Viewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST__VIEWTYPE = 2;

	/**
	 * The feature id for the '<em><b>Needed Elements Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST__USER = 4;

	/**
	 * The number of structural features of the '<em>Model Data Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_REQUEST_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl <em>Model Data Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getModelDataFeedback()
	 * @generated
	 */
	int MODEL_DATA_FEEDBACK = 9;

	/**
	 * The feature id for the '<em><b>Request Fulfillment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT = 0;

	/**
	 * The feature id for the '<em><b>Provided Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_FEEDBACK__PROVIDED_DATA = 1;

	/**
	 * The number of structural features of the '<em>Model Data Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DATA_FEEDBACK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.fortiss.consistency.model.communication.RequestFulfillment <em>Request Fulfillment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.fortiss.consistency.model.communication.RequestFulfillment
	 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getRequestFulfillment()
	 * @generated
	 */
	int REQUEST_FULFILLMENT = 10;


	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry <em>Tool Adapter Registration Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Adapter Registration Entry</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry
	 * @generated
	 */
	EClass getToolAdapterRegistrationEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterIdentifier <em>Adapter Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Identifier</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterIdentifier()
	 * @see #getToolAdapterRegistrationEntry()
	 * @generated
	 */
	EAttribute getToolAdapterRegistrationEntry_AdapterIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getFullAdapterName <em>Full Adapter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Adapter Name</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getFullAdapterName()
	 * @see #getToolAdapterRegistrationEntry()
	 * @generated
	 */
	EAttribute getToolAdapterRegistrationEntry_FullAdapterName();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerHostAddress <em>Adapter Data Server Host Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Data Server Host Address</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerHostAddress()
	 * @see #getToolAdapterRegistrationEntry()
	 * @generated
	 */
	EAttribute getToolAdapterRegistrationEntry_AdapterDataServerHostAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerPort <em>Adapter Data Server Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Data Server Port</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getAdapterDataServerPort()
	 * @see #getToolAdapterRegistrationEntry()
	 * @generated
	 */
	EAttribute getToolAdapterRegistrationEntry_AdapterDataServerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getSerializedAdapterPublicKey <em>Serialized Adapter Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serialized Adapter Public Key</em>'.
	 * @see org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry#getSerializedAdapterPublicKey()
	 * @see #getToolAdapterRegistrationEntry()
	 * @generated
	 */
	EAttribute getToolAdapterRegistrationEntry_SerializedAdapterPublicKey();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.UserToken <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Token</em>'.
	 * @see org.fortiss.consistency.model.communication.UserToken
	 * @generated
	 */
	EClass getUserToken();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserToken#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see org.fortiss.consistency.model.communication.UserToken#getToken()
	 * @see #getUserToken()
	 * @generated
	 */
	EAttribute getUserToken_Token();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.UserBaseAttributes <em>User Base Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Base Attributes</em>'.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes
	 * @generated
	 */
	EClass getUserBaseAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserBaseAttributes#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes#getRole()
	 * @see #getUserBaseAttributes()
	 * @generated
	 */
	EAttribute getUserBaseAttributes_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserBaseAttributes#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes#getHierarchy()
	 * @see #getUserBaseAttributes()
	 * @generated
	 */
	EAttribute getUserBaseAttributes_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserBaseAttributes#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes#getDepartment()
	 * @see #getUserBaseAttributes()
	 * @generated
	 */
	EAttribute getUserBaseAttributes_Department();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserBaseAttributes#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.fortiss.consistency.model.communication.UserBaseAttributes#getCompany()
	 * @see #getUserBaseAttributes()
	 * @generated
	 */
	EAttribute getUserBaseAttributes_Company();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.UserHiddenInformation <em>User Hidden Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Hidden Information</em>'.
	 * @see org.fortiss.consistency.model.communication.UserHiddenInformation
	 * @generated
	 */
	EClass getUserHiddenInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.fortiss.consistency.model.communication.UserHiddenInformation#getUserName()
	 * @see #getUserHiddenInformation()
	 * @generated
	 */
	EAttribute getUserHiddenInformation_UserName();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getUserToken <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Token</em>'.
	 * @see org.fortiss.consistency.model.communication.UserHiddenInformation#getUserToken()
	 * @see #getUserHiddenInformation()
	 * @generated
	 */
	EReference getUserHiddenInformation_UserToken();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.UserHiddenInformation#getBaseAttributes <em>Base Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Attributes</em>'.
	 * @see org.fortiss.consistency.model.communication.UserHiddenInformation#getBaseAttributes()
	 * @see #getUserHiddenInformation()
	 * @generated
	 */
	EReference getUserHiddenInformation_BaseAttributes();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.UserInitialInformation <em>User Initial Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Initial Information</em>'.
	 * @see org.fortiss.consistency.model.communication.UserInitialInformation
	 * @generated
	 */
	EClass getUserInitialInformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.UserInitialInformation#getUserToken <em>User Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Token</em>'.
	 * @see org.fortiss.consistency.model.communication.UserInitialInformation#getUserToken()
	 * @see #getUserInitialInformation()
	 * @generated
	 */
	EReference getUserInitialInformation_UserToken();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserInitialInformation#getCurrentLocation <em>Current Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Location</em>'.
	 * @see org.fortiss.consistency.model.communication.UserInitialInformation#getCurrentLocation()
	 * @see #getUserInitialInformation()
	 * @generated
	 */
	EAttribute getUserInitialInformation_CurrentLocation();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.UserDetailedInformation <em>User Detailed Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Detailed Information</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation
	 * @generated
	 */
	EClass getUserDetailedInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getRole()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getHierarchy()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_Hierarchy();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getDepartment()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_Department();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getCompany()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_Company();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getUsedTool <em>Used Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used Tool</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getUsedTool()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_UsedTool();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.UserDetailedInformation#getTriggerTime <em>Trigger Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Time</em>'.
	 * @see org.fortiss.consistency.model.communication.UserDetailedInformation#getTriggerTime()
	 * @see #getUserDetailedInformation()
	 * @generated
	 */
	EAttribute getUserDetailedInformation_TriggerTime();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.TriggerRequest <em>Trigger Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Request</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerRequest
	 * @generated
	 */
	EClass getTriggerRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.TriggerRequest#getAdapterIdentifier <em>Adapter Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter Identifier</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerRequest#getAdapterIdentifier()
	 * @see #getTriggerRequest()
	 * @generated
	 */
	EAttribute getTriggerRequest_AdapterIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.TriggerRequest#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerRequest#getUser()
	 * @see #getTriggerRequest()
	 * @generated
	 */
	EReference getTriggerRequest_User();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.communication.TriggerRequest#getElementsToBeCheckedInfo <em>Elements To Be Checked Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements To Be Checked Info</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerRequest#getElementsToBeCheckedInfo()
	 * @see #getTriggerRequest()
	 * @generated
	 */
	EReference getTriggerRequest_ElementsToBeCheckedInfo();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.TriggerFeedback <em>Trigger Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Feedback</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerFeedback
	 * @generated
	 */
	EClass getTriggerFeedback();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.TriggerFeedback#getEvaluatedRulesCounter <em>Evaluated Rules Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluated Rules Counter</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerFeedback#getEvaluatedRulesCounter()
	 * @see #getTriggerFeedback()
	 * @generated
	 */
	EAttribute getTriggerFeedback_EvaluatedRulesCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.TriggerFeedback#getPerformedEvaluationsCounter <em>Performed Evaluations Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performed Evaluations Counter</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerFeedback#getPerformedEvaluationsCounter()
	 * @see #getTriggerFeedback()
	 * @generated
	 */
	EAttribute getTriggerFeedback_PerformedEvaluationsCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.communication.TriggerFeedback#getFoundViolations <em>Found Violations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Found Violations</em>'.
	 * @see org.fortiss.consistency.model.communication.TriggerFeedback#getFoundViolations()
	 * @see #getTriggerFeedback()
	 * @generated
	 */
	EReference getTriggerFeedback_FoundViolations();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.ModelDataRequest <em>Model Data Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Data Request</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest
	 * @generated
	 */
	EClass getModelDataRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getRequestIdentifier <em>Request Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Identifier</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest#getRequestIdentifier()
	 * @see #getModelDataRequest()
	 * @generated
	 */
	EAttribute getModelDataRequest_RequestIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getTargetedAdapter <em>Targeted Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Targeted Adapter</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest#getTargetedAdapter()
	 * @see #getModelDataRequest()
	 * @generated
	 */
	EAttribute getModelDataRequest_TargetedAdapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getViewtype <em>Viewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Viewtype</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest#getViewtype()
	 * @see #getModelDataRequest()
	 * @generated
	 */
	EReference getModelDataRequest_Viewtype();

	/**
	 * Returns the meta object for the containment reference list '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getNeededElementsInfo <em>Needed Elements Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needed Elements Info</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest#getNeededElementsInfo()
	 * @see #getModelDataRequest()
	 * @generated
	 */
	EReference getModelDataRequest_NeededElementsInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.ModelDataRequest#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataRequest#getUser()
	 * @see #getModelDataRequest()
	 * @generated
	 */
	EReference getModelDataRequest_User();

	/**
	 * Returns the meta object for class '{@link org.fortiss.consistency.model.communication.ModelDataFeedback <em>Model Data Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Data Feedback</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataFeedback
	 * @generated
	 */
	EClass getModelDataFeedback();

	/**
	 * Returns the meta object for the attribute '{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getRequestFulfillment <em>Request Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Fulfillment</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataFeedback#getRequestFulfillment()
	 * @see #getModelDataFeedback()
	 * @generated
	 */
	EAttribute getModelDataFeedback_RequestFulfillment();

	/**
	 * Returns the meta object for the containment reference '{@link org.fortiss.consistency.model.communication.ModelDataFeedback#getProvidedData <em>Provided Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Data</em>'.
	 * @see org.fortiss.consistency.model.communication.ModelDataFeedback#getProvidedData()
	 * @see #getModelDataFeedback()
	 * @generated
	 */
	EReference getModelDataFeedback_ProvidedData();

	/**
	 * Returns the meta object for enum '{@link org.fortiss.consistency.model.communication.RequestFulfillment <em>Request Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Fulfillment</em>'.
	 * @see org.fortiss.consistency.model.communication.RequestFulfillment
	 * @generated
	 */
	EEnum getRequestFulfillment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationFactory getCommunicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl <em>Tool Adapter Registration Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.ToolAdapterRegistrationEntryImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getToolAdapterRegistrationEntry()
		 * @generated
		 */
		EClass TOOL_ADAPTER_REGISTRATION_ENTRY = eINSTANCE.getToolAdapterRegistrationEntry();

		/**
		 * The meta object literal for the '<em><b>Adapter Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_IDENTIFIER = eINSTANCE.getToolAdapterRegistrationEntry_AdapterIdentifier();

		/**
		 * The meta object literal for the '<em><b>Full Adapter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ADAPTER_REGISTRATION_ENTRY__FULL_ADAPTER_NAME = eINSTANCE.getToolAdapterRegistrationEntry_FullAdapterName();

		/**
		 * The meta object literal for the '<em><b>Adapter Data Server Host Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_HOST_ADDRESS = eINSTANCE.getToolAdapterRegistrationEntry_AdapterDataServerHostAddress();

		/**
		 * The meta object literal for the '<em><b>Adapter Data Server Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ADAPTER_REGISTRATION_ENTRY__ADAPTER_DATA_SERVER_PORT = eINSTANCE.getToolAdapterRegistrationEntry_AdapterDataServerPort();

		/**
		 * The meta object literal for the '<em><b>Serialized Adapter Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_ADAPTER_REGISTRATION_ENTRY__SERIALIZED_ADAPTER_PUBLIC_KEY = eINSTANCE.getToolAdapterRegistrationEntry_SerializedAdapterPublicKey();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.UserTokenImpl <em>User Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.UserTokenImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserToken()
		 * @generated
		 */
		EClass USER_TOKEN = eINSTANCE.getUserToken();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_TOKEN__TOKEN = eINSTANCE.getUserToken_Token();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl <em>User Base Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.UserBaseAttributesImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserBaseAttributes()
		 * @generated
		 */
		EClass USER_BASE_ATTRIBUTES = eINSTANCE.getUserBaseAttributes();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BASE_ATTRIBUTES__ROLE = eINSTANCE.getUserBaseAttributes_Role();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BASE_ATTRIBUTES__HIERARCHY = eINSTANCE.getUserBaseAttributes_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BASE_ATTRIBUTES__DEPARTMENT = eINSTANCE.getUserBaseAttributes_Department();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_BASE_ATTRIBUTES__COMPANY = eINSTANCE.getUserBaseAttributes_Company();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl <em>User Hidden Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.UserHiddenInformationImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserHiddenInformation()
		 * @generated
		 */
		EClass USER_HIDDEN_INFORMATION = eINSTANCE.getUserHiddenInformation();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_HIDDEN_INFORMATION__USER_NAME = eINSTANCE.getUserHiddenInformation_UserName();

		/**
		 * The meta object literal for the '<em><b>User Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HIDDEN_INFORMATION__USER_TOKEN = eINSTANCE.getUserHiddenInformation_UserToken();

		/**
		 * The meta object literal for the '<em><b>Base Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_HIDDEN_INFORMATION__BASE_ATTRIBUTES = eINSTANCE.getUserHiddenInformation_BaseAttributes();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl <em>User Initial Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.UserInitialInformationImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserInitialInformation()
		 * @generated
		 */
		EClass USER_INITIAL_INFORMATION = eINSTANCE.getUserInitialInformation();

		/**
		 * The meta object literal for the '<em><b>User Token</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INITIAL_INFORMATION__USER_TOKEN = eINSTANCE.getUserInitialInformation_UserToken();

		/**
		 * The meta object literal for the '<em><b>Current Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INITIAL_INFORMATION__CURRENT_LOCATION = eINSTANCE.getUserInitialInformation_CurrentLocation();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl <em>User Detailed Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.UserDetailedInformationImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getUserDetailedInformation()
		 * @generated
		 */
		EClass USER_DETAILED_INFORMATION = eINSTANCE.getUserDetailedInformation();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__ROLE = eINSTANCE.getUserDetailedInformation_Role();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__HIERARCHY = eINSTANCE.getUserDetailedInformation_Hierarchy();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__DEPARTMENT = eINSTANCE.getUserDetailedInformation_Department();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__COMPANY = eINSTANCE.getUserDetailedInformation_Company();

		/**
		 * The meta object literal for the '<em><b>Used Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__USED_TOOL = eINSTANCE.getUserDetailedInformation_UsedTool();

		/**
		 * The meta object literal for the '<em><b>Trigger Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DETAILED_INFORMATION__TRIGGER_TIME = eINSTANCE.getUserDetailedInformation_TriggerTime();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.TriggerRequestImpl <em>Trigger Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.TriggerRequestImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getTriggerRequest()
		 * @generated
		 */
		EClass TRIGGER_REQUEST = eINSTANCE.getTriggerRequest();

		/**
		 * The meta object literal for the '<em><b>Adapter Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_REQUEST__ADAPTER_IDENTIFIER = eINSTANCE.getTriggerRequest_AdapterIdentifier();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_REQUEST__USER = eINSTANCE.getTriggerRequest_User();

		/**
		 * The meta object literal for the '<em><b>Elements To Be Checked Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_REQUEST__ELEMENTS_TO_BE_CHECKED_INFO = eINSTANCE.getTriggerRequest_ElementsToBeCheckedInfo();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl <em>Trigger Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.TriggerFeedbackImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getTriggerFeedback()
		 * @generated
		 */
		EClass TRIGGER_FEEDBACK = eINSTANCE.getTriggerFeedback();

		/**
		 * The meta object literal for the '<em><b>Evaluated Rules Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_FEEDBACK__EVALUATED_RULES_COUNTER = eINSTANCE.getTriggerFeedback_EvaluatedRulesCounter();

		/**
		 * The meta object literal for the '<em><b>Performed Evaluations Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER_FEEDBACK__PERFORMED_EVALUATIONS_COUNTER = eINSTANCE.getTriggerFeedback_PerformedEvaluationsCounter();

		/**
		 * The meta object literal for the '<em><b>Found Violations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER_FEEDBACK__FOUND_VIOLATIONS = eINSTANCE.getTriggerFeedback_FoundViolations();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl <em>Model Data Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.ModelDataRequestImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getModelDataRequest()
		 * @generated
		 */
		EClass MODEL_DATA_REQUEST = eINSTANCE.getModelDataRequest();

		/**
		 * The meta object literal for the '<em><b>Request Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DATA_REQUEST__REQUEST_IDENTIFIER = eINSTANCE.getModelDataRequest_RequestIdentifier();

		/**
		 * The meta object literal for the '<em><b>Targeted Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DATA_REQUEST__TARGETED_ADAPTER = eINSTANCE.getModelDataRequest_TargetedAdapter();

		/**
		 * The meta object literal for the '<em><b>Viewtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DATA_REQUEST__VIEWTYPE = eINSTANCE.getModelDataRequest_Viewtype();

		/**
		 * The meta object literal for the '<em><b>Needed Elements Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DATA_REQUEST__NEEDED_ELEMENTS_INFO = eINSTANCE.getModelDataRequest_NeededElementsInfo();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DATA_REQUEST__USER = eINSTANCE.getModelDataRequest_User();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl <em>Model Data Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.impl.ModelDataFeedbackImpl
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getModelDataFeedback()
		 * @generated
		 */
		EClass MODEL_DATA_FEEDBACK = eINSTANCE.getModelDataFeedback();

		/**
		 * The meta object literal for the '<em><b>Request Fulfillment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DATA_FEEDBACK__REQUEST_FULFILLMENT = eINSTANCE.getModelDataFeedback_RequestFulfillment();

		/**
		 * The meta object literal for the '<em><b>Provided Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DATA_FEEDBACK__PROVIDED_DATA = eINSTANCE.getModelDataFeedback_ProvidedData();

		/**
		 * The meta object literal for the '{@link org.fortiss.consistency.model.communication.RequestFulfillment <em>Request Fulfillment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.fortiss.consistency.model.communication.RequestFulfillment
		 * @see org.fortiss.consistency.model.communication.impl.CommunicationPackageImpl#getRequestFulfillment()
		 * @generated
		 */
		EEnum REQUEST_FULFILLMENT = eINSTANCE.getRequestFulfillment();

	}

} //CommunicationPackage
