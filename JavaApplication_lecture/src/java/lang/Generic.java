package java.lang;

public class Generic <T>
{
	private T data[]; 
	public Generic(T...n){
		data = n;
	}
	public void disp(){
		for(T i : data){
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Generic <String> Obj1 = new Generic <String>("Hello", "Java");
		Generic <String> Obj2 = new Generic <String>("Hello", "Java", "Test");
		Generic <Integer> Obj3 = new Generic <Integer>(1,2,3);
		Obj1.disp();		
		Obj2.disp();		
		Obj3.disp();		
	}
}
