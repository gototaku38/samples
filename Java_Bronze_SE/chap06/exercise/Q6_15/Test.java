class Test {
  private static int a;
  private int b;
  public static int methodA(){
    return ++a;
  }
  public int methodB(){
    return methodA();
  }
  public static void main(String[] args) {
    Test obj = new Test();
    System.out.print(obj.methodB() + " ");
    System.out.print(obj.methodA());
  }
}
