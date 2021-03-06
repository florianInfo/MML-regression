/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMmlParser;
import org.xtext.example.mydsl.services.MmlGrammarAccess;

public class MmlParser extends AbstractAntlrParser {

	@Inject
	private MmlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMmlParser createParser(XtextTokenStream stream) {
		return new InternalMmlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MMLModel";
	}

	public MmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
