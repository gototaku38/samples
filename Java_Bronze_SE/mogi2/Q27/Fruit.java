public class Fruit {
  String kind = "orange";
  public static void main(String[] args) {
    String kind = args[1];
    Fruit obj = new Fruit();
    System.out.println(obj.kind); 
  }
}

