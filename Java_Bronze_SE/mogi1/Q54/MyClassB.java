class MyClassA {
  String str;
}
public class MyClassB extends MyClassA {
  public MyClassB(String str){
    this.str = str;
  }
  void show() {
    System.out.println("MyClassB : " + str);
  }
  public static void main(String[] args) {
    MyClassA obj = new MyClassB("Hello");
    [    ‡@    ]
  }
}

