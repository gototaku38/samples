public class Test {
  public static void main(String[] args) {
    char[] aryA = new char[5];
    aryA[0] = 'b';
    aryA[1] = 'y';
    aryA[2] = 'e';
    char[] aryB = {'o', 'r', 'a', 'n', 'g', 'e'};
    aryA = aryB;
    System.out.println(aryA);
  }
}
