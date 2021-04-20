package dataparsing.csv;

import java.io.*;
import java.util.*;

import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ift.*;
import org.supercsv.io.*;
import org.supercsv.prefs.*;

public class CSVRead {

	public static void main(String[] args) {
		try (CsvBeanReader reader = new CsvBeanReader(new BufferedReader(new InputStreamReader(new FileInputStream(
			 "C:\\Users\\user\\Desktop\\JAVA 안드로이드, ios_ App&web develop\\2018년 관서별 청소년 5대범죄 현황.csv"))),
			  CsvPreference.STANDARD_PREFERENCE)) {
			
			// 첫번째 줄은 읽지 않음
			reader.getHeader(true);
			
			// DTO 클래스의 변수들을 순서대로 문자열 배열로 생성 - 이 분을 가지고 한 줄의 데이터를 읽었을 때 변수에 대입
			String [] headers = {"num", "murder", "robber", "sexCrime", "theft", "violence"};
			
			// 제약 조건 생성
			CellProcessor [] processor = new CellProcessor[] {new Optional(), new ParseInt(new Optional()), 
					new ParseInt(new Optional()), new ParseInt(new Optional()), new ParseInt(new Optional()), new ParseInt(new Optional()) };
			
			// 읽을 데이터를 저장할 DTO의 List 생성
			List <Crime> list = new ArrayList<Crime>();
			
			// 데이터를 읽어서 저장
			while(true) {
				// 데이터를 1개 읽음
				Crime crime = reader.read(Crime.class, headers, processor);
				
				// 더 이상 읽지 못하면 종료
				if(crime == null) {
					break;
				}
				// 읽을 경우 List에 추가
				list.add(crime);
			}
			
			// List에 추가된 데이터 사용
			for(Crime crime : list) {
				System.out.println(crime.getNum() + ":" + crime.getSexCrime());
			}
			
			
		} catch (Exception e) {
			System.out.println("CSV 읽기 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
