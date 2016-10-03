package de.dfki.s2m2.service.owls;

import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.semanticweb.owl.apibinding.OWLManager;
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
import org.semanticweb.owl.model.OWLOntologyCreationException;
import org.semanticweb.owl.model.OWLOntologyManager;

import de.dfki.s2m2.service.ConceptIdentifier;
import de.dfki.s2m2.service.PlainTextContent;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceComponent.ComponentType;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewGenerationException;

public class OWLSUnfoldedAnnotationsExtractor extends OWLSExtractor {

	public static final String		INPUT_DEFINITION_TYPE = "UnfoldedInput";
	
	public static final String		OUTPUT_DEFINITION_TYPE = "UnfoldedOutput";
	
	protected OWLOntologyManager	ontologyManager;
	
	protected OWLDataFactory		owlFactory;
	
	public OWLSUnfoldedAnnotationsExtractor() {
		super();
		
		ontologyManager	= OWLManager.createOWLOntologyManager();
		
		owlFactory = ontologyManager.getOWLDataFactory();
	}
	
	@Override
	public ServiceView extract(URI serviceUri, URL documentUrl) throws ViewGenerationException {
		// read basic I/O information
		ServiceView view = super.extract(serviceUri, documentUrl);
		
		// additionally parse concept definitions using OWL-API
		for(ServiceComponent component : view.getComponents(ComponentType.INPUT)) {
			String conceptDefinition = processClass(((ConceptIdentifier) component).toURI());
			view.addComponent(INPUT_DEFINITION_TYPE, new PlainTextContent(INPUT_DEFINITION_TYPE, conceptDefinition));
		}
		for(ServiceComponent component : view.getComponents(ComponentType.OUTPUT)) {
			String conceptDefinition = processClass(((ConceptIdentifier) component).toURI());
			view.addComponent(OUTPUT_DEFINITION_TYPE, new PlainTextContent(OUTPUT_DEFINITION_TYPE, conceptDefinition));
		}
		
		return view;
	}
	
	private String processClass(URI classUri) {
		OWLClass owlClass = owlFactory.getOWLClass(classUri);
		return processClass(owlClass);
	}
	
	private String processClass(OWLClass owlClass) {
		try {
			OWLOntology onto = ontologyManager.loadOntologyFromPhysicalURI(removeFragment(owlClass.getURI()));
			return processClass(owlClass, onto, new HashSet<OWLEntity>());
		}
		catch(OWLOntologyCreationException e) {
			// TODO error handling
			return owlClass.toString();
		}
	}
	
