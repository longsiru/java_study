package Format;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";
		String data = "010-9613-9197";
		
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		
		//regExp = "\w+@\w+\.\w+(\.\w+)";

	}

}
