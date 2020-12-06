package practice.chap13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader("./log.txt"))) {
			while (true) {
				try {
				String x = br.readLine();
				if (x == null)
					break;
				String[] ar = x.split(" ");
				
				Integer sum = (Integer)map.get(ar[0]);
				if(sum == null) {
					sum = 0;
				}
				sum = sum + Integer.parseInt(ar[9]);
				map.put(ar[0], sum);
				}catch(Exception e) {
					//System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Set<String> keyset = map.keySet();
		for(String key : keyset) {
			System.out.println(key + "\t" + map.get(key));
		}
	}

}
