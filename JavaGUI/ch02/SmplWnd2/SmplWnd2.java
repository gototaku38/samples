/**
 * SmplWnd2.java
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class SmplWnd2 {

    public static void main(final String[] args) {

        final JFrame frame = new JFrame("SmplWnd2");

        frame.addWindowListener(new AppCloser());
        frame.pack();
        frame.setSize(300, 220);
        frame.setVisible(true);
    }

}

/**
 * アプリケーションを終了するためのクラス
 */
final class AppCloser extends WindowAdapter {

    @Override
    public void windowClosing(final WindowEvent e) {
        System.exit(0);
    }
}
