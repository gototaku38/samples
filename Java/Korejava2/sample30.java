class Test {
	int i = 10;
	int j = i * 2;
	int sum(int m){
		return j + m;
	}
}
public class sample30 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(
			"tオブジェクトのフィールドjの値:" + t.j);
		System.out.println(
			"tオブジェクトのメソッドsum(2)の結果:" + t.sum(2));
	}
}
