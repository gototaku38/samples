class Test {
	int m;
	int n;
	Test(int i, int j) {
		m = i;
		n = j;
	}
	int sum(int i, int j){
		return m + n + i + j;
	}
}
public class sample37 {
	public static void main(String[] args) {
		Test test = new Test(10, 5);
		System.out.println(test.sum(2, 3));
Test test2 = new Test(10, 0);
		System.out.println(test2.sum(2, 3));
	}
}
