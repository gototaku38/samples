/*
 * DrawStr.java
 */

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyLabel extends JLabel {
	@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawString("ラベルに描いたテキスト", 1, 14);
    }
}

class MyPanel extends JPanel {
	@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.drawString("パネルに描いたテキスト", 10, 50);
    }
}

public class DrawStr extends JFrame {

	@Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawString("フレームのクライアント領域に描いたテキスト", 10, 200);
    }

    DrawStr() {
        MyLabel lbl = new MyLabel();
        lbl.setText("  　　　　　　　　      　  ");
        MyPanel panel = new MyPanel();
        panel.add(lbl);
        getContentPane().add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DrawStr");
        setSize(300, 220);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawStr();
    }
}
