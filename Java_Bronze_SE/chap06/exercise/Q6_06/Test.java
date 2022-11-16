class Test {
  int x = 50;
  int y = 100;
  public static void main(String[] args) {
    int x = 0, y = 10;
    Test t = new Test();
    while (x < 3) {
      x++; y--;
    }
    System.out.println("x = " + x + " , y = " + y);
  }
}
