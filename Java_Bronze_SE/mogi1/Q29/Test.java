class Test {
  public static void main(String[] args) {
    int num = 10;
    Test obj = new Test();
    obj.method(5);
  }
  void method(int a){
    System.out.println(num + a);
  }
}
