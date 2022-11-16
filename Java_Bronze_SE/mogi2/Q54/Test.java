class Bar {
  void func() {
    System.out.println("Bar:func()");
  }
}
class Test extends Bar {
  void func() {
    System.out.println("Test:func()");
  }
  public static void main(String[] args) {
    Bar obj = new Bar();
    Test tObj = (Test)obj;
    tObj.func();
  }
}

