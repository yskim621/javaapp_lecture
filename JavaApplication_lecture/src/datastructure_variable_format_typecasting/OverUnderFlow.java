package datastructure_variable_format_typecasting;

class OverUnderFlow {
	public static void main(String args[]) {
		// int 가 저장할 수 있는 최대값을 저장
		int num1 = 2147483647;
		// 최대값보다 1이 더 큰 수를 강제 형 변환을 통해서 저장
		int num2 = (int) 2147483648L;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		System.out.println("==========================================");
		// int가 저장할 수 있는 최소값을 저장
		num1 = -2147483648;
		// 최소값보다 1이 더 작은 수를 강제 형 변환을 통해서 저장
		num2 = (int) -2147483649L;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}