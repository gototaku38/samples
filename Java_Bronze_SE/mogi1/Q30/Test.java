class Test {
  static String fruit = "Grape";
  Test(String fruit) {
    this.fruit = fruit;
  }
  public static void main(String[] args) {
    Test obj1 = new Test();
    Test obj2 = new Test("Lemon");
    System.out.println(obj1.fruit + " : " + obj2.fruit);
  }
}
