package dataparsing.html;

import java.io.*;
import java.net.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;



public class NaverHTMLParsing {

	public static void main(String[] args) {
		String html = null;
		try {
			// 1. URL 만들기 - 파라미터 확인 필수(parameter - ? 다음에 나옴)
			String addr = "https://www.naver.com/";
			// 파라미터에 한글 포함시 현 위치에 인코딩 코드 추가
			URL url = new URL(addr);

			// 2. 연결 객체 만들기 - header 추가하는 옵션 여부 확인 
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(30000);
			con.setUseCaches(false);

			// 3. 스트림 생성 후 문자열 읽어오기
			// 확인 후 한글이 깨지면 수정(인코딩 코드 추가)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
			// 문자열을 임시로 저장할 인스턴스
			StringBuilder sb = new StringBuilder();
			// 줄 단위로 읽어서 sb에 저장
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				sb.append(line + "\n");
			}
			html = sb.toString();

			// 4. 정리하기
			br.close();
			con.disconnect();
			
			

		} catch (Exception e) {
			System.err.println("데이터 다운로드 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		// 데이터 확인 - 제대로 읽어 왔는 지 한글이 깨지는 지
		// System.out.println(html);
		
		
		// HTML parsing
		if(html != null && html.trim().length() > 0) {
			// 문서 구조 가져오기
			Document document = Jsoup.parse(html);
			
			// 선택자를 이용해서 가져오기 -> Web site 내 마우스 오른쪽 클릭 검사(inspect) 마우스 모양 있는 것 상단에 클릭 후 원하는 부분 선택
			// 하이라이트 된 부분 마우스 오른쪽 클릭하여 copy - copy selector 클릭
			// 태그를 select ""에 부분에 첨부 시 'a'까지만 포함시켜야 한다.
			Elements elements = document.select("#themecast > div.theme_cont > div:nth-child(1) > div > ul > li:nth-child(3) > a.theme_info");
			
			// 선택자를 이용한 것은 반복문을 수행
			for(int i=0; i<elements.size(); i=i+1) {
				// DOM 1개 가져오기
				Element element = elements.get(i);
				// 태그 안의 내용을 가져오기
				System.out.println(element.text());
				// 시작 태그 안의 href라는 속성 값을 가져오기
				System.out.println(element.attr("href"));
			}
			
			
		} else {
			System.out.println("읽어온 데이터가 없음");
		}
		
		
		
		
		
	}
}
