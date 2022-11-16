public class sample66 {
	public static void main(String[] args) {
		int j;
		int i = 0;
		for(j = 0; j < args.length; j++) {
			i += Integer.parseInt(args[j]);
		}
		System.out.println(i);
	}
}
