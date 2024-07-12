/**
 */
package org.fortiss.consistency.viewtypes.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = org.fortiss.consistency.viewtypes.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Boolean</em>'.
	 * @generated
	 */
	TypeBoolean createTypeBoolean();

	/**
	 * Returns a new object of class '<em>Type Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Integer</em>'.
	 * @generated
	 */
	TypeInteger createTypeInteger();

	/**
	 * Returns a new object of class '<em>Type Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Double</em>'.
	 * @generated
	 */
	TypeDouble createTypeDouble();

	/**
	 * Returns a new object of class '<em>Type String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type String</em>'.
	 * @generated
	 */
	TypeString createTypeString();

	/**
	 * Returns a new object of class '<em>Value Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Boolean</em>'.
	 * @generated
	 */
	ValueBoolean createValueBoolean();

	/**
	 * Returns a new object of class '<em>Value Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Integer</em>'.
	 * @generated
	 */
	ValueInteger createValueInteger();

	/**
	 * Returns a new object of class '<em>Value Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Double</em>'.
	 * @generated
	 */
	ValueDouble createValueDouble();

	/**
	 * Returns a new object of class '<em>Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value String</em>'.
	 * @generated
	 */
	ValueString createValueString();

	/**
	 * Returns a new object of class '<em>No Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Value</em>'.
	 * @generated
	 */
	NoValue createNoValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
