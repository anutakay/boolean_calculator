package boolean_calc.lexer;

import boolean_calc.lexer.tokens.Token;


public class OperatorToken extends Token {
	
	enum Operator { NOT, AND, OR }

	public OperatorToken(Operator operator) {
		super(operator);
	}

}
