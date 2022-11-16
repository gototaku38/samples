class ClassA {
  private String msg;
  int num;
  ClassA(){  }
  ClassA(String msg, int num) {
    this.msg = msg;
    this.num = num;
  }
  public void show() {
    System.out.println(msg + " : " + num);
  }
}
class ClassB extends ClassA {

}
