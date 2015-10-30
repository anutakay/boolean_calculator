package boolean_calc;

import java.util.ArrayList;
import java.util.List;

public class ParserResult {

	List<String> tokens;
	
	List<String> errors;
	
	public ParserResult() {
		tokens = new ArrayList<String>();
		errors = new ArrayList<String>();
	}

	public List<String> getTokens() {
		return tokens;
	}

	public List<String> getErrors() {
		return errors;
	}
	
}
