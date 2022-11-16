interface Book {
  void getName();
}
class Java implements Book {
  public void getName () { System.out.print("Java "); }
}
class Linux {
  public void getName () { System.out.print("Linux "); }
}
public class Test {
  public static void main(String[] args) {
    Book[] books = { new Java(), new Linux() };
    for (int x = 0; x < books.length; x++)
      books[x].getName();
  }
}
