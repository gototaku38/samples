class Test {
	boolean check(int i, double d){
		return i < d;
	}
}
public class sample33 {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test.check(2, 3.5));
	}
}
