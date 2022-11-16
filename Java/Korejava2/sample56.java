import java.io.*;
public class sample56 {
	public static void main(String[] args) {
		try {
			InputStreamReader i =
				new InputStreamReader(System.in);
			int c = i.read();
			System.out.println((char)c);
		} catch (IOException e) {
			System.out.println("“ü—ÍƒGƒ‰[");
		}
	}
}
