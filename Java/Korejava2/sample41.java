class Calc {
	int m = 1;
	int sum(int i){
		return i + m;
	}
	int sum2(int i){
		return i - m;
	}
}
class Multiply extends Calc{
	void sum3(int i, int j){
		int k = sum(i);
		int n = sum2(j);
		System.out.println("m�̒l�F" + m);
		System.out.println("���ʁF" + (k * n));
	}
}
class ExMultiply extends Multiply{
	void sum4(int i, int j){
		sum3(i, j);
		int k = sum(i+2);
		int n = sum2(j+2);
		System.out.println("ex m�̒l�F" + m);
		System.out.println("ex ���ʁF" + (k * n));
	}
}
public class sample41 {
	public static void main(String[] args) {
		ExMultiply ex_multi = new ExMultiply();
		ex_multi.sum4(5, 4);
	}
}