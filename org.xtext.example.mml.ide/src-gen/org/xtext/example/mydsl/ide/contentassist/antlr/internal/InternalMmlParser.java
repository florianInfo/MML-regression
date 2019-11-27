package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMmlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DT'", "'DecisionTree'", "'RandomForest'", "'RF'", "'StochasticGradientDescent'", "'SGD'", "'GradientBoostingRegressor'", "'GTB'", "','", "';'", "'scikit-learn'", "'R'", "'Weka'", "'xgboost'", "'rbf'", "'linear'", "'poly'", "'mean_squared_error'", "'mean_absolute_error'", "'mean_absolute_percentage_error'", "'datainput'", "'separator'", "'mlframework'", "'algorithm'", "'SVR'", "'C='", "'kernel='", "'.'", "'formula'", "'~'", "'+'", "'CrossValidation'", "'{'", "'numRepetitionCross'", "'}'", "'TrainingTest'", "'percentageTraining'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMml.g"; }


    	private MmlGrammarAccess grammarAccess;

    	public void setGrammarAccess(MmlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMMLModel"
    // InternalMml.g:53:1: entryRuleMMLModel : ruleMMLModel EOF ;
    public final void entryRuleMMLModel() throws RecognitionException {
        try {
            // InternalMml.g:54:1: ( ruleMMLModel EOF )
            // InternalMml.g:55:1: ruleMMLModel EOF
            {
             before(grammarAccess.getMMLModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMMLModel();

            state._fsp--;

             after(grammarAccess.getMMLModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMMLModel"


    // $ANTLR start "ruleMMLModel"
    // InternalMml.g:62:1: ruleMMLModel : ( ( rule__MMLModel__Group__0 ) ) ;
    public final void ruleMMLModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:66:2: ( ( ( rule__MMLModel__Group__0 ) ) )
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            {
            // InternalMml.g:67:2: ( ( rule__MMLModel__Group__0 ) )
            // InternalMml.g:68:3: ( rule__MMLModel__Group__0 )
            {
             before(grammarAccess.getMMLModelAccess().getGroup()); 
            // InternalMml.g:69:3: ( rule__MMLModel__Group__0 )
            // InternalMml.g:69:4: rule__MMLModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMMLModel"


    // $ANTLR start "entryRuleDataInput"
    // InternalMml.g:78:1: entryRuleDataInput : ruleDataInput EOF ;
    public final void entryRuleDataInput() throws RecognitionException {
        try {
            // InternalMml.g:79:1: ( ruleDataInput EOF )
            // InternalMml.g:80:1: ruleDataInput EOF
            {
             before(grammarAccess.getDataInputRule()); 
            pushFollow(FOLLOW_1);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getDataInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataInput"


    // $ANTLR start "ruleDataInput"
    // InternalMml.g:87:1: ruleDataInput : ( ( rule__DataInput__Group__0 ) ) ;
    public final void ruleDataInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:91:2: ( ( ( rule__DataInput__Group__0 ) ) )
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            {
            // InternalMml.g:92:2: ( ( rule__DataInput__Group__0 ) )
            // InternalMml.g:93:3: ( rule__DataInput__Group__0 )
            {
             before(grammarAccess.getDataInputAccess().getGroup()); 
            // InternalMml.g:94:3: ( rule__DataInput__Group__0 )
            // InternalMml.g:94:4: rule__DataInput__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataInput"


    // $ANTLR start "entryRuleCSVParsingConfiguration"
    // InternalMml.g:103:1: entryRuleCSVParsingConfiguration : ruleCSVParsingConfiguration EOF ;
    public final void entryRuleCSVParsingConfiguration() throws RecognitionException {
        try {
            // InternalMml.g:104:1: ( ruleCSVParsingConfiguration EOF )
            // InternalMml.g:105:1: ruleCSVParsingConfiguration EOF
            {
             before(grammarAccess.getCSVParsingConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSVParsingConfiguration"


    // $ANTLR start "ruleCSVParsingConfiguration"
    // InternalMml.g:112:1: ruleCSVParsingConfiguration : ( ( rule__CSVParsingConfiguration__Group__0 ) ) ;
    public final void ruleCSVParsingConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:116:2: ( ( ( rule__CSVParsingConfiguration__Group__0 ) ) )
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            {
            // InternalMml.g:117:2: ( ( rule__CSVParsingConfiguration__Group__0 ) )
            // InternalMml.g:118:3: ( rule__CSVParsingConfiguration__Group__0 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 
            // InternalMml.g:119:3: ( rule__CSVParsingConfiguration__Group__0 )
            // InternalMml.g:119:4: rule__CSVParsingConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVParsingConfiguration"


    // $ANTLR start "entryRuleMLChoiceAlgorithm"
    // InternalMml.g:128:1: entryRuleMLChoiceAlgorithm : ruleMLChoiceAlgorithm EOF ;
    public final void entryRuleMLChoiceAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:129:1: ( ruleMLChoiceAlgorithm EOF )
            // InternalMml.g:130:1: ruleMLChoiceAlgorithm EOF
            {
             before(grammarAccess.getMLChoiceAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLChoiceAlgorithm"


    // $ANTLR start "ruleMLChoiceAlgorithm"
    // InternalMml.g:137:1: ruleMLChoiceAlgorithm : ( ( rule__MLChoiceAlgorithm__Group__0 ) ) ;
    public final void ruleMLChoiceAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:141:2: ( ( ( rule__MLChoiceAlgorithm__Group__0 ) ) )
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            {
            // InternalMml.g:142:2: ( ( rule__MLChoiceAlgorithm__Group__0 ) )
            // InternalMml.g:143:3: ( rule__MLChoiceAlgorithm__Group__0 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 
            // InternalMml.g:144:3: ( rule__MLChoiceAlgorithm__Group__0 )
            // InternalMml.g:144:4: rule__MLChoiceAlgorithm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLChoiceAlgorithm"


    // $ANTLR start "entryRuleMLAlgorithm"
    // InternalMml.g:153:1: entryRuleMLAlgorithm : ruleMLAlgorithm EOF ;
    public final void entryRuleMLAlgorithm() throws RecognitionException {
        try {
            // InternalMml.g:154:1: ( ruleMLAlgorithm EOF )
            // InternalMml.g:155:1: ruleMLAlgorithm EOF
            {
             before(grammarAccess.getMLAlgorithmRule()); 
            pushFollow(FOLLOW_1);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLAlgorithmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMLAlgorithm"


    // $ANTLR start "ruleMLAlgorithm"
    // InternalMml.g:162:1: ruleMLAlgorithm : ( ( rule__MLAlgorithm__Alternatives ) ) ;
    public final void ruleMLAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:166:2: ( ( ( rule__MLAlgorithm__Alternatives ) ) )
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            {
            // InternalMml.g:167:2: ( ( rule__MLAlgorithm__Alternatives ) )
            // InternalMml.g:168:3: ( rule__MLAlgorithm__Alternatives )
            {
             before(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 
            // InternalMml.g:169:3: ( rule__MLAlgorithm__Alternatives )
            // InternalMml.g:169:4: rule__MLAlgorithm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MLAlgorithm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMLAlgorithmAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMLAlgorithm"


    // $ANTLR start "entryRuleSVR"
    // InternalMml.g:178:1: entryRuleSVR : ruleSVR EOF ;
    public final void entryRuleSVR() throws RecognitionException {
        try {
            // InternalMml.g:179:1: ( ruleSVR EOF )
            // InternalMml.g:180:1: ruleSVR EOF
            {
             before(grammarAccess.getSVRRule()); 
            pushFollow(FOLLOW_1);
            ruleSVR();

            state._fsp--;

             after(grammarAccess.getSVRRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSVR"


    // $ANTLR start "ruleSVR"
    // InternalMml.g:187:1: ruleSVR : ( ( rule__SVR__Group__0 ) ) ;
    public final void ruleSVR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:191:2: ( ( ( rule__SVR__Group__0 ) ) )
            // InternalMml.g:192:2: ( ( rule__SVR__Group__0 ) )
            {
            // InternalMml.g:192:2: ( ( rule__SVR__Group__0 ) )
            // InternalMml.g:193:3: ( rule__SVR__Group__0 )
            {
             before(grammarAccess.getSVRAccess().getGroup()); 
            // InternalMml.g:194:3: ( rule__SVR__Group__0 )
            // InternalMml.g:194:4: rule__SVR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVR"


    // $ANTLR start "entryRuleDT"
    // InternalMml.g:203:1: entryRuleDT : ruleDT EOF ;
    public final void entryRuleDT() throws RecognitionException {
        try {
            // InternalMml.g:204:1: ( ruleDT EOF )
            // InternalMml.g:205:1: ruleDT EOF
            {
             before(grammarAccess.getDTRule()); 
            pushFollow(FOLLOW_1);
            ruleDT();

            state._fsp--;

             after(grammarAccess.getDTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDT"


    // $ANTLR start "ruleDT"
    // InternalMml.g:212:1: ruleDT : ( ( rule__DT__Group__0 ) ) ;
    public final void ruleDT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:216:2: ( ( ( rule__DT__Group__0 ) ) )
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            {
            // InternalMml.g:217:2: ( ( rule__DT__Group__0 ) )
            // InternalMml.g:218:3: ( rule__DT__Group__0 )
            {
             before(grammarAccess.getDTAccess().getGroup()); 
            // InternalMml.g:219:3: ( rule__DT__Group__0 )
            // InternalMml.g:219:4: rule__DT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDT"


    // $ANTLR start "entryRuleRandomForest"
    // InternalMml.g:228:1: entryRuleRandomForest : ruleRandomForest EOF ;
    public final void entryRuleRandomForest() throws RecognitionException {
        try {
            // InternalMml.g:229:1: ( ruleRandomForest EOF )
            // InternalMml.g:230:1: ruleRandomForest EOF
            {
             before(grammarAccess.getRandomForestRule()); 
            pushFollow(FOLLOW_1);
            ruleRandomForest();

            state._fsp--;

             after(grammarAccess.getRandomForestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandomForest"


    // $ANTLR start "ruleRandomForest"
    // InternalMml.g:237:1: ruleRandomForest : ( ( rule__RandomForest__Group__0 ) ) ;
    public final void ruleRandomForest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:241:2: ( ( ( rule__RandomForest__Group__0 ) ) )
            // InternalMml.g:242:2: ( ( rule__RandomForest__Group__0 ) )
            {
            // InternalMml.g:242:2: ( ( rule__RandomForest__Group__0 ) )
            // InternalMml.g:243:3: ( rule__RandomForest__Group__0 )
            {
             before(grammarAccess.getRandomForestAccess().getGroup()); 
            // InternalMml.g:244:3: ( rule__RandomForest__Group__0 )
            // InternalMml.g:244:4: rule__RandomForest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandomForest"


    // $ANTLR start "entryRuleSGD"
    // InternalMml.g:253:1: entryRuleSGD : ruleSGD EOF ;
    public final void entryRuleSGD() throws RecognitionException {
        try {
            // InternalMml.g:254:1: ( ruleSGD EOF )
            // InternalMml.g:255:1: ruleSGD EOF
            {
             before(grammarAccess.getSGDRule()); 
            pushFollow(FOLLOW_1);
            ruleSGD();

            state._fsp--;

             after(grammarAccess.getSGDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSGD"


    // $ANTLR start "ruleSGD"
    // InternalMml.g:262:1: ruleSGD : ( ( rule__SGD__Group__0 ) ) ;
    public final void ruleSGD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:266:2: ( ( ( rule__SGD__Group__0 ) ) )
            // InternalMml.g:267:2: ( ( rule__SGD__Group__0 ) )
            {
            // InternalMml.g:267:2: ( ( rule__SGD__Group__0 ) )
            // InternalMml.g:268:3: ( rule__SGD__Group__0 )
            {
             before(grammarAccess.getSGDAccess().getGroup()); 
            // InternalMml.g:269:3: ( rule__SGD__Group__0 )
            // InternalMml.g:269:4: rule__SGD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SGD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSGDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSGD"


    // $ANTLR start "entryRuleGTB"
    // InternalMml.g:278:1: entryRuleGTB : ruleGTB EOF ;
    public final void entryRuleGTB() throws RecognitionException {
        try {
            // InternalMml.g:279:1: ( ruleGTB EOF )
            // InternalMml.g:280:1: ruleGTB EOF
            {
             before(grammarAccess.getGTBRule()); 
            pushFollow(FOLLOW_1);
            ruleGTB();

            state._fsp--;

             after(grammarAccess.getGTBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGTB"


    // $ANTLR start "ruleGTB"
    // InternalMml.g:287:1: ruleGTB : ( ( rule__GTB__Group__0 ) ) ;
    public final void ruleGTB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:291:2: ( ( ( rule__GTB__Group__0 ) ) )
            // InternalMml.g:292:2: ( ( rule__GTB__Group__0 ) )
            {
            // InternalMml.g:292:2: ( ( rule__GTB__Group__0 ) )
            // InternalMml.g:293:3: ( rule__GTB__Group__0 )
            {
             before(grammarAccess.getGTBAccess().getGroup()); 
            // InternalMml.g:294:3: ( rule__GTB__Group__0 )
            // InternalMml.g:294:4: rule__GTB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GTB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGTBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGTB"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMml.g:303:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalMml.g:304:1: ( ruleFLOAT EOF )
            // InternalMml.g:305:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMml.g:312:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:316:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalMml.g:317:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalMml.g:317:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalMml.g:318:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalMml.g:319:3: ( rule__FLOAT__Group__0 )
            // InternalMml.g:319:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleRFormula"
    // InternalMml.g:328:1: entryRuleRFormula : ruleRFormula EOF ;
    public final void entryRuleRFormula() throws RecognitionException {
        try {
            // InternalMml.g:329:1: ( ruleRFormula EOF )
            // InternalMml.g:330:1: ruleRFormula EOF
            {
             before(grammarAccess.getRFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRFormula"


    // $ANTLR start "ruleRFormula"
    // InternalMml.g:337:1: ruleRFormula : ( ( rule__RFormula__Group__0 ) ) ;
    public final void ruleRFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:341:2: ( ( ( rule__RFormula__Group__0 ) ) )
            // InternalMml.g:342:2: ( ( rule__RFormula__Group__0 ) )
            {
            // InternalMml.g:342:2: ( ( rule__RFormula__Group__0 ) )
            // InternalMml.g:343:3: ( rule__RFormula__Group__0 )
            {
             before(grammarAccess.getRFormulaAccess().getGroup()); 
            // InternalMml.g:344:3: ( rule__RFormula__Group__0 )
            // InternalMml.g:344:4: rule__RFormula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRFormula"


    // $ANTLR start "entryRuleXFormula"
    // InternalMml.g:353:1: entryRuleXFormula : ruleXFormula EOF ;
    public final void entryRuleXFormula() throws RecognitionException {
        try {
            // InternalMml.g:354:1: ( ruleXFormula EOF )
            // InternalMml.g:355:1: ruleXFormula EOF
            {
             before(grammarAccess.getXFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getXFormulaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXFormula"


    // $ANTLR start "ruleXFormula"
    // InternalMml.g:362:1: ruleXFormula : ( ( rule__XFormula__Alternatives ) ) ;
    public final void ruleXFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:366:2: ( ( ( rule__XFormula__Alternatives ) ) )
            // InternalMml.g:367:2: ( ( rule__XFormula__Alternatives ) )
            {
            // InternalMml.g:367:2: ( ( rule__XFormula__Alternatives ) )
            // InternalMml.g:368:3: ( rule__XFormula__Alternatives )
            {
             before(grammarAccess.getXFormulaAccess().getAlternatives()); 
            // InternalMml.g:369:3: ( rule__XFormula__Alternatives )
            // InternalMml.g:369:4: rule__XFormula__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXFormula"


    // $ANTLR start "entryRuleAllVariables"
    // InternalMml.g:378:1: entryRuleAllVariables : ruleAllVariables EOF ;
    public final void entryRuleAllVariables() throws RecognitionException {
        try {
            // InternalMml.g:379:1: ( ruleAllVariables EOF )
            // InternalMml.g:380:1: ruleAllVariables EOF
            {
             before(grammarAccess.getAllVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleAllVariables();

            state._fsp--;

             after(grammarAccess.getAllVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllVariables"


    // $ANTLR start "ruleAllVariables"
    // InternalMml.g:387:1: ruleAllVariables : ( ( rule__AllVariables__AllAssignment ) ) ;
    public final void ruleAllVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:391:2: ( ( ( rule__AllVariables__AllAssignment ) ) )
            // InternalMml.g:392:2: ( ( rule__AllVariables__AllAssignment ) )
            {
            // InternalMml.g:392:2: ( ( rule__AllVariables__AllAssignment ) )
            // InternalMml.g:393:3: ( rule__AllVariables__AllAssignment )
            {
             before(grammarAccess.getAllVariablesAccess().getAllAssignment()); 
            // InternalMml.g:394:3: ( rule__AllVariables__AllAssignment )
            // InternalMml.g:394:4: rule__AllVariables__AllAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AllVariables__AllAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAllVariablesAccess().getAllAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllVariables"


    // $ANTLR start "entryRulePredictorVariables"
    // InternalMml.g:403:1: entryRulePredictorVariables : rulePredictorVariables EOF ;
    public final void entryRulePredictorVariables() throws RecognitionException {
        try {
            // InternalMml.g:404:1: ( rulePredictorVariables EOF )
            // InternalMml.g:405:1: rulePredictorVariables EOF
            {
             before(grammarAccess.getPredictorVariablesRule()); 
            pushFollow(FOLLOW_1);
            rulePredictorVariables();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredictorVariables"


    // $ANTLR start "rulePredictorVariables"
    // InternalMml.g:412:1: rulePredictorVariables : ( ( rule__PredictorVariables__Group__0 ) ) ;
    public final void rulePredictorVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:416:2: ( ( ( rule__PredictorVariables__Group__0 ) ) )
            // InternalMml.g:417:2: ( ( rule__PredictorVariables__Group__0 ) )
            {
            // InternalMml.g:417:2: ( ( rule__PredictorVariables__Group__0 ) )
            // InternalMml.g:418:3: ( rule__PredictorVariables__Group__0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup()); 
            // InternalMml.g:419:3: ( rule__PredictorVariables__Group__0 )
            // InternalMml.g:419:4: rule__PredictorVariables__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictorVariables"


    // $ANTLR start "entryRuleFormulaItem"
    // InternalMml.g:428:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // InternalMml.g:429:1: ( ruleFormulaItem EOF )
            // InternalMml.g:430:1: ruleFormulaItem EOF
            {
             before(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // InternalMml.g:437:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:441:2: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // InternalMml.g:442:2: ( ( rule__FormulaItem__Alternatives ) )
            {
            // InternalMml.g:442:2: ( ( rule__FormulaItem__Alternatives ) )
            // InternalMml.g:443:3: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // InternalMml.g:444:3: ( rule__FormulaItem__Alternatives )
            // InternalMml.g:444:4: rule__FormulaItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormulaItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleValidation"
    // InternalMml.g:453:1: entryRuleValidation : ruleValidation EOF ;
    public final void entryRuleValidation() throws RecognitionException {
        try {
            // InternalMml.g:454:1: ( ruleValidation EOF )
            // InternalMml.g:455:1: ruleValidation EOF
            {
             before(grammarAccess.getValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidation"


    // $ANTLR start "ruleValidation"
    // InternalMml.g:462:1: ruleValidation : ( ( rule__Validation__Group__0 ) ) ;
    public final void ruleValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:466:2: ( ( ( rule__Validation__Group__0 ) ) )
            // InternalMml.g:467:2: ( ( rule__Validation__Group__0 ) )
            {
            // InternalMml.g:467:2: ( ( rule__Validation__Group__0 ) )
            // InternalMml.g:468:3: ( rule__Validation__Group__0 )
            {
             before(grammarAccess.getValidationAccess().getGroup()); 
            // InternalMml.g:469:3: ( rule__Validation__Group__0 )
            // InternalMml.g:469:4: rule__Validation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidation"


    // $ANTLR start "entryRuleStratificationMethod"
    // InternalMml.g:478:1: entryRuleStratificationMethod : ruleStratificationMethod EOF ;
    public final void entryRuleStratificationMethod() throws RecognitionException {
        try {
            // InternalMml.g:479:1: ( ruleStratificationMethod EOF )
            // InternalMml.g:480:1: ruleStratificationMethod EOF
            {
             before(grammarAccess.getStratificationMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getStratificationMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStratificationMethod"


    // $ANTLR start "ruleStratificationMethod"
    // InternalMml.g:487:1: ruleStratificationMethod : ( ( rule__StratificationMethod__Alternatives ) ) ;
    public final void ruleStratificationMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:491:2: ( ( ( rule__StratificationMethod__Alternatives ) ) )
            // InternalMml.g:492:2: ( ( rule__StratificationMethod__Alternatives ) )
            {
            // InternalMml.g:492:2: ( ( rule__StratificationMethod__Alternatives ) )
            // InternalMml.g:493:3: ( rule__StratificationMethod__Alternatives )
            {
             before(grammarAccess.getStratificationMethodAccess().getAlternatives()); 
            // InternalMml.g:494:3: ( rule__StratificationMethod__Alternatives )
            // InternalMml.g:494:4: rule__StratificationMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StratificationMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStratificationMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStratificationMethod"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMml.g:503:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMml.g:504:1: ( ruleCrossValidation EOF )
            // InternalMml.g:505:1: ruleCrossValidation EOF
            {
             before(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getCrossValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMml.g:512:1: ruleCrossValidation : ( ( rule__CrossValidation__Group__0 ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:516:2: ( ( ( rule__CrossValidation__Group__0 ) ) )
            // InternalMml.g:517:2: ( ( rule__CrossValidation__Group__0 ) )
            {
            // InternalMml.g:517:2: ( ( rule__CrossValidation__Group__0 ) )
            // InternalMml.g:518:3: ( rule__CrossValidation__Group__0 )
            {
             before(grammarAccess.getCrossValidationAccess().getGroup()); 
            // InternalMml.g:519:3: ( rule__CrossValidation__Group__0 )
            // InternalMml.g:519:4: rule__CrossValidation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMml.g:528:1: entryRuleTrainingTest : ruleTrainingTest EOF ;
    public final void entryRuleTrainingTest() throws RecognitionException {
        try {
            // InternalMml.g:529:1: ( ruleTrainingTest EOF )
            // InternalMml.g:530:1: ruleTrainingTest EOF
            {
             before(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getTrainingTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMml.g:537:1: ruleTrainingTest : ( ( rule__TrainingTest__Group__0 ) ) ;
    public final void ruleTrainingTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:541:2: ( ( ( rule__TrainingTest__Group__0 ) ) )
            // InternalMml.g:542:2: ( ( rule__TrainingTest__Group__0 ) )
            {
            // InternalMml.g:542:2: ( ( rule__TrainingTest__Group__0 ) )
            // InternalMml.g:543:3: ( rule__TrainingTest__Group__0 )
            {
             before(grammarAccess.getTrainingTestAccess().getGroup()); 
            // InternalMml.g:544:3: ( rule__TrainingTest__Group__0 )
            // InternalMml.g:544:4: rule__TrainingTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleCSVSeparator"
    // InternalMml.g:553:1: ruleCSVSeparator : ( ( rule__CSVSeparator__Alternatives ) ) ;
    public final void ruleCSVSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:557:1: ( ( ( rule__CSVSeparator__Alternatives ) ) )
            // InternalMml.g:558:2: ( ( rule__CSVSeparator__Alternatives ) )
            {
            // InternalMml.g:558:2: ( ( rule__CSVSeparator__Alternatives ) )
            // InternalMml.g:559:3: ( rule__CSVSeparator__Alternatives )
            {
             before(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 
            // InternalMml.g:560:3: ( rule__CSVSeparator__Alternatives )
            // InternalMml.g:560:4: rule__CSVSeparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CSVSeparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCSVSeparatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "ruleFrameworkLang"
    // InternalMml.g:569:1: ruleFrameworkLang : ( ( rule__FrameworkLang__Alternatives ) ) ;
    public final void ruleFrameworkLang() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:573:1: ( ( ( rule__FrameworkLang__Alternatives ) ) )
            // InternalMml.g:574:2: ( ( rule__FrameworkLang__Alternatives ) )
            {
            // InternalMml.g:574:2: ( ( rule__FrameworkLang__Alternatives ) )
            // InternalMml.g:575:3: ( rule__FrameworkLang__Alternatives )
            {
             before(grammarAccess.getFrameworkLangAccess().getAlternatives()); 
            // InternalMml.g:576:3: ( rule__FrameworkLang__Alternatives )
            // InternalMml.g:576:4: rule__FrameworkLang__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FrameworkLang__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFrameworkLangAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrameworkLang"


    // $ANTLR start "ruleSVMKernel"
    // InternalMml.g:585:1: ruleSVMKernel : ( ( rule__SVMKernel__Alternatives ) ) ;
    public final void ruleSVMKernel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:589:1: ( ( ( rule__SVMKernel__Alternatives ) ) )
            // InternalMml.g:590:2: ( ( rule__SVMKernel__Alternatives ) )
            {
            // InternalMml.g:590:2: ( ( rule__SVMKernel__Alternatives ) )
            // InternalMml.g:591:3: ( rule__SVMKernel__Alternatives )
            {
             before(grammarAccess.getSVMKernelAccess().getAlternatives()); 
            // InternalMml.g:592:3: ( rule__SVMKernel__Alternatives )
            // InternalMml.g:592:4: rule__SVMKernel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SVMKernel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSVMKernelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVMKernel"


    // $ANTLR start "ruleValidationMetric"
    // InternalMml.g:601:1: ruleValidationMetric : ( ( rule__ValidationMetric__Alternatives ) ) ;
    public final void ruleValidationMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:605:1: ( ( ( rule__ValidationMetric__Alternatives ) ) )
            // InternalMml.g:606:2: ( ( rule__ValidationMetric__Alternatives ) )
            {
            // InternalMml.g:606:2: ( ( rule__ValidationMetric__Alternatives ) )
            // InternalMml.g:607:3: ( rule__ValidationMetric__Alternatives )
            {
             before(grammarAccess.getValidationMetricAccess().getAlternatives()); 
            // InternalMml.g:608:3: ( rule__ValidationMetric__Alternatives )
            // InternalMml.g:608:4: rule__ValidationMetric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidationMetric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationMetricAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidationMetric"


    // $ANTLR start "rule__MLAlgorithm__Alternatives"
    // InternalMml.g:616:1: rule__MLAlgorithm__Alternatives : ( ( ruleSVR ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleSGD ) | ( ruleGTB ) );
    public final void rule__MLAlgorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:620:1: ( ( ruleSVR ) | ( ruleDT ) | ( ruleRandomForest ) | ( ruleSGD ) | ( ruleGTB ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt1=1;
                }
                break;
            case 11:
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
            case 16:
                {
                alt1=4;
                }
                break;
            case 17:
            case 18:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMml.g:621:2: ( ruleSVR )
                    {
                    // InternalMml.g:621:2: ( ruleSVR )
                    // InternalMml.g:622:3: ruleSVR
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getSVRParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSVR();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getSVRParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:627:2: ( ruleDT )
                    {
                    // InternalMml.g:627:2: ( ruleDT )
                    // InternalMml.g:628:3: ruleDT
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDT();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getDTParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:633:2: ( ruleRandomForest )
                    {
                    // InternalMml.g:633:2: ( ruleRandomForest )
                    // InternalMml.g:634:3: ruleRandomForest
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRandomForest();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getRandomForestParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:639:2: ( ruleSGD )
                    {
                    // InternalMml.g:639:2: ( ruleSGD )
                    // InternalMml.g:640:3: ruleSGD
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getSGDParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSGD();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getSGDParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMml.g:645:2: ( ruleGTB )
                    {
                    // InternalMml.g:645:2: ( ruleGTB )
                    // InternalMml.g:646:3: ruleGTB
                    {
                     before(grammarAccess.getMLAlgorithmAccess().getGTBParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGTB();

                    state._fsp--;

                     after(grammarAccess.getMLAlgorithmAccess().getGTBParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLAlgorithm__Alternatives"


    // $ANTLR start "rule__DT__Alternatives_1"
    // InternalMml.g:655:1: rule__DT__Alternatives_1 : ( ( 'DT' ) | ( 'DecisionTree' ) );
    public final void rule__DT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:659:1: ( ( 'DT' ) | ( 'DecisionTree' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMml.g:660:2: ( 'DT' )
                    {
                    // InternalMml.g:660:2: ( 'DT' )
                    // InternalMml.g:661:3: 'DT'
                    {
                     before(grammarAccess.getDTAccess().getDTKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDTAccess().getDTKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:666:2: ( 'DecisionTree' )
                    {
                    // InternalMml.g:666:2: ( 'DecisionTree' )
                    // InternalMml.g:667:3: 'DecisionTree'
                    {
                     before(grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDTAccess().getDecisionTreeKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Alternatives_1"


    // $ANTLR start "rule__RandomForest__Alternatives_1"
    // InternalMml.g:676:1: rule__RandomForest__Alternatives_1 : ( ( 'RandomForest' ) | ( 'RF' ) );
    public final void rule__RandomForest__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:680:1: ( ( 'RandomForest' ) | ( 'RF' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMml.g:681:2: ( 'RandomForest' )
                    {
                    // InternalMml.g:681:2: ( 'RandomForest' )
                    // InternalMml.g:682:3: 'RandomForest'
                    {
                     before(grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRandomForestAccess().getRandomForestKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:687:2: ( 'RF' )
                    {
                    // InternalMml.g:687:2: ( 'RF' )
                    // InternalMml.g:688:3: 'RF'
                    {
                     before(grammarAccess.getRandomForestAccess().getRFKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRandomForestAccess().getRFKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Alternatives_1"


    // $ANTLR start "rule__SGD__Alternatives_1"
    // InternalMml.g:697:1: rule__SGD__Alternatives_1 : ( ( 'StochasticGradientDescent' ) | ( 'SGD' ) );
    public final void rule__SGD__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:701:1: ( ( 'StochasticGradientDescent' ) | ( 'SGD' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMml.g:702:2: ( 'StochasticGradientDescent' )
                    {
                    // InternalMml.g:702:2: ( 'StochasticGradientDescent' )
                    // InternalMml.g:703:3: 'StochasticGradientDescent'
                    {
                     before(grammarAccess.getSGDAccess().getStochasticGradientDescentKeyword_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSGDAccess().getStochasticGradientDescentKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:708:2: ( 'SGD' )
                    {
                    // InternalMml.g:708:2: ( 'SGD' )
                    // InternalMml.g:709:3: 'SGD'
                    {
                     before(grammarAccess.getSGDAccess().getSGDKeyword_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSGDAccess().getSGDKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGD__Alternatives_1"


    // $ANTLR start "rule__GTB__Alternatives_1"
    // InternalMml.g:718:1: rule__GTB__Alternatives_1 : ( ( 'GradientBoostingRegressor' ) | ( 'GTB' ) );
    public final void rule__GTB__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:722:1: ( ( 'GradientBoostingRegressor' ) | ( 'GTB' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMml.g:723:2: ( 'GradientBoostingRegressor' )
                    {
                    // InternalMml.g:723:2: ( 'GradientBoostingRegressor' )
                    // InternalMml.g:724:3: 'GradientBoostingRegressor'
                    {
                     before(grammarAccess.getGTBAccess().getGradientBoostingRegressorKeyword_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getGTBAccess().getGradientBoostingRegressorKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:729:2: ( 'GTB' )
                    {
                    // InternalMml.g:729:2: ( 'GTB' )
                    // InternalMml.g:730:3: 'GTB'
                    {
                     before(grammarAccess.getGTBAccess().getGTBKeyword_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getGTBAccess().getGTBKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTB__Alternatives_1"


    // $ANTLR start "rule__XFormula__Alternatives"
    // InternalMml.g:739:1: rule__XFormula__Alternatives : ( ( ruleAllVariables ) | ( rulePredictorVariables ) );
    public final void rule__XFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:743:1: ( ( ruleAllVariables ) | ( rulePredictorVariables ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMml.g:744:2: ( ruleAllVariables )
                    {
                    // InternalMml.g:744:2: ( ruleAllVariables )
                    // InternalMml.g:745:3: ruleAllVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getAllVariablesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:750:2: ( rulePredictorVariables )
                    {
                    // InternalMml.g:750:2: ( rulePredictorVariables )
                    // InternalMml.g:751:3: rulePredictorVariables
                    {
                     before(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredictorVariables();

                    state._fsp--;

                     after(grammarAccess.getXFormulaAccess().getPredictorVariablesParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XFormula__Alternatives"


    // $ANTLR start "rule__FormulaItem__Alternatives"
    // InternalMml.g:760:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:764:1: ( ( ( rule__FormulaItem__ColumnAssignment_0 ) ) | ( ( rule__FormulaItem__ColNameAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMml.g:765:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    {
                    // InternalMml.g:765:2: ( ( rule__FormulaItem__ColumnAssignment_0 ) )
                    // InternalMml.g:766:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 
                    // InternalMml.g:767:3: ( rule__FormulaItem__ColumnAssignment_0 )
                    // InternalMml.g:767:4: rule__FormulaItem__ColumnAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColumnAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColumnAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:771:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    {
                    // InternalMml.g:771:2: ( ( rule__FormulaItem__ColNameAssignment_1 ) )
                    // InternalMml.g:772:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 
                    // InternalMml.g:773:3: ( rule__FormulaItem__ColNameAssignment_1 )
                    // InternalMml.g:773:4: rule__FormulaItem__ColNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormulaItem__ColNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getColNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__Alternatives"


    // $ANTLR start "rule__StratificationMethod__Alternatives"
    // InternalMml.g:781:1: rule__StratificationMethod__Alternatives : ( ( ruleCrossValidation ) | ( ruleTrainingTest ) );
    public final void rule__StratificationMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:785:1: ( ( ruleCrossValidation ) | ( ruleTrainingTest ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMml.g:786:2: ( ruleCrossValidation )
                    {
                    // InternalMml.g:786:2: ( ruleCrossValidation )
                    // InternalMml.g:787:3: ruleCrossValidation
                    {
                     before(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCrossValidation();

                    state._fsp--;

                     after(grammarAccess.getStratificationMethodAccess().getCrossValidationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:792:2: ( ruleTrainingTest )
                    {
                    // InternalMml.g:792:2: ( ruleTrainingTest )
                    // InternalMml.g:793:3: ruleTrainingTest
                    {
                     before(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTrainingTest();

                    state._fsp--;

                     after(grammarAccess.getStratificationMethodAccess().getTrainingTestParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StratificationMethod__Alternatives"


    // $ANTLR start "rule__CSVSeparator__Alternatives"
    // InternalMml.g:802:1: rule__CSVSeparator__Alternatives : ( ( ( ',' ) ) | ( ( ';' ) ) );
    public final void rule__CSVSeparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:806:1: ( ( ( ',' ) ) | ( ( ';' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMml.g:807:2: ( ( ',' ) )
                    {
                    // InternalMml.g:807:2: ( ( ',' ) )
                    // InternalMml.g:808:3: ( ',' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 
                    // InternalMml.g:809:3: ( ',' )
                    // InternalMml.g:809:4: ','
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getCOMMAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:813:2: ( ( ';' ) )
                    {
                    // InternalMml.g:813:2: ( ( ';' ) )
                    // InternalMml.g:814:3: ( ';' )
                    {
                     before(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 
                    // InternalMml.g:815:3: ( ';' )
                    // InternalMml.g:815:4: ';'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getCSVSeparatorAccess().getSEMI_COLONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Alternatives"


    // $ANTLR start "rule__FrameworkLang__Alternatives"
    // InternalMml.g:823:1: rule__FrameworkLang__Alternatives : ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) | ( ( 'xgboost' ) ) );
    public final void rule__FrameworkLang__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:827:1: ( ( ( 'scikit-learn' ) ) | ( ( 'R' ) ) | ( ( 'Weka' ) ) | ( ( 'xgboost' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMml.g:828:2: ( ( 'scikit-learn' ) )
                    {
                    // InternalMml.g:828:2: ( ( 'scikit-learn' ) )
                    // InternalMml.g:829:3: ( 'scikit-learn' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 
                    // InternalMml.g:830:3: ( 'scikit-learn' )
                    // InternalMml.g:830:4: 'scikit-learn'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getSCIKITEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:834:2: ( ( 'R' ) )
                    {
                    // InternalMml.g:834:2: ( ( 'R' ) )
                    // InternalMml.g:835:3: ( 'R' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 
                    // InternalMml.g:836:3: ( 'R' )
                    // InternalMml.g:836:4: 'R'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:840:2: ( ( 'Weka' ) )
                    {
                    // InternalMml.g:840:2: ( ( 'Weka' ) )
                    // InternalMml.g:841:3: ( 'Weka' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 
                    // InternalMml.g:842:3: ( 'Weka' )
                    // InternalMml.g:842:4: 'Weka'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getJavaWekaEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMml.g:846:2: ( ( 'xgboost' ) )
                    {
                    // InternalMml.g:846:2: ( ( 'xgboost' ) )
                    // InternalMml.g:847:3: ( 'xgboost' )
                    {
                     before(grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3()); 
                    // InternalMml.g:848:3: ( 'xgboost' )
                    // InternalMml.g:848:4: 'xgboost'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getFrameworkLangAccess().getXGBoostEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrameworkLang__Alternatives"


    // $ANTLR start "rule__SVMKernel__Alternatives"
    // InternalMml.g:856:1: rule__SVMKernel__Alternatives : ( ( ( 'rbf' ) ) | ( ( 'linear' ) ) | ( ( 'poly' ) ) );
    public final void rule__SVMKernel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:860:1: ( ( ( 'rbf' ) ) | ( ( 'linear' ) ) | ( ( 'poly' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
                {
                alt11=2;
                }
                break;
            case 27:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMml.g:861:2: ( ( 'rbf' ) )
                    {
                    // InternalMml.g:861:2: ( ( 'rbf' ) )
                    // InternalMml.g:862:3: ( 'rbf' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getRbfEnumLiteralDeclaration_0()); 
                    // InternalMml.g:863:3: ( 'rbf' )
                    // InternalMml.g:863:4: 'rbf'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getRbfEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:867:2: ( ( 'linear' ) )
                    {
                    // InternalMml.g:867:2: ( ( 'linear' ) )
                    // InternalMml.g:868:3: ( 'linear' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_1()); 
                    // InternalMml.g:869:3: ( 'linear' )
                    // InternalMml.g:869:4: 'linear'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getLinearEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:873:2: ( ( 'poly' ) )
                    {
                    // InternalMml.g:873:2: ( ( 'poly' ) )
                    // InternalMml.g:874:3: ( 'poly' )
                    {
                     before(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_2()); 
                    // InternalMml.g:875:3: ( 'poly' )
                    // InternalMml.g:875:4: 'poly'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getSVMKernelAccess().getPolyEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVMKernel__Alternatives"


    // $ANTLR start "rule__ValidationMetric__Alternatives"
    // InternalMml.g:883:1: rule__ValidationMetric__Alternatives : ( ( ( 'mean_squared_error' ) ) | ( ( 'mean_absolute_error' ) ) | ( ( 'mean_absolute_percentage_error' ) ) );
    public final void rule__ValidationMetric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:887:1: ( ( ( 'mean_squared_error' ) ) | ( ( 'mean_absolute_error' ) ) | ( ( 'mean_absolute_percentage_error' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMml.g:888:2: ( ( 'mean_squared_error' ) )
                    {
                    // InternalMml.g:888:2: ( ( 'mean_squared_error' ) )
                    // InternalMml.g:889:3: ( 'mean_squared_error' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMSEEnumLiteralDeclaration_0()); 
                    // InternalMml.g:890:3: ( 'mean_squared_error' )
                    // InternalMml.g:890:4: 'mean_squared_error'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMml.g:894:2: ( ( 'mean_absolute_error' ) )
                    {
                    // InternalMml.g:894:2: ( ( 'mean_absolute_error' ) )
                    // InternalMml.g:895:3: ( 'mean_absolute_error' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMAEEnumLiteralDeclaration_1()); 
                    // InternalMml.g:896:3: ( 'mean_absolute_error' )
                    // InternalMml.g:896:4: 'mean_absolute_error'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMAEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMml.g:900:2: ( ( 'mean_absolute_percentage_error' ) )
                    {
                    // InternalMml.g:900:2: ( ( 'mean_absolute_percentage_error' ) )
                    // InternalMml.g:901:3: ( 'mean_absolute_percentage_error' )
                    {
                     before(grammarAccess.getValidationMetricAccess().getMAPEEnumLiteralDeclaration_2()); 
                    // InternalMml.g:902:3: ( 'mean_absolute_percentage_error' )
                    // InternalMml.g:902:4: 'mean_absolute_percentage_error'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationMetricAccess().getMAPEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationMetric__Alternatives"


    // $ANTLR start "rule__MMLModel__Group__0"
    // InternalMml.g:910:1: rule__MMLModel__Group__0 : rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 ;
    public final void rule__MMLModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:914:1: ( rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1 )
            // InternalMml.g:915:2: rule__MMLModel__Group__0__Impl rule__MMLModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MMLModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__0"


    // $ANTLR start "rule__MMLModel__Group__0__Impl"
    // InternalMml.g:922:1: rule__MMLModel__Group__0__Impl : ( ( rule__MMLModel__InputAssignment_0 ) ) ;
    public final void rule__MMLModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:926:1: ( ( ( rule__MMLModel__InputAssignment_0 ) ) )
            // InternalMml.g:927:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            {
            // InternalMml.g:927:1: ( ( rule__MMLModel__InputAssignment_0 ) )
            // InternalMml.g:928:2: ( rule__MMLModel__InputAssignment_0 )
            {
             before(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 
            // InternalMml.g:929:2: ( rule__MMLModel__InputAssignment_0 )
            // InternalMml.g:929:3: rule__MMLModel__InputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getInputAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__0__Impl"


    // $ANTLR start "rule__MMLModel__Group__1"
    // InternalMml.g:937:1: rule__MMLModel__Group__1 : rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 ;
    public final void rule__MMLModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:941:1: ( rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2 )
            // InternalMml.g:942:2: rule__MMLModel__Group__1__Impl rule__MMLModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__1"


    // $ANTLR start "rule__MMLModel__Group__1__Impl"
    // InternalMml.g:949:1: rule__MMLModel__Group__1__Impl : ( ( rule__MMLModel__AlgorithmAssignment_1 ) ) ;
    public final void rule__MMLModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:953:1: ( ( ( rule__MMLModel__AlgorithmAssignment_1 ) ) )
            // InternalMml.g:954:1: ( ( rule__MMLModel__AlgorithmAssignment_1 ) )
            {
            // InternalMml.g:954:1: ( ( rule__MMLModel__AlgorithmAssignment_1 ) )
            // InternalMml.g:955:2: ( rule__MMLModel__AlgorithmAssignment_1 )
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_1()); 
            // InternalMml.g:956:2: ( rule__MMLModel__AlgorithmAssignment_1 )
            // InternalMml.g:956:3: rule__MMLModel__AlgorithmAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__AlgorithmAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getAlgorithmAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__1__Impl"


    // $ANTLR start "rule__MMLModel__Group__2"
    // InternalMml.g:964:1: rule__MMLModel__Group__2 : rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 ;
    public final void rule__MMLModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:968:1: ( rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3 )
            // InternalMml.g:969:2: rule__MMLModel__Group__2__Impl rule__MMLModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MMLModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__2"


    // $ANTLR start "rule__MMLModel__Group__2__Impl"
    // InternalMml.g:976:1: rule__MMLModel__Group__2__Impl : ( ( rule__MMLModel__FormulaAssignment_2 )? ) ;
    public final void rule__MMLModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:980:1: ( ( ( rule__MMLModel__FormulaAssignment_2 )? ) )
            // InternalMml.g:981:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            {
            // InternalMml.g:981:1: ( ( rule__MMLModel__FormulaAssignment_2 )? )
            // InternalMml.g:982:2: ( rule__MMLModel__FormulaAssignment_2 )?
            {
             before(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 
            // InternalMml.g:983:2: ( rule__MMLModel__FormulaAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMml.g:983:3: rule__MMLModel__FormulaAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MMLModel__FormulaAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMMLModelAccess().getFormulaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__2__Impl"


    // $ANTLR start "rule__MMLModel__Group__3"
    // InternalMml.g:991:1: rule__MMLModel__Group__3 : rule__MMLModel__Group__3__Impl ;
    public final void rule__MMLModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:995:1: ( rule__MMLModel__Group__3__Impl )
            // InternalMml.g:996:2: rule__MMLModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__3"


    // $ANTLR start "rule__MMLModel__Group__3__Impl"
    // InternalMml.g:1002:1: rule__MMLModel__Group__3__Impl : ( ( rule__MMLModel__ValidationAssignment_3 ) ) ;
    public final void rule__MMLModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1006:1: ( ( ( rule__MMLModel__ValidationAssignment_3 ) ) )
            // InternalMml.g:1007:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            {
            // InternalMml.g:1007:1: ( ( rule__MMLModel__ValidationAssignment_3 ) )
            // InternalMml.g:1008:2: ( rule__MMLModel__ValidationAssignment_3 )
            {
             before(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 
            // InternalMml.g:1009:2: ( rule__MMLModel__ValidationAssignment_3 )
            // InternalMml.g:1009:3: rule__MMLModel__ValidationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MMLModel__ValidationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMMLModelAccess().getValidationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__Group__3__Impl"


    // $ANTLR start "rule__DataInput__Group__0"
    // InternalMml.g:1018:1: rule__DataInput__Group__0 : rule__DataInput__Group__0__Impl rule__DataInput__Group__1 ;
    public final void rule__DataInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1022:1: ( rule__DataInput__Group__0__Impl rule__DataInput__Group__1 )
            // InternalMml.g:1023:2: rule__DataInput__Group__0__Impl rule__DataInput__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__0"


    // $ANTLR start "rule__DataInput__Group__0__Impl"
    // InternalMml.g:1030:1: rule__DataInput__Group__0__Impl : ( 'datainput' ) ;
    public final void rule__DataInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1034:1: ( ( 'datainput' ) )
            // InternalMml.g:1035:1: ( 'datainput' )
            {
            // InternalMml.g:1035:1: ( 'datainput' )
            // InternalMml.g:1036:2: 'datainput'
            {
             before(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getDatainputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__0__Impl"


    // $ANTLR start "rule__DataInput__Group__1"
    // InternalMml.g:1045:1: rule__DataInput__Group__1 : rule__DataInput__Group__1__Impl rule__DataInput__Group__2 ;
    public final void rule__DataInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1049:1: ( rule__DataInput__Group__1__Impl rule__DataInput__Group__2 )
            // InternalMml.g:1050:2: rule__DataInput__Group__1__Impl rule__DataInput__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DataInput__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__1"


    // $ANTLR start "rule__DataInput__Group__1__Impl"
    // InternalMml.g:1057:1: rule__DataInput__Group__1__Impl : ( ( rule__DataInput__FilelocationAssignment_1 ) ) ;
    public final void rule__DataInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1061:1: ( ( ( rule__DataInput__FilelocationAssignment_1 ) ) )
            // InternalMml.g:1062:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            {
            // InternalMml.g:1062:1: ( ( rule__DataInput__FilelocationAssignment_1 ) )
            // InternalMml.g:1063:2: ( rule__DataInput__FilelocationAssignment_1 )
            {
             before(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 
            // InternalMml.g:1064:2: ( rule__DataInput__FilelocationAssignment_1 )
            // InternalMml.g:1064:3: rule__DataInput__FilelocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__FilelocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataInputAccess().getFilelocationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__1__Impl"


    // $ANTLR start "rule__DataInput__Group__2"
    // InternalMml.g:1072:1: rule__DataInput__Group__2 : rule__DataInput__Group__2__Impl ;
    public final void rule__DataInput__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1076:1: ( rule__DataInput__Group__2__Impl )
            // InternalMml.g:1077:2: rule__DataInput__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataInput__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__2"


    // $ANTLR start "rule__DataInput__Group__2__Impl"
    // InternalMml.g:1083:1: rule__DataInput__Group__2__Impl : ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) ;
    public final void rule__DataInput__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1087:1: ( ( ( rule__DataInput__ParsingInstructionAssignment_2 )? ) )
            // InternalMml.g:1088:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            {
            // InternalMml.g:1088:1: ( ( rule__DataInput__ParsingInstructionAssignment_2 )? )
            // InternalMml.g:1089:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 
            // InternalMml.g:1090:2: ( rule__DataInput__ParsingInstructionAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMml.g:1090:3: rule__DataInput__ParsingInstructionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataInput__ParsingInstructionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataInputAccess().getParsingInstructionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__Group__2__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0"
    // InternalMml.g:1099:1: rule__CSVParsingConfiguration__Group__0 : rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 ;
    public final void rule__CSVParsingConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1103:1: ( rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1 )
            // InternalMml.g:1104:2: rule__CSVParsingConfiguration__Group__0__Impl rule__CSVParsingConfiguration__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CSVParsingConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__0__Impl"
    // InternalMml.g:1111:1: rule__CSVParsingConfiguration__Group__0__Impl : ( 'separator' ) ;
    public final void rule__CSVParsingConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1115:1: ( ( 'separator' ) )
            // InternalMml.g:1116:1: ( 'separator' )
            {
            // InternalMml.g:1116:1: ( 'separator' )
            // InternalMml.g:1117:2: 'separator'
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCSVParsingConfigurationAccess().getSeparatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__0__Impl"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1"
    // InternalMml.g:1126:1: rule__CSVParsingConfiguration__Group__1 : rule__CSVParsingConfiguration__Group__1__Impl ;
    public final void rule__CSVParsingConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1130:1: ( rule__CSVParsingConfiguration__Group__1__Impl )
            // InternalMml.g:1131:2: rule__CSVParsingConfiguration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1"


    // $ANTLR start "rule__CSVParsingConfiguration__Group__1__Impl"
    // InternalMml.g:1137:1: rule__CSVParsingConfiguration__Group__1__Impl : ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) ;
    public final void rule__CSVParsingConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1141:1: ( ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) ) )
            // InternalMml.g:1142:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            {
            // InternalMml.g:1142:1: ( ( rule__CSVParsingConfiguration__SepAssignment_1 ) )
            // InternalMml.g:1143:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 
            // InternalMml.g:1144:2: ( rule__CSVParsingConfiguration__SepAssignment_1 )
            // InternalMml.g:1144:3: rule__CSVParsingConfiguration__SepAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSVParsingConfiguration__SepAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0"
    // InternalMml.g:1153:1: rule__MLChoiceAlgorithm__Group__0 : rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 ;
    public final void rule__MLChoiceAlgorithm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1157:1: ( rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1 )
            // InternalMml.g:1158:2: rule__MLChoiceAlgorithm__Group__0__Impl rule__MLChoiceAlgorithm__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MLChoiceAlgorithm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__0__Impl"
    // InternalMml.g:1165:1: rule__MLChoiceAlgorithm__Group__0__Impl : ( 'mlframework' ) ;
    public final void rule__MLChoiceAlgorithm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1169:1: ( ( 'mlframework' ) )
            // InternalMml.g:1170:1: ( 'mlframework' )
            {
            // InternalMml.g:1170:1: ( 'mlframework' )
            // InternalMml.g:1171:2: 'mlframework'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getMlframeworkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__0__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1"
    // InternalMml.g:1180:1: rule__MLChoiceAlgorithm__Group__1 : rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 ;
    public final void rule__MLChoiceAlgorithm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1184:1: ( rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2 )
            // InternalMml.g:1185:2: rule__MLChoiceAlgorithm__Group__1__Impl rule__MLChoiceAlgorithm__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MLChoiceAlgorithm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__1__Impl"
    // InternalMml.g:1192:1: rule__MLChoiceAlgorithm__Group__1__Impl : ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1196:1: ( ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) ) )
            // InternalMml.g:1197:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            {
            // InternalMml.g:1197:1: ( ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 ) )
            // InternalMml.g:1198:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 
            // InternalMml.g:1199:2: ( rule__MLChoiceAlgorithm__FrameworkAssignment_1 )
            // InternalMml.g:1199:3: rule__MLChoiceAlgorithm__FrameworkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__FrameworkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__1__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2"
    // InternalMml.g:1207:1: rule__MLChoiceAlgorithm__Group__2 : rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 ;
    public final void rule__MLChoiceAlgorithm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1211:1: ( rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3 )
            // InternalMml.g:1212:2: rule__MLChoiceAlgorithm__Group__2__Impl rule__MLChoiceAlgorithm__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MLChoiceAlgorithm__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__2__Impl"
    // InternalMml.g:1219:1: rule__MLChoiceAlgorithm__Group__2__Impl : ( 'algorithm' ) ;
    public final void rule__MLChoiceAlgorithm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1223:1: ( ( 'algorithm' ) )
            // InternalMml.g:1224:1: ( 'algorithm' )
            {
            // InternalMml.g:1224:1: ( 'algorithm' )
            // InternalMml.g:1225:2: 'algorithm'
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__2__Impl"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3"
    // InternalMml.g:1234:1: rule__MLChoiceAlgorithm__Group__3 : rule__MLChoiceAlgorithm__Group__3__Impl ;
    public final void rule__MLChoiceAlgorithm__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1238:1: ( rule__MLChoiceAlgorithm__Group__3__Impl )
            // InternalMml.g:1239:2: rule__MLChoiceAlgorithm__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3"


    // $ANTLR start "rule__MLChoiceAlgorithm__Group__3__Impl"
    // InternalMml.g:1245:1: rule__MLChoiceAlgorithm__Group__3__Impl : ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) ;
    public final void rule__MLChoiceAlgorithm__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1249:1: ( ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) ) )
            // InternalMml.g:1250:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            {
            // InternalMml.g:1250:1: ( ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 ) )
            // InternalMml.g:1251:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 
            // InternalMml.g:1252:2: ( rule__MLChoiceAlgorithm__AlgorithmAssignment_3 )
            // InternalMml.g:1252:3: rule__MLChoiceAlgorithm__AlgorithmAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MLChoiceAlgorithm__AlgorithmAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__Group__3__Impl"


    // $ANTLR start "rule__SVR__Group__0"
    // InternalMml.g:1261:1: rule__SVR__Group__0 : rule__SVR__Group__0__Impl rule__SVR__Group__1 ;
    public final void rule__SVR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1265:1: ( rule__SVR__Group__0__Impl rule__SVR__Group__1 )
            // InternalMml.g:1266:2: rule__SVR__Group__0__Impl rule__SVR__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SVR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__0"


    // $ANTLR start "rule__SVR__Group__0__Impl"
    // InternalMml.g:1273:1: rule__SVR__Group__0__Impl : ( () ) ;
    public final void rule__SVR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1277:1: ( ( () ) )
            // InternalMml.g:1278:1: ( () )
            {
            // InternalMml.g:1278:1: ( () )
            // InternalMml.g:1279:2: ()
            {
             before(grammarAccess.getSVRAccess().getSVRAction_0()); 
            // InternalMml.g:1280:2: ()
            // InternalMml.g:1280:3: 
            {
            }

             after(grammarAccess.getSVRAccess().getSVRAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__0__Impl"


    // $ANTLR start "rule__SVR__Group__1"
    // InternalMml.g:1288:1: rule__SVR__Group__1 : rule__SVR__Group__1__Impl rule__SVR__Group__2 ;
    public final void rule__SVR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1292:1: ( rule__SVR__Group__1__Impl rule__SVR__Group__2 )
            // InternalMml.g:1293:2: rule__SVR__Group__1__Impl rule__SVR__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SVR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__1"


    // $ANTLR start "rule__SVR__Group__1__Impl"
    // InternalMml.g:1300:1: rule__SVR__Group__1__Impl : ( 'SVR' ) ;
    public final void rule__SVR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1304:1: ( ( 'SVR' ) )
            // InternalMml.g:1305:1: ( 'SVR' )
            {
            // InternalMml.g:1305:1: ( 'SVR' )
            // InternalMml.g:1306:2: 'SVR'
            {
             before(grammarAccess.getSVRAccess().getSVRKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getSVRKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__1__Impl"


    // $ANTLR start "rule__SVR__Group__2"
    // InternalMml.g:1315:1: rule__SVR__Group__2 : rule__SVR__Group__2__Impl rule__SVR__Group__3 ;
    public final void rule__SVR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1319:1: ( rule__SVR__Group__2__Impl rule__SVR__Group__3 )
            // InternalMml.g:1320:2: rule__SVR__Group__2__Impl rule__SVR__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__SVR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__2"


    // $ANTLR start "rule__SVR__Group__2__Impl"
    // InternalMml.g:1327:1: rule__SVR__Group__2__Impl : ( ( rule__SVR__Group_2__0 )? ) ;
    public final void rule__SVR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1331:1: ( ( ( rule__SVR__Group_2__0 )? ) )
            // InternalMml.g:1332:1: ( ( rule__SVR__Group_2__0 )? )
            {
            // InternalMml.g:1332:1: ( ( rule__SVR__Group_2__0 )? )
            // InternalMml.g:1333:2: ( rule__SVR__Group_2__0 )?
            {
             before(grammarAccess.getSVRAccess().getGroup_2()); 
            // InternalMml.g:1334:2: ( rule__SVR__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMml.g:1334:3: rule__SVR__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVR__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVRAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__2__Impl"


    // $ANTLR start "rule__SVR__Group__3"
    // InternalMml.g:1342:1: rule__SVR__Group__3 : rule__SVR__Group__3__Impl ;
    public final void rule__SVR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1346:1: ( rule__SVR__Group__3__Impl )
            // InternalMml.g:1347:2: rule__SVR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__3"


    // $ANTLR start "rule__SVR__Group__3__Impl"
    // InternalMml.g:1353:1: rule__SVR__Group__3__Impl : ( ( rule__SVR__Group_3__0 )? ) ;
    public final void rule__SVR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1357:1: ( ( ( rule__SVR__Group_3__0 )? ) )
            // InternalMml.g:1358:1: ( ( rule__SVR__Group_3__0 )? )
            {
            // InternalMml.g:1358:1: ( ( rule__SVR__Group_3__0 )? )
            // InternalMml.g:1359:2: ( rule__SVR__Group_3__0 )?
            {
             before(grammarAccess.getSVRAccess().getGroup_3()); 
            // InternalMml.g:1360:2: ( rule__SVR__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMml.g:1360:3: rule__SVR__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SVR__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSVRAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group__3__Impl"


    // $ANTLR start "rule__SVR__Group_2__0"
    // InternalMml.g:1369:1: rule__SVR__Group_2__0 : rule__SVR__Group_2__0__Impl rule__SVR__Group_2__1 ;
    public final void rule__SVR__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1373:1: ( rule__SVR__Group_2__0__Impl rule__SVR__Group_2__1 )
            // InternalMml.g:1374:2: rule__SVR__Group_2__0__Impl rule__SVR__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__SVR__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_2__0"


    // $ANTLR start "rule__SVR__Group_2__0__Impl"
    // InternalMml.g:1381:1: rule__SVR__Group_2__0__Impl : ( 'C=' ) ;
    public final void rule__SVR__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1385:1: ( ( 'C=' ) )
            // InternalMml.g:1386:1: ( 'C=' )
            {
            // InternalMml.g:1386:1: ( 'C=' )
            // InternalMml.g:1387:2: 'C='
            {
             before(grammarAccess.getSVRAccess().getCKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getCKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_2__0__Impl"


    // $ANTLR start "rule__SVR__Group_2__1"
    // InternalMml.g:1396:1: rule__SVR__Group_2__1 : rule__SVR__Group_2__1__Impl ;
    public final void rule__SVR__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1400:1: ( rule__SVR__Group_2__1__Impl )
            // InternalMml.g:1401:2: rule__SVR__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_2__1"


    // $ANTLR start "rule__SVR__Group_2__1__Impl"
    // InternalMml.g:1407:1: rule__SVR__Group_2__1__Impl : ( ( rule__SVR__CAssignment_2_1 ) ) ;
    public final void rule__SVR__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1411:1: ( ( ( rule__SVR__CAssignment_2_1 ) ) )
            // InternalMml.g:1412:1: ( ( rule__SVR__CAssignment_2_1 ) )
            {
            // InternalMml.g:1412:1: ( ( rule__SVR__CAssignment_2_1 ) )
            // InternalMml.g:1413:2: ( rule__SVR__CAssignment_2_1 )
            {
             before(grammarAccess.getSVRAccess().getCAssignment_2_1()); 
            // InternalMml.g:1414:2: ( rule__SVR__CAssignment_2_1 )
            // InternalMml.g:1414:3: rule__SVR__CAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SVR__CAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSVRAccess().getCAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_2__1__Impl"


    // $ANTLR start "rule__SVR__Group_3__0"
    // InternalMml.g:1423:1: rule__SVR__Group_3__0 : rule__SVR__Group_3__0__Impl rule__SVR__Group_3__1 ;
    public final void rule__SVR__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1427:1: ( rule__SVR__Group_3__0__Impl rule__SVR__Group_3__1 )
            // InternalMml.g:1428:2: rule__SVR__Group_3__0__Impl rule__SVR__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__SVR__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVR__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_3__0"


    // $ANTLR start "rule__SVR__Group_3__0__Impl"
    // InternalMml.g:1435:1: rule__SVR__Group_3__0__Impl : ( 'kernel=' ) ;
    public final void rule__SVR__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1439:1: ( ( 'kernel=' ) )
            // InternalMml.g:1440:1: ( 'kernel=' )
            {
            // InternalMml.g:1440:1: ( 'kernel=' )
            // InternalMml.g:1441:2: 'kernel='
            {
             before(grammarAccess.getSVRAccess().getKernelKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSVRAccess().getKernelKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_3__0__Impl"


    // $ANTLR start "rule__SVR__Group_3__1"
    // InternalMml.g:1450:1: rule__SVR__Group_3__1 : rule__SVR__Group_3__1__Impl ;
    public final void rule__SVR__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1454:1: ( rule__SVR__Group_3__1__Impl )
            // InternalMml.g:1455:2: rule__SVR__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVR__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_3__1"


    // $ANTLR start "rule__SVR__Group_3__1__Impl"
    // InternalMml.g:1461:1: rule__SVR__Group_3__1__Impl : ( ( rule__SVR__KernelAssignment_3_1 ) ) ;
    public final void rule__SVR__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1465:1: ( ( ( rule__SVR__KernelAssignment_3_1 ) ) )
            // InternalMml.g:1466:1: ( ( rule__SVR__KernelAssignment_3_1 ) )
            {
            // InternalMml.g:1466:1: ( ( rule__SVR__KernelAssignment_3_1 ) )
            // InternalMml.g:1467:2: ( rule__SVR__KernelAssignment_3_1 )
            {
             before(grammarAccess.getSVRAccess().getKernelAssignment_3_1()); 
            // InternalMml.g:1468:2: ( rule__SVR__KernelAssignment_3_1 )
            // InternalMml.g:1468:3: rule__SVR__KernelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SVR__KernelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSVRAccess().getKernelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__Group_3__1__Impl"


    // $ANTLR start "rule__DT__Group__0"
    // InternalMml.g:1477:1: rule__DT__Group__0 : rule__DT__Group__0__Impl rule__DT__Group__1 ;
    public final void rule__DT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1481:1: ( rule__DT__Group__0__Impl rule__DT__Group__1 )
            // InternalMml.g:1482:2: rule__DT__Group__0__Impl rule__DT__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__DT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0"


    // $ANTLR start "rule__DT__Group__0__Impl"
    // InternalMml.g:1489:1: rule__DT__Group__0__Impl : ( () ) ;
    public final void rule__DT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1493:1: ( ( () ) )
            // InternalMml.g:1494:1: ( () )
            {
            // InternalMml.g:1494:1: ( () )
            // InternalMml.g:1495:2: ()
            {
             before(grammarAccess.getDTAccess().getDTAction_0()); 
            // InternalMml.g:1496:2: ()
            // InternalMml.g:1496:3: 
            {
            }

             after(grammarAccess.getDTAccess().getDTAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__0__Impl"


    // $ANTLR start "rule__DT__Group__1"
    // InternalMml.g:1504:1: rule__DT__Group__1 : rule__DT__Group__1__Impl rule__DT__Group__2 ;
    public final void rule__DT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1508:1: ( rule__DT__Group__1__Impl rule__DT__Group__2 )
            // InternalMml.g:1509:2: rule__DT__Group__1__Impl rule__DT__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__DT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1"


    // $ANTLR start "rule__DT__Group__1__Impl"
    // InternalMml.g:1516:1: rule__DT__Group__1__Impl : ( ( rule__DT__Alternatives_1 ) ) ;
    public final void rule__DT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1520:1: ( ( ( rule__DT__Alternatives_1 ) ) )
            // InternalMml.g:1521:1: ( ( rule__DT__Alternatives_1 ) )
            {
            // InternalMml.g:1521:1: ( ( rule__DT__Alternatives_1 ) )
            // InternalMml.g:1522:2: ( rule__DT__Alternatives_1 )
            {
             before(grammarAccess.getDTAccess().getAlternatives_1()); 
            // InternalMml.g:1523:2: ( rule__DT__Alternatives_1 )
            // InternalMml.g:1523:3: rule__DT__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DT__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDTAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__1__Impl"


    // $ANTLR start "rule__DT__Group__2"
    // InternalMml.g:1531:1: rule__DT__Group__2 : rule__DT__Group__2__Impl ;
    public final void rule__DT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1535:1: ( rule__DT__Group__2__Impl )
            // InternalMml.g:1536:2: rule__DT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2"


    // $ANTLR start "rule__DT__Group__2__Impl"
    // InternalMml.g:1542:1: rule__DT__Group__2__Impl : ( ( rule__DT__Max_depthAssignment_2 )? ) ;
    public final void rule__DT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1546:1: ( ( ( rule__DT__Max_depthAssignment_2 )? ) )
            // InternalMml.g:1547:1: ( ( rule__DT__Max_depthAssignment_2 )? )
            {
            // InternalMml.g:1547:1: ( ( rule__DT__Max_depthAssignment_2 )? )
            // InternalMml.g:1548:2: ( rule__DT__Max_depthAssignment_2 )?
            {
             before(grammarAccess.getDTAccess().getMax_depthAssignment_2()); 
            // InternalMml.g:1549:2: ( rule__DT__Max_depthAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMml.g:1549:3: rule__DT__Max_depthAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DT__Max_depthAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDTAccess().getMax_depthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Group__2__Impl"


    // $ANTLR start "rule__RandomForest__Group__0"
    // InternalMml.g:1558:1: rule__RandomForest__Group__0 : rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 ;
    public final void rule__RandomForest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1562:1: ( rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1 )
            // InternalMml.g:1563:2: rule__RandomForest__Group__0__Impl rule__RandomForest__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RandomForest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__0"


    // $ANTLR start "rule__RandomForest__Group__0__Impl"
    // InternalMml.g:1570:1: rule__RandomForest__Group__0__Impl : ( () ) ;
    public final void rule__RandomForest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1574:1: ( ( () ) )
            // InternalMml.g:1575:1: ( () )
            {
            // InternalMml.g:1575:1: ( () )
            // InternalMml.g:1576:2: ()
            {
             before(grammarAccess.getRandomForestAccess().getRandomForestAction_0()); 
            // InternalMml.g:1577:2: ()
            // InternalMml.g:1577:3: 
            {
            }

             after(grammarAccess.getRandomForestAccess().getRandomForestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__0__Impl"


    // $ANTLR start "rule__RandomForest__Group__1"
    // InternalMml.g:1585:1: rule__RandomForest__Group__1 : rule__RandomForest__Group__1__Impl ;
    public final void rule__RandomForest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1589:1: ( rule__RandomForest__Group__1__Impl )
            // InternalMml.g:1590:2: rule__RandomForest__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__1"


    // $ANTLR start "rule__RandomForest__Group__1__Impl"
    // InternalMml.g:1596:1: rule__RandomForest__Group__1__Impl : ( ( rule__RandomForest__Alternatives_1 ) ) ;
    public final void rule__RandomForest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1600:1: ( ( ( rule__RandomForest__Alternatives_1 ) ) )
            // InternalMml.g:1601:1: ( ( rule__RandomForest__Alternatives_1 ) )
            {
            // InternalMml.g:1601:1: ( ( rule__RandomForest__Alternatives_1 ) )
            // InternalMml.g:1602:2: ( rule__RandomForest__Alternatives_1 )
            {
             before(grammarAccess.getRandomForestAccess().getAlternatives_1()); 
            // InternalMml.g:1603:2: ( rule__RandomForest__Alternatives_1 )
            // InternalMml.g:1603:3: rule__RandomForest__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RandomForest__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRandomForestAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RandomForest__Group__1__Impl"


    // $ANTLR start "rule__SGD__Group__0"
    // InternalMml.g:1612:1: rule__SGD__Group__0 : rule__SGD__Group__0__Impl rule__SGD__Group__1 ;
    public final void rule__SGD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1616:1: ( rule__SGD__Group__0__Impl rule__SGD__Group__1 )
            // InternalMml.g:1617:2: rule__SGD__Group__0__Impl rule__SGD__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__SGD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SGD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGD__Group__0"


    // $ANTLR start "rule__SGD__Group__0__Impl"
    // InternalMml.g:1624:1: rule__SGD__Group__0__Impl : ( () ) ;
    public final void rule__SGD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1628:1: ( ( () ) )
            // InternalMml.g:1629:1: ( () )
            {
            // InternalMml.g:1629:1: ( () )
            // InternalMml.g:1630:2: ()
            {
             before(grammarAccess.getSGDAccess().getSGDAction_0()); 
            // InternalMml.g:1631:2: ()
            // InternalMml.g:1631:3: 
            {
            }

             after(grammarAccess.getSGDAccess().getSGDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGD__Group__0__Impl"


    // $ANTLR start "rule__SGD__Group__1"
    // InternalMml.g:1639:1: rule__SGD__Group__1 : rule__SGD__Group__1__Impl ;
    public final void rule__SGD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1643:1: ( rule__SGD__Group__1__Impl )
            // InternalMml.g:1644:2: rule__SGD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SGD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGD__Group__1"


    // $ANTLR start "rule__SGD__Group__1__Impl"
    // InternalMml.g:1650:1: rule__SGD__Group__1__Impl : ( ( rule__SGD__Alternatives_1 ) ) ;
    public final void rule__SGD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1654:1: ( ( ( rule__SGD__Alternatives_1 ) ) )
            // InternalMml.g:1655:1: ( ( rule__SGD__Alternatives_1 ) )
            {
            // InternalMml.g:1655:1: ( ( rule__SGD__Alternatives_1 ) )
            // InternalMml.g:1656:2: ( rule__SGD__Alternatives_1 )
            {
             before(grammarAccess.getSGDAccess().getAlternatives_1()); 
            // InternalMml.g:1657:2: ( rule__SGD__Alternatives_1 )
            // InternalMml.g:1657:3: rule__SGD__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SGD__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSGDAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SGD__Group__1__Impl"


    // $ANTLR start "rule__GTB__Group__0"
    // InternalMml.g:1666:1: rule__GTB__Group__0 : rule__GTB__Group__0__Impl rule__GTB__Group__1 ;
    public final void rule__GTB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1670:1: ( rule__GTB__Group__0__Impl rule__GTB__Group__1 )
            // InternalMml.g:1671:2: rule__GTB__Group__0__Impl rule__GTB__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__GTB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GTB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTB__Group__0"


    // $ANTLR start "rule__GTB__Group__0__Impl"
    // InternalMml.g:1678:1: rule__GTB__Group__0__Impl : ( () ) ;
    public final void rule__GTB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1682:1: ( ( () ) )
            // InternalMml.g:1683:1: ( () )
            {
            // InternalMml.g:1683:1: ( () )
            // InternalMml.g:1684:2: ()
            {
             before(grammarAccess.getGTBAccess().getGTBAction_0()); 
            // InternalMml.g:1685:2: ()
            // InternalMml.g:1685:3: 
            {
            }

             after(grammarAccess.getGTBAccess().getGTBAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTB__Group__0__Impl"


    // $ANTLR start "rule__GTB__Group__1"
    // InternalMml.g:1693:1: rule__GTB__Group__1 : rule__GTB__Group__1__Impl ;
    public final void rule__GTB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1697:1: ( rule__GTB__Group__1__Impl )
            // InternalMml.g:1698:2: rule__GTB__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GTB__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTB__Group__1"


    // $ANTLR start "rule__GTB__Group__1__Impl"
    // InternalMml.g:1704:1: rule__GTB__Group__1__Impl : ( ( rule__GTB__Alternatives_1 ) ) ;
    public final void rule__GTB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1708:1: ( ( ( rule__GTB__Alternatives_1 ) ) )
            // InternalMml.g:1709:1: ( ( rule__GTB__Alternatives_1 ) )
            {
            // InternalMml.g:1709:1: ( ( rule__GTB__Alternatives_1 ) )
            // InternalMml.g:1710:2: ( rule__GTB__Alternatives_1 )
            {
             before(grammarAccess.getGTBAccess().getAlternatives_1()); 
            // InternalMml.g:1711:2: ( rule__GTB__Alternatives_1 )
            // InternalMml.g:1711:3: rule__GTB__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__GTB__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getGTBAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GTB__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalMml.g:1720:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1724:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalMml.g:1725:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalMml.g:1732:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1736:1: ( ( RULE_INT ) )
            // InternalMml.g:1737:1: ( RULE_INT )
            {
            // InternalMml.g:1737:1: ( RULE_INT )
            // InternalMml.g:1738:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalMml.g:1747:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1751:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalMml.g:1752:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalMml.g:1759:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1763:1: ( ( '.' ) )
            // InternalMml.g:1764:1: ( '.' )
            {
            // InternalMml.g:1764:1: ( '.' )
            // InternalMml.g:1765:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalMml.g:1774:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1778:1: ( rule__FLOAT__Group__2__Impl )
            // InternalMml.g:1779:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalMml.g:1785:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1789:1: ( ( RULE_INT ) )
            // InternalMml.g:1790:1: ( RULE_INT )
            {
            // InternalMml.g:1790:1: ( RULE_INT )
            // InternalMml.g:1791:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group__0"
    // InternalMml.g:1801:1: rule__RFormula__Group__0 : rule__RFormula__Group__0__Impl rule__RFormula__Group__1 ;
    public final void rule__RFormula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1805:1: ( rule__RFormula__Group__0__Impl rule__RFormula__Group__1 )
            // InternalMml.g:1806:2: rule__RFormula__Group__0__Impl rule__RFormula__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RFormula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__0"


    // $ANTLR start "rule__RFormula__Group__0__Impl"
    // InternalMml.g:1813:1: rule__RFormula__Group__0__Impl : ( 'formula' ) ;
    public final void rule__RFormula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1817:1: ( ( 'formula' ) )
            // InternalMml.g:1818:1: ( 'formula' )
            {
            // InternalMml.g:1818:1: ( 'formula' )
            // InternalMml.g:1819:2: 'formula'
            {
             before(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getFormulaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__0__Impl"


    // $ANTLR start "rule__RFormula__Group__1"
    // InternalMml.g:1828:1: rule__RFormula__Group__1 : rule__RFormula__Group__1__Impl rule__RFormula__Group__2 ;
    public final void rule__RFormula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1832:1: ( rule__RFormula__Group__1__Impl rule__RFormula__Group__2 )
            // InternalMml.g:1833:2: rule__RFormula__Group__1__Impl rule__RFormula__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RFormula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__1"


    // $ANTLR start "rule__RFormula__Group__1__Impl"
    // InternalMml.g:1840:1: rule__RFormula__Group__1__Impl : ( ( rule__RFormula__Group_1__0 )? ) ;
    public final void rule__RFormula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1844:1: ( ( ( rule__RFormula__Group_1__0 )? ) )
            // InternalMml.g:1845:1: ( ( rule__RFormula__Group_1__0 )? )
            {
            // InternalMml.g:1845:1: ( ( rule__RFormula__Group_1__0 )? )
            // InternalMml.g:1846:2: ( rule__RFormula__Group_1__0 )?
            {
             before(grammarAccess.getRFormulaAccess().getGroup_1()); 
            // InternalMml.g:1847:2: ( rule__RFormula__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==40) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==RULE_STRING) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==40) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalMml.g:1847:3: rule__RFormula__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RFormula__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRFormulaAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__1__Impl"


    // $ANTLR start "rule__RFormula__Group__2"
    // InternalMml.g:1855:1: rule__RFormula__Group__2 : rule__RFormula__Group__2__Impl ;
    public final void rule__RFormula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1859:1: ( rule__RFormula__Group__2__Impl )
            // InternalMml.g:1860:2: rule__RFormula__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__2"


    // $ANTLR start "rule__RFormula__Group__2__Impl"
    // InternalMml.g:1866:1: rule__RFormula__Group__2__Impl : ( ( rule__RFormula__PredictorsAssignment_2 ) ) ;
    public final void rule__RFormula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1870:1: ( ( ( rule__RFormula__PredictorsAssignment_2 ) ) )
            // InternalMml.g:1871:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            {
            // InternalMml.g:1871:1: ( ( rule__RFormula__PredictorsAssignment_2 ) )
            // InternalMml.g:1872:2: ( rule__RFormula__PredictorsAssignment_2 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 
            // InternalMml.g:1873:2: ( rule__RFormula__PredictorsAssignment_2 )
            // InternalMml.g:1873:3: rule__RFormula__PredictorsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictorsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictorsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group__2__Impl"


    // $ANTLR start "rule__RFormula__Group_1__0"
    // InternalMml.g:1882:1: rule__RFormula__Group_1__0 : rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 ;
    public final void rule__RFormula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1886:1: ( rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1 )
            // InternalMml.g:1887:2: rule__RFormula__Group_1__0__Impl rule__RFormula__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__RFormula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__0"


    // $ANTLR start "rule__RFormula__Group_1__0__Impl"
    // InternalMml.g:1894:1: rule__RFormula__Group_1__0__Impl : ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) ;
    public final void rule__RFormula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1898:1: ( ( ( rule__RFormula__PredictiveAssignment_1_0 ) ) )
            // InternalMml.g:1899:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            {
            // InternalMml.g:1899:1: ( ( rule__RFormula__PredictiveAssignment_1_0 ) )
            // InternalMml.g:1900:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 
            // InternalMml.g:1901:2: ( rule__RFormula__PredictiveAssignment_1_0 )
            // InternalMml.g:1901:3: rule__RFormula__PredictiveAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__PredictiveAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRFormulaAccess().getPredictiveAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__0__Impl"


    // $ANTLR start "rule__RFormula__Group_1__1"
    // InternalMml.g:1909:1: rule__RFormula__Group_1__1 : rule__RFormula__Group_1__1__Impl ;
    public final void rule__RFormula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1913:1: ( rule__RFormula__Group_1__1__Impl )
            // InternalMml.g:1914:2: rule__RFormula__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RFormula__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__1"


    // $ANTLR start "rule__RFormula__Group_1__1__Impl"
    // InternalMml.g:1920:1: rule__RFormula__Group_1__1__Impl : ( '~' ) ;
    public final void rule__RFormula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1924:1: ( ( '~' ) )
            // InternalMml.g:1925:1: ( '~' )
            {
            // InternalMml.g:1925:1: ( '~' )
            // InternalMml.g:1926:2: '~'
            {
             before(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRFormulaAccess().getTildeKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__Group_1__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__0"
    // InternalMml.g:1936:1: rule__PredictorVariables__Group__0 : rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 ;
    public final void rule__PredictorVariables__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1940:1: ( rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1 )
            // InternalMml.g:1941:2: rule__PredictorVariables__Group__0__Impl rule__PredictorVariables__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PredictorVariables__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__0"


    // $ANTLR start "rule__PredictorVariables__Group__0__Impl"
    // InternalMml.g:1948:1: rule__PredictorVariables__Group__0__Impl : ( ( rule__PredictorVariables__VarsAssignment_0 ) ) ;
    public final void rule__PredictorVariables__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1952:1: ( ( ( rule__PredictorVariables__VarsAssignment_0 ) ) )
            // InternalMml.g:1953:1: ( ( rule__PredictorVariables__VarsAssignment_0 ) )
            {
            // InternalMml.g:1953:1: ( ( rule__PredictorVariables__VarsAssignment_0 ) )
            // InternalMml.g:1954:2: ( rule__PredictorVariables__VarsAssignment_0 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_0()); 
            // InternalMml.g:1955:2: ( rule__PredictorVariables__VarsAssignment_0 )
            // InternalMml.g:1955:3: rule__PredictorVariables__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group__1"
    // InternalMml.g:1963:1: rule__PredictorVariables__Group__1 : rule__PredictorVariables__Group__1__Impl ;
    public final void rule__PredictorVariables__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1967:1: ( rule__PredictorVariables__Group__1__Impl )
            // InternalMml.g:1968:2: rule__PredictorVariables__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__1"


    // $ANTLR start "rule__PredictorVariables__Group__1__Impl"
    // InternalMml.g:1974:1: rule__PredictorVariables__Group__1__Impl : ( ( rule__PredictorVariables__Group_1__0 )* ) ;
    public final void rule__PredictorVariables__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1978:1: ( ( ( rule__PredictorVariables__Group_1__0 )* ) )
            // InternalMml.g:1979:1: ( ( rule__PredictorVariables__Group_1__0 )* )
            {
            // InternalMml.g:1979:1: ( ( rule__PredictorVariables__Group_1__0 )* )
            // InternalMml.g:1980:2: ( rule__PredictorVariables__Group_1__0 )*
            {
             before(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 
            // InternalMml.g:1981:2: ( rule__PredictorVariables__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMml.g:1981:3: rule__PredictorVariables__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__PredictorVariables__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPredictorVariablesAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group__1__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__0"
    // InternalMml.g:1990:1: rule__PredictorVariables__Group_1__0 : rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 ;
    public final void rule__PredictorVariables__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:1994:1: ( rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1 )
            // InternalMml.g:1995:2: rule__PredictorVariables__Group_1__0__Impl rule__PredictorVariables__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__PredictorVariables__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__0"


    // $ANTLR start "rule__PredictorVariables__Group_1__0__Impl"
    // InternalMml.g:2002:1: rule__PredictorVariables__Group_1__0__Impl : ( '+' ) ;
    public final void rule__PredictorVariables__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2006:1: ( ( '+' ) )
            // InternalMml.g:2007:1: ( '+' )
            {
            // InternalMml.g:2007:1: ( '+' )
            // InternalMml.g:2008:2: '+'
            {
             before(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPredictorVariablesAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__0__Impl"


    // $ANTLR start "rule__PredictorVariables__Group_1__1"
    // InternalMml.g:2017:1: rule__PredictorVariables__Group_1__1 : rule__PredictorVariables__Group_1__1__Impl ;
    public final void rule__PredictorVariables__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2021:1: ( rule__PredictorVariables__Group_1__1__Impl )
            // InternalMml.g:2022:2: rule__PredictorVariables__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__1"


    // $ANTLR start "rule__PredictorVariables__Group_1__1__Impl"
    // InternalMml.g:2028:1: rule__PredictorVariables__Group_1__1__Impl : ( ( rule__PredictorVariables__VarsAssignment_1_1 ) ) ;
    public final void rule__PredictorVariables__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2032:1: ( ( ( rule__PredictorVariables__VarsAssignment_1_1 ) ) )
            // InternalMml.g:2033:1: ( ( rule__PredictorVariables__VarsAssignment_1_1 ) )
            {
            // InternalMml.g:2033:1: ( ( rule__PredictorVariables__VarsAssignment_1_1 ) )
            // InternalMml.g:2034:2: ( rule__PredictorVariables__VarsAssignment_1_1 )
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1()); 
            // InternalMml.g:2035:2: ( rule__PredictorVariables__VarsAssignment_1_1 )
            // InternalMml.g:2035:3: rule__PredictorVariables__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictorVariables__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictorVariablesAccess().getVarsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__Group_1__1__Impl"


    // $ANTLR start "rule__Validation__Group__0"
    // InternalMml.g:2044:1: rule__Validation__Group__0 : rule__Validation__Group__0__Impl rule__Validation__Group__1 ;
    public final void rule__Validation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2048:1: ( rule__Validation__Group__0__Impl rule__Validation__Group__1 )
            // InternalMml.g:2049:2: rule__Validation__Group__0__Impl rule__Validation__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Validation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Validation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0"


    // $ANTLR start "rule__Validation__Group__0__Impl"
    // InternalMml.g:2056:1: rule__Validation__Group__0__Impl : ( ( rule__Validation__StratificationAssignment_0 ) ) ;
    public final void rule__Validation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2060:1: ( ( ( rule__Validation__StratificationAssignment_0 ) ) )
            // InternalMml.g:2061:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            {
            // InternalMml.g:2061:1: ( ( rule__Validation__StratificationAssignment_0 ) )
            // InternalMml.g:2062:2: ( rule__Validation__StratificationAssignment_0 )
            {
             before(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 
            // InternalMml.g:2063:2: ( rule__Validation__StratificationAssignment_0 )
            // InternalMml.g:2063:3: rule__Validation__StratificationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Validation__StratificationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getStratificationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__0__Impl"


    // $ANTLR start "rule__Validation__Group__1"
    // InternalMml.g:2071:1: rule__Validation__Group__1 : rule__Validation__Group__1__Impl ;
    public final void rule__Validation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2075:1: ( rule__Validation__Group__1__Impl )
            // InternalMml.g:2076:2: rule__Validation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Validation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1"


    // $ANTLR start "rule__Validation__Group__1__Impl"
    // InternalMml.g:2082:1: rule__Validation__Group__1__Impl : ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) ;
    public final void rule__Validation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2086:1: ( ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) ) )
            // InternalMml.g:2087:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            {
            // InternalMml.g:2087:1: ( ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* ) )
            // InternalMml.g:2088:2: ( ( rule__Validation__MetricAssignment_1 ) ) ( ( rule__Validation__MetricAssignment_1 )* )
            {
            // InternalMml.g:2088:2: ( ( rule__Validation__MetricAssignment_1 ) )
            // InternalMml.g:2089:3: ( rule__Validation__MetricAssignment_1 )
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2090:3: ( rule__Validation__MetricAssignment_1 )
            // InternalMml.g:2090:4: rule__Validation__MetricAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Validation__MetricAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }

            // InternalMml.g:2093:2: ( ( rule__Validation__MetricAssignment_1 )* )
            // InternalMml.g:2094:3: ( rule__Validation__MetricAssignment_1 )*
            {
             before(grammarAccess.getValidationAccess().getMetricAssignment_1()); 
            // InternalMml.g:2095:3: ( rule__Validation__MetricAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=28 && LA20_0<=30)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMml.g:2095:4: rule__Validation__MetricAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Validation__MetricAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getValidationAccess().getMetricAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__0"
    // InternalMml.g:2105:1: rule__CrossValidation__Group__0 : rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 ;
    public final void rule__CrossValidation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2109:1: ( rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1 )
            // InternalMml.g:2110:2: rule__CrossValidation__Group__0__Impl rule__CrossValidation__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__CrossValidation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__0"


    // $ANTLR start "rule__CrossValidation__Group__0__Impl"
    // InternalMml.g:2117:1: rule__CrossValidation__Group__0__Impl : ( 'CrossValidation' ) ;
    public final void rule__CrossValidation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2121:1: ( ( 'CrossValidation' ) )
            // InternalMml.g:2122:1: ( 'CrossValidation' )
            {
            // InternalMml.g:2122:1: ( 'CrossValidation' )
            // InternalMml.g:2123:2: 'CrossValidation'
            {
             before(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getCrossValidationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__0__Impl"


    // $ANTLR start "rule__CrossValidation__Group__1"
    // InternalMml.g:2132:1: rule__CrossValidation__Group__1 : rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 ;
    public final void rule__CrossValidation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2136:1: ( rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2 )
            // InternalMml.g:2137:2: rule__CrossValidation__Group__1__Impl rule__CrossValidation__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__CrossValidation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__1"


    // $ANTLR start "rule__CrossValidation__Group__1__Impl"
    // InternalMml.g:2144:1: rule__CrossValidation__Group__1__Impl : ( '{' ) ;
    public final void rule__CrossValidation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2148:1: ( ( '{' ) )
            // InternalMml.g:2149:1: ( '{' )
            {
            // InternalMml.g:2149:1: ( '{' )
            // InternalMml.g:2150:2: '{'
            {
             before(grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__1__Impl"


    // $ANTLR start "rule__CrossValidation__Group__2"
    // InternalMml.g:2159:1: rule__CrossValidation__Group__2 : rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 ;
    public final void rule__CrossValidation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2163:1: ( rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3 )
            // InternalMml.g:2164:2: rule__CrossValidation__Group__2__Impl rule__CrossValidation__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CrossValidation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__2"


    // $ANTLR start "rule__CrossValidation__Group__2__Impl"
    // InternalMml.g:2171:1: rule__CrossValidation__Group__2__Impl : ( 'numRepetitionCross' ) ;
    public final void rule__CrossValidation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2175:1: ( ( 'numRepetitionCross' ) )
            // InternalMml.g:2176:1: ( 'numRepetitionCross' )
            {
            // InternalMml.g:2176:1: ( 'numRepetitionCross' )
            // InternalMml.g:2177:2: 'numRepetitionCross'
            {
             before(grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getNumRepetitionCrossKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__2__Impl"


    // $ANTLR start "rule__CrossValidation__Group__3"
    // InternalMml.g:2186:1: rule__CrossValidation__Group__3 : rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 ;
    public final void rule__CrossValidation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2190:1: ( rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4 )
            // InternalMml.g:2191:2: rule__CrossValidation__Group__3__Impl rule__CrossValidation__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__CrossValidation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__3"


    // $ANTLR start "rule__CrossValidation__Group__3__Impl"
    // InternalMml.g:2198:1: rule__CrossValidation__Group__3__Impl : ( ( rule__CrossValidation__NumberAssignment_3 ) ) ;
    public final void rule__CrossValidation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2202:1: ( ( ( rule__CrossValidation__NumberAssignment_3 ) ) )
            // InternalMml.g:2203:1: ( ( rule__CrossValidation__NumberAssignment_3 ) )
            {
            // InternalMml.g:2203:1: ( ( rule__CrossValidation__NumberAssignment_3 ) )
            // InternalMml.g:2204:2: ( rule__CrossValidation__NumberAssignment_3 )
            {
             before(grammarAccess.getCrossValidationAccess().getNumberAssignment_3()); 
            // InternalMml.g:2205:2: ( rule__CrossValidation__NumberAssignment_3 )
            // InternalMml.g:2205:3: rule__CrossValidation__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__3__Impl"


    // $ANTLR start "rule__CrossValidation__Group__4"
    // InternalMml.g:2213:1: rule__CrossValidation__Group__4 : rule__CrossValidation__Group__4__Impl ;
    public final void rule__CrossValidation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2217:1: ( rule__CrossValidation__Group__4__Impl )
            // InternalMml.g:2218:2: rule__CrossValidation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__4"


    // $ANTLR start "rule__CrossValidation__Group__4__Impl"
    // InternalMml.g:2224:1: rule__CrossValidation__Group__4__Impl : ( '}' ) ;
    public final void rule__CrossValidation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2228:1: ( ( '}' ) )
            // InternalMml.g:2229:1: ( '}' )
            {
            // InternalMml.g:2229:1: ( '}' )
            // InternalMml.g:2230:2: '}'
            {
             before(grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__Group__4__Impl"


    // $ANTLR start "rule__TrainingTest__Group__0"
    // InternalMml.g:2240:1: rule__TrainingTest__Group__0 : rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 ;
    public final void rule__TrainingTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2244:1: ( rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 )
            // InternalMml.g:2245:2: rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TrainingTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0"


    // $ANTLR start "rule__TrainingTest__Group__0__Impl"
    // InternalMml.g:2252:1: rule__TrainingTest__Group__0__Impl : ( 'TrainingTest' ) ;
    public final void rule__TrainingTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2256:1: ( ( 'TrainingTest' ) )
            // InternalMml.g:2257:1: ( 'TrainingTest' )
            {
            // InternalMml.g:2257:1: ( 'TrainingTest' )
            // InternalMml.g:2258:2: 'TrainingTest'
            {
             before(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0__Impl"


    // $ANTLR start "rule__TrainingTest__Group__1"
    // InternalMml.g:2267:1: rule__TrainingTest__Group__1 : rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 ;
    public final void rule__TrainingTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2271:1: ( rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 )
            // InternalMml.g:2272:2: rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__TrainingTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1"


    // $ANTLR start "rule__TrainingTest__Group__1__Impl"
    // InternalMml.g:2279:1: rule__TrainingTest__Group__1__Impl : ( '{' ) ;
    public final void rule__TrainingTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2283:1: ( ( '{' ) )
            // InternalMml.g:2284:1: ( '{' )
            {
            // InternalMml.g:2284:1: ( '{' )
            // InternalMml.g:2285:2: '{'
            {
             before(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1__Impl"


    // $ANTLR start "rule__TrainingTest__Group__2"
    // InternalMml.g:2294:1: rule__TrainingTest__Group__2 : rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 ;
    public final void rule__TrainingTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2298:1: ( rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3 )
            // InternalMml.g:2299:2: rule__TrainingTest__Group__2__Impl rule__TrainingTest__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TrainingTest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2"


    // $ANTLR start "rule__TrainingTest__Group__2__Impl"
    // InternalMml.g:2306:1: rule__TrainingTest__Group__2__Impl : ( 'percentageTraining' ) ;
    public final void rule__TrainingTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2310:1: ( ( 'percentageTraining' ) )
            // InternalMml.g:2311:1: ( 'percentageTraining' )
            {
            // InternalMml.g:2311:1: ( 'percentageTraining' )
            // InternalMml.g:2312:2: 'percentageTraining'
            {
             before(grammarAccess.getTrainingTestAccess().getPercentageTrainingKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getPercentageTrainingKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2__Impl"


    // $ANTLR start "rule__TrainingTest__Group__3"
    // InternalMml.g:2321:1: rule__TrainingTest__Group__3 : rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 ;
    public final void rule__TrainingTest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2325:1: ( rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4 )
            // InternalMml.g:2326:2: rule__TrainingTest__Group__3__Impl rule__TrainingTest__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__TrainingTest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__3"


    // $ANTLR start "rule__TrainingTest__Group__3__Impl"
    // InternalMml.g:2333:1: rule__TrainingTest__Group__3__Impl : ( ( rule__TrainingTest__NumberAssignment_3 ) ) ;
    public final void rule__TrainingTest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2337:1: ( ( ( rule__TrainingTest__NumberAssignment_3 ) ) )
            // InternalMml.g:2338:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            {
            // InternalMml.g:2338:1: ( ( rule__TrainingTest__NumberAssignment_3 ) )
            // InternalMml.g:2339:2: ( rule__TrainingTest__NumberAssignment_3 )
            {
             before(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 
            // InternalMml.g:2340:2: ( rule__TrainingTest__NumberAssignment_3 )
            // InternalMml.g:2340:3: rule__TrainingTest__NumberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__3__Impl"


    // $ANTLR start "rule__TrainingTest__Group__4"
    // InternalMml.g:2348:1: rule__TrainingTest__Group__4 : rule__TrainingTest__Group__4__Impl ;
    public final void rule__TrainingTest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2352:1: ( rule__TrainingTest__Group__4__Impl )
            // InternalMml.g:2353:2: rule__TrainingTest__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__4"


    // $ANTLR start "rule__TrainingTest__Group__4__Impl"
    // InternalMml.g:2359:1: rule__TrainingTest__Group__4__Impl : ( '}' ) ;
    public final void rule__TrainingTest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2363:1: ( ( '}' ) )
            // InternalMml.g:2364:1: ( '}' )
            {
            // InternalMml.g:2364:1: ( '}' )
            // InternalMml.g:2365:2: '}'
            {
             before(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__4__Impl"


    // $ANTLR start "rule__MMLModel__InputAssignment_0"
    // InternalMml.g:2375:1: rule__MMLModel__InputAssignment_0 : ( ruleDataInput ) ;
    public final void rule__MMLModel__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2379:1: ( ( ruleDataInput ) )
            // InternalMml.g:2380:2: ( ruleDataInput )
            {
            // InternalMml.g:2380:2: ( ruleDataInput )
            // InternalMml.g:2381:3: ruleDataInput
            {
             before(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataInput();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getInputDataInputParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__InputAssignment_0"


    // $ANTLR start "rule__MMLModel__AlgorithmAssignment_1"
    // InternalMml.g:2390:1: rule__MMLModel__AlgorithmAssignment_1 : ( ruleMLChoiceAlgorithm ) ;
    public final void rule__MMLModel__AlgorithmAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2394:1: ( ( ruleMLChoiceAlgorithm ) )
            // InternalMml.g:2395:2: ( ruleMLChoiceAlgorithm )
            {
            // InternalMml.g:2395:2: ( ruleMLChoiceAlgorithm )
            // InternalMml.g:2396:3: ruleMLChoiceAlgorithm
            {
             before(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMLChoiceAlgorithm();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getAlgorithmMLChoiceAlgorithmParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__AlgorithmAssignment_1"


    // $ANTLR start "rule__MMLModel__FormulaAssignment_2"
    // InternalMml.g:2405:1: rule__MMLModel__FormulaAssignment_2 : ( ruleRFormula ) ;
    public final void rule__MMLModel__FormulaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2409:1: ( ( ruleRFormula ) )
            // InternalMml.g:2410:2: ( ruleRFormula )
            {
            // InternalMml.g:2410:2: ( ruleRFormula )
            // InternalMml.g:2411:3: ruleRFormula
            {
             before(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRFormula();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getFormulaRFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__FormulaAssignment_2"


    // $ANTLR start "rule__MMLModel__ValidationAssignment_3"
    // InternalMml.g:2420:1: rule__MMLModel__ValidationAssignment_3 : ( ruleValidation ) ;
    public final void rule__MMLModel__ValidationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2424:1: ( ( ruleValidation ) )
            // InternalMml.g:2425:2: ( ruleValidation )
            {
            // InternalMml.g:2425:2: ( ruleValidation )
            // InternalMml.g:2426:3: ruleValidation
            {
             before(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValidation();

            state._fsp--;

             after(grammarAccess.getMMLModelAccess().getValidationValidationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MMLModel__ValidationAssignment_3"


    // $ANTLR start "rule__DataInput__FilelocationAssignment_1"
    // InternalMml.g:2435:1: rule__DataInput__FilelocationAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataInput__FilelocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2439:1: ( ( RULE_STRING ) )
            // InternalMml.g:2440:2: ( RULE_STRING )
            {
            // InternalMml.g:2440:2: ( RULE_STRING )
            // InternalMml.g:2441:3: RULE_STRING
            {
             before(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataInputAccess().getFilelocationSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__FilelocationAssignment_1"


    // $ANTLR start "rule__DataInput__ParsingInstructionAssignment_2"
    // InternalMml.g:2450:1: rule__DataInput__ParsingInstructionAssignment_2 : ( ruleCSVParsingConfiguration ) ;
    public final void rule__DataInput__ParsingInstructionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2454:1: ( ( ruleCSVParsingConfiguration ) )
            // InternalMml.g:2455:2: ( ruleCSVParsingConfiguration )
            {
            // InternalMml.g:2455:2: ( ruleCSVParsingConfiguration )
            // InternalMml.g:2456:3: ruleCSVParsingConfiguration
            {
             before(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getDataInputAccess().getParsingInstructionCSVParsingConfigurationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataInput__ParsingInstructionAssignment_2"


    // $ANTLR start "rule__CSVParsingConfiguration__SepAssignment_1"
    // InternalMml.g:2465:1: rule__CSVParsingConfiguration__SepAssignment_1 : ( ruleCSVSeparator ) ;
    public final void rule__CSVParsingConfiguration__SepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2469:1: ( ( ruleCSVSeparator ) )
            // InternalMml.g:2470:2: ( ruleCSVSeparator )
            {
            // InternalMml.g:2470:2: ( ruleCSVSeparator )
            // InternalMml.g:2471:3: ruleCSVSeparator
            {
             before(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCSVSeparator();

            state._fsp--;

             after(grammarAccess.getCSVParsingConfigurationAccess().getSepCSVSeparatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVParsingConfiguration__SepAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__FrameworkAssignment_1"
    // InternalMml.g:2480:1: rule__MLChoiceAlgorithm__FrameworkAssignment_1 : ( ruleFrameworkLang ) ;
    public final void rule__MLChoiceAlgorithm__FrameworkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2484:1: ( ( ruleFrameworkLang ) )
            // InternalMml.g:2485:2: ( ruleFrameworkLang )
            {
            // InternalMml.g:2485:2: ( ruleFrameworkLang )
            // InternalMml.g:2486:3: ruleFrameworkLang
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrameworkLang();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getFrameworkFrameworkLangEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__FrameworkAssignment_1"


    // $ANTLR start "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"
    // InternalMml.g:2495:1: rule__MLChoiceAlgorithm__AlgorithmAssignment_3 : ( ruleMLAlgorithm ) ;
    public final void rule__MLChoiceAlgorithm__AlgorithmAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2499:1: ( ( ruleMLAlgorithm ) )
            // InternalMml.g:2500:2: ( ruleMLAlgorithm )
            {
            // InternalMml.g:2500:2: ( ruleMLAlgorithm )
            // InternalMml.g:2501:3: ruleMLAlgorithm
            {
             before(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMLAlgorithm();

            state._fsp--;

             after(grammarAccess.getMLChoiceAlgorithmAccess().getAlgorithmMLAlgorithmParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MLChoiceAlgorithm__AlgorithmAssignment_3"


    // $ANTLR start "rule__SVR__CAssignment_2_1"
    // InternalMml.g:2510:1: rule__SVR__CAssignment_2_1 : ( ruleFLOAT ) ;
    public final void rule__SVR__CAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2514:1: ( ( ruleFLOAT ) )
            // InternalMml.g:2515:2: ( ruleFLOAT )
            {
            // InternalMml.g:2515:2: ( ruleFLOAT )
            // InternalMml.g:2516:3: ruleFLOAT
            {
             before(grammarAccess.getSVRAccess().getCFLOATParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSVRAccess().getCFLOATParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__CAssignment_2_1"


    // $ANTLR start "rule__SVR__KernelAssignment_3_1"
    // InternalMml.g:2525:1: rule__SVR__KernelAssignment_3_1 : ( ruleSVMKernel ) ;
    public final void rule__SVR__KernelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2529:1: ( ( ruleSVMKernel ) )
            // InternalMml.g:2530:2: ( ruleSVMKernel )
            {
            // InternalMml.g:2530:2: ( ruleSVMKernel )
            // InternalMml.g:2531:3: ruleSVMKernel
            {
             before(grammarAccess.getSVRAccess().getKernelSVMKernelEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSVMKernel();

            state._fsp--;

             after(grammarAccess.getSVRAccess().getKernelSVMKernelEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVR__KernelAssignment_3_1"


    // $ANTLR start "rule__DT__Max_depthAssignment_2"
    // InternalMml.g:2540:1: rule__DT__Max_depthAssignment_2 : ( RULE_INT ) ;
    public final void rule__DT__Max_depthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2544:1: ( ( RULE_INT ) )
            // InternalMml.g:2545:2: ( RULE_INT )
            {
            // InternalMml.g:2545:2: ( RULE_INT )
            // InternalMml.g:2546:3: RULE_INT
            {
             before(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDTAccess().getMax_depthINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DT__Max_depthAssignment_2"


    // $ANTLR start "rule__RFormula__PredictiveAssignment_1_0"
    // InternalMml.g:2555:1: rule__RFormula__PredictiveAssignment_1_0 : ( ruleFormulaItem ) ;
    public final void rule__RFormula__PredictiveAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2559:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2560:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2560:2: ( ruleFormulaItem )
            // InternalMml.g:2561:3: ruleFormulaItem
            {
             before(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictiveFormulaItemParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__PredictiveAssignment_1_0"


    // $ANTLR start "rule__RFormula__PredictorsAssignment_2"
    // InternalMml.g:2570:1: rule__RFormula__PredictorsAssignment_2 : ( ruleXFormula ) ;
    public final void rule__RFormula__PredictorsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2574:1: ( ( ruleXFormula ) )
            // InternalMml.g:2575:2: ( ruleXFormula )
            {
            // InternalMml.g:2575:2: ( ruleXFormula )
            // InternalMml.g:2576:3: ruleXFormula
            {
             before(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXFormula();

            state._fsp--;

             after(grammarAccess.getRFormulaAccess().getPredictorsXFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RFormula__PredictorsAssignment_2"


    // $ANTLR start "rule__AllVariables__AllAssignment"
    // InternalMml.g:2585:1: rule__AllVariables__AllAssignment : ( ( '.' ) ) ;
    public final void rule__AllVariables__AllAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2589:1: ( ( ( '.' ) ) )
            // InternalMml.g:2590:2: ( ( '.' ) )
            {
            // InternalMml.g:2590:2: ( ( '.' ) )
            // InternalMml.g:2591:3: ( '.' )
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 
            // InternalMml.g:2592:3: ( '.' )
            // InternalMml.g:2593:4: '.'
            {
             before(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 

            }

             after(grammarAccess.getAllVariablesAccess().getAllFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllVariables__AllAssignment"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_0"
    // InternalMml.g:2604:1: rule__PredictorVariables__VarsAssignment_0 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2608:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2609:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2609:2: ( ruleFormulaItem )
            // InternalMml.g:2610:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_0"


    // $ANTLR start "rule__PredictorVariables__VarsAssignment_1_1"
    // InternalMml.g:2619:1: rule__PredictorVariables__VarsAssignment_1_1 : ( ruleFormulaItem ) ;
    public final void rule__PredictorVariables__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2623:1: ( ( ruleFormulaItem ) )
            // InternalMml.g:2624:2: ( ruleFormulaItem )
            {
            // InternalMml.g:2624:2: ( ruleFormulaItem )
            // InternalMml.g:2625:3: ruleFormulaItem
            {
             before(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getPredictorVariablesAccess().getVarsFormulaItemParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictorVariables__VarsAssignment_1_1"


    // $ANTLR start "rule__FormulaItem__ColumnAssignment_0"
    // InternalMml.g:2634:1: rule__FormulaItem__ColumnAssignment_0 : ( RULE_INT ) ;
    public final void rule__FormulaItem__ColumnAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2638:1: ( ( RULE_INT ) )
            // InternalMml.g:2639:2: ( RULE_INT )
            {
            // InternalMml.g:2639:2: ( RULE_INT )
            // InternalMml.g:2640:3: RULE_INT
            {
             before(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColumnINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__ColumnAssignment_0"


    // $ANTLR start "rule__FormulaItem__ColNameAssignment_1"
    // InternalMml.g:2649:1: rule__FormulaItem__ColNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FormulaItem__ColNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2653:1: ( ( RULE_STRING ) )
            // InternalMml.g:2654:2: ( RULE_STRING )
            {
            // InternalMml.g:2654:2: ( RULE_STRING )
            // InternalMml.g:2655:3: RULE_STRING
            {
             before(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormulaItemAccess().getColNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaItem__ColNameAssignment_1"


    // $ANTLR start "rule__Validation__StratificationAssignment_0"
    // InternalMml.g:2664:1: rule__Validation__StratificationAssignment_0 : ( ruleStratificationMethod ) ;
    public final void rule__Validation__StratificationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2668:1: ( ( ruleStratificationMethod ) )
            // InternalMml.g:2669:2: ( ruleStratificationMethod )
            {
            // InternalMml.g:2669:2: ( ruleStratificationMethod )
            // InternalMml.g:2670:3: ruleStratificationMethod
            {
             before(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStratificationMethod();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getStratificationStratificationMethodParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__StratificationAssignment_0"


    // $ANTLR start "rule__Validation__MetricAssignment_1"
    // InternalMml.g:2679:1: rule__Validation__MetricAssignment_1 : ( ruleValidationMetric ) ;
    public final void rule__Validation__MetricAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2683:1: ( ( ruleValidationMetric ) )
            // InternalMml.g:2684:2: ( ruleValidationMetric )
            {
            // InternalMml.g:2684:2: ( ruleValidationMetric )
            // InternalMml.g:2685:3: ruleValidationMetric
            {
             before(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidationMetric();

            state._fsp--;

             after(grammarAccess.getValidationAccess().getMetricValidationMetricEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Validation__MetricAssignment_1"


    // $ANTLR start "rule__CrossValidation__NumberAssignment_3"
    // InternalMml.g:2694:1: rule__CrossValidation__NumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__CrossValidation__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2698:1: ( ( RULE_INT ) )
            // InternalMml.g:2699:2: ( RULE_INT )
            {
            // InternalMml.g:2699:2: ( RULE_INT )
            // InternalMml.g:2700:3: RULE_INT
            {
             before(grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getNumberINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__NumberAssignment_3"


    // $ANTLR start "rule__TrainingTest__NumberAssignment_3"
    // InternalMml.g:2709:1: rule__TrainingTest__NumberAssignment_3 : ( RULE_INT ) ;
    public final void rule__TrainingTest__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMml.g:2713:1: ( ( RULE_INT ) )
            // InternalMml.g:2714:2: ( RULE_INT )
            {
            // InternalMml.g:2714:2: ( RULE_INT )
            // InternalMml.g:2715:3: RULE_INT
            {
             before(grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getNumberINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__NumberAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000448000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000080007F800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});

}