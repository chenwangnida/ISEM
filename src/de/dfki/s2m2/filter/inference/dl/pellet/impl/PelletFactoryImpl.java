/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.clarkparsia.modularity.IncrementalClassifier;

import de.dfki.s2m2.filter.inference.dl.pellet.PelletFactory;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PelletFactoryImpl extends EFactoryImpl implements PelletFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PelletFactory init() {
		try {
			PelletFactory thePelletFactory = (PelletFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.dfki.de/s2m2/2011/s2m2/inference/dl/pellet"); 
			if (thePelletFactory != null) {
				return thePelletFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PelletFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletFactoryImpl() {
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
			case PelletPackage.PELLET_REASONER: return createPelletReasoner();
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
			case PelletPackage.OWL_ONTOLOGY_MANAGER:
				return createOWLOntologyManagerFromString(eDataType, initialValue);
			case PelletPackage.OWL_DATA_FACTORY:
				return createOWLDataFactoryFromString(eDataType, initialValue);
			case PelletPackage.OWL_ONTOLOGY:
				return createOWLOntologyFromString(eDataType, initialValue);
			case PelletPackage.INCREMENTAL_CLASSIFIER:
				return createIncrementalClassifierFromString(eDataType, initialValue);
			case PelletPackage.SET:
				return createSetFromString(eDataType, initialValue);
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
			case PelletPackage.OWL_ONTOLOGY_MANAGER:
				return convertOWLOntologyManagerToString(eDataType, instanceValue);
			case PelletPackage.OWL_DATA_FACTORY:
				return convertOWLDataFactoryToString(eDataType, instanceValue);
			case PelletPackage.OWL_ONTOLOGY:
				return convertOWLOntologyToString(eDataType, instanceValue);
			case PelletPackage.INCREMENTAL_CLASSIFIER:
				return convertIncrementalClassifierToString(eDataType, instanceValue);
			case PelletPackage.SET:
				return convertSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletReasoner createPelletReasoner() {
		PelletReasonerImpl pelletReasoner = new PelletReasonerImpl();
		return pelletReasoner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntologyManager createOWLOntologyManagerFromString(EDataType eDataType, String initialValue) {
		return (OWLOntologyManager)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOWLOntologyManagerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDataFactory createOWLDataFactoryFromString(EDataType eDataType, String initialValue) {
		return (OWLDataFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOWLDataFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntology createOWLOntologyFromString(EDataType eDataType, String initialValue) {
		return (OWLOntology)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOWLOntologyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalClassifier createIncrementalClassifierFromString(EDataType eDataType, String initialValue) {
		return (IncrementalClassifier)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncrementalClassifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<?> createSetFromString(EDataType eDataType, String initialValue) {
		return (Set<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PelletPackage getPelletPackage() {
		return (PelletPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PelletPackage getPackage() {
		return PelletPackage.eINSTANCE;
	}

} //PelletFactoryImpl
