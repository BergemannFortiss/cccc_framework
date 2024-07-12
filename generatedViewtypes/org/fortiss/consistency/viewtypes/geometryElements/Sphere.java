/**
 */
package org.fortiss.consistency.viewtypes.geometryElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.geometryElements.Sphere#getDiameter <em>Diameter</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getSphere()
 * @model
 * @generated
 */
public interface Sphere extends GeometryElement {
	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(double)
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#getSphere_Diameter()
	 * @model
	 * @generated
	 */
	double getDiameter();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.geometryElements.Sphere#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(double value);

} // Sphere
