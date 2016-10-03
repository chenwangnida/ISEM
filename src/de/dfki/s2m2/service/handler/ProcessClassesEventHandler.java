package de.dfki.s2m2.service.handler;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import de.dfki.s2m2.filter.inference.dl.DLReasoner;
import de.dfki.s2m2.service.ConceptIdentifier;
import de.dfki.s2m2.service.RegistryEventHandler;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewExtractor;
import de.dfki.s2m2.service.ViewGenerationException;

public class ProcessClassesEventHandler implements RegistryEventHandler {
	
	private Logger				logger = Logger.getLogger(RegistryEventHandler.class);

	protected ServiceRegistry	registry;
	
	protected DLReasoner		reasoner;
	
	protected ViewExtractor		viewExtractor;
	
	protected Set<String>		conceptSources;
	
	public ProcessClassesEventHandler(ServiceRegistry registry, DLReasoner reasoner, ViewExtractor viewExtractor, Set<String> conceptSources) {
		this.registry		= registry;
		this.reasoner		= reasoner;
		this.viewExtractor	= viewExtractor;
		this.conceptSources	= conceptSources;
	}
	
	public ProcessClassesEventHandler(ServiceRegistry registry, DLReasoner reasoner, ViewExtractor viewExtractor, String conceptSource) {
		this.registry		= registry;
		this.reasoner		= reasoner;
		this.viewExtractor	= viewExtractor;
		this.conceptSources	= new HashSet<String>();
		this.conceptSources.add(conceptSource);
	}
	
	@Override
	public void handle(URI serviceUri) {
		try {
			ServiceView serviceView = registry.getViewOnService(serviceUri, viewExtractor);
			
			for(String source : conceptSources) {
				for(ServiceComponent component : serviceView.getComponents(source)) {
					// only consider concept URI's
					if(component.hasCharacteristic(ConceptIdentifier.class)) {
						reasoner.process(component.castTo(ConceptIdentifier.class).toURI());
					}
				}				
			}
		}
		catch(ViewGenerationException e) {
			logger.warn("Unable to handle " + serviceUri.toString(), e);
		}
	}
	
	@Override
	public String toString() {
		String str = this.getClass().getName() + ": ";
		for(String source : conceptSources)
			str += source + " ";
		return str;
	}
}
