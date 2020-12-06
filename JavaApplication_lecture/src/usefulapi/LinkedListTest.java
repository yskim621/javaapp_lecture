package usefulapi;

import java.util.*;

class LinkedListTest
{
	public static void main(String[] args) 
	{
		String[] item = {"강남","이대","종로"};
		LinkedList<String> q = new LinkedList<String>();
		for(String n : item)
			q.add(n);
		System.out.println("q의 크기:"+q.size());
		String data="";
		while((data = q.poll()) != null)
			System.out.println(data+"삭제!");
		System.out.println("q의 크기:"+q.size());
	}
}
