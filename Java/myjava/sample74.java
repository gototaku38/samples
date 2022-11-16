class ExThread extends Thread {
	public void run() {
		for(int i=0;i<=10;i++){
            System.out.println("i:"+i);
}
	}
}
public class sample74 {
	public static void main(String[] args) {
		ExThread et = new ExThread();
		et.start();
		for(int j=0;j<=10;j++){
            System.out.println("j:"+j);
}
	}
}
