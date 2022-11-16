/*
 * JFrameWnd1.java
 */
import javax.swing.JFrame;

public class JFrameWnd1 extends JFrame{

    public static void main(String[] args) {
		new JFrameWnd1();
	}

    public JFrameWnd1(){

        // ウィンドウを閉じたら終了するようにする
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 最小サイズを設定する
        setMinimumSize(new java.awt.Dimension(250, 160));

        // パックして表示する
        pack();
        setVisible(true);
    }
}
