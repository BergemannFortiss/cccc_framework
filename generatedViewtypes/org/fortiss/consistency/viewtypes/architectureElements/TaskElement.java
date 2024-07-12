/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredRamMemory <em>Required Ram Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredFlashMemory <em>Required Flash Memory</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getTaskElement()
 * @model
 * @generated
 */
public interface TaskElement extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Required Ram Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RAM size in KB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Ram Memory</em>' attribute.
	 * @see #setRequiredRamMemory(double)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getTaskElement_RequiredRamMemory()
	 * @model
	 * @generated
	 */
	double getRequiredRamMemory();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredRamMemory <em>Required Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Ram Memory</em>' attribute.
	 * @see #getRequiredRamMemory()
	 * @generated
	 */
	void setRequiredRamMemory(double value);

	/**
	 * Returns the value of the '<em><b>Required Flash Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flash size in KB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Flash Memory</em>' attribute.
	 * @see #setRequiredFlashMemory(double)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getTaskElement_RequiredFlashMemory()
	 * @model
	 * @generated
	 */
	double getRequiredFlashMemory();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.TaskElement#getRequiredFlashMemory <em>Required Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Flash Memory</em>' attribute.
	 * @see #getRequiredFlashMemory()
	 * @generated
	 */
	void setRequiredFlashMemory(double value);

} // TaskElement
