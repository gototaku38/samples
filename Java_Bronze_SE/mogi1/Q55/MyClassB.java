class MyClassA {
  void show() {
    System.out.print("MyClassA ");
  }
}
public class MyClassB extends MyClassA {
  public void show() {
    System.out.println("MyClassB");
  }
  public static void main(String[] args) {
    MyClassA obj = new MyClassB();
    obj.show();
  }
}

