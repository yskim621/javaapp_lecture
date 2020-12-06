package usingscanner_Iterator_Condition;

public class TestFloatSum {
	public static void main(String[] args) {
		//0.1부터 1.0까지의 합 구하기
		double i;
		double sum = 0;
		for(i=0.1f; i<=1.0f; i=i+0.1f){
			sum = sum + i;
		}
		System.out.println("합계:" + sum);
	}
}
