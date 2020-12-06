package java.network;

import java.net.*;
import java.util.*;

public class MulticastSend {
	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket();
			Scanner scanner = new Scanner(System.in);
			InetAddress ia = InetAddress.getByName("FF01:0:0:0:0:0:0:175");
			System.out.print("닉네임 입력 : ");
			String nick = scanner.nextLine();
			while (true) {
				System.out.print("전송자료 입력(종료는 end) : ");
				String msg = scanner.nextLine();
				if(msg.equals("end")){
					msg = nick + " 방에서 나감";
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 9999);
					ms.send(dp);
					scanner.close();
					ms.close();
					break;
				}
				msg = nick + ":" + msg;
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ia, 9999);
				ms.send(dp);
			}
		} catch (Exception e) {
			System.out.println("서버 에러:" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}