/**
 * 数値計算サンプルクラス<br>
 * プログラム実行時の引数を二乗して出力する
 * @author Yuri Sakashita
 * @version 1.0
 */
public class sample_manual {
    /**
     * mainメソッド
     * @param args 実行時引数
     * @see  java.lang.Integer#valueOf
     * @exception ArrayIndexOutOfBoundsException プログラム実行時引数なしの場合に発生
     */
    public static void main(String[] args) {
        try {
            int x = Integer.valueOf(args[0]);
            System.out.print(x + "*" + x + "=" + calc(x));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外参照例外");
        }
    }
    
    /**
     * calcメソッド<br>
     * 引数の二乗値を返す
     * @param i 二乗する数値
     * @return 引数値を二乗した数値
     */
    static int calc(int i) {
        int j = i*i;
        return j;
    }
}
