class Sample6_7 {
  int instanceVal;             //ƒCƒ“ƒXƒ^ƒ“ƒX•Ï”
  static int staticVal;        //static •Ï”

  int methodA() { return instanceVal; }           //‡@ OK
  int methodB() { return staticVal; }             //‡A OK
  //static int methodC() { return instanceVal; }  //‡B NG
  static int methodD() { return staticVal; }      //‡C OK
  static int methodE() {                          //‡D OK
    Sample6_7 obj = new Sample6_7();
    return obj.instanceVal;
  }
}
