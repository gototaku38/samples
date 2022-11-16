import java.io.*;
public class sample59 {
	public static void main(String[] args) {
		try {
			String str;
			FileReader in =
				new FileReader("sample.java");
			BufferedReader b =
				new BufferedReader(in);
			while((str = b.readLine()) != null)
				System.out.println(str);
			b.close();
		} catch (IOException e) {
			System.out.println("“ü—ÍƒGƒ‰[");
		}
	}
}
