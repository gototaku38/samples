//�ԃN���X
class Car
{
   private int num;
   private double gas;
   
   public Car()
   {
      num = 0;
      gas = 0.0;
      System.out.println("�Ԃ��쐬���܂����B");
   }
   public Car(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("�i���o�[" + num + "�K�\������" + gas + "�̎Ԃ��쐬���܂����B");
   }
   public void setCar(int n, double g)
   {
      num = n;
      gas = g;
      System.out.println("�i���o�[��" + num + "�ɃK�\�����ʂ�" + gas + "�ɂ��܂����B");
   }
   public void show()
   {
      System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
      System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
   }
}
//���[�V���O�J�[�N���X
class RacingCar extends Car
{
   private int course;
   
   public RacingCar()
   {
      course = 0;
      System.out.println("���[�V���O�J�[���쐬���܂����B");
   }
   public RacingCar(int n, double g, int c)
   {
      super(n, g);
      course = c;
      System.out.println("�R�[�X�ԍ�" + course + "�̃��[�V���O�J�[���쐬���܂����B");
   }
   public void setCourse(int c)
   {
      course = c;
      System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
   }
}

class Sample2
{
   public static void main(String[] args)
   {
      RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
   }
}