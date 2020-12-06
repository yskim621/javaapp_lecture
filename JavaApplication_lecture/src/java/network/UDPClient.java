package java.network;
import java.net.*;
import java.io.*;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("보낼 자료 입력 : ");
		String msg = in.readLine();

		DatagramSocket dsoc = new DatagramSocket();

		InetAddress ia = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(msg.getBytes(),
				msg.getBytes().length, ia, 7777);
		dsoc.send(dp);
		System.out.println("전송완료");
		dsoc.close();
	}
}
