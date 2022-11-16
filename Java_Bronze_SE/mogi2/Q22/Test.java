class Test {
  public static void main(String[] args) {
    String[] str = new String[3];
    str[0] = "JP";
    str[1] = null;
    str[2] = "US";
    for (int i = 1; i < str.length; i++) {
      System.out.print(str[i] + " ");
    }
  }
}
