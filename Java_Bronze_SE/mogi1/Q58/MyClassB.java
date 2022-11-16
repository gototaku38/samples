class MyClassA { }
public class MyClassB extends MyClassA {
  public static void main(String[] args) {
    MyClassA obj1 = new MyClassA();
    MyClassB obj2 = new MyClassB();
    MyClassB obj3 = (MyClassB)obj1;
    Object obj4 = (Object)obj1;
    String obj5 = (String)obj1;
    MyClassA obj6 = (MyClassA)obj2;
  }
}

