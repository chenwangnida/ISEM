package de.dfki.isem.sme2;

import org.eclipse.emf.common.util.URI;

public class ApproxLogicBased extends GenericISeM {

	@Override
	protected URI getFilterModel() {
		return URI.createFileURI("plugin/isem/filter/isem/approx-logic-based.filter");
	}

}
