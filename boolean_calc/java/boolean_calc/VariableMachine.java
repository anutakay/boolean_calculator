package boolean_calc;

public class VariableMachine {

	public Token getToken(String token) throws Exception {
		Exception e = null;
		char[] array = token.toCharArray();
		char ch = array[0];
		if (!Character.isLetter(ch)) {
			e = new Exception();
		}
		for(int i = 1; i < array.length; i++) {
			ch = array[i];
			if ((!Character.isLetter(ch))&&(!Character.isDigit(ch))) {
				e = new Exception();
				break;
			}
		}
		if(e == null) {
			return new VariableToken(token);
		} else {
			throw e;
		}
	}

}
