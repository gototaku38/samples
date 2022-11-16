class Super {
  int num;
  public void methodA() { num += 100; }
  public void print() { System.out.println("num 値 :" + num); }
}
class Sub extends Super {
  public void methodA() { num += 500; }
  public void methodB() {
    methodA(); // 7 行目が呼び出される
    print(); // スーパークラスのメソッド呼び出し
    super.methodA(); // 3 行目が呼び出される
    print(); // スーパークラスのメソッド呼び出し
  }
}
class Sample7_5 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.methodB();
  }
}
