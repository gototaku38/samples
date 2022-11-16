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
public class sample46X {
	public static void main(String[] args) {
		int i = 5;
		int j;
		Test[] ex_test = new Test[2];
		ex_test[0] = new ExTest();
		ex_test[1] = new ExTest2();
		for(j = 0; j < 2; j++)
			ex_test[j].calc(i);
	}
}
