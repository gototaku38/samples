class Foo {
  void Foo() { System.out.println("Hello"); }
  void Foo(String str) { System.out.println("Bye"); }
}
class Test {
  public static void main(String[] args) {
    Foo f = new Foo();
  }
}
