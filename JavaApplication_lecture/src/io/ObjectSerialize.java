package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSerialize {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;

		List<Data> list = new ArrayList<Data>();
		list.add(new Data("박문석", 44));
		list.add(new Data("이유진", 43));
		list.add(new Data("김태현", 42));
		
		for (Data k : list)
			System.out.println(k);
		
		System.out.println("===============================");
		System.out.println("직렬화해서 저장한 후 가져와서 출력");
		System.out.println("===============================");

		try {
			fos = new FileOutputStream("./object.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);

			fis = new FileInputStream("./object.dat");
			ois = new ObjectInputStream(fis);
			List<Data> result = (List<Data>) ois.readObject();
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (fis != null)
					fis.close();
				if (ois != null)
					ois.close();
				if (fos != null)
					fos.close();
				if (oos != null)
					oos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}

