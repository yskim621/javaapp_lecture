package practice.chap04;

//완전수 개수 구하기
public class PerfectSu {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i=2; i<=1000; i=i+1) {
			int sum = 0;
			for(int j=1; j<i-1; j=j+1) {
				if(i%j == 0) {
					sum = sum + j;
				}
			}
			if(i == sum) {
				//System.out.println(i);
				cnt = cnt + 1;
			}
		}
		System.out.println("완전수 개수:" + cnt);

	}

}
