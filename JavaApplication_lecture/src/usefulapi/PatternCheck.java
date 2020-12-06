package usefulapi;

import java.util.regex.Pattern;

public class PatternCheck {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^a.c$");
		String[] strArr = { "abc", "acc", "adc", "aec", "afc", "agc", "ahc", "aiic" };
		for (String str : strArr) {
			System.out.println("[" + str + "] : " + p.matcher(str).find());
		}
	}
}
