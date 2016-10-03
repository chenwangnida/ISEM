package de.dfki.s2m2.service.handler;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import de.dfki.s2m2.filter.textsim.Index;
import de.dfki.s2m2.filter.textsim.IndexException;
import de.dfki.s2m2.service.PlainTextContent;
import de.dfki.s2m2.service.RegistryEventHandler;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewExtractor;
import de.dfki.s2m2.service.ViewGenerationException;

public class AddToIndexEventHandler implements RegistryEventHandler {
	
	private Logger				logger = Logger.getLogger(AddToIndexEventHandler.class);

	protected ServiceRegistry	registry;
	
	protected Index				index;
	
	protected ViewExtractor		viewExtractor;
	
	protected Set<String>		textSources;
	
	public AddToIndexEventHandler(ServiceRegistry registry, Index index, ViewExtractor viewExtractor, Set<String> textSources) {
		this.registry		= registry;
		this.index			= index;
		this.viewExtractor	= viewExtractor;
		this.textSources	= textSources;
	}
	
	public AddToIndexEventHandler(ServiceRegistry registry, Index index, ViewExtractor viewExtractor, String textSource) {
		this.registry		= registry;
		this.index			= index;
		this.viewExtractor	= viewExtractor;
		this.textSources	= new HashSet<String>();
		this.textSources.add(textSource);
	}
	
	@Override
	public void handle(URI serviceUri) {
		try {
			ServiceView serviceView = registry.getViewOnService(serviceUri, viewExtractor);
			String content = "";
			for(String textSource : textSources) {
				// extract relevant information and store content in index structure
				for(ServiceComponent component : serviceView.getComponents(textSource)) {
					// only consider textual content
					if(component.hasCharacteristic(PlainTextContent.class)) {
						content += " " + component.toString();
					}
				}
			}
			index.addDocument(serviceUri.toString(), content);
		}
		catch(ViewGenerationException e) {
			logger.warn("Unable to handle " + serviceUri.toString(), e);
		} catch (IndexException e) {
			logger.warn("Unable to handle " + serviceUri.toString(), e);
		}
	}
	
	@Override
	public String toString() {
		String str = this.getClass().getName() + ": ";
		for(String source : textSources)
			str += source + " ";
		return str;
	}
}
