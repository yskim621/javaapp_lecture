package usingscanner_Iterator_Condition;

public class Switching {
	public static void main(String args[]) {
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			if (flag == false) {
				System.out.println("On");
			} else {
				System.out.println("Off");
			}
			flag = !flag;
		}
	}
}
