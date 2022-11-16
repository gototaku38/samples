class One {
  public One foo() { return this; }
}
class Two extends One {
  public One foo() { return this; }
}
class Three extends Two {
  // ‚±‚±‚ÉƒR[ƒh‚ğ‘}“ü
}
