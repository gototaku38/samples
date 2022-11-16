class Test {
	int[] sum(int[] data){
		int[] r = new int[data.length];
		int i;
		for(i = 0; i < data.length; i++)
			r[i] = data[i]*data[i];
		return r;
	}
}
public class sample34X {
	public static void main(String[] args) {
		Test test = new Test();
		int[] data1 = new int[]{1,2,3,4,5};
		int result[];
		int i;
		result = test.sum(data1);
		for(i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}
}
