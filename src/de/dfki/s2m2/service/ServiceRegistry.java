package de.dfki.s2m2.service;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.mindswap.exceptions.NotImplementedException;


// TODO

public abstract class ServiceRegistry {
	
	public static enum Event { REGISTRATION, DEREGISTRATION }
	
	private Map<String, RegistryEventHandler>	registrationEventHandlers;
	
	private Map<String, RegistryEventHandler>	deregistrationEventHandlers;
	
	public ServiceRegistry() {
		registrationEventHandlers	= new HashMap<String, RegistryEventHandler>();
		deregistrationEventHandlers	= new HashMap<String, RegistryEventHandler>();		
	}
	
	public void addEventHandler(String id, RegistryEventHandler eventHandler, Event type) throws IllegalArgumentException {
		if(registrationEventHandlers.containsKey(id) || deregistrationEventHandlers.containsKey(id)) 
			throw new IllegalArgumentException("Unable to register event handler. Event handler ID already in use.");
	
		switch(type) {
			case REGISTRATION:
				registrationEventHandlers.put(id, eventHandler);
				break;
			case DEREGISTRATION:
				deregistrationEventHandlers.put(id, eventHandler);
				break;			
			default:
				throw new NotImplementedException("Event type not implemented.");
		}		
	}
	
	public boolean removeEventHandler(String id) {
		if(registrationEventHandlers.containsKey(id)) {
			registrationEventHandlers.remove(id);
			return true;
		}
		if(deregistrationEventHandlers.containsKey(id)) {
			deregistrationEventHandlers.remove(id);
			return true;
		}
		return false;
	}

	public abstract Set<URI> getRegisteredServices();
	
	final public Set<URI> registerServices(URL descriptionUrl) throws IOException {
		// add services to registry
		Set<URI> serviceUris = addServices(descriptionUrl);
		
		// apply each event handler for every event/service
		for(RegistryEventHandler eventHandler : registrationEventHandlers.values()) {
			for(URI serviceUri : serviceUris) {
				eventHandler.handle(serviceUri);
			}
		}
		
		return serviceUris;
	}
	
	protected abstract Set<URI> addServices(URL descriptionUrl) throws IOException;
	
	final public void deregisterService(URI serviceUri) {
		// apply each event handler
		for(RegistryEventHandler eventHandler : deregistrationEventHandlers.values()) {
			eventHandler.handle(serviceUri);
		}
		
		// remove service from registry
		removeService(serviceUri);
	}
	
	protected abstract void removeService(URI serviceUri);
	
	public abstract URL getSource(URI serviceUri);
	
	public abstract ServiceView getViewOnService(URI serviceUri, ViewExtractor viewExtractor) throws  ViewGenerationException;
}
