/*
 * Slider.java
 */
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame {

    JSlider rSlider = new JSlider(0, 255, 128);
    JSlider gSlider = new JSlider(0, 255, 128);
    JSlider bSlider = new JSlider(0, 255, 128);
    JPanel panel = new JPanel();

    Slider() {
        setLayout( new GridLayout(4, 1) );
        ChangeListener listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int r = rSlider.getValue();
                int g = gSlider.getValue();
                int b = bSlider.getValue();
                panel.setBackground( new Color(r, g,b) );
            }
        };
        rSlider.addChangeListener( listener );
        gSlider.addChangeListener( listener );
        bSlider.addChangeListener( listener );
        add(rSlider);
        add(gSlider);
        add(bSlider);
        add(panel);
        listener.stateChanged ( null ); // 初期値を表示する

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Slider");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Slider();
    }
}
