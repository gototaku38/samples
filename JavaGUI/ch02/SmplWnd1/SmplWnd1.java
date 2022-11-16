/**
 * SmplWnd1.java
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SmplWnd1 {

	public static void main(final String[] args) {

        final JFrame frame = new JFrame("SmplWnd1");

        // ウィンドウを閉じるとプログラムを終了する
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.pack();
        frame.setSize(300, 220);
        frame.setVisible(true);
    }

}
