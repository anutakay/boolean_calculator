package boolean_calc.parser;

import java.util.ArrayList;
import java.util.List;

import boolean_calc.lexer.tokens.Token;
import boolean_calc.lexer.tokens.VariableToken;

public class AndExpression {
	
	List<OrExpression> orExpressions;
	
	List<Token> tokens;
	
	public AndExpression() {
		orExpressions = new ArrayList<OrExpression>();
		tokens = new ArrayList<Token>();
	}
	
	public void parse(List<Token> sourse) {
		for(Token t: sourse) {
			if (t.getClass().equals(VariableToken.class)) {
				tokens.add(t);
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((orExpressions == null) ? 0 : orExpressions.hashCode());
		result = prime * result + ((tokens == null) ? 0 : tokens.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AndExpression other = (AndExpression) obj;
		if (orExpressions == null) {
			if (other.orExpressions != null)
				return false;
		} else if (!orExpressions.equals(other.orExpressions))
			return false;
		if (tokens == null) {
			if (other.tokens != null)
				return false;
		} else if (!tokens.equals(other.tokens))
			return false;
		return true;
	}

}
