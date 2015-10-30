package boolean_calc;

public class Parser {
	
	public Parser() {}
	
	public ParserResult parse(String sourse) {
		ParserResult result = new ParserResult();
		
		result.addToken(new BooleanToken(sourse));
		return result;
	}
}
