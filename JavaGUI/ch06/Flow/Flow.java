/*
* Flow.java
*/
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow extends JFrame {

    Flow() {

        // パネルを作ってレイアウトを設定する
        JPanel panel = new JPanel();
        panel.setLayout( new FlowLayout(FlowLayout.CENTER, 5, 5));

        // ウィンドウを閉じたら終了するようにする
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // コンポーネントを作る
        JButton btn[] = new JButton[5];
        for (int i=0; i<5; i++)
            btn[i] = new JButton("Button:" + Integer.toString(i));
        for (int i=0; i<5; i++)
            panel.add(btn[i]);

        this.getContentPane().add(panel);
        this.setTitle("Flow");
        this.pack();
        this.setSize(220, 180);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Flow();
    }
}
