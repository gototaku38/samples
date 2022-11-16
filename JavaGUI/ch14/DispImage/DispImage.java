/*
 * DispImage.java
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DispImage extends JFrame {

    DispImage() {
        JLabel lbl = new JLabel( new ImageIcon("images/mari.gif"));
        JButton btn = new JButton("クリック！");
        setLayout( new FlowLayout() );
        btn.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("images/maril.gif");
                lbl.setIcon(icon);
            }
        });
        add(lbl);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("DispImage");
        setSize(550, 550);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DispImage();
    }
}

