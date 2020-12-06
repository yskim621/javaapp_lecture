package usefulapi;

import java.text.*;

public class NumberFormat {
	public static void main(String[] args) {
		double number  = 1234567.89;
		String[] pattern = {
			"0000000000.0000",
			"##########.####",
			"#,###.##",
			"#,####.##",
			"#,###.##+;#,###.##-",
			"#.#%",
			"\u00A4 #,###",
		};
		for(int i=0; i < pattern.length; i++) {
		    DecimalFormat df = new DecimalFormat(pattern[i]);
		    System.out.printf("%19s : %s\n",pattern[i], df.format(number));
		}
	}
}

