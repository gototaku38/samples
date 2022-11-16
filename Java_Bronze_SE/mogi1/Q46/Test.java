class Test {
  int num1, num2;
  public Test(int num2) {
    this.num2 = num2;
  }
  public Test(int num1, int num2) {
    this.num1 = num1++;
    this(++num2);
  }
  public static void main(String[] args) {
    int num1 = 3;
    int num2 = 5;
    Test obj = new Test(num1, num2);
    System.out.println(obj.num1 + " : " + obj.num2);
  }
}
