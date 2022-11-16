class Bar {
  String getStr() {
    return "Bar";
  }
}
class Test extends Bar {
  String getStr() {
    return "Test";
  }
  public static void main(String[] args) {
    Bar obj = new Test();
    Test t = (Test)obj;
    System.out.println(t.getStr());
  }
}

