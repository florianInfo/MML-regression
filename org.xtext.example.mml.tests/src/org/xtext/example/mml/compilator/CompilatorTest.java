package org.xtext.example.mml.compilator;


import static org.junit.Assert.assertTrue;

import java.io.BufferedInputStream;
import java.util.Scanner;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.mml.MMLModel;
import org.xtext.example.mydsl.tests.MmlInjectorProvider;


import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(MmlInjectorProvider.class)
public class CompilatorTest {
	
	public static Compilator compilator;
	
	@Inject
	ParseHelper<MMLModel> parseHelper;
	
	@BeforeAll
	public static void init() {
		compilator = new GeneralCompilator();
	}
	
	@Test
	public void programBasic() throws Exception {
		MMLModel result = parseHelper.parse("datainput \"foo.csv\"\n" + 
				"mlframework scikit-learn\n" + 
				"algorithm RF\n" + 
				"TrainingTest {\n" + 
				"	percentageTraining 90\n" + 
				"}\n" + 
				"mean_squared_error");
		String resultCompiled = compilator.compile(result);
		Scanner scanner = new Scanner(resultCompiled);
		
		
		String line1 = scanner.nextLine();
		assertTrue(line1.equals("import pandas as pd"));
		
		String line2 = scanner.nextLine();
		assertTrue(line2.equals("from sklearn.ensemble import RandomForestClassifier"));
		
		String line3 = scanner.nextLine();
		assertTrue(line3.equals("from sklearn.model_selection import train_test_split"));
		
		
		
		
		
		System.out.println("Prog1 : \n"+resultCompiled);
	}

}
