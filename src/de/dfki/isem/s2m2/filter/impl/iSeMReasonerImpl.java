/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.impl;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.semanticweb.owl.inference.OWLReasonerAdapter;
import org.semanticweb.owl.inference.OWLReasonerException;
import org.semanticweb.owl.model.OWLAxiom;
import org.semanticweb.owl.model.OWLClass;
import org.semanticweb.owl.model.OWLDescription;
import org.semanticweb.owl.model.OWLException;
import org.semanticweb.owl.model.OWLOntology;
import org.semanticweb.owl.model.OWLOntologyChange;
import org.semanticweb.owl.model.OWLOntologyChangeException;
import org.semanticweb.owl.model.OWLOntologyChangeListener;
import org.semanticweb.owl.model.RemoveAxiom;
import org.semanticweb.owl.util.DLExpressivityChecker;
import org.semanticweb.owl.util.DLExpressivityChecker.Construct;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import uk.ac.manchester.cs.owl.inference.dig11.DIGQueryResponse;
import uk.ac.manchester.cs.owl.inference.dig11.DIGReasoner;
import uk.ac.manchester.cs.owl.inference.dig11.DIGReasonerException;
import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.dl.pellet.impl.PelletReasonerImpl;
import de.dfki.s2m2.service.ConceptIdentifier;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceComponent.ComponentType;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewExtractor;
import de.dfki.s2m2.service.ViewGenerationException;

