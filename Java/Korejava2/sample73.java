import p_calc.*;
class Ex_Calc extends Calc {
	public int sum3(int i, int j){
		return sum2(1, 2);
	}
}
public class sample73 {
	public static void main(String[] args) {
		Ex_Calc calc = new Ex_Calc();
		System.out.println(calc.sum3(1, 2));
	}
}
