interface Foo{
  private int a = 1;      //‡@
  public int b = 1;       //‡A
  abstract int c = 1;     //‡B
  static int d = 1;       //‡C
  final int e = 1;        //‡D
}
