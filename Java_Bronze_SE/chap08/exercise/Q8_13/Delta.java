interface Foo { }
class Alpha implements Foo { }
class Beta extends Alpha { }
class Delta extends Beta {
  public static void main( String[] args ) {
    Beta x = new Beta();
    // ‚±‚±‚ÉƒR[ƒh‚ğ‘}“ü
  }
}
