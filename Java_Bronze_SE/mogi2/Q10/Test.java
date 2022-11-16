public class Test {
  public static void main(String[] args) {
    String words = "ABCDEFGHIJ";
    String msg = null;
    switch(words.charAt(7)){
      case 'H':
        msg = "Hello ";
        break;
      case 'G':
        msg = "GoodBye ";
      default:
        msg = "other ";
    }
    System.out.println(msg);
  }
}
