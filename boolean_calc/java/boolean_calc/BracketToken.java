package boolean_calc;

public class BracketToken extends Token {

	enum Bracket { LEFT, RIGHT };

	public BracketToken(Bracket bracket) {
		super(bracket);
	}

}
