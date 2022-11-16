class Foo {
  // ‚±‚±‚ÉƒR[ƒh‚ğ‘}“ü
    int[] data = {a, b};
    return data;
  }
}
class Test {
  public static void main(String[] args) {
    Foo obj = new Foo();
    int[] array = obj.method(100, 200);
    System.out.println(array[0] + " " + array[1]);
  }
}
