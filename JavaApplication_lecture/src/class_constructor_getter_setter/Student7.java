package class_constructor_getter_setter;

public class Student7 {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	//매개변수가 없는 생성자를 디폴트 생성자라고 합니다.
	public Student7(){
		System.out.println("디폴트 생성자");
	}
	//생성자 오버로딩 – 매개변수가 있는 생성자를 정의
	public Student7(String n, int n1, int n2, int n3)
	{
		//매개변수가 없는 생성자 호출
		//다른 문장보다 앞에 기재되어야하며 생성자에서만 사용 가능
		//super()가 있는 경우에는 super() 다음에 와야 합니다.
		this();
		name = n;
		kor = n1;
		eng = n2;
		mat = n3;
	}
	
	//접근자 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public double calc() {
		double avg;
		avg = (kor + mat + eng) / 3.0;
		return avg;
	}
	public void disp() {
		System.out.println(name + "의 평균은 " + calc() + "입니다.");
	}
}
