package dataparsing.csv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StringDownload {

	public static void main(String[] args) {
		try {
			//다운로드 받을 URL을 생성
			String addr = "https://www.naver.com";
			URL url = new URL(addr);
			
			//연결 -> https://www.naver.com을 주소창에 쓰고 '엔터'로 연결 명령
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			//스트림 만들기
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//줄 단위로 읽기
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
			//정리 작업
			br.close();
			con.disconnect();
		}catch(Exception e) {
		}
	}
}
