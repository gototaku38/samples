class ExThread extends Thread {
	String str;
	Calc obj;
	ExThread (String s, Calc c){
		str = s;
		obj = c;
	}
	public void run() {
		try {
			obj.calc(str);
		}catch (Exception e) {
			System.out.println("エラー");
		}
	}
}
class Calc {
	int i = 0;
	public void calc(String str) throws Exception {
		int n = i;
		Thread.sleep(1000);
		i = n + 10;
		System.out.println(str + "\ti:" + i);
	}
}
public class sample75 {
	public static void main(String[] args) {
			Calc c = new Calc();
		ExThread et = new ExThread("et", c);
		et.start();
			ExThread et2 = new ExThread("et1", c);
		et2.start();
		try {
		}catch (Exception e) {
			System.out.println("エラー");
		}
	}
}
