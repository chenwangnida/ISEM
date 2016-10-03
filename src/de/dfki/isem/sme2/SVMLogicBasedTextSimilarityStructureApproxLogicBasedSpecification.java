package de.dfki.isem.sme2;

import org.eclipse.emf.common.util.URI;

public class SVMLogicBasedTextSimilarityStructureApproxLogicBasedSpecification extends GenericLibSVMISeM {

	@Override
	protected String getSVMModelFileName() {
		return "plugin/isem/svm/logic-based_text-similarity_structure_approx-logic-based_specification.xml";
	}

	@Override
	protected URI getFilterModel() {
		return URI.createFileURI("plugin/isem/filter/isem/svm_logic-based_text-similarity_structure_approx-logic-based_specification.filter");
	}

}
