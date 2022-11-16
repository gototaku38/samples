/**
 * BkgColor.java
 */
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BkgColor {

	public static void main(final String[] args) {

        final JFrame frame = new JFrame("BkgColor");
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);

        // ウィンドウを閉じるとプログラムを終了する
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.add(panel);
        frame.setSize(300, 220);
        frame.setVisible(true);
    }

}
