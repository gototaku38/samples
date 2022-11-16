/*
 * ImageBtn.java
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageBtn extends JFrame {

	ImageBtn() {
        this.setLayout( new BorderLayout() );
        ImageIcon icon = new ImageIcon("images/close.gif");
        JButton button = new JButton("Close", icon);
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 System.exit(0);
            }
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button, "South");
        this.setTitle("ImageBtn");
        this.setSize(280, 80);
        this.setVisible(true);
	}

    public static void main(String[] args) {
        new ImageBtn();
    }
}

