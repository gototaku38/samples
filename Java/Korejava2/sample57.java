import java.io.*;
public class sample57 {
	public static void main(String[] args) {
		try {
			BufferedWriter o =
				new BufferedWriter(new OutputStreamWriter(System.out));
			o.write("•¶š—ñ");
			o.flush();
		} catch (IOException e) {
			System.out.println("o—ÍƒGƒ‰[");
		}
	}
}
