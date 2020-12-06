package usefulapi;

import java.util.regex.Pattern;

public class FrequentlyPattern {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^01(0|1|[6-9])-(\\d{3}|\\d{4})-\\d{4}$");
		String mobile1 = "010-3790-1997";
		String mobile2 = "012-3790-1997";
		boolean r = p.matcher(mobile1).find();
		if(r){
			System.out.println(mobile1 + "은 올바른 전화번호입니다.");
		}
		else{
			System.out.println(mobile1 + "은 올바르지 않은 전화번호입니다.");
		}
		r =p.matcher(mobile2).find();
		if(r){
			System.out.println(mobile2 + "은 올바른 전화번호입니다.");
		}
		else{
			System.out.println(mobile2 + "은 올바르지 않은 전화번호입니다.");
		}
		
		p = Pattern.compile("^[a-zA-Z0-9]+[@][a-zA-Z0-9]+[\\.][a-zA-Z0-9]+$");
		String email1 = "ggangpae1@gmail.com";
		String email2 = "ggangpae1gmail.com";
		String email3 = "ggangpae1@";
		r =p.matcher(email1).find();
		if(r){
			System.out.println(email1 + "은 올바른 이메일 주소입니다.");
		}
		else{
			System.out.println(email1 + "은 올바르지 않은 이메일 주소입니다.");
		}
		
		r =p.matcher(email2).find();
		if(r){
			System.out.println(email2 + "은 올바른 이메일 주소입니다.");
		}
		else{
			System.out.println(email2 + "은 올바르지 않은 이메일 주소입니다.");
		}
		
		r =p.matcher(email3).find();
		if(r){
			System.out.println(email3 + "은 올바른 이메일 주소입니다.");
		}
		else{
			System.out.println(email3 + "은 올바르지 않은 이메일 주소입니다.");
		}
	}
}
