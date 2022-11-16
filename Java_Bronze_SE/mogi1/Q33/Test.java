class Test {
  int method(int num1) {
    return num1 * num1;
  }
  double method(int num2) {
    return num2 * 0.9;
  }
  public static void main(String[] args) {
    int data = 10;
    Test obj = new Test();
    System.out.println(obj.method(data));
  }
}
