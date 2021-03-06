package boolean_calc.lexer;

import boolean_calc.lexer.tokens.BooleanToken;
import boolean_calc.lexer.tokens.BracketToken;
import boolean_calc.lexer.tokens.Token;

public class TokenFactory {

	public Token createToken(String token) throws Exception {
		if(token.equals("0")) {
			return new BooleanToken(false);
		} 
		else if(token.equals("1")) {
			return new BooleanToken(true);
		} 
		else if(token.equals("not")) {
			return new OperatorToken(OperatorToken.Operator.NOT);
		}
		else if(token.equals("and")) {
			return new OperatorToken(OperatorToken.Operator.AND);
		}
		else if(token.equals("or")) {
			return new OperatorToken(OperatorToken.Operator.OR);
		}
		else if(token.equals("(")) {
			return new BracketToken(BracketToken.Bracket.LEFT);
		}
		else if(token.equals(")")) {
			return new BracketToken(BracketToken.Bracket.RIGHT);
		}
		else {
			VariableMachine machine = new VariableMachine();
			return machine.getToken(token);
		}
	}

}
