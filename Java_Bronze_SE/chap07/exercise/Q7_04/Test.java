class X {
  static int val;
}
class A extends X {
  A() { val++; }
}
class B extends X {
  B() { val++; }
}
class Test {
  public static void main(String[] args) {
    new A(); new B();
    System.out.println(X.val);
  }
}
