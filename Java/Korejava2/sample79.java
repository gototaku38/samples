import java.util.ArrayList;
public class sample79 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		Integer i = new Integer(1);
		array.add(i);
		array.add(new String("•¶Žš—ñ"));
		System.out.println(array.get(0));
		System.out.println(array.get(1));
	}
}
