class Test {
  public static void main(String[] args) {
    int i = 23; int j = 5;
    Loop:for (; j < i; i++) {
      do {
        i += j;
        if (--j == 0) break Loop;
        System.out.print("i=" + i + "j=" + j + " ");
      } while (i < 30);
    }
  }
}
