class ClassA {
  long funcA(int num) { return 0; }
  long funcB(int num, String str) { return 0; }
}
class ClassB extends ClassA {
  long funcA(int num) { return 0; }
  int funcA(String str) { return 0; }
  int funcA(long num) { return 0; }
  public long funcB(int num, String str) { return 0; }
  public long funcB(String str, int num) { return 0; }
}
