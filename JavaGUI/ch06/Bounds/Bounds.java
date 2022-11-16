/**
 * Bounds.java
 */
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bounds {

	Bounds() {
        JFrame frame = new JFrame("Bounds");

        // レイアウトを設定する
        FlowLayout layout =new FlowLayout( FlowLayout.CENTER, 5, 5);
        JPanel panel = new JPanel();
        panel.setLayout( layout );

        // コンポーネントを作する
        JButton btn[] = new JButton[8];
        for (int i=0; i<8; i++)
            btn[i] = new JButton("Button:" + Integer.toString(i));
        // コンポーネントを配置する
        for (int i=0; i<8; i++)
            panel.add(btn[i]);
        frame.setTitle("Flow");
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setSize(300,200);
        frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Bounds();
	}
}

