package java.network;

import java.io.*;
import java.net.*;

public class WebDownload {
	public static void main(String[] ar) {
		InetAddress ia = null;
		Socket sock = null;
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			ia = InetAddress.getByName("www.daum.net");
			sock = new Socket(ia, 80);
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
			out.println("GET http://www.daum.net");
			out.flush();
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while (true) {
				String str = in.readLine();

				if (str == null)
					break;
				System.out.println(str);
			}
			in.close();
			out.close();
			sock.close();
		} catch (IOException e) {
			System.out.println("데터 가져오기 실패 : " + e.getMessage());
		}
	}
}
