package boolean_calc.lexer;

import boolean_calc.lexer.tokens.Token;


public class LexicalAnalyzer {
	
	private LexicalResult result;
	
	private Preparator preparator = new Preparator();
	
	public LexicalAnalyzer() {}
	
	public LexicalResult analize(Source source) {
		clearResult();
		String str = source.next();
		while(str != null) {
			parseString(str);
			str = source.next();
		}
		return result;
	}
	
	public LexicalResult analize(String source) {
		clearResult();
		parseString(source);
		return result;
	}
	
	private void clearResult() {
		result = new LexicalResult();
	}
	
	private void parseString(String source) {
		String[] strings = preparator.prepare(source);
		makeTokens(strings);
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
