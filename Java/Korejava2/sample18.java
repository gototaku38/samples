public class sample18 {
	public static void main(String[] args) {
		int i = (int)(Math.random() * 10);
		int amari = i % 3;
		switch (amari) {
		case 0: System.out.println("—”" + i + "‚Í3‚Ì”{”‚Å‚·B");
			break;
		case 1: System.out.println("—”" + i + "‚Í3‚Ì”{”+1‚Å‚·B");
			break;
		case 2: System.out.println("—”" + i + "‚Í3‚Ì”{”+2‚Å‚·B");
			break;
		default:break;
		}
	}
}
