package boolean_calc;

public class Preparator {

	public String[] prepare(String source) {
		String withSpaces = addSpaces(source);
		String[] res = withSpaces.split(" ");
		return res;
	} 
	
	private String addSpaces(String source) {
		String res = source.replace("(", " ( ");
		res = res.replace(")", " ) ");
		return res;
	}

}
