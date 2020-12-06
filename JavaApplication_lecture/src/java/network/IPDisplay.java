package java.network;
import java.net.*;
public class IPDisplay{
	public static void main(String[] ar) {
		InetAddress ia = null;  //주소를 얻기 위한  클래스
		InetAddress []ia2 = null;
		try {
			ia = InetAddress.getByName("www.daum.net");
		System.out.println("server HostAddress : " + ia.getHostAddress());
			System.out.println("server HostName : " + ia.getHostName());
			System.out.println("--------------");
			ia = InetAddress.getLocalHost();
		System.out.println("local HostAddress : " + ia.getHostAddress());
			System.out.println("local HostName : " + ia.getHostName());
			System.out.println("--------------");
			ia2 = InetAddress.getAllByName("www.daum.net");
			for(InetAddress aa:ia2){
				System.out.println(aa.getHostAddress());
				System.out.println(aa.getHostName());
			}
		} 
		catch (UnknownHostException ee){
			System.out.println("해당 사이트는 유효하지 않습니다.");
		}
	}
}


