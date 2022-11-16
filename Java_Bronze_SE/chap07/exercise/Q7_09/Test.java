class Foo {
  String data1;
  Foo(String data1) {
    this.data1 = data1;
  }
}
class Bar extends Foo {
  private String data2;
  Bar(String data1, String data2){
    // ‚±‚±‚ÉƒR[ƒh‚ğ‘}“ü    
  }
  public static void main(String[] args) {
    Bar obj = new Bar("Java", "Bronze");
    System.out.println(obj.data1 + " " + obj.data2);
  }
}
