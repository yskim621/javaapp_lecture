package operator;

public class Bit
{ 
      public static void main(String[] args) 
      { 
            int x = 3;  //011
            int y = 5;  //101
            System.out.println("x는 " + x + "이고, y는 " + y +"일 때, "); 
            //011 | 101 = 111
            System.out.println("x | y = " + (x|y)); 
            //011 & 101 = 001
            System.out.println("x & y = " + (x&y)); 
            //011 ^ 101 = 110
            System.out.println("x ^ y = " + (x^y));
            //~011 -> ~100
            System.out.println("~x  = " + ~x);

            System.out.println("true | false = " + (true|false)); 
            System.out.println("true & false = " + (true&false)); 
            System.out.println("true ^ false = " + (true^false)); 
      } 
}

