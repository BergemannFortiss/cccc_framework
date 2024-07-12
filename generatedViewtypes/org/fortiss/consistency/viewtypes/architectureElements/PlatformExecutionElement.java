/**
 */
package org.fortiss.consistency.viewtypes.architectureElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Execution Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedRamMemory <em>Provided Ram Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedFlashMemory <em>Provided Flash Memory</em>}</li>
 *   <li>{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getAcquisitionCost <em>Acquisition Cost</em>}</li>
 * </ul>
 *
 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getPlatformExecutionElement()
 * @model
 * @generated
 */
public interface PlatformExecutionElement extends ArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Provided Ram Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RAM size in KB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Ram Memory</em>' attribute.
	 * @see #setProvidedRamMemory(double)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getPlatformExecutionElement_ProvidedRamMemory()
	 * @model
	 * @generated
	 */
	double getProvidedRamMemory();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedRamMemory <em>Provided Ram Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Ram Memory</em>' attribute.
	 * @see #getProvidedRamMemory()
	 * @generated
	 */
	void setProvidedRamMemory(double value);

	/**
	 * Returns the value of the '<em><b>Provided Flash Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flash size in KB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Flash Memory</em>' attribute.
	 * @see #setProvidedFlashMemory(double)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getPlatformExecutionElement_ProvidedFlashMemory()
	 * @model
	 * @generated
	 */
	double getProvidedFlashMemory();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getProvidedFlashMemory <em>Provided Flash Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Flash Memory</em>' attribute.
	 * @see #getProvidedFlashMemory()
	 * @generated
	 */
	void setProvidedFlashMemory(double value);

	/**
	 * Returns the value of the '<em><b>Acquisition Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flash size in KB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acquisition Cost</em>' attribute.
	 * @see #setAcquisitionCost(double)
	 * @see org.fortiss.consistency.viewtypes.architectureElements.ArchitectureElementsPackage#getPlatformExecutionElement_AcquisitionCost()
	 * @model
	 * @generated
	 */
	double getAcquisitionCost();

	/**
	 * Sets the value of the '{@link org.fortiss.consistency.viewtypes.architectureElements.PlatformExecutionElement#getAcquisitionCost <em>Acquisition Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition Cost</em>' attribute.
	 * @see #getAcquisitionCost()
	 * @generated
	 */
	void setAcquisitionCost(double value);

} // PlatformExecutionElement
