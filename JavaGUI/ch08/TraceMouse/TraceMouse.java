/*
 * TraceMouse.java
 */

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class TraceMouse extends JFrame {

    // Point型のリストを作成する
    ArrayList<Point> poss = new ArrayList<Point> ();

    public void paint(Graphics g)
    {
        super.paint(g);
        for (int i=0; i<poss.size()-1; i++){
            int x1 = (int)poss.get(i).getX();
            int y1 = (int)poss.get(i).getY();
            int x2 = (int)poss.get(i+1).getX();
            int y2 = (int)poss.get(i+1).getY();
            g.drawLine(x1, y1, x2, y2);
        }
    }

    class MyMouseLisner implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            Point pos = e.getPoint();
            poss.add(pos);
            repaint();
        }
        public void mouseMoved(MouseEvent e) {
            poss.clear();
        }
	}

    TraceMouse () {
        addMouseMotionListener(new MyMouseLisner());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TraceMouse");
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TraceMouse();
    }
}

