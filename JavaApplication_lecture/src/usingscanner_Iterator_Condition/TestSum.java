package usingscanner_Iterator_Condition;

public class TestSum {
	public static void main(String[] args) {
		//1부터 10까지의 합 구하기
		int i;
		int sum = 0;
		for(i=1; i<= 10; i=i+1){
			sum = sum + i;
		}
		System.out.println("합계:" + sum);
		
		sum = 0;
		for(i=1; i<= 10; sum=sum+i, i=i+1);
		System.out.println("합계:" + sum);
	}
}
