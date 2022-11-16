class Foo {
  Foo() { System.out.println("Hello"); }
  private Foo(String str) { System.out.println("Bye"); }
}
class Test {
  public static void main(String[] args) {
    Foo f = new Foo();
  }
}
