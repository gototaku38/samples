/**
 * Counter.java
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int counter = 0;

    public static void main(final String[] args) {

        final JFrame frame = new JFrame("Counter");

        JButton button = new JButton("クリック！");
        JLabel label = new JLabel("0");
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                label.setText(Integer.toString(++counter));
            }
        });

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(button);
        frame.getContentPane().add(label);

        frame.addWindowListener(new AppCloser());
        frame.pack();
        frame.setSize(250, 120);
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
