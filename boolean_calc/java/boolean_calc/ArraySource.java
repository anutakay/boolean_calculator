package boolean_calc;

public class ArraySource implements Source {
	
	private String[] strings;
	
	private int counter = 0;
	
	public ArraySource(String[] strings) {
		this.strings = strings;
	}

	@Override
	public String next() {
		if(counter < strings.length) {
			String result = strings[counter];
			counter++;
			return result;
		}
		return null;
	}

}
