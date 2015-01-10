//:NewIODemo.java

import java.io.*;

public class NewIODemo {
	public static void main(String[] args) {
		try {
			// 1. Reading input by lines:
			//BufferedReader in = new BufferedReader(new FileReader(args[0]));
			BufferedReader in = new BufferedReader(new FileReader("C:/Users/Leon/workspace/test/src/Leaf.java"));
			String s, s2 = new String();
			while ((s = in.readLine()) != null) {
				s2 += s + "\n";
			}
			in.close();
			
			// 1b. Reading standard input:
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a line:");
			System.out.println( stdin.readLine() );
			
			// 2. Input from memory
			StringReader in2 = new StringReader(s2);
			int c;
			while ( (c = in2.read()) != -1) {
				System.out.print( (char)c );
			}
			
			// 3. Formatted memory input
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}