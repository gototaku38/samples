interface A { }
interface B { void b(); }
interface C { public void c(); }
abstract class D implements A,B,C { }
class E extends D {
  void b() { }
  public void c() { }
}
