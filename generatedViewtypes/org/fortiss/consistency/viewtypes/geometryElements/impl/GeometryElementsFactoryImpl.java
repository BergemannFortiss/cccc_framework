/**
 */
package org.fortiss.consistency.viewtypes.geometryElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.fortiss.consistency.viewtypes.geometryElements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryElementsFactoryImpl extends EFactoryImpl implements GeometryElementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeometryElementsFactory init() {
		try {
			GeometryElementsFactory theGeometryElementsFactory = (GeometryElementsFactory)EPackage.Registry.INSTANCE.getEFactory(GeometryElementsPackage.eNS_URI);
			if (theGeometryElementsFactory != null) {
				return theGeometryElementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeometryElementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryElementsFactoryImpl() {
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
			case GeometryElementsPackage.GEOMETRY: return createGeometry();
			case GeometryElementsPackage.GEOMETRY_ELEMENT: return createGeometryElement();
			case GeometryElementsPackage.PLACEHOLDER_ELEMENT: return createPlaceholderElement();
			case GeometryElementsPackage.ORIGIN: return createOrigin();
			case GeometryElementsPackage.SPHERE: return createSphere();
			case GeometryElementsPackage.CUBE: return createCube();
			case GeometryElementsPackage.CUBOID: return createCuboid();
			case GeometryElementsPackage.PLANE: return createPlane();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryElement createGeometryElement() {
		GeometryElementImpl geometryElement = new GeometryElementImpl();
		return geometryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceholderElement createPlaceholderElement() {
		PlaceholderElementImpl placeholderElement = new PlaceholderElementImpl();
		return placeholderElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin createOrigin() {
		OriginImpl origin = new OriginImpl();
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere() {
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cube createCube() {
		CubeImpl cube = new CubeImpl();
		return cube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuboid createCuboid() {
		CuboidImpl cuboid = new CuboidImpl();
		return cuboid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plane createPlane() {
		PlaneImpl plane = new PlaneImpl();
		return plane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryElementsPackage getGeometryElementsPackage() {
		return (GeometryElementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeometryElementsPackage getPackage() {
		return GeometryElementsPackage.eINSTANCE;
	}

} //GeometryElementsFactoryImpl
