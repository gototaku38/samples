class Test {
  public static void main(String[] args) {
    int x = 10;
    for(int y = 1; y < 3; y++) {
      x++;
      switch(x){
        case 11:
          System.out.print("11 ");
        case 12:
          System.out.print("12 ");
        case 13:
          System.out.print("13 ");
      }
    }
  }
}
