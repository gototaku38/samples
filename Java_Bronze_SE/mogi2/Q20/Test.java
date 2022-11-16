class Test {
  public static void main(String[] args) {
    int arry[] = {10, 30, 50};
    int num = 0;
    for (int val : arry) {
      switch (val) {
        case 10:
          num++;
        case 20:
          num++;
          break;
        case 30:
          num++;
          break;
        case 40:
         num++;
        case 50:
          num++;
      }
    }
    System.out.println(num);
  }
}
