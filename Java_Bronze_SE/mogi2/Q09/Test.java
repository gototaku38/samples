class Employee { }

public class Test {
  public static void main(String[] args) {
    Employee e1 = new Employee();
    Employee e2 = e1;
    Employee e3 = new Employee();
   
    if(e1 == e2) {
      System.out.println("e1 == e2");
    }else{
      System.out.println("e1 != e2");
    }
    if(e1 == e3) {
      System.out.println("e1 == e3");
    }else{
      System.out.println("e1 != e3");
    }
  }
}
