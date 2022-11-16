import java.io.*;
public class sample55 {
	public static void main(String[] args) {
		try {
			InputStreamReader i =
				new InputStreamReader(System.in);
			BufferedReader b =
				new BufferedReader(i);
			String str = b.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("“ü—ÍƒGƒ‰[");
		}
	}
}
