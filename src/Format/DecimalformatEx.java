package Format;

import java.text.DecimalFormat;

public class DecimalformatEx {

	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df;
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));

	}

}
