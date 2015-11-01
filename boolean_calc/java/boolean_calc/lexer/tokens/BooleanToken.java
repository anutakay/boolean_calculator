package boolean_calc.lexer.tokens;



public class BooleanToken extends Token {

	private BooleanToken(Object token) {
		super(token);
	}

	public BooleanToken(boolean b) {
		this(new Boolean(b));
	}

}
