package boolean_calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TokenFactoryTest {
	
	@Test
	public void create_test() {
		TokenFactory factory = new TokenFactory();
	} 
	
	@Test
	public void create_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("0");
		assertNotEquals(null, token);
	}
	
	@Test
	public void zero_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("0");
		Token zeroToken = new BooleanToken(false);
		assertEquals(zeroToken, token);
	}
	
	@Test
	public void one_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("1");
		Token oneToken = new BooleanToken(true);
		assertEquals(oneToken, token);
	}
	
	@Test
	public void no_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("not");
		Token noToken = new OperatorToken(OperatorToken.Operator.NOT);
		assertEquals(noToken, token);
	}
	
	@Test
	public void and_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("and");
		Token noToken = new OperatorToken(OperatorToken.Operator.AND);
		assertEquals(noToken, token);
	}
	
	@Test
	public void or_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("or");
		Token noToken = new OperatorToken(OperatorToken.Operator.OR);
		assertEquals(noToken, token);
	}
	
	@Test
	public void open_bracket_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("(");
		Token noToken = new BracketToken(BracketToken.Bracket.LEFT);
		assertEquals(noToken, token);
	}
	
	@Test
	public void close_bracket_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken(")");
		Token noToken = new BracketToken(BracketToken.Bracket.RIGHT);
		assertEquals(noToken, token);
	}

}
