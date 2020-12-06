package array_sort;

public class StringArray {

	public static void main(String[] args) {
		//String 객체의 주소 3개를 저장할 수 있는 배열을 생성
		String [] names = new String[5];
		//데이터 대입
		names[0] = "데니스 리치히";
		names[1] = "제임스 고슬링";
		names[2] = "귀도 반 로섬";
		names[3] = "아네르스 하일스베르";
		names[4] = "애플";
		//모든 데이터 출력
		int size = names.length;
		for(int i=0; i<size; i++){
			System.out.println(names[i]);
		}
	}
}


