interface Foo {
  public int exec(int x, int y);
}
class MyClassA implements Foo{
  public int exec(int x, int y){
    return (x * y)/2;
  }
}
class MyClassB implements Foo{
  public int exec(int x, int y){
    return (int)(x * y * 3.14);
  }
}
public class Test {
  public static void main(String[] args) {
    Foo[] foos = {new MyClassA(), new MyClassB()};
    System.out.print(foos[0].exec(10, 5) + " ");
    System.out.print(foos[1].exec(10, 5));
  }
}