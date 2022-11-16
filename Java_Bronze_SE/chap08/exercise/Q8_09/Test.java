interface I {
  void func();
}
class A implements I {
  public void func(){ System.out.println("A "); }
}
class B extends A {
  public void func(){ System.out.println("B "); }
}
class Test {
  public static void main(String[] args) {
    I obj = new B();
    obj.func();
  }
}
