class SuperClass {
  public void show() {
    System.out.print("SuperClass ");
  }
}
public class SubClass {
  public void show() {
    System.out.println("SubClass");
  }
  public static void main(String[] args) {
    SuperClass obj = new SubClass();
    obj.show();
  }
}