	private String processClass(OWLClass owlClass, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlClass))
			return "";
		
		processedItems.add(owlClass);
		Set<OWLClassAxiom> definition = ontology.getAxioms(owlClass);
		String defString = "";
		for(OWLClassAxiom axiom : definition) {
			defString += axiom.toString() + " ";
			// recurse for classes
			Set <OWLClass> owlClasses = axiom.getClassesInSignature();
			owlClasses.removeAll(processedItems);
			for(OWLClass otherOwlClass : owlClasses) {
				defString += processClass(otherOwlClass, ontology, processedItems) + " ";
			}
			
			// recurse for object properties
			Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
			for(OWLObjectProperty owlProperty : owlProperties) {
				defString += processObjectProperty(owlProperty, ontology, processedItems) + " ";
			}
			
			// recurse for datatype properties
			Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
			for(OWLDataProperty dataProperty : dataProperties) {
				defString += processDataProperty(dataProperty, ontology, processedItems) + " ";
			}
			
			// recurse for individuals
			Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
			owlIndividuals.removeAll(processedItems);
			for(OWLIndividual owlIndividual : owlIndividuals) {
				defString += processIndividual(owlIndividual, ontology, processedItems)+ " ";
			}
		}
		return defString;
	}
	
	private String processObjectProperty(OWLObjectProperty owlProperty, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlProperty))
			return "";

		processedItems.add(owlProperty);
		Set<OWLObjectPropertyAxiom> definition = ontology.getAxioms(owlProperty);
		String defString = "";
		for(OWLObjectPropertyAxiom axiom : definition) {		
			defString += axiom.toString() + " ";
			// recurse for classes
			Set <OWLClass> owlClasses = axiom.getClassesInSignature();
			owlClasses.removeAll(processedItems);
			for(OWLClass otherOwlClass : owlClasses) {
				defString += processClass(otherOwlClass, ontology, processedItems)+ " ";
			}
			
			// recurse for object properties
			Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
			for(OWLObjectProperty otherOwlProperty : owlProperties) {
				defString += processObjectProperty(otherOwlProperty, ontology, processedItems) + " ";
			}
			
			// recurse for datatype properties
			Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
			for(OWLDataProperty dataProperty : dataProperties) {
				defString += processDataProperty(dataProperty, ontology, processedItems) + " ";
			}
			
			// recurse for individuals
			Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
			owlIndividuals.removeAll(processedItems);
			for(OWLIndividual owlIndividual : owlIndividuals) {
				defString += processIndividual(owlIndividual, ontology, processedItems) + " ";
			}
		}
		return defString;
	}
	
	private String processDataProperty(OWLDataProperty owlProperty, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlProperty))
			return "";

		processedItems.add(owlProperty);
		Set<OWLDataPropertyAxiom> definition = ontology.getAxioms(owlProperty);
		String defString = "";
		for(OWLDataPropertyAxiom axiom : definition) {			
			defString += axiom.toString() + " ";
			// recurse for classes
			Set <OWLClass> owlClasses = axiom.getClassesInSignature();
			owlClasses.removeAll(processedItems);
			for(OWLClass otherOwlClass : owlClasses) {
				defString += processClass(otherOwlClass, ontology, processedItems) + " ";
			}
			
			// recurse for object properties
			Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
			for(OWLObjectProperty otherOwlProperty : owlProperties) {
				defString += processObjectProperty(otherOwlProperty, ontology, processedItems) + " ";
			}
			
			// recurse for datatype properties
			Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
			for(OWLDataProperty dataProperty : dataProperties) {
				defString += processDataProperty(dataProperty, ontology, processedItems) + " ";
			}
			
			// recurse for individuals
			Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
			owlIndividuals.removeAll(processedItems);
			for(OWLIndividual owlIndividual : owlIndividuals) {
				defString += processIndividual(owlIndividual, ontology, processedItems) + " ";
			}
		}
		return defString;
	}
	
	private String processIndividual(OWLIndividual owlIndividual, OWLOntology ontology, Set<OWLEntity> processedItems) {
		if(processedItems.contains(owlIndividual))
			return "";

		processedItems.add(owlIndividual);
		Set<OWLIndividualAxiom> definition = ontology.getAxioms(owlIndividual);
		String defString = "";
		for(OWLIndividualAxiom axiom : definition) {
			defString += axiom.toString() + " ";
			// recurse for classes
			Set <OWLClass> owlClasses = axiom.getClassesInSignature();
			owlClasses.removeAll(processedItems);
			for(OWLClass otherOwlClass : owlClasses) {
				defString += processClass(otherOwlClass, ontology, processedItems) + " ";
			}
			
			// recurse for object properties
			Set<OWLObjectProperty> owlProperties = axiom.getObjectPropertiesInSignature();
			for(OWLObjectProperty owlProperty : owlProperties) {
				defString += processObjectProperty(owlProperty, ontology, processedItems) + " ";
			}
			
			// recurse for datatype properties
			Set<OWLDataProperty> dataProperties = axiom.getDataPropertiesInSignature();
			for(OWLDataProperty dataProperty : dataProperties) {
				defString += processDataProperty(dataProperty, ontology, processedItems) + " ";
			}
			
			// recurse for individuals
			Set <OWLIndividual> owlIndividuals = axiom.getIndividualsInSignature();
			owlIndividuals.removeAll(processedItems);
			for(OWLIndividual otherOwlIndividual : owlIndividuals) {
				defString += processIndividual(otherOwlIndividual, ontology, processedItems) + " ";
			}
		}
		return defString;
	}
		
	private final URI removeFragment(URI uri) {
		String uriString = uri.toString();
		uriString = uriString.substring(0, uriString.indexOf('#'));
		return URI.create(uriString);
	}
}
