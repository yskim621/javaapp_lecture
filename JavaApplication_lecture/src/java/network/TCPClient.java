package java.network;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		InetAddress ia = null;
		Socket sock = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
	
		try {
			while (true) {
				ia = InetAddress.getByName("127.0.0.1");
				sock = new Socket(ia, 9999);
				out = new PrintWriter(sock.getOutputStream(), true);
				System.out.print("서버에게 보내는 문자열:");
				String msg = sc.nextLine();
				out.println(msg + "\n");
				out.flush();
				out.close();
			}
		} catch (IOException e) {
			System.out.println("접속 오류 : " + e.toString());
		}finally {
			sc.close();
		}
	}
}

