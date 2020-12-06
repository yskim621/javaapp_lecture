package practice.chap10;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (true) {
			System.out.print("4글자 단어를 입력하시오:");
			input = sc.nextLine();
			if(input.length() != 4) {
				System.out.println("4글자로 입력하세요!!!!");
			}else {
				break;
			}
		}
		
		String eros = "eros";
		boolean flag = false;
		for(int i=0; i<4; i=i+1) {
			if(eros.charAt(0) == input.charAt(i)) {
				for(int j=1; j<4; j=j+1) {
					if(eros.charAt(j) != input.charAt((i + j)%4)){
						flag = true;
						break;
					}
				}
			}
		}
		
		if(flag == false) {
			System.out.println("eros 와 " + input + "은 Anagram");
		}else {
			System.out.println("eros 와 " + input + "은 Anagram이 아님");
		}

		sc.close();

	}

}
