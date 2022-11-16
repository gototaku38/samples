interface Test {
int m = 5;
	void calc(int i);
}
interface Test2 {
	int n = 10;
	void calc2(int i);
}

class InTest implements Test, Test2 {
	public void calc(int i) {
		int j = i * m;
		System.out.println(j);
	}
	public void calc2(int i) {
		int j = i * n;
		System.out.println(j);
	}
}

public class sample49 {
	public static void main(String[] args) {
		int i = 4;
		InTest in_test = new InTest();
		in_test.calc(i);
		in_test.calc2(i);
	}
}
