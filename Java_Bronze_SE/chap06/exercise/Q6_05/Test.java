class Test {
  public static void main(String[] args) {
    int x = 5;
    Test t = new Test();
    t.go(x);
    System.out.print(" main:x =" + x);
  }
  void go(int x) {
    System.out.print(" go:x =" + x++);
  }
}
