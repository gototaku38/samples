class Test {
  public static void main(String[] args) {
    String[] ary = new String[3];
    ary[1] = "Lemon";
    ary[2] = null;
    ary[3] = "Grape";
    for(int i = 0; i < ary.length; i++) {
      System.out.print(ary[i] + " ");
    }
  }
}
