package de.dfki.s2m2.service.owls;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.mindswap.owl.OWLFactory;
import org.mindswap.owl.OWLKnowledgeBase;
import org.mindswap.owls.service.Service;

import de.dfki.s2m2.service.CachingServiceRegistry;

public class OWLSRegistry extends CachingServiceRegistry {

	protected OWLKnowledgeBase		owlKnowledgeBase;
	
	public OWLSRegistry() {
		owlKnowledgeBase = OWLFactory.createKB();
		// TODO
		owlKnowledgeBase.getReader().getCache().setLocalCacheDirectory("cache");
	}
	
	@Override
	protected Set<URI> addServices(URL descriptionUrl) throws IOException {
		try {
			URI descriptionUri = descriptionUrl.toURI();
			List<Service> services = owlKnowledgeBase.readAllServices(descriptionUri);
						
			HashSet<URI> result = new HashSet<URI>();
			URI serviceUri;
			for(Service service : services) {
				serviceUri = service.getURI();
				sources.put(serviceUri, descriptionUrl);
				result.add(serviceUri);
			}
			
			owlKnowledgeBase.unload(descriptionUri);
			
			return result;
		}
		catch(URISyntaxException e) {
			throw new IOException("Unable to load services from " + descriptionUrl.toString() + ".", e);
		}
	}

}
