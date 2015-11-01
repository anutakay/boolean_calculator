package boolean_calc.lexer;

import java.util.ArrayList;
import java.util.List;

import boolean_calc.lexer.tokens.Token;

public class LexicalResult {

	List<Token> tokens;
	
	List<String> errors;
	
	public LexicalResult() {
		tokens = new ArrayList<Token>();
		errors = new ArrayList<String>();
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void addToken(Token token) {
		tokens.add(token);
	}

	public void addError(String error) {
		errors.add(error);
	}
	
}
