class ClassA {
  String msg;
  ClassA(String msg) {
    this.msg = msg;
  }
}
class ClassB extends ClassA {
  private String type;
  ClassB(String msg, String type) {
    
    super(msg);
    this.type = type;
    /**/
    /*
    this.type = type;
    super(msg);
    */
    /*
    this.type = type;
    super.msg = msg;
    */
    /*
    super.msg = msg;
    this.type = type;
    */
    /*
    this.type = type;
    ClassA.msg = msg;
    */
  }
  public static void main(String[] args) {
    ClassB obj = new ClassB("Hi", "Text");
    System.out.println(obj.msg + " : " + obj.type);
  }
}
