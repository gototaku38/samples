/*
 * BarGraph.java
 */
import java.awt.Graphics;

import javax.swing.JFrame;

public class BarGraph extends JFrame {

    int data[] = {25, 36, 14, 56, 74, 49, 83, 45, 55, 89, 100};

    public void paint(Graphics g)
    {
        super.paint(g);
        // 横軸を描く
        g.drawLine( 50, 250, 250, 250);
        for (int i=0; i<11; i++) {
            String s = String.format("%3d", i * 10);
            g.drawString(s, i  * 20 + 50, 270);
        }
        // 縦軸を描く
        g.drawLine( 50, 40, 50, 250);
        for (int i=0; i<11; i++) {
            String s = String.format("%3d", i * 10);
            g.drawString(s, 28, 254 - i  * 20);
        }
        // データを描く
        for (int i=0; i<11; i++) {
            int x = i * 20 + 50;
            int y = 250 - data[i] * 2;
            int w = 20;
            int h = data[i] * 2;
            g.drawRect( x, y, w, h);
        }
    }

    BarGraph() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BarGraph");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]){
        new BarGraph();
    }
}
