package java.network;
import java.io.*;
import java.net.*;


public class ConnectThread extends Thread {
	String urlStr;

	public ConnectThread(String inStr) {
		urlStr = inStr;
	}

	public void run() {

		try {
			final String output = request(urlStr);
			System.out.println("가져온 데이터:" + output);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	private String request(String urlStr) {
		StringBuilder html = new StringBuilder();
		try {
			URL url = new URL(urlStr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			if (conn != null) {
				conn.setConnectTimeout(10000);
				conn.setUseCaches(false);
				if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					while (true) {
						String line = br.readLine();
						if (line == null)
							break;
						html.append(line + '\n');
					}
					br.close();
				}
				conn.disconnect();
			}
		}
		catch (Exception e) {
			System.out.printf("SampleHTTPClient",
				"Exception in processing response.", e);
				}
				return html.toString();
			}
		}

