/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.s2m2.filter.inference.theoremproving.Implication;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingFactory;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TheoremprovingFactoryImpl extends EFactoryImpl implements TheoremprovingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TheoremprovingFactory init() {
		try {
			TheoremprovingFactory theTheoremprovingFactory = (TheoremprovingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2/inference/theoremproving"); 
			if (theTheoremprovingFactory != null) {
				return theTheoremprovingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TheoremprovingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremprovingFactoryImpl() {
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
			case TheoremprovingPackage.IMPLICATION: return createImplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends SpecificationExpression> Implication<T> createImplication() {
		ImplicationImpl<T> implication = new ImplicationImpl<T>();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremprovingPackage getTheoremprovingPackage() {
		return (TheoremprovingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TheoremprovingPackage getPackage() {
		return TheoremprovingPackage.eINSTANCE;
	}

} //TheoremprovingFactoryImpl
