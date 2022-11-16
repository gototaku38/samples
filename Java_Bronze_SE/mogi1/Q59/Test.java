interface Fruit {
  int get();
}
class Lemon implements Fruit {
  public int get() { return 7; }
}
class Orange {
  public int get() { return 64; }
}
class Test {
  public static void main(String[] args) {
    Fruit[] ary = {new Lemon(), new Orange()};
    for(int i = 0; i < ary.length; i++) {
      System.out.print(ary[i].get() + " ");
    }
  }
}
