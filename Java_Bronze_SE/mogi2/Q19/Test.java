class Test {
  public static void main(String[] args) {
    String[] ary = {"A","B","C"};
    for(int i = 0; i < 2; i++) {
      for(String s : ary){
        System.out.print(ary[i] + " ");
      }
    }
  }
}