package de.dfki.isem.sme2;

import de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation;

public abstract class GenericLibSVMISeM extends GenericISeM {

	public GenericLibSVMISeM() {
		super();
		
		try {
			((LibSVMAggregation) engine.getSetup().getFeatureSpace().iterator().next()).loadModel(getSVMModelFileName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected abstract String getSVMModelFileName();

}
