/**
 */
package org.fortiss.consistency.viewtypes.geometryElements;

import org.eclipse.emf.common.util.EList;

import org.fortiss.consistency.viewtypes.basics.INamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getContainedElements <em>Contained Elements</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getGeometryElement()
 * @model
 * @generated
 */
public interface GeometryElement extends INamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getGeometryElement_ContainedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeometryElement> getContainedElements();

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getGeometryElement_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Origin)
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getGeometryElement_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Origin getOrigin();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.geometryElements.GeometryElement#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Origin value);

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' attribute list.
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getGeometryElement_Materials()
	 * @model
	 * @generated
	 */
	EList<String> getMaterials();

} // GeometryElement
