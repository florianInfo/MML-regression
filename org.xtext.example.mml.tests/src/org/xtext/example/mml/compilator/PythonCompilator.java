package org.xtext.example.mml.compilator;

import org.xtext.example.mydsl.mml.AllVariables;
import org.xtext.example.mydsl.mml.CSVParsingConfiguration;
import org.xtext.example.mydsl.mml.CrossValidation;
import org.xtext.example.mydsl.mml.DT;
import org.xtext.example.mydsl.mml.DataInput;
import org.xtext.example.mydsl.mml.FormulaItem;
import org.xtext.example.mydsl.mml.MLAlgorithm;
import org.xtext.example.mydsl.mml.MMLModel;
import org.xtext.example.mydsl.mml.PredictorVariables;
import org.xtext.example.mydsl.mml.RFormula;
import org.xtext.example.mydsl.mml.SVR;
import org.xtext.example.mydsl.mml.Validation;
import org.xtext.example.mydsl.mml.ValidationMetric;
import org.xtext.example.mydsl.mml.XFormula;

public class PythonCompilator {
	
	public static String compile(MMLModel model) throws Exception {
		DataInput dataInput = model.getInput();
		String fileLocation = dataInput.getFilelocation();
		
		/*lecture inputs*/
		String pythonImport = "import pandas as pd\n"; 
		String DEFAULT_COLUMN_SEPARATOR = ","; // by default
		String csv_separator = DEFAULT_COLUMN_SEPARATOR;
		CSVParsingConfiguration parsingInstruction = dataInput.getParsingInstruction();
		if (parsingInstruction != null) {			
			System.err.println("parsing instruction..." + parsingInstruction);
			csv_separator = parsingInstruction.getSep().toString();
		}
		String csvReading = "mml_data = pd.read_csv(" + mkValueInSingleQuote(fileLocation) + ", sep=" + mkValueInSingleQuote(csv_separator) + ")\n";						
		
		String pythonAlgo = "algo=";
		MLAlgorithm algo = model.getAlgorithm().getAlgorithm();
		switch (algo.eClass().getName()) {
		case "SVR":
			pythonImport+= "from sklearn.svm import SVR\n";
			String c = ((SVR)algo).getC();
			String kernel = ((SVR)algo).getKernel().getName();
			pythonAlgo+= "SVR(";
			pythonAlgo+= (c == null || c.equals("")) ? "" : "C="+c;
			pythonAlgo+= (!(c==null || c.equals("") || kernel == null || kernel.equals(""))) ? ", " : "";
			pythonAlgo+= (kernel == null || kernel.equals("")) ? "" : "kernel="+mkValueInSingleQuote(kernel);
			pythonAlgo+= ")\n";
			break;
		case "DT": 
			pythonImport+= "from sklearn.svm import tree\n";
			int depth = ((DT)algo).getMax_depth();
			pythonAlgo+= "DesicionTreeClassifier(";
			pythonAlgo+= (depth == 0 ) ? "" : "max_depth="+depth;
			pythonAlgo+= ")\n";
			break;
		case "RandomForest": 
			pythonImport+= "from sklearn.ensemble import RandomForestClassifier\n";
			pythonAlgo+= "RandomForestClassifier()\n";
			break;
		case "SGD": 
			pythonImport+= "from sklearn import linear_model\n";
			pythonAlgo+= "linear_model.SGDClassifier()\n";
			break;
		case "GTB": 
			pythonImport+= "from sklearn.ensemble import GradientBoostingClassifier\n";
			pythonAlgo+= "GradientBoostingClassifier()\n";
			break;
		default:
			break;
		}
		
		
		String pythonFormula ="col_names=mml_data.columns\n";
		RFormula formula = model.getFormula();
		if(formula != null) {
			FormulaItem predictive = formula.getPredictive();
			XFormula predictors = formula.getPredictors();
			if(predictive != null) {
				if(predictive.getColName() != null) {
					pythonFormula+="Y= mml_data["+ 
							mkValueInSingleQuote(predictive.getColName())
							+"]\n";
				}
				else {
					pythonFormula+="Y= mml_data[col_names["+ 
							predictive.getColumn()
							+"]]\n";
				}
				//handle predictor with predictive
				if(predictors instanceof AllVariables) {
					if(predictive.getColName() != null) {
						pythonFormula+="X= mml_data.drop(columns=["
								+mkValueInSingleQuote(predictive.getColName())
								+"]\n";
					}
					else {
						pythonFormula+="X=mml_data\n";
						pythonFormula+="X.remove("+ 
								predictive.getColumn()
								+")\n";
					}
				}
				else {
					pythonFormula+="X=pd.DataFrame()\n";
					PredictorVariables columns = (PredictorVariables)predictors;
					for(FormulaItem item : columns.getVars()) {
						if(item.getColName() != null) {
							pythonFormula+="X.insert(0, "+ mkValueInSingleQuote(item.getColName())+", mml_data["
									+ mkValueInSingleQuote(item.getColName())+"], True)\n";
						}
						else {
							pythonFormula+="X.insert(0, col_names["+item.getColumn()+"], mml_data[col_names["
									+ item.getColumn()+"]], True)\n";
						}
						
					}
					
				}
			}
			else {
				//il y a une startegie mais pas de colonne prédictive du coup c'est la dernière et on gère juste les colonne servant a predir
				if(predictors instanceof AllVariables) {
					pythonFormula+="X= mml_data.drop(columns=[col_names[len(col_names)-1]])\n";//finsih
				}
				else {
					pythonFormula+="X=pd.DataFrame()\n";
					PredictorVariables columns = (PredictorVariables)predictors;
					for(FormulaItem item : columns.getVars()) {
						if(item.getColName() != null) {
							pythonFormula+="X.insert(0, "+ mkValueInSingleQuote(item.getColName())+", mml_data["
									+ mkValueInSingleQuote(item.getColName())+"], True)\n";
						}
						else {
							pythonFormula+="X.insert(0, col_names["+item.getColumn()+"], mml_data[col_names["
									+ item.getColumn()+"]], True)\n";
						}
						
					}
					
				}
				pythonFormula+="Y= mml_data[col_names[len(col_names)-1]]\n";
			}
			
			
		}
		else {
			pythonFormula+="X= mml_data.drop(columns=[col_names[len(col_names)-1]])\n";
			pythonFormula+="Y= mml_data[col_names[len(col_names)-1]]\n";
		}
		
		
		String pythonValidation = "";
		Validation validation = model.getValidation();
		if(validation.getStratification() instanceof CrossValidation) {
			pythonImport+="from sklearn.model_selection import cross_val_score\n";
			pythonValidation+="scores = cross_val_score(algo, X, Y, cv="+validation.getStratification().getNumber()+")\n";
			for(ValidationMetric metric : validation.getMetric()) {
				switch (metric.getName()) {
				case "MSE":
					pythonValidation+="print('Mean squared error : '+str(scores.mean()))\n";
					break;
				case "MAE":
					// TODO 
					break;
				case "MAPE":
					// TODO 
					break;
				default:
					break;
				}
			}
			
		}else {
			pythonImport+="from sklearn.model_selection import train_test_split\n";
			int trainingPercent = validation.getStratification().getNumber();
			double setTest = 1 - ((double)trainingPercent / 100);
			pythonValidation+="X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size="+setTest+")\n";
			pythonValidation+="algo.fit(X_train, Y_train)\n";
			for(ValidationMetric metric : validation.getMetric()) {
				switch (metric.getName()) {
				case "MSE":
					pythonImport+="from sklearn.metrics import mean_squared_error\n";
					pythonValidation+="mse = mean_squared_error(Y_test, algo.predict(X_test))\n";
					pythonValidation+="print('Mean squared error : '+str(mse))\n";
					break;
				case "MAE":
					pythonImport+="from sklearn.metrics import mean_absolute_error\n";
					pythonValidation+="mae = mean_absolute_error(Y_test, algo.predict(X_test))\n";
					pythonValidation+="print('Mean absolute error : '+str(mae))\n";
					break;
				case "MAPE":
					// TODO 
					break;
				default:
					break;
				}
			}
		}
		
		return 	pythonImport+"\n"
				+csvReading+"\n"
				+pythonFormula+"\n"
				+pythonAlgo+"\n"
				+pythonValidation;
	}
	
	
	private static String mkValueInSingleQuote(String val) {
		return "'" + val + "'";
	}
	

}
