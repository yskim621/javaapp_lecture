package java.network;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceive {
	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket(9999);
			ms.joinGroup(InetAddress.getByName("FF01:0:0:0:0:0:0:175"));
			System.out.println("서버 대기 중.....");
			while(true){
				byte[] msg = new byte[512];
				DatagramPacket data = new DatagramPacket(msg, msg.length);
				ms.receive(data);
				String str = new String(data.getData()).trim();
				System.out.println(str);
			}
		} catch (Exception e) {
			System.out.println("서버 에러:" + e.getMessage());
			e.printStackTrace();
		}
	}
}
