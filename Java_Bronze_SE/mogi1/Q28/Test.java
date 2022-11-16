class Test {
  String fruit;
  public void show() {
    System.out.println(fruit);
  }
  public static void main(String[] args) {
    Test obj1;
    Test obj2;
    obj1.fruit = "Grape";
    obj2.fruit = "Lemon";
    obj1.show();
    obj2.show();
  }
}
