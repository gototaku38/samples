abstract class MyClassA {
  public abstract void methodA();
  void methodB() {
    System.out.println("MyClassA#methodB");
  }
}
public class MyClassB extends MyClassA {
  /*
  void methodA() {
    System.out.println("MyClassB#methodA");
  }
  */
  
  public void methodA() {
    System.out.println("MyClassB#methodA");
  }
  
  /*
  public abstract void methodA() {
    System.out.println("MyClassB#methodA");
  }
  */
  /*
  public void methodB() {
    System.out.println("MyClassB#methodB");
  }
  */
  /*
  void methodB() {
    System.out.println("MyClassB#methodB");
  }
  */
}

