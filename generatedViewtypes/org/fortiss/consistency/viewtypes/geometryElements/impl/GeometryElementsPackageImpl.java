/**
 */
package org.fortiss.consistency.viewtypes.geometryElements.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.fortiss.consistency.viewtypes.basics.BasicsPackage;

import org.fortiss.consistency.viewtypes.basics.impl.BasicsPackageImpl;

import org.fortiss.consistency.viewtypes.geometryElements.Cube;
import org.fortiss.consistency.viewtypes.geometryElements.Cuboid;
import org.fortiss.consistency.viewtypes.geometryElements.Geometry;
import org.fortiss.consistency.viewtypes.geometryElements.GeometryElement;
import org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsFactory;
import org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage;
import org.fortiss.consistency.viewtypes.geometryElements.Origin;
import org.fortiss.consistency.viewtypes.geometryElements.PlaceholderElement;
import org.fortiss.consistency.viewtypes.geometryElements.Plane;
import org.fortiss.consistency.viewtypes.geometryElements.Sphere;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryElementsPackageImpl extends EPackageImpl implements GeometryElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeholderElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuboidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeEClass = null;

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
	 * @see org.fortiss.consistency.viewtypes.geometryElements.GeometryElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeometryElementsPackageImpl() {
		super(eNS_URI, GeometryElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeometryElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeometryElementsPackage init() {
		if (isInited) return (GeometryElementsPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryElementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGeometryElementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GeometryElementsPackageImpl theGeometryElementsPackage = registeredGeometryElementsPackage instanceof GeometryElementsPackageImpl ? (GeometryElementsPackageImpl)registeredGeometryElementsPackage : new GeometryElementsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicsPackage.eNS_URI);
		BasicsPackageImpl theBasicsPackage = (BasicsPackageImpl)(registeredPackage instanceof BasicsPackageImpl ? registeredPackage : BasicsPackage.eINSTANCE);

		// Create package meta-data objects
		theGeometryElementsPackage.createPackageContents();
		theBasicsPackage.createPackageContents();

		// Initialize created meta-data
		theGeometryElementsPackage.initializePackageContents();
		theBasicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeometryElementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeometryElementsPackage.eNS_URI, theGeometryElementsPackage);
		return theGeometryElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_ContainedElements() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryElement() {
		return geometryElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryElement_ContainedElements() {
		return (EReference)geometryElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryElement_Weight() {
		return (EAttribute)geometryElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometryElement_Origin() {
		return (EReference)geometryElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeometryElement_Materials() {
		return (EAttribute)geometryElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceholderElement() {
		return placeholderElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceholderElement_Type() {
		return (EAttribute)placeholderElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrigin() {
		return originEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrigin_X() {
		return (EAttribute)originEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrigin_Y() {
		return (EAttribute)originEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrigin_Z() {
		return (EAttribute)originEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphere() {
		return sphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphere_Diameter() {
		return (EAttribute)sphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCube() {
		return cubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCube_Length() {
		return (EAttribute)cubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuboid() {
		return cuboidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuboid_Length() {
		return (EAttribute)cuboidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuboid_Width() {
		return (EAttribute)cuboidEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCuboid_Height() {
		return (EAttribute)cuboidEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlane() {
		return planeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlane_Length() {
		return (EAttribute)planeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlane_Width() {
		return (EAttribute)planeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryElementsFactory getGeometryElementsFactory() {
		return (GeometryElementsFactory)getEFactoryInstance();
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
		geometryEClass = createEClass(GEOMETRY);
		createEReference(geometryEClass, GEOMETRY__CONTAINED_ELEMENTS);

		geometryElementEClass = createEClass(GEOMETRY_ELEMENT);
		createEReference(geometryElementEClass, GEOMETRY_ELEMENT__CONTAINED_ELEMENTS);
		createEAttribute(geometryElementEClass, GEOMETRY_ELEMENT__WEIGHT);
		createEReference(geometryElementEClass, GEOMETRY_ELEMENT__ORIGIN);
		createEAttribute(geometryElementEClass, GEOMETRY_ELEMENT__MATERIALS);

		placeholderElementEClass = createEClass(PLACEHOLDER_ELEMENT);
		createEAttribute(placeholderElementEClass, PLACEHOLDER_ELEMENT__TYPE);

		originEClass = createEClass(ORIGIN);
		createEAttribute(originEClass, ORIGIN__X);
		createEAttribute(originEClass, ORIGIN__Y);
		createEAttribute(originEClass, ORIGIN__Z);

		sphereEClass = createEClass(SPHERE);
		createEAttribute(sphereEClass, SPHERE__DIAMETER);

		cubeEClass = createEClass(CUBE);
		createEAttribute(cubeEClass, CUBE__LENGTH);

		cuboidEClass = createEClass(CUBOID);
		createEAttribute(cuboidEClass, CUBOID__LENGTH);
		createEAttribute(cuboidEClass, CUBOID__WIDTH);
		createEAttribute(cuboidEClass, CUBOID__HEIGHT);

		planeEClass = createEClass(PLANE);
		createEAttribute(planeEClass, PLANE__LENGTH);
		createEAttribute(planeEClass, PLANE__WIDTH);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		geometryEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		geometryElementEClass.getESuperTypes().add(theBasicsPackage.getINamedCommentedElement());
		placeholderElementEClass.getESuperTypes().add(this.getGeometryElement());
		originEClass.getESuperTypes().add(this.getGeometryElement());
		sphereEClass.getESuperTypes().add(this.getGeometryElement());
		cubeEClass.getESuperTypes().add(this.getGeometryElement());
		cuboidEClass.getESuperTypes().add(this.getGeometryElement());
		planeEClass.getESuperTypes().add(this.getGeometryElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometry_ContainedElements(), this.getGeometryElement(), null, "containedElements", null, 0, -1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryElementEClass, GeometryElement.class, "GeometryElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometryElement_ContainedElements(), this.getGeometryElement(), null, "containedElements", null, 0, -1, GeometryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometryElement_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, GeometryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometryElement_Origin(), this.getOrigin(), null, "origin", null, 0, 1, GeometryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeometryElement_Materials(), ecorePackage.getEString(), "materials", null, 0, -1, GeometryElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeholderElementEClass, PlaceholderElement.class, "PlaceholderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceholderElement_Type(), ecorePackage.getEString(), "type", null, 0, 1, PlaceholderElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(originEClass, Origin.class, "Origin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrigin_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Origin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrigin_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Origin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrigin_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Origin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereEClass, Sphere.class, "Sphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphere_Diameter(), ecorePackage.getEDouble(), "diameter", null, 0, 1, Sphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cubeEClass, Cube.class, "Cube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCube_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cuboidEClass, Cuboid.class, "Cuboid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCuboid_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Cuboid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuboid_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Cuboid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCuboid_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Cuboid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planeEClass, Plane.class, "Plane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlane_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlane_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Plane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GeometryElementsPackageImpl
