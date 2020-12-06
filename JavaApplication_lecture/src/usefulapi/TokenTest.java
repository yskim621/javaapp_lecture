package usefulapi;

import java.util.*;
public class TokenTest {
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer("C++	Java	C#	JavaScript", "\t");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

