class Test {
  boolean flag;
  public static void main(String[] args) {
    Test obj = new Test();
    
    //if(obj.flag.equals("true")) {
    //if(obj.flag == "true") {
    if(obj.flag) {
    //if(obj.flag = "true") {
    //if(obj.flag.equals(true)) {
      
      System.out.print("OK");
    } else {
      System.out.print("NG");
    }
  }
}