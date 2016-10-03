/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionFactory;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.service.pddl.PDDLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThetasubsumptionFactoryImpl extends EFactoryImpl implements ThetasubsumptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThetasubsumptionFactory init() {
		try {
			ThetasubsumptionFactory theThetasubsumptionFactory = (ThetasubsumptionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2/inference/theoremproving/theta"); 
			if (theThetasubsumptionFactory != null) {
				return theThetasubsumptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThetasubsumptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThetasubsumptionFactoryImpl() {
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
			case ThetasubsumptionPackage.THETA_SUBSUMPTION: return createThetaSubsumption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ThetasubsumptionPackage.PDDL_EXPRESSION:
				return createPDDLExpressionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ThetasubsumptionPackage.PDDL_EXPRESSION:
				return convertPDDLExpressionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThetaSubsumption createThetaSubsumption() {
		ThetaSubsumptionImpl thetaSubsumption = new ThetaSubsumptionImpl();
		return thetaSubsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDDLExpression createPDDLExpressionFromString(EDataType eDataType, String initialValue) {
		return (PDDLExpression)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPDDLExpressionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThetasubsumptionPackage getThetasubsumptionPackage() {
		return (ThetasubsumptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThetasubsumptionPackage getPackage() {
		return ThetasubsumptionPackage.eINSTANCE;
	}

} //ThetasubsumptionFactoryImpl
