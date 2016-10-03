package de.dfki.s2m2.service;

import java.net.URI;

public interface RegistryEventHandler {

	public void handle(URI serviceUri);
}
