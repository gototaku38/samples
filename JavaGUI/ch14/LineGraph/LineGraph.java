/*
 * LineGraph.java
 */
import java.awt.Graphics;

import javax.swing.JFrame;

public class LineGraph extends JFrame {

    int data[] = {25, 36, 14, 56, 74, 49, 83, 45, 55, 89, 100};

    public void paint(Graphics g)
    {
        super.paint(g);
        // 横線を描く
        g.drawLine( 50, 250, 250, 250);
        for (int i=0; i<11; i++) {
            String s = String.format("%3d", i * 10);
            g.drawString(s, i  * 20 + 40, 270);
        }
        // 縦線を描く
        g.drawLine( 50, 40, 50, 250);
        for (int i=0; i<11; i++) {
            String s = String.format("%3d", i * 10);
            g.drawString(s, 28, 250 - i  * 20);
        }
        // データを描く
        for (int i=0; i<10; i++) {
            int x1 = i * 20 + 50;
            int x2 = (i + 1) * 20 + 50;
            int y1 = 250 - data[i] * 2;
            int y2 = 250 - data[i+1] * 2;
            g.drawLine( x1, y1, x2, y2);
        }
    }

    LineGraph() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("LineGraph");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]){
        new LineGraph();
    }
}
