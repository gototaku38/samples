interface I {
  void show();
}
class ClassA implements I {
  public void show(){
    System.out.println("ClassA");
  }
}
class ClassB extends ClassA {
  public void show(){
    System.out.println("ClassB");
  }
  public static void main(String[] args) {
    I obj;
    ClassA objA = new ClassA();
    ClassB objB = new ClassB();
    obj = objB;
    obj.show();
  }
}
