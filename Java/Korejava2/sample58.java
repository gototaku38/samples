import java.io.*;
public class sample58 {
	public static void main(String[] args) {
		try {
			int i;
			FileReader in =
				new FileReader("sample.java");
			while((i = in.read()) != -1)
				System.out.print((char)i);
			in.close();
		} catch (IOException e) {
			System.out.println("ファイル入力エラー");
		}
	}
}
