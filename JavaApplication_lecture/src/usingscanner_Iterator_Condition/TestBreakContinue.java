package usingscanner_Iterator_Condition;

public class TestBreakContinue {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			//첫번째 3의 배수를 만나면 반복문 종료
			if (i % 3 == 0) {
				break;
			}
			sum = sum + i;
		}
		System.out.println("Break Sum의 합:" + sum);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			//3의 배수인 경우는 아래 문장을 수행하지 않고 반복문의 최상단으로 이동
			if (i % 3 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println("Continue Sum의 합:" + sum);
	}
}
