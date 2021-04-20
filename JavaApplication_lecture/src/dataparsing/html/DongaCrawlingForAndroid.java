package dataparsing.html;

import java.io.*;
import java.net.*;
import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class DongaCrawlingForAndroid {

	public static void main(String[] args) {
		String html = null;
		try {
			// 1. URL 만들기 - 파라미터 확인 필수(parameter - ? 다음에 나옴)
			String query = "박문석";
			// 파라미터 인코딩
			query = URLEncoder.encode(query, "utf-8");
			String addr = "https://www.donga.com/news/search?p=1&query=" + query + "&check_news=1&more=1&sorting=1"
					+ "&search_date=1&v1=&v2=&range=1";
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

		
		// 데이터 확인 - 정상적인 출력 / 한글 정상 출력 확인
		// System.out.println(html);

		
		// 데이터 건수를 저장할 변수
		int cnt = -1;
		try {
			// 텍스트를 메모리에 펼치기
			Document document = Jsoup.parse(html);
			Elements elements = document.select("#content > div.searchContWrap > div.searchCont > h2 > span:nth-child(1)");

			// 텍스트 형태로 리턴 -> 문자열 내부에서 추출 (Split or Substring)으로 추출
			// Substring - 정해진 위치에서 고정된 문자열 길이를 출력할때
			// Split - 그 외에 일정한 패턴을 가진 것 모두
			for (int i = 0; i < elements.size(); i = i + 1) {
				// DOM 1개 가져오기
				Element element = elements.get(i);

				String content = element.text();

				System.out.println(content);

				// 기사 건수만 찾아오기
				// 공백을 기준으로 분할
				String[] ar = content.split(" ");
				cnt = Integer.parseInt(ar[1]);
				System.out.println(cnt);
			}

		} catch (Exception e) {
			System.err.println("데이터 건수 추출 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		
		// 페이지 당 데이터 개수
		int perPageCnt = 15;

		// 페이지 개수 계산
		// 전체 데이터 개수를 페이지당 데이터 개수로 나누고 나머지가 있으면 페이지 개수를 1개 추가
		int pageCnt = cnt / perPageCnt;
		if (cnt % perPageCnt != 0) {
			pageCnt = pageCnt + 1;
		}
		System.out.println("pageCnt: " + pageCnt);

		
		// 기사의 링크를 저장할 변수
		List<String> list = new ArrayList<>();
		try {
			// 반복문 안에서 예외가 발생했을 때 다음 반복으로 넘어가고자 하면 반복문 내 예외처리
			for (int i = 0; i < pageCnt; i = i + 1) {
				try {
					String query = "박문석";
					// 파라미터 인코딩
					query = URLEncoder.encode(query, "utf-8");
					String addr = "https://www.donga.com/news/search?p=" + ((i * perPageCnt) + 1) + "&query=" + query
							+ "&check_news=1&more=1&sorting=1" + "&search_date=1&v1=&v2=&range=1";
					// 파라미터에 한글 포함시 현 위치에 인코딩 코드 추가
					URL url = new URL(addr);

					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					con.setConnectTimeout(10000);
					con.setUseCaches(false);

					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					StringBuilder sb = new StringBuilder();

					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						sb.append(line + "\n");
					}
					html = sb.toString();

					br.close();
					con.disconnect();

					// 다운로드 여부 and 한글 정상 출력 여부
					// System.out.println(html);

					
					// 링크 수집을 위해서 html 파싱
					Document doc = Jsoup.parse(html);
					// Selector가 너무 길면 앞 부분은 생략 가능
					Elements elements = doc.select("div.t > p.tit > a");
					for (int j = 0; j < elements.size(); j = j + 1) {
						Element element = elements.get(j);
						// a 태그의 href 속성을 list에 저장
						list.add(element.attr("href"));
					}
					// System.out.println(list);

				} catch (Exception e) {
					System.err.println("현재 페이지 읽어오기 실패");
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			System.err.println("기사 링크 저장 실패");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		
		// 현재 디렉토리에 박문석.txt 파일에 기사 내용 저장
		// try() 안에 만든 객체는 close를 호출할 필요가 없음
		try (PrintWriter pw = new PrintWriter("./박문석기사저장.txt")) {
			for (String link : list) {
				try {
					URL url = new URL(link);
					HttpURLConnection con = (HttpURLConnection) url.openConnection();
					con.setUseCaches(false);
					con.setConnectTimeout(10000);

					BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
					StringBuilder sb = new StringBuilder();
					while (true) {
						String line = br.readLine();
						if (line == null) {
							break;
						}
						sb.append(line + "\n");
					}
					html = sb.toString();
					br.close();
					con.disconnect();

					// System.out.println(html);

					
					// 기사 내용만 골라내기
					Document document = Jsoup.parse(html);
					Elements elements = document.select("#content > div > div.article_txt");
					for (int k = 0; k < elements.size(); k = k + 1) {
						Element element = elements.get(k);
						// html에 저장된 내용을 파일에 저장
						pw.println(element.text());
						pw.flush();
					}

				} catch (Exception e) {
					System.out.println("기사 가져오기 실패");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println("기사 저장 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
