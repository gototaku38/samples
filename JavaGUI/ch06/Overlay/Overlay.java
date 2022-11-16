/*
 * Overlay.java
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class Overlay extends JFrame {

    Overlay() {

        JPanel panel = new JPanel();
        OverlayLayout layout =new OverlayLayout( panel );
        panel.setLayout( layout );
        JButton button1 = new JButton("ボタン1");
        button1.setForeground(Color.red);
        button1.setFont(new Font("Serif", Font.BOLD, 14));
        panel.add(button1);
        JButton button2 = new JButton("-- ボタン2l --");
        button2.setForeground(Color.green);
        button2.setFont(new Font("Serif", Font.BOLD, 18));
        panel.add(button2);
        JButton button3 = new JButton("<<< ボタン3 >>>");
        button3.setForeground(Color.blue);
        button3.setFont(new Font("Serif", Font.BOLD, 22));
        panel.add(button3);
        getContentPane().add(panel);

        this.setTitle("Overlay");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(260, 150);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Overlay();
    }
}
