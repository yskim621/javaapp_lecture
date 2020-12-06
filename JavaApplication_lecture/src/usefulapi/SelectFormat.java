package usefulapi;

import java.text.*;

public class SelectFormat {
	public static void main(String[] args) 
	{
		double[] limits = {0, 60, 70, 80, 90};
		String[] grades = {"F", "D", "C", "B", "A"};	
		
		int[] scores = { 45, 98, 88, 26, 81, 76};

		ChoiceFormat form = new ChoiceFormat(limits, grades);

		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]+":"+form.format(scores[i]));		
		}
	}
}
