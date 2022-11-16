class MyClassA {
  static String data;
  public void show() {
    System.out.println("MyClassA : " + data);
  }
}
public class MyClassB extends MyClassA {
  public static void show() {
    System.out.println("MyClassB : " + data);
  }
  public static void main(String[] args) {
    MyClassA obj1, obj2;
    obj1 = new MyClassA();
    obj2 = new MyClassB();
    obj1.data = "Hello";
    obj2.data = "Bye";
    obj1.show();
    obj2.show();
  }
}

