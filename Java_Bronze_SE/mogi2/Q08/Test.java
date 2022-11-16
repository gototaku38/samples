public class Test {
  public static void main(String[] args) {
    String data = "null";
    if(data == null) {
      System.out.println("null");
    }else if(data.length() == 0) {
      System.out.println("0");
    }else{
      System.out.println("else");
    }
  }
}
