class Employee {
  int id;
  void setId(int i) {
    id = i;
  }
  int getId() {
    return id;
  }
}
class Sample6_2 {
  public static void main(String[] args) {
    // Aさん用オブジェクトを作成
    Employee a = new Employee();
    // IDをセットする
    a.setId(100);

    // Bさん用オブジェクトを作成
    Employee b = new Employee();
    // IDをセットする
    b.setId(200);

    // それぞれのIDの表示
    System.out.println("A さん： " + a.getId());
    System.out.println("B さん： " + b.getId());
  }
}
