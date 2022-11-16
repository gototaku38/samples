class Test {
  public static void main(String args[]) {
    String str = "Hello!";
    String str2 = "Bye!";
    str += str2;
    str -= str2;

    if ( str == str2 ) {
      System.out.println("str = str2");
    } else {
      System.out.println("str != str2");
    }
  }
}
