class Test {
	int sum(int[] data){
		int r = 0;
		int i;
		for(i = 0; i < data.length; i++)
			r += data[i];
		return r;
	}
}
public class sample34 {
	public static void main(String[] args) {
		Test test = new Test();
		int[] data1 = new int[]{1,2,3,4,5};
		int result;
		result = test.sum(data1);
		System.out.println(result);
	}
}
