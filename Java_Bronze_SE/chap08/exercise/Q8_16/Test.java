interface MyInter {
  public static final int VAL = 3;
  void foo(int s);
}
public class Test implements MyInter {
  public static void main(String [] args) {
    int x = 5;
    new Test().foo(++x);
  }
  void foo(int s) {
    s += VAL + ++s;
    System.out.println("s:" + s);
  }
}
