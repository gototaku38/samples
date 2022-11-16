class ClassA {
  String name;
  ClassA(String name) { this.name = name; }
  public void show(){
    System.out.println(name);
  }
}
class ClassB extends ClassA {
  private String no;
  ClassB(String no, String name) {
    super(name);
    this.no = no;
  }
  public void show(){
    System.out.println(no + " : " + name);
  }
}
class Test {
  public static void main(String[] args) {
    ClassA obj1, obj2;
    obj1 = new ClassA("taro");
    obj2 = new ClassB("T001", "ryo");
    obj1.show();
    obj2.show();
  }
}
