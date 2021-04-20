package dataparsing.xml;

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class WeatherBroXMLParsingThroThread {

	public static void main(String[] args) {
		// Anonymous Class를 이용해서 Thread 클래스로부터 상속받는 클래스의 인스턴스 생성
		Thread th = new Thread() {
			// 스레드로 수행할 내용
			public void run() {
				// run 메소드 안에서 에외가 발생했을 때, return하도록 만들면 스레드를 중지
				try {
					// Step 1. 문자열로 다운로드 받기
					String weatherString = null;
					try {
						// 1. 주소 만들기 - 파라미터 확인 필수
						String addr = "http://www.weather.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
						// 파라미터에 한글 포함시 현 위치에 인코딩 코드 추가
						URL url = new URL(addr);

						// 2. 연결 객체 만들기 - header 추가 여부 확인
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
						weatherString = sb.toString();

						// 4. 정리하기
						br.close();
						con.disconnect();

					} catch (Exception e) {
						System.err.println("데이터 다운로드 실패");
						System.err.println(e.getMessage());
						e.printStackTrace();

					}

					// 데이터 다운로드 확인
					// System.out.println(weatherString);
					
					
					// Step 2. XML 데이터 파싱

					// 데이터를 저장할 자료구조 생성
					List<Map<String, Object>> list = new ArrayList<>();

					if (weatherString != null && weatherString.trim().length() != 0) {
						
						// 루트 태그 찾기
						DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
						DocumentBuilder builder = factory.newDocumentBuilder();
						Document document = builder.parse(new ByteArrayInputStream(weatherString.getBytes()));
						Element root = document.getDocumentElement();
						
						// 도시 이름 찾아오기
						List<String> cities = new ArrayList<>();
						NodeList cityList = root.getElementsByTagName("city");
						
						for(int i=0; i<cityList.getLength(); i=i+1) {
							Node node = cityList.item(i);
							Node city = node.getFirstChild();
							cities.add(city.getNodeValue());	
						}
						// System.out.println(cities);
						
						// 날짜, 날씨, 최고온도, 최저온도를 가져오기
						NodeList dateList = root.getElementsByTagName("tmEf");
						NodeList weatherList = root.getElementsByTagName("wf");
						NodeList maxTempList = root.getElementsByTagName("tmx");
						NodeList minTempList = root.getElementsByTagName("tmn");
						
						// 날짜, 날씨, 최고온도, 최저온도를 저장할 임시 리스트
						List<String> list1 = new ArrayList<>();
						List<String> list2 = new ArrayList<>();
						List<String> list3 = new ArrayList<>();
						List<String> list4 = new ArrayList<>();
						
						for(int i=0; i<dateList.getLength(); i = i +1) {
							// 날짜를 list1에 저장하기
							Node node = dateList.item(i);
							Node temp = node.getFirstChild();
							list1.add(temp.getNodeValue());
							// 날씨를 list2에 저장하기
							// wf만 초기 데이터가 1개 더 있으므로 싱크를 맞추기 위해서 다음 데이터부터 출력
							node = weatherList.item(i+1);
							temp = node.getFirstChild();
							list2.add(temp.getNodeValue());
							// 최고온도를 list3에 저장하기
							node = maxTempList.item(i);
							temp = node.getFirstChild();
							list3.add(temp.getNodeValue());
							// 최저온도를 list4에 저장하기
							node = minTempList.item(i);
							temp = node.getFirstChild();
							list4.add(temp.getNodeValue());	
						}
						// System.out.println(list1);
						// System.out.println(list2);
						// System.out.println(list3);
						// System.out.println(list4);
						
						// i=0 -> j=0-13
						// i=1 -> j=13-26
						// cities와 list1, list2, list3, list4의 데이터를 모아서 하나의 List로 만들기 - city 1개에 각 데이터가 13개씩 존재
						for(int i=0; i<cities.size(); i=i+1) {
							// 도시 이름 1개 가져오기
							String city = cities.get(i);
							// 도시 이름 1개당 13개의 날짜, 날씨, 최고온도, 최저온도를 가져오기
							for(int j=0; j<13; j=j+1) {
								String date = list1.get(i*13+j);
								String wf = list2.get(i*13+j);
								String tmx = list3.get(i*13+j);
								String tmn = list4.get(i*13+j);
								// 맵 생성
								Map<String, Object> map = new HashMap<>();
								map.put("city", city);
								map.put("date", date);
								map.put("wf", wf);
								map.put("tmx", tmx);
								map.put("tmn", tmn);
								
								list.add(map);
							}
						}
						
						
					} else {
						System.out.println("읽어온 데이터가 없음");
					}
					
					//System.out.println(list);
					/*
					for(Map<String, Object> map : list) {
						// Map은 출력할 때를 제외하고 사용할 때는 원래 자료형으로 형 변환을 해줘야 한다.
						if(((String)map.get("city")).equals("대전")) {
							System.out.println(map);
						}
					}
					*/
					
					// Step 3. DB(MySQL)에 저장
					try {
						// 드라이버 클래스 로드
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						// DB 연결
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yoon?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "root", "1410517yoonseok");
						
						// SQL 실행 객체 생성
						// list의 데이터를 데이터베이스에 삽입
						for(Map<String, Object> map : list) {
							PreparedStatement pstmt = con.prepareStatement("insert into weather(weathercity, weatherdate, weatherwf, weathertmx, weathertmn) values(?, ?, ?, ?, ?)");
							pstmt.setString(1, (String) map.get("city"));
							pstmt.setString(2, (String) map.get("date"));
							pstmt.setString(3, (String) map.get("wf"));
							pstmt.setString(4, (String) map.get("tmx"));
							pstmt.setString(5, (String) map.get("tmn"));
							
							// SQL 실행
							pstmt.executeUpdate();
							
							pstmt.close();
						}
						
						// 사용한 객체 정리
						con.close();
						
						System.out.println("데이터 저장 성공");
						
					} catch(Exception e) {
						System.err.println("데이터 저장 실패");
						System.err.println(e.getMessage());
						e.printStackTrace();
					}
					
					
					
					
				} catch (Exception e) {
					System.err.println("스레드 동작 에러");
					System.err.println(e.getMessage());
					e.printStackTrace();
					return;
				}
			}
		};

		// 스레드 시작
		th.start();
	}
}
