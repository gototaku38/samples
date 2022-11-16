public class sample47 {
	public static void main(String[] args) {
		int i = 5;
		int j;
		Test[] ex_test = new Test[2];
		ex_test[0] = new ExTest();
		ex_test[1] = new ExTest2();
		for(j = 0; j < 2; j++) {
			ex_test[j].calc(i);
			System.out.println(ex_test[j] instanceof ExTest);
		}
	}
}
