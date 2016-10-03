/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl.pellet.impl;

import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.semanticweb.owl.apibinding.OWLManager;
import org.semanticweb.owl.inference.OWLReasonerAdapter;
import org.semanticweb.owl.inference.OWLReasonerException;
import org.semanticweb.owl.model.AddAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLClassAxiom;
import org.semanticweb.owl.model.OWLDataFactory;
import org.semanticweb.owl.model.OWLDataProperty;
import org.semanticweb.owl.model.OWLDataPropertyAxiom;
import org.semanticweb.owl.model.OWLEntity;
import org.semanticweb.owl.model.OWLIndividual;
import org.semanticweb.owl.model.OWLIndividualAxiom;
import org.semanticweb.owl.model.OWLObjectProperty;
import org.semanticweb.owl.model.OWLObjectPropertyAxiom;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import com.clarkparsia.modularity.IncrementalClassifier;

import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletReasoner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reasoner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#isPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getLOCAL_ONTOLOGY_URI <em>LOCAL ONTOLOGY URI</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getOntologyManager <em>Ontology Manager</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getOwlFactory <em>Owl Factory</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getLocalOntology <em>Local Ontology</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl#getProcessedConcepts <em>Processed Concepts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PelletReasonerImpl extends EObjectImpl implements PelletReasoner {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreprocessing() <em>Preprocessing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPROCESSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreprocessing() <em>Preprocessing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected boolean preprocessing = PREPROCESSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLOCAL_ONTOLOGY_URI() <em>LOCAL ONTOLOGY URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOCAL_ONTOLOGY_URI()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ONTOLOGY_URI_EDEFAULT = "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology";

	/**
	 * The cached value of the '{@link #getLOCAL_ONTOLOGY_URI() <em>LOCAL ONTOLOGY URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOCAL_ONTOLOGY_URI()
	 * @generated
	 * @ordered
	 */
	protected String locaL_ONTOLOGY_URI = LOCAL_ONTOLOGY_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntologyManager() <em>Ontology Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyManager()
	 * @generated
	 * @ordered
	 */
	protected static final OWLOntologyManager ONTOLOGY_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntologyManager() <em>Ontology Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntologyManager()
	 * @generated
	 * @ordered
	 */
	protected OWLOntologyManager ontologyManager = ONTOLOGY_MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwlFactory() <em>Owl Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlFactory()
	 * @generated
	 * @ordered
	 */
	protected static final OWLDataFactory OWL_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwlFactory() <em>Owl Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwlFactory()
	 * @generated
	 * @ordered
	 */
	protected OWLDataFactory owlFactory = OWL_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOntology() <em>Local Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOntology()
	 * @generated
	 * @ordered
	 */
	protected static final OWLOntology LOCAL_ONTOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOntology() <em>Local Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOntology()
	 * @generated
	 * @ordered
	 */
	protected OWLOntology localOntology = LOCAL_ONTOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected static final IncrementalClassifier CLASSIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected IncrementalClassifier classifier = CLASSIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessedConcepts() <em>Processed Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessedConcepts()
	 * @generated
	 * @ordered
	 */
	protected Set<URI> processedConcepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PelletReasonerImpl() {
		super();
		
		// create new OWL API ontology manager and Pellet reasoner
		ontologyManager	= OWLManager.createOWLOntologyManager();
		classifier		= new IncrementalClassifier(ontologyManager);
		try {
			localOntology	= ontologyManager.createOntology(URI.create(this.locaL_ONTOLOGY_URI));
			classifier.loadOntology(localOntology);
		}
		catch(OWLOntologyCreationException e) {
			// TODO error handling
		}
		catch(OWLReasonerException e) {
			// TODO error handling
		}
		owlFactory = ontologyManager.getOWLDataFactory();
		
		processedConcepts = new HashSet<URI>();
		preprocessing = true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PelletPackage.Literals.PELLET_REASONER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PelletPackage.PELLET_REASONER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreprocessing() {
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprocessing(boolean newPreprocessing) {
		boolean oldPreprocessing = preprocessing;
		preprocessing = newPreprocessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PelletPackage.PELLET_REASONER__PREPROCESSING, oldPreprocessing, preprocessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLOCAL_ONTOLOGY_URI() {
		return locaL_ONTOLOGY_URI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntologyManager getOntologyManager() {
		return ontologyManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLDataFactory getOwlFactory() {
		return owlFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntology getLocalOntology() {
		return localOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementalClassifier getClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set<URI> getProcessedConcepts() {
		return processedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean equivalent(EList<URI> concepts) throws InferenceException, NotSupportedException {
		try {
			Iterator<URI> iterator = concepts.iterator();
			
			OWLClass firstConcept = owlFactory.getOWLClass(iterator.next());
			if(!classifier.isDefined(firstConcept)) {
				processClass(firstConcept);
			}
			
			while(iterator.hasNext()) {
				OWLClass otherConcept = owlFactory.getOWLClass(iterator.next());
				if(!classifier.isDefined(otherConcept)) {
					processClass(otherConcept);
				}
				if(!classifier.isEquivalentClass(firstConcept, otherConcept)) {
					return false;
				}
			}
			
			return true;
		}
		catch(OWLReasonerException e) {
			// TODO
			throw new InferenceException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean subsumes(URI subsumer, URI subsumed) throws InferenceException, NotSupportedException {
		try {
			OWLClass owlConcept			= owlFactory.getOWLClass(subsumer);
			OWLClass owlSubsumedConcept	= owlFactory.getOWLClass(subsumed);
			
			if(!classifier.isDefined(owlConcept)) {
				processClass(owlConcept);
			}
			
			if(!classifier.isDefined(owlSubsumedConcept)) {
				processClass(owlSubsumedConcept);
			}
			
			return classifier.isSubClassOf(owlSubsumedConcept, owlConcept);
		}
		catch(OWLReasonerException e) {
			// TODO
			throw new InferenceException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean leastGeneric(URI parent, URI child) throws InferenceException, NotSupportedException {
		try {
			OWLClass owlConcept			= owlFactory.getOWLClass(child);
			OWLClass owlLgcConcept		= owlFactory.getOWLClass(parent);
			
			if(!classifier.isDefined(owlConcept)) {
				processClass(owlConcept);
			}
			
			if(!classifier.isDefined(owlLgcConcept)) {
				processClass(owlLgcConcept);
			}
			
			// TODO Bad code appearance
			for(OWLClass superClass : OWLReasonerAdapter.flattenSetOfSets(classifier.getSuperClasses(owlConcept))) {
				if(superClass.getURI().equals(parent))
					return true;
			}
			
			return false;
		}
		catch(OWLReasonerException e) {
			// TODO
			throw new InferenceException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void process(URI entity) {
		OWLClass owlClass = owlFactory.getOWLClass(entity);
		processClass(owlClass);
	}
	
	protected void processClass(OWLClass owlClass) {
		if(processedConcepts.contains(owlClass.getURI()))
			return;
		
		try {
			OWLOntology onto = ontologyManager.loadOntologyFromPhysicalURI(removeFragment(owlClass.getURI()));
			ontologyManager.applyChange(new AddAxiom(localOntology, owlFactory.getOWLSubClassAxiom(owlClass, owlFactory.getOWLThing())));
			processClass(owlClass, onto, new HashSet<OWLEntity>());
			classifier.classify();
			processedConcepts.add(owlClass.getURI());
		}
		catch(OWLOntologyCreationException e) {
			// TODO error handling
			return;
		}
		catch(OWLReasonerException e) {
			// TODO error handling
			return;
		}
		catch(OWLOntologyChangeException e) {
			// TODO error handling
			return;
		}
	}
	
	protected void processClass(OWLClass owlClass, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlClass))
			return;
		try {
			processedItems.add(owlClass);
			Set<OWLClassAxiom> definition = ontology.getAxioms(owlClass);
			for(OWLClassAxiom axiom : definition) {
				AddAxiom add = new AddAxiom(localOntology, axiom);
				ontologyManager.applyChange(add);
				
				// recurse for classes
				Set <OWLClass> owlClasses = axiom.getClassesInSignature();
				owlClasses.removeAll(processedItems);
				for(OWLClass otherOwlClass : owlClasses) {
					processClass(otherOwlClass, ontology, processedItems);
				}
				
				// recurse for object properties
				Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
				for(OWLObjectProperty owlProperty : owlProperties) {
					processObjectProperty(owlProperty, ontology, processedItems);
				}
				
				// recurse for datatype properties
				Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
				for(OWLDataProperty dataProperty : dataProperties) {
					processDataProperty(dataProperty, ontology, processedItems);
				}
				
				// recurse for individuals
				Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
				owlIndividuals.removeAll(processedItems);
				for(OWLIndividual owlIndividual : owlIndividuals) {
					processIndividual(owlIndividual, ontology, processedItems);
				}
			}
		}
		catch(OWLOntologyChangeException e) {
			// TODO error handling
			return;
		}
	}
	
	protected void processObjectProperty(OWLObjectProperty owlProperty, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlProperty))
			return;
		try {
			processedItems.add(owlProperty);
			Set<OWLObjectPropertyAxiom> definition = ontology.getAxioms(owlProperty);
			for(OWLObjectPropertyAxiom axiom : definition) {
				AddAxiom add = new AddAxiom(localOntology, axiom);
				ontologyManager.applyChange(add);
				
				// recurse for classes
				Set <OWLClass> owlClasses = axiom.getClassesInSignature();
				owlClasses.removeAll(processedItems);
				for(OWLClass otherOwlClass : owlClasses) {
					processClass(otherOwlClass, ontology, processedItems);
				}
				
				// recurse for object properties
				Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
				for(OWLObjectProperty otherOwlProperty : owlProperties) {
					processObjectProperty(otherOwlProperty, ontology, processedItems);
				}
				
				// recurse for datatype properties
				Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
				for(OWLDataProperty dataProperty : dataProperties) {
					processDataProperty(dataProperty, ontology, processedItems);
				}
				
				// recurse for individuals
				Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
				owlIndividuals.removeAll(processedItems);
				for(OWLIndividual owlIndividual : owlIndividuals) {
					processIndividual(owlIndividual, ontology, processedItems);
				}
			}
		}
		catch(OWLOntologyChangeException e) {
			// TODO error handling
			return;
		}
	}
	
	protected void processDataProperty(OWLDataProperty owlProperty, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlProperty))
			return;
		try {
			processedItems.add(owlProperty);
			Set<OWLDataPropertyAxiom> definition = ontology.getAxioms(owlProperty);
			for(OWLDataPropertyAxiom axiom : definition) {
				AddAxiom add = new AddAxiom(localOntology, axiom);
				ontologyManager.applyChange(add);
				
				// recurse for classes
				Set <OWLClass> owlClasses = axiom.getClassesInSignature();
				owlClasses.removeAll(processedItems);
				for(OWLClass otherOwlClass : owlClasses) {
					processClass(otherOwlClass, ontology, processedItems);
				}
				
				// recurse for object properties
				Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
				for(OWLObjectProperty otherOwlProperty : owlProperties) {
					processObjectProperty(otherOwlProperty, ontology, processedItems);
				}
				
				// recurse for datatype properties
				Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
				for(OWLDataProperty dataProperty : dataProperties) {
					processDataProperty(dataProperty, ontology, processedItems);
				}
				
				// recurse for individuals
				Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
				owlIndividuals.removeAll(processedItems);
				for(OWLIndividual owlIndividual : owlIndividuals) {
					processIndividual(owlIndividual, ontology, processedItems);
				}
			}
		}
		catch(OWLOntologyChangeException e) {
			// TODO error handling
			return;
		}
	}
	
	protected void processIndividual(OWLIndividual owlIndividual, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlIndividual))
			return;
		try {
			processedItems.add(owlIndividual);
			Set<OWLIndividualAxiom> definition = ontology.getAxioms(owlIndividual);
			for(OWLIndividualAxiom axiom : definition) {
				AddAxiom add = new AddAxiom(localOntology, axiom);
				ontologyManager.applyChange(add);
				
				// recurse for classes
				Set <OWLClass> owlClasses = axiom.getClassesInSignature();
				owlClasses.removeAll(processedItems);
				for(OWLClass otherOwlClass : owlClasses) {
					processClass(otherOwlClass, ontology, processedItems);
				}
				
				// recurse for object properties
				Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
				for(OWLObjectProperty owlProperty : owlProperties) {
					processObjectProperty(owlProperty, ontology, processedItems);
				}
				
				// recurse for datatype properties
				Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
				for(OWLDataProperty dataProperty : dataProperties) {
					processDataProperty(dataProperty, ontology, processedItems);
				}
				
				// recurse for individuals
				Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
				owlIndividuals.removeAll(processedItems);
				for(OWLIndividual otherOwlIndividual : owlIndividuals) {
					processIndividual(otherOwlIndividual, ontology, processedItems);
				}
			}
		}
		catch(OWLOntologyChangeException e) {
			// TODO error handling
			return;
		}
	}
		
	protected final URI removeFragment(URI uri) {
		String uriString = uri.toString();
		uriString = uriString.substring(0, uriString.indexOf('#'));
		return URI.create(uriString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PelletPackage.PELLET_REASONER__NAME:
				return getName();
			case PelletPackage.PELLET_REASONER__PREPROCESSING:
				return isPreprocessing();
			case PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY_URI:
				return getLOCAL_ONTOLOGY_URI();
			case PelletPackage.PELLET_REASONER__ONTOLOGY_MANAGER:
				return getOntologyManager();
			case PelletPackage.PELLET_REASONER__OWL_FACTORY:
				return getOwlFactory();
			case PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY:
				return getLocalOntology();
			case PelletPackage.PELLET_REASONER__CLASSIFIER:
				return getClassifier();
			case PelletPackage.PELLET_REASONER__PROCESSED_CONCEPTS:
				return getProcessedConcepts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PelletPackage.PELLET_REASONER__NAME:
				setName((String)newValue);
				return;
			case PelletPackage.PELLET_REASONER__PREPROCESSING:
				setPreprocessing((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PelletPackage.PELLET_REASONER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PelletPackage.PELLET_REASONER__PREPROCESSING:
				setPreprocessing(PREPROCESSING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PelletPackage.PELLET_REASONER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PelletPackage.PELLET_REASONER__PREPROCESSING:
				return preprocessing != PREPROCESSING_EDEFAULT;
			case PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY_URI:
				return LOCAL_ONTOLOGY_URI_EDEFAULT == null ? locaL_ONTOLOGY_URI != null : !LOCAL_ONTOLOGY_URI_EDEFAULT.equals(locaL_ONTOLOGY_URI);
			case PelletPackage.PELLET_REASONER__ONTOLOGY_MANAGER:
				return ONTOLOGY_MANAGER_EDEFAULT == null ? ontologyManager != null : !ONTOLOGY_MANAGER_EDEFAULT.equals(ontologyManager);
			case PelletPackage.PELLET_REASONER__OWL_FACTORY:
				return OWL_FACTORY_EDEFAULT == null ? owlFactory != null : !OWL_FACTORY_EDEFAULT.equals(owlFactory);
			case PelletPackage.PELLET_REASONER__LOCAL_ONTOLOGY:
				return LOCAL_ONTOLOGY_EDEFAULT == null ? localOntology != null : !LOCAL_ONTOLOGY_EDEFAULT.equals(localOntology);
			case PelletPackage.PELLET_REASONER__CLASSIFIER:
				return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
			case PelletPackage.PELLET_REASONER__PROCESSED_CONCEPTS:
				return processedConcepts != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", preprocessing: ");
		result.append(preprocessing);
		result.append(", LOCAL_ONTOLOGY_URI: ");
		result.append(locaL_ONTOLOGY_URI);
		result.append(", ontologyManager: ");
		result.append(ontologyManager);
		result.append(", owlFactory: ");
		result.append(owlFactory);
		result.append(", localOntology: ");
		result.append(localOntology);
		result.append(", classifier: ");
		result.append(classifier);
		result.append(", processedConcepts: ");
		result.append(processedConcepts);
		result.append(')');
		return result.toString();
	}

} //PelletReasonerImpl
