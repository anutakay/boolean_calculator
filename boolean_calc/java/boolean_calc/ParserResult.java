package boolean_calc;

import java.util.ArrayList;
import java.util.List;

public class ParserResult {

	List<Token> tokens;
	
	List<String> errors;
	
	public ParserResult() {
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
	
}
