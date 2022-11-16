class Test {
  public static void main(String[] args) {
    int x = 100;
    x = method(x);
    System.out.println(x);
  }
  static int method(int a) {
    return a + 100;
  }
}
