class Test {
  public static void main(String[] args) {
    int num = 1;
    for (num = 0; num < 3; ++num) {
      num *= 2;
    }
    System.out.println("num = " + (num++));
  }
}
