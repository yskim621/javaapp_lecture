package operator;

public class Shift {
	public static void main(String args[]) {
		// Integer.toBinaryString은 매개변수를 2진 문자열로 변경해주는 메소드 입니다.
		
		int temp; // 계산 결과를 담기 위한 변수
		
		System.out.println(8);
		System.out.println(Integer.toBinaryString(8));
		//2번 왼쪽으로 shift 하면 4배가 되서 32
		temp = 8 << 2;
		System.out.println("8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		//28번을 밀면 1이 맨 앞으로 이동을 하게 되서 음수가 됩니다.
		temp = 8 << 28;
		System.out.println("8 << 28 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		
		
		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));
		
		temp = -8 << 2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));

		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));

		//오른쪽으로 shift 하면 첫번째 비트가 맨 앞에 추가됩니다.
		temp = -8 >> 2;
		System.out.println("-8 >> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));

		System.out.println(-8);
		System.out.println(Integer.toBinaryString(-8));

		//>>>은 무조건 0이 맨 앞에 추가되므로 음수를 가지고 하게 되면 양수로 변경됩니다.
		temp = -8 >>> 2;
		System.out.println("-8 >>> 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));

		//33번 shift 인 경우 34가 32보다 크거나 같으므로 32로 나눈 나머지인 2번만 수행
		temp = 4 << 34;
		System.out.println("4 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
	}
}


