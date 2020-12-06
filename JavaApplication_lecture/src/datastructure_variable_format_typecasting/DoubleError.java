package datastructure_variable_format_typecasting;

public class DoubleError {
	public static void main(String[] args) {
		double d = 0.1;
		double result = 0.0;

		// 0.1을 천번 더하기
		for (int i = 0; i < 1000; i++) {
			result += d;
		}
		System.out.println("result:" + result);

		// 1을 천번 더한 후 10으로 나누기
		result = 0;
		for (int i = 0; i < 1000; i++) {
			result += (int) (d * 10);
		}
		System.out.println("result:" + (result / 10));
	}
}
