package java.network;

import java.io.*;
import java.net.*;

public class ImageDownloadThread extends Thread {
	String mAddr;
	String mFile;

	ImageDownloadThread(String addr, String filename) {
		mAddr = addr;
		mFile = filename;
		System.out.println(mFile);
	}
	public void run() {
		URL imageurl;
		int read;
		try {
			imageurl = new URL(mAddr);
			HttpURLConnection conn= (HttpURLConnection)imageurl.openConnection();
			int len = conn.getContentLength();
			byte[] raster = new byte[len];
			InputStream is = conn.getInputStream();
			FileOutputStream fos = new FileOutputStream(mFile);
			while(true) {
				read = is.read(raster);
				System.out.println(read);
				if (read <= 0) {
					break;
				}
				fos.write(raster,0, read);
			}

			is.close();
			fos.close();
			conn.disconnect();
		} catch (Exception e) {
			mFile = null;
		}
	}
}

