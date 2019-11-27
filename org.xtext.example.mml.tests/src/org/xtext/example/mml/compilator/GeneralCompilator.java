package org.xtext.example.mml.compilator;

import org.xtext.example.mydsl.mml.MMLModel;

public class GeneralCompilator implements Compilator{
	
	
	public String compile(MMLModel model) throws Exception {
		String codeResult = "";
		
		String framework = model.getAlgorithm().getFramework().getName();
		switch(framework) {
		case "SCIKIT": codeResult+= PythonCompilator.compile(model); break;
		case "R" : throw new Exception("R not yet implemented");
		case "JavaWeka" : throw new Exception("Weka not yet implemented");
		case "XGBoost" : throw new Exception("XGBoost not yet implemented");
		default : 
			System.out.println("framework not found");
		}
		
		return codeResult;
	}

}
