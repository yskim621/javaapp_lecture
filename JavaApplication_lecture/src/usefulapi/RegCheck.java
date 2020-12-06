package usefulapi;

public class RegCheck {
	public static void main(String[] args) {
		String regExpStr = "^a.c$";
		String[] strArr = { "abc", "acc", "adc", "aec", "afc", "agc", "ahc", "aiic" };
		for (String str : strArr) {
			System.out.println("[" + str + "] : " + str.matches(regExpStr));
		}
	}
}

