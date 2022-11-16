class Test {
  public static void main(String[] args) {
    int num = 0;
    do {
      num++;
      if(num % 2 == 0)
        num++;
      System.out.print(num + " ");
    }while(num <= 10);
  }
}
