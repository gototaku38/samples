class Test {
  public static void main(String[] args) {
    String str = "abcde";
    for (int i = 2; i < 4; i++) {
      char c = str.charAt(i);
      if (c != -1) {
        switch (c) {
          case 'a':
            System.out.print("a");
            break;
          case 'b':
            System.out.print("b");
            break;
          case 'c':
            System.out.print("c");
            break;
          case 'd':
            System.out.print("d");
            break;
          case 'e':
            System.out.print("e");
          break;
        }
      }
    }
  }
}
