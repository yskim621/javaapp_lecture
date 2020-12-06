package operator;

public class DoubleProblem {
	public static void main(String[] args) {
		// 실수 연산 - 연산의 결과가 이상
		double d = 0.3;
		double result = 1 - 3 * d;
		System.out.println("결과:" + result);
		
		//정수로 변환한 후 연산
		result = (1 * 10 - (d * 10 * 3)) / 10.0;
		System.out.println("결과:" + result);
		
		int x = 5;
		double y = 0.0;
		//0으로 나누는 것이 에러가 아닐 수도 있음
		double r1 = x / y;
		double r2 = x % y;

		//연산의 결과가 Infinity 나 NaN
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1 + 2);
		
	}
}

		
