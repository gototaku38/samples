class Test {
  public static void main(String[] args) {
    boolean var = false;
    if(var = true){
      while(var) {
        System.out.print("a ");
        var = false;
      }
    }else {
      System.out.print("b ");
    }
  }
}
