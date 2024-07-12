/**
 */
package org.fortiss.consistency.viewtypes.dictionary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.consistency.viewtypes.basics.BasicsPackage;

import org.fortiss.consistency.viewtypes.dictionary.AbsoluteTermEntry;
import org.fortiss.consistency.viewtypes.dictionary.Dictionary;
import org.fortiss.consistency.viewtypes.dictionary.DictionaryElement;
import org.fortiss.consistency.viewtypes.dictionary.DictionaryFactory;
import org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage;

import org.fortiss.consistency.viewtypes.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DictionaryPackageImpl extends EPackageImpl implements DictionaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absoluteTermEntryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.fortiss.consistency.viewtypes.dictionary.DictionaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DictionaryPackageImpl() {
		super(eNS_URI, DictionaryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DictionaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DictionaryPackage init() {
		if (isInited) return (DictionaryPackage)EPackage.Registry.INSTANCE.getEPackage(DictionaryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDictionaryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DictionaryPackageImpl theDictionaryPackage = registeredDictionaryPackage instanceof DictionaryPackageImpl ? (DictionaryPackageImpl)registeredDictionaryPackage : new DictionaryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicsPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDictionaryPackage.createPackageContents();

		// Initialize created meta-data
		theDictionaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDictionaryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DictionaryPackage.eNS_URI, theDictionaryPackage);
		return theDictionaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionary() {
		return dictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionary_ContainedElements() {
		return (EReference)dictionaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionaryElement() {
		return dictionaryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbsoluteTermEntry() {
		return absoluteTermEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbsoluteTermEntry_AbsoluteTerm() {
		return (EReference)absoluteTermEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryFactory getDictionaryFactory() {
		return (DictionaryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dictionaryEClass = createEClass(DICTIONARY);
		createEReference(dictionaryEClass, DICTIONARY__CONTAINED_ELEMENTS);

		dictionaryElementEClass = createEClass(DICTIONARY_ELEMENT);

		absoluteTermEntryEClass = createEClass(ABSOLUTE_TERM_ENTRY);
		createEReference(absoluteTermEntryEClass, ABSOLUTE_TERM_ENTRY__ABSOLUTE_TERM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicsPackage theBasicsPackage = (BasicsPackage)EPackage.Registry.INSTANCE.getEPackage(BasicsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dictionaryEClass.getESuperTypes().add(theBasicsPackage.getIIdElement());
		dictionaryEClass.getESuperTypes().add(theBasicsPackage.getINamedElement());
		dictionaryElementEClass.getESuperTypes().add(theBasicsPackage.getIIdElement());
		dictionaryElementEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		absoluteTermEntryEClass.getESuperTypes().add(this.getDictionaryElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictionary_ContainedElements(), this.getDictionaryElement(), null, "containedElements", null, 0, -1, Dictionary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictionaryElementEClass, DictionaryElement.class, "DictionaryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(absoluteTermEntryEClass, AbsoluteTermEntry.class, "AbsoluteTermEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsoluteTermEntry_AbsoluteTerm(), theTypesPackage.getIValue(), null, "absoluteTerm", null, 0, 1, AbsoluteTermEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DictionaryPackageImpl
