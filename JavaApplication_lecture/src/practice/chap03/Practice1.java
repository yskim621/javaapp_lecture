package practice.chap03;

//swap 처리하기
public class Practice1 {

	public static void main(String[] args) {
		int coke = 1000;
		int cider = 800;
		
		//이부분에 코드를 작성해서 coke 와 cider의 값을 변경해보세요
		int temp = coke;
		coke = cider;
		cider = temp;
		
		System.out.println("콜라는 " + coke + "원 사이다는 " + cider + "원");
	}
}
