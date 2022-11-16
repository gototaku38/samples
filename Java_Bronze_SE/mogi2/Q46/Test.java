class A {
  int func(int x , int y){
    return x / y;
  }
}
class B {
  int func(int x , int y) {
    return (int)(Math.PI * x * y);
  }
}
class Test {
  public static void main(String[] args) {
    A a = new A();
    System.out.print(a.func(10, 2) + " ");
    B b = new B();
    System.out.print(b.func(10, 10));
  }
}
