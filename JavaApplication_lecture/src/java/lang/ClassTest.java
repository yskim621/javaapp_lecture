package java.lang;

class First
{}

class Second extends First 
{}

public class ClassTest 
{
	public static void main(String args[]) 
	{
		First x = new First();
		Second y = new Second();
		Class<?> cyberclass = x.getClass(); 
		    
		System.out.println("x의 클래스명: " + cyberclass.getName());
		cyberclass =cyberclass.getSuperclass();
		System.out.println("x의 상위 클래스명: " + cyberclass.getName());
		cyberclass = y.getClass(); 
		System.out.println("y의 클래스명: " + cyberclass.getName());
		cyberclass =cyberclass.getSuperclass();
		System.out.println("y의 상위 클래스명: " + cyberclass.getName());
	}
}
