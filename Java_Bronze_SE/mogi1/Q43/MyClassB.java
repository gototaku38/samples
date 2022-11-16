class MyClassA {
  int a;
  MyClassA() {
    a = 1;
  }
  MyClassA(int a) {
    this.a = a;
  }
}
public class MyClassB extends MyClassA {
  int b, c;
  public MyClassB(int b){
    this.b = b;
  }
  public MyClassB(int b, int c){
    this(b);
    this.c = c;
  }
  public static void main(String[] args) {
    MyClassB obj = new MyClassB(10, 20);
    System.out.println(obj.a + " " + obj.b + " " + obj.c);
  }
}

