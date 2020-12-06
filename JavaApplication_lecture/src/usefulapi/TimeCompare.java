package usefulapi;

import java.util.*;

class TimeCompare
{
	public static void main(String[] args) 
	{
		int i;
		long start, end;
		Vector <String> vec = new Vector<String>();
		vec.add("1");
		vec.add("3");
		vec.add("4");
		start = System.nanoTime();
		for(i=0; i<100000; i++)
		{
			vec.add(2, "2");
		}
		end = System.nanoTime();
		
		System.out.println("벡터에 십만개의 데이터를 2번째에 삽입하는데 걸리는 시간:" + (end-start)/1000000000.0 + "초");
		LinkedList <String> li = new LinkedList<String>();
		li.add("1");
		li.add("3");
		li.add("4");
		start = System.nanoTime();
		for(i=0; i<100000; i++)
		{
			li.add(2, "2");
		}
		end = System.nanoTime();
		System.out.println("리스트에 십만개의 데이터를 2번째에 삽입하는데 걸리는 시간:" + (end-start)/1000000000.0 + "초");
	}
}


