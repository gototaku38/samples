/*
 * Piechart.java
 */
import java.awt.Graphics;

import javax.swing.JFrame;

public class Piechart extends JFrame {

    int data[] = {25, 36, 14, 56, 74, 49};

    public void paint(Graphics g)
    {
        super.paint(g);
        // 合計を計算する
        int total = 0;
        for (int i=0; i<data.length; i++) {
            total += data[i];
        }

        // 円を描く
        g.drawArc(40, 40, 200, 200, 0, 360);
        double Angle = -0.5 * 3.1416;
        double sweepAngle = 0;
        // 最初の線
        g.drawLine(140, 140, 140, 40);
        // データの個数だけ線を描く
        for (int i = 0; i<data.length; i++)
        {
            sweepAngle = 2 * 3.1416 * data[i] / total;// ラジアン単位
            Angle += sweepAngle;
            int x = 140 + (int)(100.0 * Math.cos(Angle) );
            int y = 140 + (int)(100.0 * Math.sin(Angle) );
            g.drawLine(140, 140, x, y);
        }
    }

    Piechart() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Piechart");
        setSize(280, 270);
        setVisible(true);
    }

    public static void main(String args[]){
        new Piechart();
    }
}
