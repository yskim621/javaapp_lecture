package usefulapi;

import java.util.*;
class TestStack 
{
	public static void main(String args[])
	{
		Stack <String> stack=new Stack<String>();
		stack.push("1");
		stack.push("2");
		System.out.println("Top이 가리키는 데이터:" + stack.pop());
		System.out.println("Top이 가리키는 데이터:" + stack.pop());

		stack.push("1");
		stack.push("2");
		System.out.println("Top이 가리키는 데이터:" + stack.peek());
		System.out.println("Top이 가리키는 데이터:" + stack.peek());

		System.out.println("검색하고자 하는 데이터가 있는 위치:" + stack.search("1"));
		System.out.println("검색하고자 하는 데이터가 있는 위치:" + stack.search("3"));
	}
}

