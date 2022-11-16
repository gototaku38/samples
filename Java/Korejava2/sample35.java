class Test {
	int sum(int i, int j){
		return i + j;
	}
	int sum(int i, double d){
		return (int)(i + d);
	}
}
public class sample35 {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.sum(1, 2));
		System.out.println(test.sum(2, 2.5));
	}
}