/**
 * <!-- begin-user-doc -->
 * Special reasoner wrapper exposing basic DL reasoning tasks via Pellet as well as special reasoning tasks concept
 * contraction and reduction via MAMAS-tng. All functionality has been implemented specifically for iSeM.
 * 
 * @author Patrick Kapahnke
 * @version 1.1 05/12/2011
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getLogger <em>Logger</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getTEMP_CLASS_URI <em>TEMP CLASS URI</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getLOCAL_ALN_ONTOLOGY <em>LOCAL ALN ONTOLOGY</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getTEMP_ONTOLOGY <em>TEMP ONTOLOGY</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getServiceRegistry <em>Service Registry</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getViewExtractor <em>View Extractor</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getMamasTng <em>Mamas Tng</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getAlnOntology <em>Aln Ontology</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getProbabilities <em>Probabilities</em>}</li>
 *   <li>{@link de.dfki.isem.s2m2.filter.impl.iSeMReasonerImpl#getProbabilityLowerBound <em>Probability Lower Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class iSeMReasonerImpl extends PelletReasonerImpl implements iSeMReasoner {
	/**
	 * The default value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected static final Logger LOGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogger() <em>Logger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogger()
	 * @generated
	 * @ordered
	 */
	protected Logger logger = LOGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTEMP_CLASS_URI() <em>TEMP CLASS URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTEMP_CLASS_URI()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_CLASS_URI_EDEFAULT = "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntology#TempClass";

	/**
	 * The cached value of the '{@link #getTEMP_CLASS_URI() <em>TEMP CLASS URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTEMP_CLASS_URI()
	 * @generated
	 * @ordered
	 */
	protected String temP_CLASS_URI = TEMP_CLASS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getLOCAL_ALN_ONTOLOGY() <em>LOCAL ALN ONTOLOGY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOCAL_ALN_ONTOLOGY()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ALN_ONTOLOGY_EDEFAULT = "http://www-ags.dfki.uni-sb.de/ISeM/LocalOntologyALN";

	/**
	 * The cached value of the '{@link #getLOCAL_ALN_ONTOLOGY() <em>LOCAL ALN ONTOLOGY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOCAL_ALN_ONTOLOGY()
	 * @generated
	 * @ordered
	 */
	protected String locaL_ALN_ONTOLOGY = LOCAL_ALN_ONTOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTEMP_ONTOLOGY() <em>TEMP ONTOLOGY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTEMP_ONTOLOGY()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMP_ONTOLOGY_EDEFAULT = "http://www-ags.dfki.uni-sb.de/ISeM/TempOntology";

	/**
	 * The cached value of the '{@link #getTEMP_ONTOLOGY() <em>TEMP ONTOLOGY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTEMP_ONTOLOGY()
	 * @generated
	 * @ordered
	 */
	protected String temP_ONTOLOGY = TEMP_ONTOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceRegistry() <em>Service Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRegistry()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceRegistry SERVICE_REGISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceRegistry() <em>Service Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceRegistry()
	 * @generated
	 * @ordered
	 */
	protected ServiceRegistry serviceRegistry = SERVICE_REGISTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewExtractor() <em>View Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewExtractor()
	 * @generated
	 * @ordered
	 */
	protected static final ViewExtractor VIEW_EXTRACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewExtractor() <em>View Extractor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewExtractor()
	 * @generated
	 * @ordered
	 */
	protected ViewExtractor viewExtractor = VIEW_EXTRACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMamasTng() <em>Mamas Tng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMamasTng()
	 * @generated
	 * @ordered
	 */
	protected static final DIGReasoner MAMAS_TNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMamasTng() <em>Mamas Tng</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMamasTng()
	 * @generated
	 * @ordered
	 */
	protected DIGReasoner mamasTng = MAMAS_TNG_EDEFAULT;

	/**
	 * This is true if the Mamas Tng attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mamasTngESet;

	/**
	 * The default value of the '{@link #getAlnOntology() <em>Aln Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlnOntology()
	 * @generated
	 * @ordered
	 */
	protected static final OWLOntology ALN_ONTOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlnOntology() <em>Aln Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlnOntology()
	 * @generated
	 * @ordered
	 */
	protected OWLOntology alnOntology = ALN_ONTOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProbabilities() <em>Probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilities()
	 * @generated
	 * @ordered
	 */
	protected Map<URI, Double> probabilities;

	/**
	 * The default value of the '{@link #getProbabilityLowerBound() <em>Probability Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Double PROBABILITY_LOWER_BOUND_EDEFAULT = new Double(9999999.0);

	/**
	 * The cached value of the '{@link #getProbabilityLowerBound() <em>Probability Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabilityLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Double probabilityLowerBound = PROBABILITY_LOWER_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected iSeMReasonerImpl() {
		super();
		
		logger = Logger.getLogger(this.getClass());
		
		probabilities = new HashMap<URI, Double>();
				
		try {
			mamasTng = new DIGReasoner(this.ontologyManager);
			mamasTng.getReasoner().setReasonerURL(URI.create("http://dee227.poliba.it:8080/MAMAS-tng/DIG").toURL());
			logger.info("DIG reasoner info: " + mamasTng.getReasoner().getIdentity().getSupportedAskElements());
			alnOntology = this.ontologyManager.createOntology(URI.create(this.locaL_ALN_ONTOLOGY));
								
			// ontology change listener to add axioms to ALN ontology if appropriate
			this.ontologyManager.addOntologyChangeListener(new OWLOntologyChangeListener() {
				
				@Override
				public void ontologiesChanged(List<? extends OWLOntologyChange> changes)
						throws OWLException {
					
					// check if original matchmaker ontology (of Pellet) is subject to change
					if(changes.isEmpty() || !changes.get(0).getOntology().getURI().equals(locaL_ONTOLOGY_URI))
							return;
					
					// create temp ontology and check expressivity ALN
					OWLOntology tempOntology = ontologyManager.createOntology(URI.create(temP_ONTOLOGY));
					for(OWLOntologyChange change : changes) {
						ontologyManager.addAxiom(tempOntology, change.getAxiom());
					}
					
					DLExpressivityChecker dlChecker = new DLExpressivityChecker(Collections.singleton(tempOntology));
					for(Construct construct : dlChecker.getConstructs()) {
						// break if other constructs than ALN are used
						if(!construct.equals(Construct.AL) && !construct.equals(Construct.N)) {
							ontologyManager.removeOntology(URI.create(temP_ONTOLOGY));
							return;
						}
					}
					ontologyManager.removeOntology(URI.create(temP_ONTOLOGY));
					
					// add ALN descriptions to local ALN ontology
					for(OWLOntologyChange change : changes) {
						ontologyManager.addAxiom(alnOntology, change.getAxiom());
					}
					
					mamasTng.loadOntologies(Collections.singleton(alnOntology));			
					mamasTng.classify();
				}
			});
		}
		catch(OWLException e) {
			logger.error("Unable to create local ALN ontology.", e);
		}
		catch(MalformedURLException e) {
			logger.error("Invalid DIG HTTP address. Could not initialize reasoner.", e);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.ISE_MREASONER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logger getLogger() {
		return logger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTEMP_CLASS_URI() {
		return temP_CLASS_URI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLOCAL_ALN_ONTOLOGY() {
		return locaL_ALN_ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTEMP_ONTOLOGY() {
		return temP_ONTOLOGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceRegistry(ServiceRegistry newServiceRegistry) {
		ServiceRegistry oldServiceRegistry = serviceRegistry;
		serviceRegistry = newServiceRegistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.ISE_MREASONER__SERVICE_REGISTRY, oldServiceRegistry, serviceRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewExtractor getViewExtractor() {
		return viewExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewExtractor(ViewExtractor newViewExtractor) {
		ViewExtractor oldViewExtractor = viewExtractor;
		viewExtractor = newViewExtractor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR, oldViewExtractor, viewExtractor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIGReasoner getMamasTng() {
		return mamasTng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMamasTng() {
		return mamasTngESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OWLOntology getAlnOntology() {
		return alnOntology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<URI, Double> getProbabilities() {
		return probabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProbabilityLowerBound() {
		return probabilityLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabilityLowerBound(Double newProbabilityLowerBound) {
		Double oldProbabilityLowerBound = probabilityLowerBound;
		probabilityLowerBound = newProbabilityLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND, oldProbabilityLowerBound, probabilityLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Calls MAMAS-tng to compute the contraction of a concept C wrt. to D. Returns the "keep" part of
	 * the resulting tuple <G,K>, which is the maximum part to keep to make K and D compatible.
	 * 
	 * @param C Concept to contract.
	 * @param D Concept to which the contraction is performed.
	 * @return "Keep" part of the contraction result tuple <G,K>.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OWLDescription contract(URI C, URI D) throws InferenceException {		
		if(!alnOntology.containsClassReference(C) || !alnOntology.containsClassReference(D))
			return this.owlFactory.getOWLClass(C);
		
		try {
			Document request = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
						
			Element asks = request.createElement("asks");
			asks.setAttribute("xmlns", "http://dl.kr.org/dig/2003/02/lang");
			asks.setAttribute("uri", mamasTng.getKbURI());
			request.appendChild(asks);
			
			Element contract = request.createElement("contract");
			contract.setAttribute("id", "q1");
			asks.appendChild(contract);
			
			Element CElem = request.createElement("catom");
			CElem.setAttribute("name", C.toString());
			contract.appendChild(CElem);
			
			Element DElem = request.createElement("catom");
			DElem.setAttribute("name", D.toString());
			contract.appendChild(DElem);
						
			Document response = mamasTng.getReasoner().performRequest(request);
						
			Iterator<DIGQueryResponse> responseIter = mamasTng.getTranslator().getDIGQueryResponseIterator(this.owlFactory, response);
			
			return OWLReasonerAdapter.flattenSetOfSets(responseIter.next().getConceptSets()).iterator().next();
		}
		catch(ParserConfigurationException e) {
			logger.error("Unable to perform concept contraction for concepts " + C.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept contraction for concepts " + C.toString() + " and " + D.toString() + ".", e);
		}
		catch(DIGReasonerException e) {
			logger.error("Unable to perform concept contraction for concepts " + C.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept contraction for concepts " + C.toString() + " and " + D.toString() + ".", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Calls MAMAS-tng abduction functionality. The result is a fictive constructed concept Cprime, which
	 * extends the original concept C to be subsumed by D.
	 * 
	 * @param C Original concept for the construction via abduction.
	 * @param D Target concept to subsume the resulting concept Cprime.
	 * @return CPrime, the constructed concept.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OWLDescription abduce(URI C, URI D) throws InferenceException {
		if(!alnOntology.containsClassReference(C) || !alnOntology.containsClassReference(D))
			return this.owlFactory.getOWLClass(D);
		
		try {
			Document request = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			Element asks = request.createElement("asks");
			asks.setAttribute("xmlns", "http://dl.kr.org/dig/2003/02/lang");
			asks.setAttribute("uri", mamasTng.getKbURI());
			request.appendChild(asks);
			
			Element abduce = request.createElement("abduce");
			abduce.setAttribute("id", "q2");
			asks.appendChild(abduce);
			
			Element KElem = request.createElement("catom");
			KElem.setAttribute("name", C.toString());
			abduce.appendChild(KElem);
			
			Element DElem = request.createElement("catom");
			DElem.setAttribute("name", D.toString());
			abduce.appendChild(DElem);
						
			Document response = mamasTng.getReasoner().performRequest(request);
			
			Iterator<DIGQueryResponse> responseIter = mamasTng.getTranslator().getDIGQueryResponseIterator(this.owlFactory, response);
			
			OWLDescription H = OWLReasonerAdapter.flattenSetOfSets(responseIter.next().getConceptSets()).iterator().next();
			
			return owlFactory.getOWLObjectIntersectionOf(this.owlFactory.getOWLClass(D), H);
		}
		catch(ParserConfigurationException e) {
			logger.error("Unable to perform concept abduction for concepts " + C.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept abduction for concepts " + C.toString() + " and " + D.toString() + ".", e);
		}
		catch(DIGReasonerException e) {
			logger.error("Unable to perform concept abduction for concepts " + C.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept abduction for concepts " + C.toString() + " and " + D.toString() + ".", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Calls MAMAS-tng abduction functionality. The result is a fictive constructed concept Cprime, which
	 * extends the original concept K (usually obtained by concept contraction) to be subsumed by D.
	 * 
	 * @param K Original concept for the construction via abduction. It is an <code>OWLDescription</code> usually obtained from <code>contract()</code>.
	 * @param D Target concept to subsume the resulting concept Cprime.
	 * @return CPrime, the constructed concept.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OWLDescription abduce(OWLDescription K, URI D) throws InferenceException {
		if(!alnOntology.containsClassReference(D))
			return this.owlFactory.getOWLClass(D);
		try {
			Document request = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			Element asks = request.createElement("asks");
			asks.setAttribute("xmlns", "http://dl.kr.org/dig/2003/02/lang");
			asks.setAttribute("uri", mamasTng.getKbURI());
			request.appendChild(asks);
			
			Element abduce = request.createElement("abduce");
			abduce.setAttribute("id", "q2");
			asks.appendChild(abduce);
			
			mamasTng.getTranslator().translateToDIG(K, request, abduce);
			
			Element DElem = request.createElement("catom");
			DElem.setAttribute("name", D.toString());
			abduce.appendChild(DElem);
			
			Document response = mamasTng.getReasoner().performRequest(request);
						
			Iterator<DIGQueryResponse> responseIter = mamasTng.getTranslator().getDIGQueryResponseIterator(this.owlFactory, response);
			
			OWLDescription H = OWLReasonerAdapter.flattenSetOfSets(responseIter.next().getConceptSets()).iterator().next();
			return owlFactory.getOWLObjectIntersectionOf(this.owlFactory.getOWLClass(D), H);
		}
		catch(ParserConfigurationException e) {
			logger.error("Unable to perform concept abduction for concepts " + K.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept abduction for concepts " + K.toString() + " and " + D.toString() + ".", e);
		}
		catch(DIGReasonerException e) {
			logger.error("Unable to perform concept abduction for concepts " + K.toString() + " and " + D.toString() + ".", e);
			throw new InferenceException("Unable to perform concept abduction for concepts " + K.toString() + " and " + D.toString() + ".", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the probability P(C) of concept C.
	 * 
	 * @param C Concept C represented as URI.
	 * @return P(C)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double probability(URI C) throws InferenceException {
		if(serviceRegistry == null) {
			logger.error("Service registry is not set.");
			throw new InferenceException("Service registry is not set.");			
		}
		if(viewExtractor == null) {
			logger.error("View extractor is not set.");
			throw new InferenceException("View extractor is not set.");		
		}
		
		// TODO Do this during registration of services (registration event handlers!)
		
		// TODO HACK
		if(probabilities.containsKey(C))
			return probabilities.get(C);
		
		// collect "multiset" of service parameter concept definitions
		HashMap<URI, Integer> parameterUsage = new HashMap<URI, Integer>();
		int parameterCount = 0;
		for(URI serviceUri : serviceRegistry.getRegisteredServices()) {
			try {
				ServiceView serviceView = serviceRegistry.getViewOnService(serviceUri, viewExtractor);
				Collection<ServiceComponent> inputs		= serviceView.getComponents(ComponentType.INPUT);
				Collection<ServiceComponent> outputs	= serviceView.getComponents(ComponentType.OUTPUT);
				for(ServiceComponent input : inputs) {
					URI inputConceptUri = input.castTo(ConceptIdentifier.class).toURI();
					if(parameterUsage.containsKey(inputConceptUri)) {
						Integer usage = parameterUsage.get(inputConceptUri);
						parameterUsage.put(inputConceptUri, ++usage);
					}
					else {
						parameterUsage.put(inputConceptUri, 1);
					}
					parameterCount++;
				}
				for(ServiceComponent output : outputs) {
					URI outputConceptUri = output.castTo(ConceptIdentifier.class).toURI();
					if(parameterUsage.containsKey(outputConceptUri)) {
						Integer usage = parameterUsage.get(outputConceptUri);
						parameterUsage.put(outputConceptUri, ++usage);
					}
					else {
						parameterUsage.put(outputConceptUri, 1);
					}
					parameterCount++;
				}
			}
			catch(ViewGenerationException e) {
				// ignore this service
				logger.warn("Unable to extract signature for " + serviceUri.toString() + ". Will be ignored for probability estimation.", e);
			}
		}
		
		// division by 0!
		if(parameterCount == 0)
			return 0.0;
		
		// compute the number of "occurences"
		int sum = 0;
		for(URI D : parameterUsage.keySet()) {
			try {
				if(subsumes(C, D))
					sum += parameterUsage.get(D);
			}
			catch(InferenceException e) {
				// ignore this concept
				logger.warn("Error in probability estimation for concept " + C.toString() + ". Concept " + D.toString() + " could not be incorporated.");
			}
			catch(NotSupportedException e) {
				// ignore this concept
				logger.warn("Error in probability estimation for concept " + C.toString() + ". Concept " + D.toString() + " could not be incorporated.");
			}
		}
		
		double prob = (double) sum/(double) parameterCount;
		probabilities.put(C, prob);
		
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Computes the probability P(C) of concept C. Also applicable for anonymous concept definitions. This
	 * variant required temporary classification of the concept in question and may take longer than the
	 * variant for named concepts.
	 * 
	 * @param C Concept C represented as <code>OWLDescription</code>.
	 * @return P(C)
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double probability(OWLDescription C) throws InferenceException {
		if(!C.isAnonymous())
			return probability(C.asOWLClass().getURI());
		
		URI conceptUri = URI.create(temP_CLASS_URI);
		OWLAxiom tempAxiom = owlFactory.getOWLEquivalentClassesAxiom(owlFactory.getOWLClass(conceptUri), C);
		try {
			ontologyManager.addAxiom(localOntology, tempAxiom);
		}
		catch(OWLOntologyChangeException e) {
			logger.error("Unable to compute probability for concept " + C.toString() + ". Will be set to 0.", e);
			return 0.0;
		}
		
		double probability = probability(conceptUri);
		
		try {
			ontologyManager.applyChange(new RemoveAxiom(localOntology, tempAxiom));
		}
		catch(OWLOntologyChangeException e) {
			logger.warn("Unable to remove temporary concept " + C.toString() + " from local ALN matchmaker ontology. May cause wrong results for further probability computations.", e);
		}
		
		return probability;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void resetProbabilities() {
		probabilities.clear();
	}

	/**
	 * <!-- begin-user-doc -->
     * Computes the set of direct common subsumers (dcs) of two concepts. The second parameter may
     * be an anonymous concept definition. If this is the case, computation may be slower than the
     * variant for two named concepts because of additional classification computations. This
     * version of <code>getDirectCommonSubsumers()</code> is especially useful in context of
     * concept contraction and abduction, which may return anonymous concept definitions.
     * 
     * @param conceptUri1 Concept 1 for dcs computation.
     * @param conceptUri2 Concept 2 for dcs computation.
     * @return Set of direct common subsumers of concept 1 and 2.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Set<URI> directCommonSubsumers(URI concept1, OWLDescription concept2) throws InferenceException {
		// TODO Is this correct? May improve performance (no incremental classification!)
		if(!concept2.isAnonymous())
			return directCommonSubsumers(concept1, concept2.asOWLClass().getURI());
		
		URI conceptUri2 = URI.create(temP_CLASS_URI);
		OWLAxiom tempAxiom = owlFactory.getOWLEquivalentClassesAxiom(owlFactory.getOWLClass(conceptUri2), concept2);
		try {
			ontologyManager.addAxiom(localOntology, tempAxiom);
		}
		catch(OWLOntologyChangeException e) {
			logger.error("Unable to compute direct common subsumers for " + concept1.toString() + " and " + concept2.toString() + ". Returned owl#Thing instead.", e);
			return Collections.singleton(owlFactory.getOWLThing().getURI());
		}
		
		Set<URI> dcs = directCommonSubsumers(concept1, conceptUri2);
		
		try {
			ontologyManager.applyChange(new RemoveAxiom(localOntology, tempAxiom));
		}
		catch(OWLOntologyChangeException e) {
			logger.warn("Unable to remove temporary concept " + concept2.toString() + " from local ALN matchmaker ontology. May cause wrong results for further probability computations.", e);

		}
				
		return dcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Set<URI> directCommonSubsumers(URI concept1, URI concept2) throws InferenceException {
		
		Set<OWLClass> commonAncestors = new HashSet<OWLClass>();
		Set<OWLClass> otherAncestors = new HashSet<OWLClass>();
		Set<OWLClass> tempAncestors;
		
		try {
			commonAncestors = OWLReasonerAdapter.flattenSetOfSets(classifier.getAncestorClasses(owlFactory.getOWLClass(concept1)));
			otherAncestors = OWLReasonerAdapter.flattenSetOfSets(classifier.getAncestorClasses(owlFactory.getOWLClass(concept2)));
			tempAncestors = new HashSet<OWLClass>();
			for(OWLClass ancestor : commonAncestors) {
				if(otherAncestors.contains(ancestor))
					tempAncestors.add(ancestor);
			}
			commonAncestors = tempAncestors;
	
		}
		catch(OWLReasonerException e) {
			// TODO Error handling.
			throw new InferenceException("Unable to compute direct common subsumers.", e);
		}  		
		
    	int max = 0;
    	Set<URI> dcs = new HashSet<URI>();
    	dcs.add(owlFactory.getOWLThing().getURI());
    	for(OWLClass ancestor : commonAncestors) {
    		try {
	    		int depth = getDepth(ancestor);
	    		if(depth > max) {
	    			max = depth;
	    			dcs.clear();
	    			dcs.add(ancestor.getURI());
	    			continue;
	    		}
	    		if(depth == max) {
	    			dcs.add(ancestor.getURI());
	    		}
    		}
    		catch(OWLReasonerException e) {
    			// skip this ancestor...
    			// TODO Error handling.
    		}
    	}
    	
    	return dcs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer depth(URI concept) throws InferenceException {
		try {
			return getDepth(owlFactory.getOWLClass(concept));
		} catch (OWLReasonerException e) {
			throw new InferenceException(e);
		}
	}
	
	/**
	 * Computes the depth of an OWL class in the inferred taxonomy of the local matchmaker ontology.
	 * 
	 * @param owlClass OWL class to compute the depth for.
	 * @return Depth of the class in the inferred taxonomy beginning with 0 for owl#Thing.
	 * @throws OWLReasonerException If an error occurred during depth computation.
	 */
    protected int depth(OWLClass owlClass) throws OWLReasonerException {
    	if(owlClass.equals(owlFactory.getOWLThing()))
    		return 0;
    	
    	Set<OWLClass> parents		= OWLReasonerAdapter.flattenSetOfSets(classifier.getSuperClasses(owlClass));

    	if(parents.isEmpty())
    		return 0;
    	
    	int min = Integer.MAX_VALUE;
    	for(OWLClass parent : parents) {
    		int depth = 0;
    		if(!parent.equals(owlFactory.getOWLThing())) {
    			depth = getDepth(parent);
    		}
    		min = Math.min(min, depth);
    	}
    	return min + 1;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Integer distanceToAncestor(URI concept, URI ancestor) throws InferenceException {
		try {
			return distanceToAncestor(owlFactory.getOWLClass(concept), owlFactory.getOWLClass(ancestor));
		} catch (OWLReasonerException e) {
			throw new InferenceException(e);
		}
	}
	
    /**
     * Computes the distance of a concept to an anchestor using BFS.
     * 
     * @param concept Concept definition of the descendant concept
     * @param ancestor Concept definition of the ancestor concept
     * @return Distance of concepts.
     * @throws OWLReasonerException If an error occurred during distance computation.
     */
    protected int distanceToAncestor(OWLClass concept, OWLClass ancestor) throws OWLReasonerException {    	
    	if(concept.equals(ancestor))
    		return 0;
    	if(classifier.getEquivalentClasses(concept).contains(ancestor))
    		return 0;
    	    	
    	LinkedList<OWLClass>	list = new LinkedList<OWLClass>(OWLReasonerAdapter.flattenSetOfSets(classifier.getSuperClasses(concept)));
    	LinkedList<Integer>		distances = new LinkedList<Integer>();
    	for(int i = 0; i < list.size(); i++)
    		distances.add(1);
    	
    	while(!list.isEmpty()) {
    		OWLClass current = list.pollFirst();
    		int distance = distances.pollFirst();
    		
    		if(current.equals(ancestor))
    			return distance;
    		list.addAll(OWLReasonerAdapter.flattenSetOfSets(classifier.getSuperClasses(current)));
    		for(int i = distances.size(); i < list.size(); i++)
    			distances.add(distance + 1);
    	}
    	
    	return Integer.MAX_VALUE;
    }

	/**
	 * Computed the depth of an OWL class in the inferred taxonomy of the local matchmaker ontology.
	 * 
	 * @param owlClass OWL class to compute the depth for.
	 * @return Depth of the class in the inferred taxonomy beginning with 0 for owl#Thing.
	 * @throws OWLReasonerException If an error occurred during depth computation.
	 */
    protected int getDepth(OWLClass owlClass) throws OWLReasonerException {
    	if(owlClass.equals(owlFactory.getOWLThing()))
    		return 0;
    	
    	Set<OWLClass> parents		= OWLReasonerAdapter.flattenSetOfSets(classifier.getSuperClasses(owlClass));

    	if(parents.isEmpty())
    		return 0;
    	
    	int min = Integer.MAX_VALUE;
    	for(OWLClass parent : parents) {
    		int depth = 0;
    		if(!parent.equals(owlFactory.getOWLThing())) {
    			depth = getDepth(parent);
    		}
    		min = Math.min(min, depth);
    	}
    	return min + 1;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilterPackage.ISE_MREASONER__LOGGER:
				return getLogger();
			case FilterPackage.ISE_MREASONER__TEMP_CLASS_URI:
				return getTEMP_CLASS_URI();
			case FilterPackage.ISE_MREASONER__LOCAL_ALN_ONTOLOGY:
				return getLOCAL_ALN_ONTOLOGY();
			case FilterPackage.ISE_MREASONER__TEMP_ONTOLOGY:
				return getTEMP_ONTOLOGY();
			case FilterPackage.ISE_MREASONER__SERVICE_REGISTRY:
				return getServiceRegistry();
			case FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR:
				return getViewExtractor();
			case FilterPackage.ISE_MREASONER__MAMAS_TNG:
				return getMamasTng();
			case FilterPackage.ISE_MREASONER__ALN_ONTOLOGY:
				return getAlnOntology();
			case FilterPackage.ISE_MREASONER__PROBABILITIES:
				return getProbabilities();
			case FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND:
				return getProbabilityLowerBound();
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
			case FilterPackage.ISE_MREASONER__SERVICE_REGISTRY:
				setServiceRegistry((ServiceRegistry)newValue);
				return;
			case FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR:
				setViewExtractor((ViewExtractor)newValue);
				return;
			case FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND:
				setProbabilityLowerBound((Double)newValue);
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
			case FilterPackage.ISE_MREASONER__SERVICE_REGISTRY:
				setServiceRegistry(SERVICE_REGISTRY_EDEFAULT);
				return;
			case FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR:
				setViewExtractor(VIEW_EXTRACTOR_EDEFAULT);
				return;
			case FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND:
				setProbabilityLowerBound(PROBABILITY_LOWER_BOUND_EDEFAULT);
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
			case FilterPackage.ISE_MREASONER__LOGGER:
				return LOGGER_EDEFAULT == null ? logger != null : !LOGGER_EDEFAULT.equals(logger);
			case FilterPackage.ISE_MREASONER__TEMP_CLASS_URI:
				return TEMP_CLASS_URI_EDEFAULT == null ? temP_CLASS_URI != null : !TEMP_CLASS_URI_EDEFAULT.equals(temP_CLASS_URI);
			case FilterPackage.ISE_MREASONER__LOCAL_ALN_ONTOLOGY:
				return LOCAL_ALN_ONTOLOGY_EDEFAULT == null ? locaL_ALN_ONTOLOGY != null : !LOCAL_ALN_ONTOLOGY_EDEFAULT.equals(locaL_ALN_ONTOLOGY);
			case FilterPackage.ISE_MREASONER__TEMP_ONTOLOGY:
				return TEMP_ONTOLOGY_EDEFAULT == null ? temP_ONTOLOGY != null : !TEMP_ONTOLOGY_EDEFAULT.equals(temP_ONTOLOGY);
			case FilterPackage.ISE_MREASONER__SERVICE_REGISTRY:
				return SERVICE_REGISTRY_EDEFAULT == null ? serviceRegistry != null : !SERVICE_REGISTRY_EDEFAULT.equals(serviceRegistry);
			case FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR:
				return VIEW_EXTRACTOR_EDEFAULT == null ? viewExtractor != null : !VIEW_EXTRACTOR_EDEFAULT.equals(viewExtractor);
			case FilterPackage.ISE_MREASONER__MAMAS_TNG:
				return isSetMamasTng();
			case FilterPackage.ISE_MREASONER__ALN_ONTOLOGY:
				return ALN_ONTOLOGY_EDEFAULT == null ? alnOntology != null : !ALN_ONTOLOGY_EDEFAULT.equals(alnOntology);
			case FilterPackage.ISE_MREASONER__PROBABILITIES:
				return probabilities != null;
			case FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND:
				return PROBABILITY_LOWER_BOUND_EDEFAULT == null ? probabilityLowerBound != null : !PROBABILITY_LOWER_BOUND_EDEFAULT.equals(probabilityLowerBound);
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
		result.append(" (logger: ");
		result.append(logger);
		result.append(", TEMP_CLASS_URI: ");
		result.append(temP_CLASS_URI);
		result.append(", LOCAL_ALN_ONTOLOGY: ");
		result.append(locaL_ALN_ONTOLOGY);
		result.append(", TEMP_ONTOLOGY: ");
		result.append(temP_ONTOLOGY);
		result.append(", serviceRegistry: ");
		result.append(serviceRegistry);
		result.append(", viewExtractor: ");
		result.append(viewExtractor);
		result.append(", mamasTng: ");
		if (mamasTngESet) result.append(mamasTng); else result.append("<unset>");
		result.append(", alnOntology: ");
		result.append(alnOntology);
		result.append(", probabilities: ");
		result.append(probabilities);
		result.append(", probabilityLowerBound: ");
		result.append(probabilityLowerBound);
		result.append(')');
		return result.toString();
	}

} //iSeMReasonerImpl
