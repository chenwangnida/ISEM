package de.dfki.isem.sme2;

import org.eclipse.emf.common.util.URI;

public class LogicBased extends GenericISeM {

	@Override
	protected URI getFilterModel() {
		return URI.createFileURI("plugin/isem/filter/isem/logic-based.filter");
	}

}
