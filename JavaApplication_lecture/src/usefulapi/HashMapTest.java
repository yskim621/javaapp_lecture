package usefulapi;

import java.util.*;
class HashMapTest
{
	public static void main(String[] args) 
	{
		String[] msg = {"서울","부산",null, "목포","제주"};
		HashMap<Integer, String> map =  new HashMap<Integer,String>();
		for(int i=0 ; i<msg.length ; i++)
		{
			map.put(i,msg[i]);//맵에 저장
		}
		for(int i=0; i<map.size(); i++)
		{
			Integer n = i;
			System.out.println(map.get(n)); 
		}
	}
}
