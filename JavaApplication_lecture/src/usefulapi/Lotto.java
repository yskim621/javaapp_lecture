package usefulapi;

import java.util.*;
class Lotto {
	public static void main(String[] args) {
		Random rn = new Random();
		int Lotto[] = new int[6];
		boolean flag = false;
		for(int i=0; i<6; i++){
			Lotto[i] = Math.abs(rn.nextInt() % 45) + 1;
			if(i>=1)
			{
				for(int j=0; j<i; j++)
				{
					if(Lotto[i] == Lotto[j])
					{
						flag = true;
						break;
					}
				}
			}
			
			if (flag == true)
			{
				i--;
			}
		}
		for(int i=0; i<6; i++)
		{
			System.out.println("Lotto[" + i + "]=" + Lotto[i]);
		}
	}
}
