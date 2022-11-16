class Test {
  public static void main(String[] args) {
    char[] x = {'a', 'b', 'c'};
    char[] y = {'d', 'e'};
    for(int a = 0; a < x.length; a++) {
      System.out.print(x[a] + " ");
      for(int b = 0; b < y.length; b++) {
        System.out.print(y[b] + " ");
      }
    }
  }
}
