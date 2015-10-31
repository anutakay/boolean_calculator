package boolean_calc;

public class OperatorToken extends Token {
	
	enum Operator { NOT, AND, OR }

	public OperatorToken(Operator operator) {
		super(operator);
	}

}
