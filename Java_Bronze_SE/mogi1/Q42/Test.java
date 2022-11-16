class A {
  void processA() { }
  void processB(String data) { }
  int processC(int val1, double val2) { return 0; }
  int processD(int num) { return 0; }
}
class B extends A {
  public void processA() { }
  public void processB(String[] data) { }
  int processC(int val1, float val2) { return 0; }
  int processD(int num) { return 0; }
}

