class MyClassA { 
  private int num = 100;
  void show() {
    System.out.println(num);
  }
  void show(int val) {
    System.out.println(val);
  }
}
public class MyClassB extends MyClassA {
  public static void main(String[] args) {
    MyClassA obj = new MyClassB();
    obj.show(obj.num);
  }
}

