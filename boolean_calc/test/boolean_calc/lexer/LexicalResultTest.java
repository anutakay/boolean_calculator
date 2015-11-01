package boolean_calc.lexer;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import boolean_calc.lexer.tokens.Token;

public class LexicalResultTest {

	@Test
	public void tokens_not_null_test() {
		LexicalResult result = new LexicalResult();
		assertNotEquals(null, result.getTokens());
	}
	
	@Test
	public void errors_not_null_test() {
		LexicalResult result = new LexicalResult();
		assertNotEquals(null, result.getErrors());
	}
	
	@Test
	public void add_token_test() {
		LexicalResult result = new LexicalResult();
		result.addToken(new Token("1"));
	}
	
}
