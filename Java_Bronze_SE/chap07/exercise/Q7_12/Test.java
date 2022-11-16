class Foo {
  protected static int method(int a, int b) { return a * b; }
}
class Bar extends Foo{
  public static int method(int a, int b) {
    int c = super.method(a, b);
    return c;
  }
}
class Test {
  public static void main(String[] args) {
    Bar b = new Bar();
    System.out.print(b.method(3,4) + " ");
    System.out.print(Bar.method(2,3));
  }
}
