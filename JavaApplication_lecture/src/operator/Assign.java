package operator;

public class Assign
{ 
      public static void main(String[] args) 
      { 
        int add,sub,mul, div;
		add = sub = mul = div =10;
		//add = add + 10
		add +=10;
		sub -=10;
		mul *=10;
		div /=10;
		System.out.println("add:" + add);
		System.out.println("sub:" + sub);
		System.out.println("mul:" + mul);
		System.out.println("div:" + div);
      } 
}
