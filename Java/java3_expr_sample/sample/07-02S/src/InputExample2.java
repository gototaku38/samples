import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample2 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try {
			String line = reader.readLine();
			double val = Double.parseDouble(line);
			System.out.println("入力された値の平方根は" + Math.sqrt(val));
			reader.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
