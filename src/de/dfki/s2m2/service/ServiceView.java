package de.dfki.s2m2.service;

import java.net.URI;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

// TODO

public class ServiceView extends HashMap<String, Collection<ServiceComponent>> implements Comparable<ServiceView> {
	
	private static final long		serialVersionUID = 1l;
	
	protected URI					serviceUri;

	public ServiceView(URI serviceUri) {
		this.serviceUri = serviceUri;
	}

	public void addComponent(String type, ServiceComponent component) {
		if(!containsKey(type)) {
			Collection<ServiceComponent> components = new LinkedList<ServiceComponent>();
			components.add(component);
			put(type, components);
		}
		else {
			get(type).add(component);
		}
	}
	
	/**
	 * This method just calls the original <code>get</code> method of <code>HashMap</code>.
	 * 
	 * @param type Type of returned components.
	 * @return Components for the given type.
	 */
	public Collection<ServiceComponent> getComponents(String type) {
		if(!containsKey(type))
			return new LinkedList<ServiceComponent>();
		return get(type);
	}	
	
	/**
	 * Adds all service information of another view to this view. The other view remains unchanged. No duplicate checking is performed,
	 * this method is intended to merge disjunct views only.
	 * 
	 * @param anotherView Other view to merge with this view.
	 */
	public void mergeWith(ServiceView anotherView) {
		for(Entry<String, Collection<ServiceComponent>> entry : anotherView.entrySet()) {
			for(ServiceComponent component : entry.getValue()) {
				addComponent(entry.getKey(), component);
			}
		}
	}
	
	/**
	 * Returns the service URI for which this view was created.
	 * 
	 * @return URI of the service for which this view was created.
	 */
	public URI getServiceUri() {
		return serviceUri;
	}
	
	@Override
	public String toString() {
		String str = "<" + serviceUri.toString() + ">:";
		for(String key : keySet()) {
			Collection<ServiceComponent> collection = get(key);
			str += "\n" + key + ": [ ";
			for(ServiceComponent component : collection) {
				str += component.toString() + " ";
			}
			str += "]";
		}
		
		return str;
	}
	
	@Override
	public int compareTo(ServiceView anotherView) {
		if(anotherView == null)
			return Integer.MAX_VALUE;
		return serviceUri.compareTo(anotherView.getServiceUri());
	}
}
