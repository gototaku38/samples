/*
 * RbGroup.java
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RbGroup extends JFrame implements ItemListener {

    JPanel panel = new JPanel();
    ButtonGroup bg = new ButtonGroup();
    JRadioButton rb1 = new JRadioButton("one", true);
    JRadioButton rb2 = new JRadioButton("two", false);
    JRadioButton rb3 = new JRadioButton("three", false);
    JLabel lbl = new JLabel("oneが選択されました");

    public void itemStateChanged ( ItemEvent e ){
        if (e.getSource().equals(rb1))
            lbl.setText("oneが選択されました");
        if (e.getSource().equals(rb2))
            lbl.setText("twoが選択されました");
        if (e.getSource().equals(rb3))
            lbl.setText("threeが選択されました");
    }
 
    RbGroup() {
        setLayout( new FlowLayout());
        panel.setLayout( new GridLayout(3, 1) );
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        panel.add(rb1);
        panel.add(rb2);
        panel.add(rb3);
        rb1.addItemListener( this );
        rb2.addItemListener( this );
        rb3.addItemListener( this );
        this.add(panel);
        this.add(lbl);
        setTitle("RbGroup");
        this.setSize(250, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new RbGroup();
    }
}
