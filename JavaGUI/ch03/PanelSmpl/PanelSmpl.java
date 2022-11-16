/*
 * PanelSmpl.java
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelSmpl {

	public static void main(String[] args) {

        JFrame frame = new JFrame("PanelSmpl");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ラベルを作って表示する
        JLabel label = new JLabel("ラベル");
        label.setPreferredSize(new Dimension(220, 40));
        LineBorder border = new LineBorder(Color.BLACK, 1, true);
        label.setBorder(border);
        label.setHorizontalAlignment(JLabel.CENTER);

        // ボタンを作って表示する
        JButton button = new JButton("閉じる");
        button.setPreferredSize(new Dimension(220, 40));
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                System.exit(0);
            }
        });

        // パネルを作る
        JPanel panel = new JPanel();
        // パネルにコンポーネントを追加する
        panel.add(label);
        panel.add(button);

        // パネルをフレームに追加する
        frame.getContentPane().add(panel);
        frame.setSize(300, 220);
        frame.setVisible(true);
	}

}
