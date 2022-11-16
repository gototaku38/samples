import java.io.*;
public class sample62 {
	public static void main(String[] args) {
		try {
			String str;
			FileReader in =
				new FileReader("sample.java");
			FileWriter out =
				new FileWriter("sample_.java");
			BufferedReader in_b =
				new BufferedReader(in);
			PrintWriter pw = new PrintWriter(out);
			while((str = in_b.readLine()) != null) {
				pw.println(str);
			}
			in_b.close();
			pw.close();
			out.close();
			in.close();
		} catch (IOException e) {
			System.out.println("“üo—ÍƒGƒ‰[");
		}
	}
}
