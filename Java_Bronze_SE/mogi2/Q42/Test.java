class A {
  void show() {
    System.out.print("X ");
  }
}
class B {
  public void show() {
    System.out.print("Y ");
  }
}
class Test{
  public static void main(String[] args) {
    A obj = new B();
    obj.show();
  }
}
