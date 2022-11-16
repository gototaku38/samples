/*
 * ImageBtn.java
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageBtn extends JFrame  {

    ImageBtn() {

        ImageIcon image = new ImageIcon("images/marir.gif");
        JButton button = new JButton("JButton", image);
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                ImageIcon image = new ImageIcon("images/maril.gif");
                button.setIcon(image);
            }
        });
        add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ImageBtn");
        setSize(260, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageBtn();
    }
}

