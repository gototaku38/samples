class Drink {
	String name;
	int capacity;
	int divide(int p) {
		return capacity / p;
	}
}
public class sample29 {
	public static void main(String[] args) {
		Drink wine = new Drink();
		int i;
		int p = 100;
		wine.name = "ƒƒCƒ“";
		wine.capacity = 750;
		i = wine.divide(p);
		System.out.println("–¼‘O:" + wine.name);
		System.out.println(p + "ml‚Å" + i + "”tæ‚ê‚Ü‚·");
	}
}
