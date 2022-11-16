class Test {
	int m;
	Test() {
		m = 10;
	}
	int sum(int i, int j){
		return m + i + j;
	}
}
public class sample36 {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.sum(2, 3));
	}
}
