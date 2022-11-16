class Vehicle {
  Vehicle() {
    System.out.print("Vehicle ");
  }
}
class Bike extends Vehicle {
  Bike() {
    System.out.print("Bike ");
  }
}
class Bicycle extends Bike {
  Bicycle() {
    System.out.print("Bicycle ");
  }
  public static void main(String[] args) {
    Bicycle obj = new Bicycle();
  }
}
