package org.xtext.example.mml.compilator;

import org.xtext.example.mydsl.mml.MMLModel;

public interface Compilator {
	
	public String compile(MMLModel model) throws Exception;

}
