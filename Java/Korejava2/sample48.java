interface Test {
	int m = 5;
	void calc(int i);
}

class InTest implements Test {
	public void calc(int i) {
		int j = i * m;
		System.out.println(j);
	}
}

public class sample48 {
	public static void main(String[] args) {
		int i = 4;
		InTest in_test = new InTest();
		in_test.calc(i);
	}
}
