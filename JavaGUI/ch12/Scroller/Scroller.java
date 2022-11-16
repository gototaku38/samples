/*
 * Scroller.java
 */
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Scroller extends JFrame {

    JScrollBar rScroll = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 255);
    JScrollBar gScroll = new JScrollBar(JScrollBar.HORIZONTAL, 128, 1, 0, 255);
    JScrollBar bScroll = new JScrollBar(JScrollBar.HORIZONTAL, 128, 1, 0, 255);
    JPanel panel = new JPanel();

    Scroller() {
        setLayout( new GridLayout(4, 1) );
        AdjustmentListener listener = new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
		        int r = rScroll.getValue();
		        int g = gScroll.getValue();
		        int b = bScroll.getValue();
		        panel.setBackground( new Color(r, g,b) );

			}
        };
        rScroll.addAdjustmentListener(listener);
        gScroll.addAdjustmentListener(listener);
        bScroll.addAdjustmentListener(listener);
        add(rScroll);
        add(gScroll);
        add(bScroll);
        add(panel);
        rScroll.setValue(128);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Scroller");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Scroller();
    }
}
