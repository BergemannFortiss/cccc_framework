/**
 */
package org.fortiss.consistency.viewtypes.dictionary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage
 * @generated
 */
public interface DictionaryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DictionaryFactory eINSTANCE = org.fortiss.consistency.viewtypes.dictionary.impl.DictionaryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary</em>'.
	 * @generated
	 */
	Dictionary createDictionary();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	DictionaryElement createDictionaryElement();

	/**
	 * Returns a new object of class '<em>Absolute Term Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absolute Term Entry</em>'.
	 * @generated
	 */
	AbsoluteTermEntry createAbsoluteTermEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DictionaryPackage getDictionaryPackage();

} //DictionaryFactory
