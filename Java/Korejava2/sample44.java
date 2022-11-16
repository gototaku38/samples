class Test {
	int i = 10;
}
class ExTest extends Test{
	int i = 5;
	int sum(int i) {
		return i + this.i + super.i;
	}
}
public class sample44 {
	public static void main(String[] args) {
		ExTest ex_test = new ExTest();
		System.out.println(ex_test.sum(2));
	}
}
