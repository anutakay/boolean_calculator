package boolean_calc.parser;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import boolean_calc.lexer.tokens.Token;
import boolean_calc.lexer.tokens.VariableToken;
import boolean_calc.parser.AndExpression;

public class AndExpressionTest {
	
	@Test
	public void create_test() {
		AndExpression expression = new AndExpression();
	}
	
	@Test
	public void simple_test() {
		List<Token> tokens = new ArrayList<Token>();
		tokens.add(new VariableToken("x"));
		AndExpression actuals = new AndExpression();
		actuals.parse(tokens);
		AndExpression expecteds = new AndExpression();
		expecteds.tokens.add(new VariableToken("x"));
		assertEquals(expecteds.tokens, actuals.tokens);
	}

}
