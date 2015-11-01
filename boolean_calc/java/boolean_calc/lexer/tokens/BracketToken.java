package boolean_calc.lexer.tokens;



public class BracketToken extends Token {

	public enum Bracket { LEFT, RIGHT };

	public BracketToken(Bracket bracket) {
		super(bracket);
	}

}
