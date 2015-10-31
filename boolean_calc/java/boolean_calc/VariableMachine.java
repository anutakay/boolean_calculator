package boolean_calc;

public class VariableMachine {

	public Token getToken(String token) throws Exception {
		char[] array = token.toCharArray();
		char ch = array[0];
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
			return new VariableToken(token);
		}
		throw new Exception();
	}

}
