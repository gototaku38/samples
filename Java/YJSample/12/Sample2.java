//�̂���̃N���X
abstract class Vehicle
{
   protected int speed;
   public void setSpeed(int s)
   {
     speed = s;
     System.out.println("���x��" + speed + "�ɂ��܂����B");
   }
   abstract void show();
}
//�ԃN���X
class Car extends Vehicle
{
   private int num;
   private double gas;
   
   public Car(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("�i���o�[" + num + "�K�\������" + gas+ "�̎Ԃ��쐬���܂����B");
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
      System.out.println("���x��" + speed + "�ł��B");
   }
}
//��s�@�N���X
class Plane extends Vehicle
{
   private int flight;

   public Plane(int f)
   {
      flight = f;
      System.out.println("��" + flight + "�̔�s�@���쐬���܂����B");
   }
   public void show()
   {
      System.out.println("��s�@�̕ւ�" + flight + "�ł��B");
      System.out.println("���x��" + speed + "�ł��B");
   }
}

class Sample2
{
   public static void main(String[] args)
   {
      Vehicle[] vc;
      vc = new Vehicle[2];

      vc[0] = new Car(1234, 20.5);
      vc[1] = new Plane(232);

      for(int i=0; i<vc.length; i++){
          if(vc[i] instanceof Car)
            System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł��B");
          else
            System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g��Car�N���X�ł͂���܂���B");
      }
   }
}