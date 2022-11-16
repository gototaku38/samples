class Test {
  static String lang = "C";
  public String operation = "Unix";
  Test() { }
  Test(String str) {
    operation = str;
  }
  public static void main(String args[]) {
    Test obj1 = new Test();
    Test obj2 = new Test("Solaris");
    obj2.lang = "Java";
    System.out.println(obj1.lang + "\t" + obj1.operation);
    System.out.println(obj2.lang + "\t" + obj2.operation);
  }
}
