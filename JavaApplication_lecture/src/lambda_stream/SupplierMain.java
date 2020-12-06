package lambda_stream;

import java.util.*;
import java.util.function.*;

public class SupplierMain {

	public static void main(String[] args) {
		IntSupplier dice = () -> {
			Random r = new Random();
			int num = r.nextInt(6)+1;
			return num;
		};
		
		int val = dice.getAsInt();
		System.out.println("주사위: " + val);
	}
}

