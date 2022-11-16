class Test {
  public float calc(int val1, float val2) {
    return val1 + val2;
  }
  public String calc(String val1, String val2) {
    return val1 + val2;
  }
  public static void main(String[] args) {
    Test obj = new Test();
    System.out.println("ans : " + obj.calc(10, 30));
    System.out.println("ans : " + obj.calc("20", "10"));
  }
}