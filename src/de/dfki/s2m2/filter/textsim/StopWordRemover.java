package de.dfki.s2m2.filter.textsim;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Simple stop word remover which gets a text file listing all stop words as input. Each stop word in this file must be listed in a seperate line.
 * 
 * @author Patrick Kapahnke
 * @version 1.0
 */
public class StopWordRemover {

	public static final String			STOPWORD_FILENAME = "resources" + File.separator + "stopwords.txt";
	
	protected static String regEx = null;
	
	public static String removeStopWords(String text) {
		if(regEx == null)
			createRegEx(new File(STOPWORD_FILENAME));
		
		return text.toLowerCase().replaceAll(regEx, " ");
	}
	
	public static void createRegEx(File stopWordFile) {
		try {
			regEx = "[\\.,\\?!\\(\\)]|\\b(";
		
			BufferedReader reader = new BufferedReader(new FileReader(stopWordFile));
		
			try {
				String stopWord = reader.readLine();
				if(stopWord == null) {
					regEx = null;
					return;
				}
				regEx += stopWord;
				while((stopWord = reader.readLine()) != null)
					regEx += "|" + stopWord;
					
			}
			catch(IOException e) {
				// TODO Error handling.
				e.printStackTrace();
				regEx = null;
				return;
			}
			finally {
				reader.close();
			}
		
			regEx += ")\\b";
		}
		catch(FileNotFoundException e) {
			// TODO Error handling.	
			e.printStackTrace();
			regEx = null;
		}
		catch(IOException e) {
			// TODO Error handling.
			e.printStackTrace();
			regEx = null;
			
		}
	}
	
	public static void main(String args[]) {
		String text = new String();
		for(String arg : args) {
			text += arg + " ";
		}
		System.out.println(removeStopWords(text));
	}
}
