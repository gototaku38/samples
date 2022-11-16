class Test {
  public static void main(String[] args) {
    boolean b = false;
    int i = 0;
    if (i++ > 5 && !b)
      i++;
    if (i > 0)
      b = true;
    System.out.println("b=" + b + " i=" + i);
  }
}
