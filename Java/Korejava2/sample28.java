public class sample28 {
	public static void main(String[] args) {
		int i;
		int j;
	LOOP1:
		for(j = 0; j < 10;j++) {
			System.out.print(j + ":");
			i = 0;
			while(i < 10) {
				System.out.print(" " + i);
				if(i*j > 20) { break LOOP1; }
				i++;
			}
			System.out.print("\n");
		}
	}
}
