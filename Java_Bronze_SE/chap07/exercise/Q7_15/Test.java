public class Test {
  public void foo() {
    bar();
  }
  private void bar() { };
  public static void main(String args[]) {
    Test test = new Test();
    test.foo();
  }
}
