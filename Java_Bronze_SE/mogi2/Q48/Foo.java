public abstract class Foo {
  public Foo(String str) {
    methodA(str);
    methodB();
  }
  public void methodA(String str) {
    System.out.print(str + " ");
  }
  public abstract void methodB();
  
  public static void main(String[] args) {
    System.out.print("start ");
    Foo obj = new Foo("orange");
    obj.methodA("lemon");
  }
}
