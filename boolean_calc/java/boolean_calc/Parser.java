package boolean_calc;

public class Parser {
	
	private ParserResult result;
	
	public Parser() {}
	
	public ParserResult parse(Source source) {
		clearResult();
		String str = source.next();
		while(str != null) {
			parseString(str);
			str = source.next();
		}
		return result;
	}
	
	public ParserResult parse(String source) {
		clearResult();
		parseString(source);
		return result;
	}
	
	private void clearResult() {
		result = new ParserResult();
	}
	
	private void parseString(String source) {
		String[] strings = prepareStrings(source);
		makeTokens(strings);
	}
		
	private String[] prepareStrings(String source) {
		String withSpaces = addSpaces(source);
		String[] res = withSpaces.split(" ");
		return res;
	} 
	
	private String addSpaces(String source) {
		String res = source.replace("(", " ( ");
		res = res.replace(")", " ) ");
		return res;
	}
	
	private void makeTokens(String[] strings) {
		for(int i = 0; i < strings.length; i++)
		{ 
			String str = strings[i];
			makeToken(str);
		}
	}

	private void makeToken(String str) {
		try {
			TokenFactory factory = new TokenFactory();
			Token token = factory.createToken(str);
			result.addToken(token);
		} catch (Exception e) {
			result.addError("Синтаксическая ошибка");
		}
	}

}
