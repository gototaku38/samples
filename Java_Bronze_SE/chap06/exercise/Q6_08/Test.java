class Test {
  static void func(int a, int b) { System.out.print(a + b); }
  static void func(String a, String b) { System.out.print(a + b); }
  public static void main(String[] args) {
    func(10, 20); func("a", "b");
  }
}
