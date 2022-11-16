class Test {
	int m;
	int n;
	Test(int i, int j) {
		m = i;
		n = j;
	}
	Test(Test testC) {
		m = testC.m;
		n = testC.n;
	}
	int sum(int i, int j){
		return m + n + i + j;
	}
}
public class sample38 {
	public static void main(String[] args) {
		Test test = new Test(10, 5);
		test.m++;
		test.n++;
		Test test2 = new Test(test);
		System.out.println(test2.sum(2, 3));
	}
}
