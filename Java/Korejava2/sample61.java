import java.io.*;
public class sample61 {
	public static void main(String[] args) {
		try {
			String str;
			FileReader in =
				new FileReader("sample.java");
			FileWriter out =
				new FileWriter("sample_.java");
			BufferedReader in_b =
				new BufferedReader(in);
			BufferedWriter out_b =
				new BufferedWriter(out);
			while((str = in_b.readLine()) != null) {
				out_b.write(str);
				out_b.newLine();
			}
			in_b.close();
			out_b.close();
			out.close();
			in.close();
		} catch (IOException e) {
			System.out.println("“üo—ÍƒGƒ‰[");
		}
	}
}
