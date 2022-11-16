class A {
  int num = 10;
  void func(){ num++; }
}
class B extends A {
  static int num = 30;
  static void func() { num++; }
}
class Test {
  public static void main(String[] args) {
    A obj = new B();
    obj.func();
    System.out.println(obj.num);
  }
}
