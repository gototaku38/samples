class Test {
  public static void main(String[] args) {
    int a = 0;
    boolean b = false;
    while((a++ < 3) && !b){
      System.out.print("x ");
      if(a == 2) {
        System.out.print("y ");
      }
    }
  }
}
