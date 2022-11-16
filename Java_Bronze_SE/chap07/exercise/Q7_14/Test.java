class Foo {
  int a, b;
  Foo (int b) {
    this.b = b;
  }
  Foo (int a, int b) {
    this.a = a++;
    this(++b);
  }
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    Foo obj = new Foo(a, b);
    System.out.println(obj.a + " : " + obj.b);
  }
}
