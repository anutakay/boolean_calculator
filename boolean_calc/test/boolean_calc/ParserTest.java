package boolean_calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParserTest {
	
	@Test
	public void result_not_null_test() {
		Parser parser = new Parser();
		ParserResult result = parser.parse("");
		assertNotEquals(null, result);
	}
	
	@Test
	public void one_test() {
		Parser parser = new Parser();
		ParserResult result = parser.parse("1");
		
		Token[] actuals = new Token[result.tokens.size()];
		actuals = result.tokens.toArray(actuals);
		
		Token[] expecteds = {new BooleanToken("1")};
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void zero_test() {
		Parser parser = new Parser();
		ParserResult result = parser.parse("0");
		
		Token[] actuals = new Token[result.tokens.size()];
		actuals = result.tokens.toArray(actuals);
		
		Token[] expecteds = {new BooleanToken("0")};
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void two_test() {
		Parser parser = new Parser();
		ParserResult result = parser.parse("2");
		
		Token[] actuals = new Token[result.tokens.size()];
		actuals = result.tokens.toArray(actuals);
		
		Token[] expecteds = {};
		assertArrayEquals(expecteds, actuals);
	}
	
}
