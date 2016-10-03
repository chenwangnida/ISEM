package de.dfki.s2m2.sme2;

import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;

import de.dfki.s2m2.MatchingEngine;
import de.dfki.s2m2.MatchingEngineFactory;
import de.dfki.s2m2.MatchingResult;
import de.dfki.sme2.IMatchmakerPlugin;

public class GenericPlugin implements IMatchmakerPlugin {

	private MatchingEngine engine;
	
	public GenericPlugin() {
		engine = MatchingEngineFactory.createMatchingEngine(URI.createFileURI("C:\\Daten\\workspaces\\runtime-EclipseApplication\\iSeM filters\\text-similarity.filter"));
	}
	
	@Override
	public void input(URL url) {
		try {
			engine.getServiceRegistry().registerServices(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Hashtable<URL, Vector<URL>> query(URL url) {
		try {
			Vector<MatchingResult> ranking = engine.match(url);
			Vector<URL> resultVec = new Vector<URL>();
			for(MatchingResult result : ranking) {
				resultVec.add(result.getOfferSource());
			}
			Hashtable<URL, Vector<URL>> output = new Hashtable<URL, Vector<URL>>();
			output.put(url, resultVec);
			
			return output;
		}
		catch(Exception e) {
			e.printStackTrace();
			return new Hashtable<URL, Vector<URL>>();
		}
	}
	
	public static void main(String[] args) {
		new GenericPlugin();
	}
}
