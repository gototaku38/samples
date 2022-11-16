class Test {
	int i = 10;
	int j = i * 2;
	int sum(int m){
		return j + m;
	}
	int sum3(int m, int n){
		int k = sum(3);
		return m + n + k;
	}
}
public class sample31 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("tオブジェクトのメソッド" + "sum3(1,5)の結果:" + t.sum3(1,5));
	}
}
