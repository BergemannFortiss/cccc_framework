/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.fortiss.consistency.model.BasicElementInformation;
import org.fortiss.consistency.model.ConsistencyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Element Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl#getElementClassString <em>Element Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.impl.BasicElementInformationImpl#getSourceTool <em>Source Tool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicElementInformationImpl extends EObjectImpl implements BasicElementInformation {
	/**
	 * The default value of the '{@link #getElementClassString() <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClassString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_CLASS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementClassString() <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementClassString()
	 * @generated
	 * @ordered
	 */
	protected String elementClassString = ELEMENT_CLASS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceModel() <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected String sourceModel = SOURCE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceTool() <em>Source Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTool()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceTool() <em>Source Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTool()
	 * @generated
	 * @ordered
	 */
	protected String sourceTool = SOURCE_TOOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicElementInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsistencyPackage.Literals.BASIC_ELEMENT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementClassString() {
		return elementClassString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementClassString(String newElementClassString) {
		String oldElementClassString = elementClassString;
		elementClassString = newElementClassString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING, oldElementClassString, elementClassString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementId() {
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceModel() {
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceModel(String newSourceModel) {
		String oldSourceModel = sourceModel;
		sourceModel = newSourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_MODEL, oldSourceModel, sourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceTool() {
		return sourceTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceTool(String newSourceTool) {
		String oldSourceTool = sourceTool;
		sourceTool = newSourceTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_TOOL, oldSourceTool, sourceTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING:
				return getElementClassString();
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_NAME:
				return getElementName();
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_ID:
				return getElementId();
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_MODEL:
				return getSourceModel();
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_TOOL:
				return getSourceTool();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING:
				setElementClassString((String)newValue);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_MODEL:
				setSourceModel((String)newValue);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_TOOL:
				setSourceTool((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING:
				setElementClassString(ELEMENT_CLASS_STRING_EDEFAULT);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_MODEL:
				setSourceModel(SOURCE_MODEL_EDEFAULT);
				return;
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_TOOL:
				setSourceTool(SOURCE_TOOL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_CLASS_STRING:
				return ELEMENT_CLASS_STRING_EDEFAULT == null ? elementClassString != null : !ELEMENT_CLASS_STRING_EDEFAULT.equals(elementClassString);
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_MODEL:
				return SOURCE_MODEL_EDEFAULT == null ? sourceModel != null : !SOURCE_MODEL_EDEFAULT.equals(sourceModel);
			case ConsistencyPackage.BASIC_ELEMENT_INFORMATION__SOURCE_TOOL:
				return SOURCE_TOOL_EDEFAULT == null ? sourceTool != null : !SOURCE_TOOL_EDEFAULT.equals(sourceTool);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (elementClassString: ");
		result.append(elementClassString);
		result.append(", elementName: ");
		result.append(elementName);
		result.append(", elementId: ");
		result.append(elementId);
		result.append(", sourceModel: ");
		result.append(sourceModel);
		result.append(", sourceTool: ");
		result.append(sourceTool);
		result.append(')');
		return result.toString();
	}

} //BasicElementInformationImpl
