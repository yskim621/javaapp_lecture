package java.network;
import java.io.*;

public class ImageMain {
	public static void main(String[] args) {
		String imageurl = "http://www.onlifezone.com/files/attach/images/962811/376/321/005/2.jpg";
		int idx = imageurl.lastIndexOf('/');
		String localimage = imageurl.substring(idx + 1);
		String path = "./" + localimage;

		if (new File(path).exists()) {
			System.out.println("image is exist");
		} else {
			System.out.println("image is not exist");
			(new ImageDownloadThread(imageurl, path)).start();
		}
	}
}
