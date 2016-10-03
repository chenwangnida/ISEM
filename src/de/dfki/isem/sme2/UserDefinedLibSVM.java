package de.dfki.isem.sme2;

import org.eclipse.emf.common.util.URI;

public class UserDefinedLibSVM extends GenericLibSVMISeM {

	@Override
	protected String getSVMModelFileName() {
		return "plugin/isem/filter/svm/user-defined.xml";
	}

	@Override
	protected URI getFilterModel() {
		return URI.createFileURI("plugin/isem/filter/isem/user-defined.filter");
	}

}
