class Automobile {
  public void drive() { System.out.print("go forward "); }
}
class Ferrari extends Automobile {
  public void drive() { System.out.print("go fast "); }
}
public class Test {
  public static void main(String[] args) {
    Automobile[] autos = { new Automobile(), new Ferrari() };
    for (int x = 0; x < autos.length; x++)
    autos[x].drive();
  }
}
