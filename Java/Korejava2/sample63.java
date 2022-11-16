import java.io.*;
public class sample63 {
	public static void main(String[] args) {
		try {
			int i;
			FileInputStream in = new
				FileInputStream("test.jpg");
			FileOutputStream out = new
				FileOutputStream("test_.jpg");
			while((i = in.read()) != -1) {
				out.write(i);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("“üo—ÍƒGƒ‰[");
		}
	}
}
