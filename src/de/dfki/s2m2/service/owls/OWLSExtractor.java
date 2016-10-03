package de.dfki.s2m2.service.owls;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.mindswap.owl.OWLDataValue;
import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLIndividual;
import org.mindswap.owl.OWLIndividualList;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.process.Input;
import org.mindswap.owls.process.Output;
import org.mindswap.owls.profile.Profile;
import org.mindswap.owls.service.Service;

import de.dfki.s2m2.service.ConceptIdentifier;
import de.dfki.s2m2.service.PlainTextContent;
import de.dfki.s2m2.service.ServiceComponent.ComponentType;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.Specification;
import de.dfki.s2m2.service.SpecificationParsingException;
import de.dfki.s2m2.service.ViewExtractor;
import de.dfki.s2m2.service.ViewGenerationException;
import de.dfki.s2m2.service.pddl.PDDLExpression;
import de.dfki.s2m2.service.pddl.PDDXMLExpression;

// TODO Javadoc.

// TODO Support for OWL-S 1.2 in parallel (dynamic class loading, different OWL-S API versions)

public class OWLSExtractor implements ViewExtractor {

	protected OWLKnowledgeBase		owlKnowledgeBase;
	
	public OWLSExtractor() {
		owlKnowledgeBase = OWLFactory.createKB();
		// TODO
		owlKnowledgeBase.getReader().getCache().setLocalCacheDirectory("cache");
	}
	
	@Override
	public ServiceView extract(URI serviceUri, URL documentUrl) throws ViewGenerationException {
		// load service using OWL-S API
		try {
			URI documentUri = documentUrl.toURI();
			owlKnowledgeBase.readAllServices(documentUri);
				
			ServiceView resultView = new ServiceView(serviceUri);
			
			// get the service
			Service service = owlKnowledgeBase.getService(serviceUri);
			// get the profile
			// TODO A single profile per service is assumed for now.
			Profile profile = service.getProfile();
			
			// add service parameters to the output service view
			for(Input input : profile.getInputs()) {
				resultView.addComponent(ComponentType.INPUT, new ConceptIdentifier(ComponentType.INPUT, input.getParamType().getURI()));
			}
			for(Output output : profile.getOutputs()) {
				resultView.addComponent(ComponentType.OUTPUT, new ConceptIdentifier(ComponentType.OUTPUT, output.getParamType().getURI()));
			}
			
			// get specification part
			// TODO Currently only PDDL in standard PDDL syntax and PDDXML is considered. Should be extended to SWRL... (OR generic approach!?)
			try {
				OWLIndividualList<?> preconditions = service.getProcess().getProperties(owlKnowledgeBase.createObjectProperty(URI.create("http://www.daml.org/services/owl-s/1.1/Process.owl#hasPrecondition")));
				for(OWLIndividual condition : preconditions) {
					OWLDataValue exprBody = condition.getProperty(owlKnowledgeBase.createDataProperty(URI.create("http://www.daml.org/services/owl-s/1.1/generic/Expression.owl#expressionBody")));
					try {
						resultView.addComponent(ComponentType.PRECONDITION, new Specification<PDDLExpression>(ComponentType.PRECONDITION, PDDLExpression.create(exprBody.getLexicalValue())));
					}
					catch(SpecificationParsingException e) {
						try {
							resultView.addComponent(ComponentType.PRECONDITION, new Specification<PDDLExpression>(ComponentType.PRECONDITION, PDDXMLExpression.create(exprBody.getLexicalValue())));
						}
						catch(SpecificationParsingException e1) {
							// TODO Error handling
							System.err.println("Unsupported precondition expression found: " + exprBody.getLexicalValue());
						}
					}
				}
			}
			catch(NullPointerException e) {
				// TODO Error handling
			}
			try {
				OWLIndividualList<?> effects = service.getProcess().getResult().getProperties(owlKnowledgeBase.createObjectProperty(URI.create("http://www.daml.org/services/owl-s/1.1/Process.owl#hasEffect")));
				for(OWLIndividual expression : effects) {
					OWLDataValue exprBody = expression.getProperty(owlKnowledgeBase.createDataProperty(URI.create("http://www.daml.org/services/owl-s/1.1/generic/Expression.owl#expressionBody")));
					try {
						resultView.addComponent(ComponentType.EFFECT, new Specification<PDDLExpression>(ComponentType.EFFECT, PDDLExpression.create(exprBody.getLexicalValue())));
					}
					catch(SpecificationParsingException e) {
						try {
							resultView.addComponent(ComponentType.EFFECT, new Specification<PDDLExpression>(ComponentType.EFFECT, PDDXMLExpression.create(exprBody.getLexicalValue())));
						}
						catch(SpecificationParsingException e1) {
							// TODO Error handling
							System.err.println("Unsupported effect expression found: " + exprBody.getLexicalValue());
						}
					}
				}
			}
			catch(NullPointerException e) {
				// TODO Error handling
			}
			
			// add informal service description to output
			resultView.addComponent(ComponentType.DESCRIPTION, new PlainTextContent(ComponentType.DESCRIPTION, profile.getTextDescription()));
			
			owlKnowledgeBase.unload(documentUri);
			
			return resultView;
		}
		catch(IOException e) {
			throw new ViewGenerationException("Unable to extract inputs/outputs of service " + serviceUri + " from " + documentUrl + ".", e);
		}
		catch(URISyntaxException e) {
			throw new ViewGenerationException("Unable to extract inputs/outputs of service " + serviceUri + " from " + documentUrl + ".", e);
		}
		catch(Exception e) {
			// TODO Error handling?
			throw new ViewGenerationException("Unable to extract inputs/outputs of service " + serviceUri + " from " + documentUrl + ".", e);
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.err.println("Invalid number of arguments.");
			System.exit(1);
		}
		
		try {
			URI serviceUri	= URI.create(args[0]);
			URL documentUrl	= new URL(args[1]);
			
			OWLSExtractor extractor = new OWLSExtractor();
			ServiceView serviceView = extractor.extract(serviceUri, documentUrl);
			
			System.out.println(serviceView.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
