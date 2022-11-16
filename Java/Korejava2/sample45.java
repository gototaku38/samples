class Test {
	static int i;
}
public class sample45 {
	public static void main(String[] args) {
		Test test = new Test();
		test.i = 5;
		System.out.println("test i:" + test.i);
		Test test2 = new Test();
		test2.i = 10;
		System.out.println("test2 i:" + test2.i);
		System.out.println("test i:" + test.i);
	}
}
