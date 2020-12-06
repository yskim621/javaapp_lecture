package practice.chap05;

public class InsertionSort {

	public static void main(String[] args) {
		int[] list = {2,5,3,9,1,4 };
		
		for (int i = 1; i < list.length; i=i+1) {
			int standard = list[i];  // 기준
			int j = i-1;
			for( ;j>=0; j=j-1) {
				if(standard >= list[j]) {
					break;
				}
				list[j+1] = list[j];
			}
			list[j + 1] = standard;  // 기준값 저장
			
			System.out.print((i)+"pass:");
			for(int k=0; k<i+1; k++) {
				System.out.print(list[k] + "  ");
			}
			System.out.println();
		}
		
		for(int e : list) {
			System.out.print(e + "  ");
		}

	}

}
