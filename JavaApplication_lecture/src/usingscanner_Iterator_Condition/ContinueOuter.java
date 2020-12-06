package usingscanner_Iterator_Condition;

public class ContinueOuter {
	public static void main(String[] args) {
		outLoop: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i:" + i + "-j:" + j);
				if (j == 2) {
					continue outLoop;
				}
			}
		}
	}
}

