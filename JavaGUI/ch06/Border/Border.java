/*
* Border.java
*/
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border extends JFrame {

    Border() {

    	// レイアウトを設定する
        this.setLayout( new BorderLayout( 5, 5) );
        // ウィンドウを閉じたら終了するようにする
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	// コンポーネントを作る
        JButton btnn = new JButton("North Button");
        JButton btns = new JButton("South Button");
        JButton btnw = new JButton("West");
        JButton btne = new JButton("East");
        JButton btnc = new JButton("Center Button");

    	// コンポーネントを配置する
        add(btnn, BorderLayout.NORTH);
        add(btns, BorderLayout.SOUTH);
        add(btnw, BorderLayout.WEST);
        add(btne, BorderLayout.EAST);
        add(btnc, BorderLayout.CENTER);

        this.setTitle("Border");
        this.pack();
        this.setSize(300, 160);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}
