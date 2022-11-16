import java.io.*;
public class sample60 {
	public static void main(String[] args) {
		try {
			FileWriter out =
				new FileWriter("test.txt");
			out.write("‚ ‚¢‚¤‚¦‚¨");
			out.close();
		} catch (IOException e) {
			System.out.println("o—ÍƒGƒ‰[");
		}
	}
}
