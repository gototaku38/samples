public class Bar {
  private String str1, str2;
  private String str3 = "orange";
  Bar(){
   this("grape");
   str1 = "peach";
  }
  Bar(String s) {
    str2 = s;
  }
  public void disp() {
    System.out.println(str1 + " : " + str2);
  }
  public static void main(String[] args) {
    Bar obj =  new Bar();
    obj.disp();
  }
}
