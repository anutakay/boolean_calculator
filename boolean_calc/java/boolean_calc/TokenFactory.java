package boolean_calc;

public class TokenFactory {

	public Token createToken(String token) throws Exception {
		if(token.equals("0")) {
			return new BooleanToken("0");
		} 
		else if(token.equals("1")) {
			return new BooleanToken("1");
		}
		else throw new Exception();
	}

}
