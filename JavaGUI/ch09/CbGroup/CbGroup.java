/*
 * CbGroup.java
 */
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CbGroup extends JFrame implements ItemListener {

    JPanel panel = new JPanel();
    CheckboxGroup cbg = new CheckboxGroup();
    Checkbox cb1 = new Checkbox("one", cbg, true);
    Checkbox cb2 = new Checkbox("two", cbg, false);
    Checkbox cb3 = new Checkbox("three", cbg, false);
    JLabel lbl = new JLabel("oneが選択されました");

    public void itemStateChanged ( ItemEvent e ){
        if (e.getSource().equals(cb1))
            lbl.setText("oneが選択されました");
        if (e.getSource().equals(cb2))
            lbl.setText("twoが選択されました");
        if (e.getSource().equals(cb3))
            lbl.setText("threeが選択されました");
    }

    CbGroup() {
        setLayout( new FlowLayout());
        panel.setLayout( new GridLayout(3, 1) );
        panel.add(cb1);
        panel.add(cb2);
        panel.add(cb3);
        cb1.addItemListener( this );
        cb2.addItemListener( this );
        cb3.addItemListener( this );
        cbg.setSelectedCheckbox(cb1);
        this.add(panel);
        this.add(lbl);

        setTitle("CbGroup");
        this.setSize(280, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CbGroup();
    }
}
