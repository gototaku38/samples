/**
 * Fonts.java
 */
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fonts extends JFrame {

    Fonts() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout( panel, BoxLayout.Y_AXIS ));

        JLabel label1 = new JLabel();
        Font font1 = new Font(Font.SERIF, Font.PLAIN, 12);
        label1.setFont(font1);
        label1.setText("Font.SERIF, Font.PLAIN, 12");
        panel.add(label1);

        JLabel label2 = new JLabel();
        Font font2 = new Font(Font.SERIF, Font.ITALIC, 14);
        label2.setFont(font2);
        label2.setText("Font.SERIF, Font.ITALIC, 14");
        panel.add(label2);

        JLabel label3 = new JLabel();
        Font font3 = new Font(Font.SERIF, Font.BOLD, 16);
        label3.setFont(font3);
        label3.setText("Font.SERIF, Font.BOLD, 16");
        panel.add(label3);

        JLabel label4 = new JLabel();
        Font font4 = new Font(Font.SANS_SERIF, Font.PLAIN, 12);
        label4.setFont(font4);
        label4.setText("Font.SANS_SERIF, Font.PLAIN, 12");
        panel.add(label4);

        JLabel label5 = new JLabel();
        Font font5 = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        label5.setFont(font5);
        label5.setText("Font.MONOSPACED, Font.PLAIN, 12");
        panel.add(label5);

        this.getContentPane().add(panel);

        // ウィンドウを閉じたら終了するようにする
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Fonts");
        this.pack();
        this.setSize(280, 160);
        this.setVisible(true);
    }

	public static void main(String[] args) {
        new Fonts();
    }
}
