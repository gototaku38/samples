/*
 * ImageLbl.java
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLbl extends JFrame {

    ImageLbl() {
        ImageIcon image = new ImageIcon("images/marir.gif");
        JLabel lbl = new JLabel(image);
        JButton btn = new JButton("クリック");
        btn.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e ){
                ImageIcon image = new ImageIcon("images/maril.gif");
                lbl.setIcon(image);
            }
        });

        setLayout(new GridLayout(2, 1,5,5));
        add(lbl);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ImageLbl");
        setSize(300, 140);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageLbl();
    }
}

