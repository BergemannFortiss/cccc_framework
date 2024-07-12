/**
 */
package org.fortiss.consistency.viewtypes.dictionary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.consistency.viewtypes.dictionary.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DictionaryFactoryImpl extends EFactoryImpl implements DictionaryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DictionaryFactory init() {
		try {
			DictionaryFactory theDictionaryFactory = (DictionaryFactory)EPackage.Registry.INSTANCE.getEFactory(DictionaryPackage.eNS_URI);
			if (theDictionaryFactory != null) {
				return theDictionaryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DictionaryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DictionaryPackage.DICTIONARY: return createDictionary();
			case DictionaryPackage.DICTIONARY_ELEMENT: return createDictionaryElement();
			case DictionaryPackage.ABSOLUTE_TERM_ENTRY: return createAbsoluteTermEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary createDictionary() {
		DictionaryImpl dictionary = new DictionaryImpl();
		return dictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryElement createDictionaryElement() {
		DictionaryElementImpl dictionaryElement = new DictionaryElementImpl();
		return dictionaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteTermEntry createAbsoluteTermEntry() {
		AbsoluteTermEntryImpl absoluteTermEntry = new AbsoluteTermEntryImpl();
		return absoluteTermEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryPackage getDictionaryPackage() {
		return (DictionaryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DictionaryPackage getPackage() {
		return DictionaryPackage.eINSTANCE;
	}

} //DictionaryFactoryImpl
