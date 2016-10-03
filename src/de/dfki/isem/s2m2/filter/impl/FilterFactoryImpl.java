/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.semanticweb.owl.model.OWLDescription;

import uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner;
import de.dfki.isem.s2m2.filter.ApproximatedSubsumption;
import de.dfki.isem.s2m2.filter.DirectCommonSubsumers;
import de.dfki.isem.s2m2.filter.FilterFactory;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.StructuralSimilarity;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ViewExtractor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilterFactoryImpl extends EFactoryImpl implements FilterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilterFactory init() {
		try {
			FilterFactory theFilterFactory = (FilterFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/isem/2011/isem"); 
			if (theFilterFactory != null) {
				return theFilterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FilterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterFactoryImpl() {
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
			case FilterPackage.ISE_MREASONER: return createiSeMReasoner();
			case FilterPackage.APPROXIMATED_SUBSUMPTION: return createApproximatedSubsumption();
			case FilterPackage.DIRECT_COMMON_SUBSUMERS: return createDirectCommonSubsumers();
			case FilterPackage.STRUCTURAL_SIMILARITY: return createStructuralSimilarity();
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
			case FilterPackage.LOGGER:
				return createLoggerFromString(eDataType, initialValue);
			case FilterPackage.SERVICE_REGISTRY:
				return createServiceRegistryFromString(eDataType, initialValue);
			case FilterPackage.VIEW_EXTRACTOR:
				return createViewExtractorFromString(eDataType, initialValue);
			case FilterPackage.DIG_REASONER:
				return createDIGReasonerFromString(eDataType, initialValue);
			case FilterPackage.OWL_DESCRPTION:
				return createOWLDescrptionFromString(eDataType, initialValue);
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
			case FilterPackage.LOGGER:
				return convertLoggerToString(eDataType, instanceValue);
			case FilterPackage.SERVICE_REGISTRY:
				return convertServiceRegistryToString(eDataType, instanceValue);
			case FilterPackage.VIEW_EXTRACTOR:
				return convertViewExtractorToString(eDataType, instanceValue);
			case FilterPackage.DIG_REASONER:
				return convertDIGReasonerToString(eDataType, instanceValue);
			case FilterPackage.OWL_DESCRPTION:
				return convertOWLDescrptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iSeMReasoner createiSeMReasoner() {
		iSeMReasonerImpl iSeMReasoner = new iSeMReasonerImpl();
		return iSeMReasoner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApproximatedSubsumption createApproximatedSubsumption() {
		ApproximatedSubsumptionImpl approximatedSubsumption = new ApproximatedSubsumptionImpl();
		return approximatedSubsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectCommonSubsumers createDirectCommonSubsumers() {
		DirectCommonSubsumersImpl directCommonSubsumers = new DirectCommonSubsumersImpl();
		return directCommonSubsumers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralSimilarity createStructuralSimilarity() {
		StructuralSimilarityImpl structuralSimilarity = new StructuralSimilarityImpl();
		return structuralSimilarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger createLoggerFromString(EDataType eDataType, String initialValue) {
		return (Logger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoggerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRegistry createServiceRegistryFromString(EDataType eDataType, String initialValue) {
		return (ServiceRegistry)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceRegistryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewExtractor createViewExtractorFromString(EDataType eDataType, String initialValue) {
		return (ViewExtractor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewExtractorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIGReasoner createDIGReasonerFromString(EDataType eDataType, String initialValue) {
		return (DIGReasoner)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDIGReasonerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDescription createOWLDescrptionFromString(EDataType eDataType, String initialValue) {
		return (OWLDescription)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOWLDescrptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterPackage getFilterPackage() {
		return (FilterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilterPackage getPackage() {
		return FilterPackage.eINSTANCE;
	}

} //FilterFactoryImpl
