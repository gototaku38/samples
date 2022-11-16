abstract class ClassA {
  public abstract String method(); 
}
class ClassB extends ClassA {
  //void method(String s){ }
  
  //String method() { return null; }
  
  //public void method() { }
  
  //public void method(String s){ }
  
  public String method() { return null; }
  
  //public String method(String s) { return null; }
}
