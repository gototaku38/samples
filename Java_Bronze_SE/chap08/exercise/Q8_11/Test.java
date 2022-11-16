class A { }
class B extends A { }
class C {}
class Test {
  public static void main(String[] args) {
    A a = new C();
    C c = (C)a;
  }
}
