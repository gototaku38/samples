/*
 * MousePoint.java
 */

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MousePoint extends JFrame {

    Point pos = null;

    public void paint(Graphics g)
    {
        super.paint(g);
        if (pos == null)
            return;
        int x = (int)pos.getX();
        int y = (int)pos.getY();
        String s = String.format("(%d,%d)", x, y);
        g.drawString(s, x, y);
    }

    class MyMouseLisner implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            pos = e.getPoint();
            repaint();
        }
        public void mouseEntered(MouseEvent e) { ; }
        public void mouseReleased(MouseEvent e){ ; }
        public void mousePressed(MouseEvent e) { ; }
        public void mouseExited(MouseEvent e) { ; }
    }

    MousePoint () {
        this.addMouseListener(new MyMouseLisner());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MousePoint");
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MousePoint();
    }
}

