class Test {
  public static void main(String[] args) {
    int num = 0;
    do {
      num++;
      if(num == 1) {
        continue;
      }
      System.out.print(num + " ");
    }while(num < 1);
  }
}
