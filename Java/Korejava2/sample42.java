class Test {
	void printString(String str) {
		System.out.println("Testクラス:" + str);
	}
}
class ExTest extends Test{
	void printString(String str) {
		System.out.println("ExTestクラス:" + str);
	}
}
public class sample42 {
	public static void main(String[] args) {
		ExTest ex_test = new ExTest();
		ex_test.printString("文字列");
	}
}
