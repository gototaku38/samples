/*
 * YesNoDlg.java
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class YesNoDlg extends JFrame {

    YesNoDlg() {

        JButton button = new JButton("ダイアログボックス表示");
        JLabel label = new JLabel("ボタンをクリックしてください");
        setLayout(new GridLayout(2, 1,5,5));
        add(button);
        add(label);

    	ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		    	int result = JOptionPane.showConfirmDialog(null,
		                "choose one", "choose one", JOptionPane.YES_NO_OPTION);
		        if (result == JOptionPane.YES_OPTION) {
		        	label.setText("Yes");
		        } else {
		        	label.setText("No");
		        }
			}

        };
        button.addActionListener( listener );

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("YesNoDlg");
        setSize(300, 220);
        setVisible(true);
    }

    public static void main(String[] args) {
        new YesNoDlg();
    }
}