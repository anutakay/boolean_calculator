package boolean_calc;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class ParserResultTest {

	@Test
	public void tokens_not_null_test() {
		ParserResult result = new ParserResult();
		assertNotEquals(null, result.getTokens());
	}
	
	@Test
	public void errors_not_null_test() {
		ParserResult result = new ParserResult();
		assertNotEquals(null, result.getErrors());
	}
	
}
