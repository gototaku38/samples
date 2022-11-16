abstract class Test {
	abstract void calc(int i);
	void printNum(int i) {
		System.out.println(i);
	}
}
class ExTest extends Test {
	void calc(int i) {
			int j = i * i;
		printNum(j);
	}
}
class ExTest2 extends Test {
	void calc(int i) {
		int j = i + i;
		printNum(j);
	}
}
public class sample46 {
	public static void main(String[] args) {
		int i = 5;
		Test ex_test = new ExTest();
		ex_test.calc(i);
		Test ex_test2 = new ExTest2();
		ex_test2.calc(i);

	}
}
