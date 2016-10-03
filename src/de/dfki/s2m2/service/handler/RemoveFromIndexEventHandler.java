package de.dfki.s2m2.service.handler;

import java.net.URI;

import de.dfki.s2m2.filter.textsim.Index;
import de.dfki.s2m2.filter.textsim.IndexException;
import de.dfki.s2m2.service.RegistryEventHandler;

public class RemoveFromIndexEventHandler implements RegistryEventHandler {
	
	protected Index		index;
		
	public RemoveFromIndexEventHandler(Index index) {
		this.index	= index;
	}
	
	@Override
	public void handle(URI serviceUri) {
		try {
			index.removeDocument(serviceUri.toString());
		}
		catch(IndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
