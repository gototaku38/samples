class ExThread implements Runnable {
	public void run() {
	for(int i=0;i<=10;i++){
      System.out.println("i:"+i);	
	}
}}

public class sample76 {
	public static void main(String[] args) {
		ExThread et = new ExThread();
		Thread th = new Thread(et);
		th.start();
		for(int i=0;i<=10;i++){
            System.out.println("j:"+i);}
}
	}

