package boolean_calc;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParserTest {
	
	@Test
	public void result_not_null_test() {
		Parser parser = new Parser();
		assertNotEquals(null, parser.parse(""));
	}
	
}
