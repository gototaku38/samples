public class sample51 {
	public static void main(String[] args) {
		try {
			System.out.println("‘æ1ˆø”:" + args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("‘æ1ˆø”‚Í‘¶İ‚µ‚È‚¢");
		} finally {
			System.out.println("ˆø”‚Ìo—ÍI—¹");
		}
	}
}

