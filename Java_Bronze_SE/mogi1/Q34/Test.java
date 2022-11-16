class Test {
  private static int x;

  public static int methodA() {
    return ++x; 
  }
  public int methodB() {
    return methodA();
  }
  public static void main(String[] args) {
    Test obj = new Test();
    System.out.println(obj.methodB() + " " + obj.methodA());
  }
}
