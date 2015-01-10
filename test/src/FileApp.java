//:FileApp.java
//import java.io.*;
public class FileApp {
	public static void main(String[] args) {
		byte buffer[] = new byte[2056];
		try {
			//FileInputStream fileIn = new FileInputStream("C:/Users/Leon/workspace/test/fileapp.txt");
			//int bytes = fileIn.read(buffer, 0, 2056);
			while (true) {
			    int bytes = System.in.read(buffer, 0, 2056);
				String str = new String(buffer, 0, bytes);
				System.out.println("-->"+str+"|bytes:"+bytes+"|str:"+str.length());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}