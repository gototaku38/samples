public abstract class Foo {
  public Foo(String data){
    methodA(data);
    methodB();
  }
  public void methodA(String data) {
    System.out.println(data);
  }
  public abstract void methodB();
  
  public static void main(String[] args) {
    Foo obj = new Foo("Hello");
    obj.methodA("Bye");
  }
}
