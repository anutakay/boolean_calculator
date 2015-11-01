package boolean_calc;

public class Parser {
	
	public Parser() {}
	
	public ParserResult parse(String source) {
		String[] strings = prepareStrings(source);
		TokenFactory factory = new TokenFactory();
		ParserResult result = new ParserResult();
		
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
	
	private String[] prepareStrings(String source) {
		String withSpaces = addSpaces(source);
		String[] result = withSpaces.split(" ");
		return result;
	} 
	
	private String addSpaces(String source) {
		String result = source.replace("(", " ( ");
		result = result.replace(")", " ) ");
		return result;
	}
}
