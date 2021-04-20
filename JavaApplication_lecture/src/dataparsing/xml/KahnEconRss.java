package dataparsing.xml;

import java.io.*;
import java.net.*;
import java.util.*;

import javax.xml.parsers.*;

// Node 부분 import
import org.w3c.dom.*;

public class KahnEconRss {

	public static void main(String[] args) {

		// Step 1. 문자열로 다운로드 받기
		// 문자열을 저장할 변수
		String xmlString = null;

		// title과 link 여러 개를 저장할 자료 구조를 생성
		// List는 처음에 만들 때 인스턴스 생성 -> 대부분의 경우 반복문을 돌려야 하는 데, 반복문 순회시 List내 null있으면 출력 시
		// 예외가 발생
		List<Map<String, Object>> list = new ArrayList<>();

		// 파일 경로 생성
		String filepath = "./updatefile.dat";
		// 파일이 존재하는 경우 더이상 다운 받지 않음 -> Smartphone에서 자주 바뀌지 않는 데이터 Local에 저장
		File f = new File(filepath);
		if (f.exists()) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
				String line = br.readLine();
				java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
				if (date.toString().equals(line)) {
					System.out.println("이미 다운로드 받은 파일");
					System.exit(0);
				}
				br.close();
			} catch (Exception e) {
				System.err.println("파일 중복 검사 실패");
				System.err.println(e.getMessage());
				e.printStackTrace();
			}

		}

		try {
			System.out.println("다운로드");
			// 다운로드 받은 날짜를 기록 -> 날짜까지만 기록하고 싶을 떄는 sql.Date 클래스가 베스트
			java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
			// 파일에 오늘 날짜 기록
			PrintWriter pw = new PrintWriter(filepath);
			pw.print(date.toString());
			pw.flush();
			pw.close();

			// 1. 주소 만들기 - 파라미터 확인 필수
			String addr = "http://www.khan.co.kr/rss/rssdata/economy_news.xml";
			// 파라미터에 한글 포함시 현 위치에 인코딩 코드 추가
			URL url = new URL(addr);

			// 2. 연결 객체 만들기 - header 추가 여부 확인
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(30000);
			con.setUseCaches(false);

			// 3. 스트림 생성 후 문자열 읽어오기
			// 확인 후 한글이 깨지면 수정(인코딩 코드 추가)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
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
			xmlString = sb.toString();

			// 4. 정리하기
			br.close();
			con.disconnect();

		} catch (Exception e) {
			System.err.println("데이터 다운로드 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		// 데이터 확인
		// System.out.println(xmlString);

		
		// Step 2. 다운로드 받은 문자열이 있을 때만 파싱
		if (xmlString != null && xmlString.trim().length() != 0) {
			try {
				// 루트 태그 찾기 -> Entry point인 부모 찾기 
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				Document document = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));
				Element root = document.getDocumentElement();

				// 원하는 태그를 추출 - title과 link 태그의 값을 가져오기
				NodeList titles = root.getElementsByTagName("title");
				NodeList links = root.getElementsByTagName("link");

				// 반복문을 돌려서 하나씩 순회
				for (int i = 1; i < titles.getLength(); i = i + 1) {
					Map<String, Object> map = new HashMap<>();

					// title 저장 
					Node node = titles.item(i);
					Node tag = node.getFirstChild();
					map.put("title", tag.getNodeValue());

					// link 저장
					node = links.item(i);
					tag = node.getFirstChild();
					map.put("link", tag.getNodeValue());

					// list에 추가
					list.add(map);
				}

				/*
				 * // 원하는 태그를 추출 NodeList links = root.getElementsByTagName("link");
				 * 
				 * // 반복문을 돌려서 각각 순회 -> index(i)[0]에 데이터가 null이므로 i의 시작점을 0으로 값(i=0;)을 주면
				 * NullpointException for(int i=1; i<links.getLength(); i=i+1) { Node node =
				 * links.item(i); Node link = node.getFirstChild();
				 * System.out.println(link.getNodeValue()); }
				 */

			} catch (Exception e) {
				System.err.println("xml 파싱 실패");
				System.err.println(e.getMessage());
				// 예외가 발생한 지점부터 역추적
				e.printStackTrace();
			}
		} else {
			System.out.println("다운로드 받은 데이터 없음");
			System.exit(0);
		}

		// Step 3. list 내용 출력
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}

}
