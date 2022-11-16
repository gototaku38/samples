class Foo {
  Foo() { System.out.print("Foo()  "); }
  Foo(String s) { System.out.print("Foo(String s)  "); }
}
class Test extends Foo{
  Test() { System.out.print("Test()"); }
  Test(String s) { System.out.print("Test(String s)"); }
  public static void main(String[] args) {
    Test obj = new Test("test");
  }
}
