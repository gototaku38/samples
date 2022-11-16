class A {
  int num = 10;
  void method() {
    System.out.println("A:method()");
  }
}
class B extends A {
  int num = 30;
  void method() {
    System.out.println("B:method()");
  }
}
public class Test {
  public static void main(String[] args) {
    B obj = new B();
    System.out.println(obj.num);
    obj.method();
  }
}

