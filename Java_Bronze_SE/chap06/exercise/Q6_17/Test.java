class Test {
  static int num;
  void methodA() { num++; }
  static void methodB() { num++; }
  public static void main(String[] args) {
    methodA(); methodB();
    System.out.println(num);
  }
}