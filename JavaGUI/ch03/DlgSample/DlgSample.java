/*
 * DlgSample.java
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DlgSample extends JFrame {

    DlgSample() {

        JButton btn = new JButton("ダイアログボックス表示");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null, "きわめて単純なダイアログボックス", "ダイアログ",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };
        btn.addActionListener( listener );
        add(btn);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("DlgSample");
        setSize(350, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DlgSample();
    }
}
