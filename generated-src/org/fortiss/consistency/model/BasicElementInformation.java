/**
 * (c) 2024. GENERATED CODE: Do not edit, see Ecore metamodel instead!
 */
package org.fortiss.consistency.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Element Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Model element containing basic information about other model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.model.BasicElementInformation#getElementClassString <em>Element Class String</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.BasicElementInformation#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.BasicElementInformation#getElementId <em>Element Id</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.BasicElementInformation#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link org.fortiss.consistency.model.BasicElementInformation#getSourceTool <em>Source Tool</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation()
 * @model
 * @generated
 */
public interface BasicElementInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Class String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Class String</em>' attribute.
	 * @see #setElementClassString(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation_ElementClassString()
	 * @model
	 * @generated
	 */
	String getElementClassString();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.BasicElementInformation#getElementClassString <em>Element Class String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Class String</em>' attribute.
	 * @see #getElementClassString()
	 * @generated
	 */
	void setElementClassString(String value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation_ElementName()
	 * @model
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.BasicElementInformation#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation_ElementId()
	 * @model
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.BasicElementInformation#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model</em>' attribute.
	 * @see #setSourceModel(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation_SourceModel()
	 * @model
	 * @generated
	 */
	String getSourceModel();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.BasicElementInformation#getSourceModel <em>Source Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' attribute.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(String value);

	/**
	 * Returns the value of the '<em><b>Source Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tool</em>' attribute.
	 * @see #setSourceTool(String)
	 * @see org.fortiss.consistency.model.ConsistencyPackage#getBasicElementInformation_SourceTool()
	 * @model
	 * @generated
	 */
	String getSourceTool();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.model.BasicElementInformation#getSourceTool <em>Source Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tool</em>' attribute.
	 * @see #getSourceTool()
	 * @generated
	 */
	void setSourceTool(String value);

} // BasicElementInformation
