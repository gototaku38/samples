class Test {
  public static void main(String[] args) {
    int x = 10;
    int y = (x = 3) + x;
    System.out.println(x + " " + y);
  }
}
