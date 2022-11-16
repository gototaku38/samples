class Foo {
  static int val;
  static int methodA() {
    return ++val;
  }
  int methodB() {
    return methodA();
  }
}
class Test {
  public static void main(String[] args) {
    Foo obj = new Foo();
    obj.methodA();
    int num = obj.methodB();
    System.out.println(num);
  }
}
