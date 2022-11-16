class Test {
  int instanceVal = 100;
  static int staticVal = 200;
  void methodA() { System.out.println("methodA(): " + instanceVal);}
  static void methodB() {
                    System.out.println("methodB(): " + staticVal);}
}
class Sample6_6 {
  public static void main(String[] args) {
    //System.out.println(Test.instanceVal);      //‡@ NG
    System.out.println(Test.staticVal);          //‡A OK
    //Test.methodA();                            //‡B NG
    Test.methodB();                              //‡C OK
    System.out.println("-------------------");
    Test t = new Test();
    System.out.println(t.instanceVal);           //‡D OK
    System.out.println(t.staticVal);             //‡E OK
    t.methodA();                                 //‡F OK
    t.methodB();                                 //‡G OK
  }
}
