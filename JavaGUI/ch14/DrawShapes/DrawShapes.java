/*
 * DrawShapes.java
 */
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawShapes extends JFrame {

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine( 40, 45, 240, 45); // 直線を描く
        g.setColor(Color.BLACK);
        g.drawRect( 70, 90, 120, 80); // 長方形を描く
        g.setColor(Color.BLUE);
        g.drawOval(50, 50, 200, 150); //楕円を描く
    }

	DrawShapes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DrawShapes");
        setSize(280, 230);
        setVisible(true);
	}

    public static void main(String[] args) {
        new DrawShapes();
    }
}
