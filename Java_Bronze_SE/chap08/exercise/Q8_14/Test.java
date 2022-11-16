interface I1 {
  public void display();
}
interface I2 {
  public void display();
}
class Test implements I1, I2 {
  public void display() {
    System.out.print("hello");
  }
}
