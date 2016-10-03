package de.dfki.s2m2.service;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public abstract class CachingServiceRegistry extends ServiceRegistry {

	protected HashMap<URI, URL>				sources = new HashMap<URI, URL>();
	
	protected HashMap<URI, ServiceView>		serviceCache = new HashMap<URI, ServiceView>();
	
	protected ViewExtractor					cachedFrom = null;
	
	@Override
	protected void removeService(URI serviceUri) {
		sources.remove(serviceUri);
		serviceCache.remove(serviceUri);
	}
	
	@Override
	public URL getSource(URI serviceUri) {
		return sources.get(serviceUri);
	}
	
	@Override
	public Set<URI> getRegisteredServices() {
		return sources.keySet();
	}

	@Override
	public ServiceView getViewOnService(URI serviceUri, ViewExtractor viewExtractor) throws ViewGenerationException {
		URL sourceDocument = sources.get(serviceUri);
		
		// check availability of service in registry
		if(sourceDocument == null) {
			throw new ViewGenerationException("Unable to extract view on " + serviceUri.toString() + ". Service not registered.");
		}
		
		// try to read cache
		if(viewExtractor.equals(cachedFrom)) {
			// requested object is contained in cache
			if(serviceCache.containsKey(serviceUri)) {
				return serviceCache.get(serviceUri);
			}
			// requested object is NOT contained in cache yet
			else {
				ServiceView view = viewExtractor.extract(serviceUri, sourceDocument);
				serviceCache.put(serviceUri, view);
				return view;
			}
		}
		// clear and rebuild cache
		else {
			serviceCache.clear();
			cachedFrom = viewExtractor;
			
			ServiceView view = viewExtractor.extract(serviceUri, sourceDocument);
			serviceCache.put(serviceUri, view);
			return view;
		}
	}
	
	public void prepareCache(ViewExtractor viewExtractor) throws ViewGenerationException {
		// reuse previous cache
		if(viewExtractor.equals(cachedFrom)) {
			// loop through each service entry and add extracted view to cache if not yet existent
			ServiceView view;
			URI serviceUri;
			for(Entry<URI, URL> entry : sources.entrySet()) {
				serviceUri = entry.getKey();
				if(!serviceCache.containsKey(serviceUri)) {
					view = viewExtractor.extract(serviceUri, entry.getValue());
					serviceCache.put(serviceUri, view);
				}
			}
		}
		// clear and rebuild cache
		else {
			serviceCache.clear();
			cachedFrom = viewExtractor;
			
			// loop through each service entry and extract view to cache
			ServiceView view;
			URI serviceUri;
			for(Entry<URI, URL> entry : sources.entrySet()) {
				serviceUri = entry.getKey();
				view = viewExtractor.extract(serviceUri, entry.getValue());
				serviceCache.put(serviceUri, view);
			}
		}
	}
}
