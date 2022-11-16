/*
 * UndecorateWnd.java
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UndecorateWnd extends JFrame{

    public static void main(String[] args) {
		new UndecorateWnd();
	}

    public UndecorateWnd(){

        JButton button = new JButton("閉じる");
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 System.exit(0);
            }
        });
        getContentPane().add(button);

        // ウィンドウを閉じたら終了するようにする
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 最小サイズを設定する
        setMinimumSize(new java.awt.Dimension(250, 160));

        // ウィンドウの装飾を表示しない
        setUndecorated(true);
        // パックして表示する
        pack();
        setVisible(true);
    }
}
