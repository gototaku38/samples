/*
 * Fonts.java
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Fonts extends JFrame {

    String fontName[] = {"Arial", "Arial Bold", "SansSerif", "Courier", "Century"};
    int fontStyles[] = { Font.PLAIN, Font.PLAIN, Font.PLAIN, Font.PLAIN, Font.PLAIN };

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        int y = 50;
        String s = "";
        for (int i=0; i<5; i++)
        {
            int size = i * 4 + 12;
            Font f = new Font(fontName[i], fontStyles[i], size) ;
            s = f.getFontName();
            g.setFont(f);
            g.drawString(s, 20, y);
            y += size + 6;
        }
    }

    Fonts() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fonts");
        setSize(260, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fonts();
    }
}
