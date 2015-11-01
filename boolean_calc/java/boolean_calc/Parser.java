package boolean_calc;

public class Parser {
	
	public Parser() {}
	
	public ParserResult parse(String sourse) {
		String[] strings = sourse.split(" ");
		
		ParserResult result = new ParserResult();
		TokenFactory factory = new TokenFactory();
		for(int i = 0; i < strings.length; i++)
		{ 
			Token token = null; 
			try {
				token = factory.createToken(strings[i]);
				result.addToken(token);
			} catch (Exception e) {
			}
		}
		return result;
	}
}
