/**
 */
package org.fortiss.consistency.viewtypes.geometryElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getLength <em>Length</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getPlane()
 * @model
 * @generated
 */
public interface Plane extends GeometryElement {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getPlane_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getPlane_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.geometryElements.Plane#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

} // Plane
