package dataparsing.html;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DaumCafeAutoWriting {

	public static void main(String[] args) {
		try {
			// 브라우저 실행
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			
			// 브라우저 실행
			WebDriver driver = new ChromeDriver();
			
			// 다음 로그인 페이지(카카오아이디로 로그인) 접속
			driver.get("https://accounts.kakao.com/login?continue=https%3A%2F%2Flogins.daum.net%2Faccounts%2Fksso.do%3Frescue%3Dtrue%26url%3Dhttps%253A%252F%252Fwww.daum.net%252F");
			
			// 아이디 입력란 찾기
			WebElement id = driver.findElement(By.xpath("//*[@id=\"id_email_2\"]"));
			
			// ID 입력
			id.sendKeys("01099660621");
			
			// password 입력란 찾기
			WebElement pw = driver.findElement(By.xpath("//*[@id=\"id_password_3\"]"));
			
			
			// password 입력
			pw.sendKeys("1410517yoonseok");
			
			// login 버튼 찾기
			WebElement login = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[8]/button[1]"));
						
			// password 입력
			login.click();
			

			
			// CPU 과부화 방지를 위한 지연
			//Thread.sleep(3000);			
			
			// 카페로 이동
			//driver.get("https://cafe.naver.com/goondae");
			
			//WebElement login = driver.findElement(By.xpath("//*[@id=\"log.login\"]"));
		
			
		} catch(Exception e) {
			System.out.println("다음 카페 글쓰기 실패");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
