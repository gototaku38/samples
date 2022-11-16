class calcException extends Exception {
}
public class sample53 {
	public static void main(String[] args) {
		try {
			calc(2, 2);
		} catch (calcException e) {
			System.out.println("calcException‚ª" + "throw‚³‚ê‚Ü‚µ‚½");
		}
	}
	static void calc (int i, int j) throws calcException {
		if(i == j) {
			calcException ce = new
				calcException();
			throw ce;
		}
		System.out.println(i * j);
	}
}
