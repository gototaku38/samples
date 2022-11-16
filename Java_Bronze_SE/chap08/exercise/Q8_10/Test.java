class Foo {
  String name;
}
class Bar extends Foo {
  Bar(String name) {
    this.name = name;
  }
  void show() {
    System.out.println(name);
  }
  public static void main(String[] args) {
    Foo obj = new Bar("hana");
    // ‚±‚±‚ÉƒR[ƒh‚ğ‘}“ü
  }
}