package dataparsing.html;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SeleniumTest {

	public static void main(String[] args) {
		try {
			// 크롬을 사용하기 위한 환경 설정
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			
			// 크롬 실행 객체 만들기
			WebDriver driver = new ChromeDriver();
			
			// 페이지 접속
			driver.get("https://www.naver.com");
			
		} catch(Exception e) {
			System.out.println("크롬 실행 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
