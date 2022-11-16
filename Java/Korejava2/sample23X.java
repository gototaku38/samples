public class sample23X {
	public static void main(String[] args) {
		int[][] data = new int[][]{
			{ 1, 2, 3 ,4 },
			{ 5, 6, 7, 8 },
			{ 9,10,11,12 }};
		int i,j;
		for(j = 0; j < data.length; j++) {
			for(i = 0; i < data[0].length; i++)
				System.out.print(data[j][i] + ",");
			System.out.println();
		}
	}
}
