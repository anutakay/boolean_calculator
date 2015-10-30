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
		Token zeroToken = new BooleanToken("0");
		assertEquals(zeroToken, token);
	}
	
	@Test
	public void one_token_test() throws Exception {
		TokenFactory factory = new TokenFactory();
		Token token = factory.createToken("1");
		Token zeroToken = new BooleanToken("1");
		assertEquals(zeroToken, token);
	}

}
