import java.util.Random;
class Sample {
  public static void main(String args[]) {
    int num=ransu(10);
    num=num+100;
    System.out.println(num);
  }

  public static int ransu(int x){
    Random rand = new Random();
    int num = rand.nextInt(x);
    retrun num;
}
}