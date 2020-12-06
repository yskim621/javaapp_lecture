package practice.chap04;

public class Star {

	public static void main(String[] args) {
		/*
		for (int i = 0; i < 5; i=i+1) {
			for (int j = 0; j <= i; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i = 0; i < 5; i=i+1) {
			for (int j = 0; j < i*2+1; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i = 0; i < 5; i=i+1) {
			for (int j = 0; j < 5-i; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i = 0; i < 5; i=i+1) {
			if(i < 3) {
			for (int j = 0; j < i+1; j=j+1) {
				System.out.print("*");
			}
			}else {
				for (int j = 0; j < 5-i; j=j+1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		for (int i=0; i<5; i=i+1) {
			if (i < 3) {
				for(int j=0; j<2-i; j=j+1) {
					System.out.print(" ");
				}
				for (int j=0; j<i*2 + 1; j=j+1) {
					System.out.print("*");
				}
			} else {
				for(int j=0; j<i-2; j=j+1) {
					System.out.print(" ");
				}
				for (int j=0; j<9-i*2; j=j+1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/

	}
}
