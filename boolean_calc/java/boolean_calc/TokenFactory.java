package boolean_calc;

public class TokenFactory {

	public Token createToken(String token) throws Exception {
		if(token.equals("0")) {
			return new BooleanToken(false);
		} 
		else if(token.equals("1")) {
			return new BooleanToken(true);
		} 
		else if(token.equals("not")) {
			return new OperatorToken("not");
		}
		else if(token.equals("and")) {
			return new OperatorToken("and");
		}
		else if(token.equals("or")) {
			return new OperatorToken("or");
		}
		else if(token.equals("(")) {
			return new BracketToken("(");
		}
		else if(token.equals(")")) {
			return new BracketToken(")");
		}
		else throw new Exception();
	}

}
