/*
 * ButtonWnd
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonWnd {

	public static void main(String[] args) {

        JFrame frame = new JFrame("ButtonWnd");
        JButton button = new JButton("Close");
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 System.exit(0);
            }
        });
        frame.getContentPane().add(button);

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // frame.pack();
        frame.setSize(300, 220);
        frame.setVisible(true);
	}

}


