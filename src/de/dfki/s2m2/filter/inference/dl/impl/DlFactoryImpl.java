/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.dfki.s2m2.filter.inference.dl.DlFactory;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.Equivalence;
import de.dfki.s2m2.filter.inference.dl.LeastGenericConcept;
import de.dfki.s2m2.filter.inference.dl.Subsumption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DlFactoryImpl extends EFactoryImpl implements DlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DlFactory init() {
		try {
			DlFactory theDlFactory = (DlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2/inference/dl"); 
			if (theDlFactory != null) {
				return theDlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DlFactoryImpl() {
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
			case DlPackage.EQUIVALENCE: return createEquivalence();
			case DlPackage.SUBSUMPTION: return createSubsumption();
			case DlPackage.LEAST_GENERIC_CONCEPT: return createLeastGenericConcept();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equivalence createEquivalence() {
		EquivalenceImpl equivalence = new EquivalenceImpl();
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsumption createSubsumption() {
		SubsumptionImpl subsumption = new SubsumptionImpl();
		return subsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeastGenericConcept createLeastGenericConcept() {
		LeastGenericConceptImpl leastGenericConcept = new LeastGenericConceptImpl();
		return leastGenericConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DlPackage getDlPackage() {
		return (DlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DlPackage getPackage() {
		return DlPackage.eINSTANCE;
	}

} //DlFactoryImpl
