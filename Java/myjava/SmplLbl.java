/*
 * SmplLbl.java
 */
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class SmplLbl extends JFrame {

	SmplLbl() {
        // ラベルを作る
        JLabel label = new JLabel("ラベルサンプル");
        label.setPreferredSize(new Dimension(220, 40));
        // 背景色を設定する
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true);
        // 境界を設定する
        LineBorder border = new LineBorder(Color.BLUE, 2, true);
        label.setBorder(border);
        // 文字列の水平表示位置を指定する
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        panel.add(label);

        setTitle("SmpleLbl");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        setSize(300, 220);
        setVisible(true);
	}

	public static void main(String[] args) {

        new SmplLbl();
	}

}
