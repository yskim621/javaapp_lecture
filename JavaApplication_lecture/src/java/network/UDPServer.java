package java.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
		try (DatagramSocket dsoc = new DatagramSocket(7777);) {
			byte[] data = new byte[65536];

			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("서버 서비스 시작...");
			while (true) {
				dsoc.receive(dp);
				System.out.println("------보낸 곳 주소 : " + dp.getAddress().getHostAddress());
				System.out.println("자료 크기 : " + dp.getLength());
				String message = new String(dp.getData()).trim();
				System.out.println("내용 : " + message);
			}
		} catch (Exception e) {
			System.out.println("오류 : " + e);
		}
	}
}
