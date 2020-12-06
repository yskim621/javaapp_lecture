package usingscanner_Iterator_Condition;

public class BreakOuter {
	public static void main(String[] args) {
		outLoop: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + "-j:" + j);
				if (i == 1 && j == 2) {
			//break는 기본적으로 가까운 반복문을 빠져나가지만 break 다음에 레이블을
			//사용하면 레이블에 해당하는 반복문을 빠져 나갑니다.
					break outLoop;
				}
			}
		}
	}
}
