class Test {
  public static void main(String[] args) {
    int num = 0;
    boolean flag = false;
    while((num++ < 3) && !flag) {
      System.out.print("5 ");
      if(num == 2) {
        flag = true;
        System.out.print("* ");
      }
    }
  }
}
