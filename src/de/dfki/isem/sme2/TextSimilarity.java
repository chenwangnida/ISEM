package de.dfki.isem.sme2;

import org.eclipse.emf.common.util.URI;

public class TextSimilarity extends GenericISeM {

	@Override
	protected URI getFilterModel() {
		return URI.createFileURI("plugin/isem/filter/isem/text-similarity.filter");
	}

}
