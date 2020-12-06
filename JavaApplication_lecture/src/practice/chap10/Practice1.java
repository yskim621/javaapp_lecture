package practice.chap10;

public class Practice1 {

	public static void main(String[] args) {
		String urlString = "https://localhost:8080/insert.jsp";
		String contextPath = "https://localhost:8080";
		
		String result = urlString.substring(contextPath.length());
		System.out.println(result);

	}

}
