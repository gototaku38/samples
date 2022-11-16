import java.util.*;
public class sample78 {
	public static void main(String[] args) {
		StringTokenizer st = new
			StringTokenizer("abc def g");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
