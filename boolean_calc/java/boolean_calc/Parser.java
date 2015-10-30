package boolean_calc;

public class Parser {
	
	public Parser() {}
	
	public ParserResult parse(String sourse) {
		ParserResult result = new ParserResult();
		TokenFactory factory = new TokenFactory();
		Token token = null; 
		try {
			token = factory.createToken(sourse);
			result.addToken(token);
		} catch (Exception e) {
		}	
		return result;
	}
}
