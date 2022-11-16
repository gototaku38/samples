/*
 * CreateColor.java
 */
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class CreateColor extends JFrame {

    CreateColor() {
        JPanel panel = new JPanel();
        JSpinner spinr = new JSpinner( new SpinnerNumberModel(127, 0, 255, 1) );
        JSpinner sping = new JSpinner( new SpinnerNumberModel(127, 0, 255, 1) );
        JSpinner spinb = new JSpinner( new SpinnerNumberModel(127, 0, 255, 1) );
        JButton btnrgb = new JButton("色作成");

        btnrgb.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // RGB値から色を作る
                int r = Integer.valueOf( String.valueOf(spinr.getValue()) );
                int g = Integer.valueOf( String.valueOf(sping.getValue()) );
                int b = Integer.valueOf( String.valueOf(spinb.getValue()) );
                panel.setBackground( new Color(r,g,b) );
            }
        });

        JPanel subpanel = new JPanel();
        subpanel.setLayout( new GridLayout(3,2));
        JLabel lblr = new JLabel("赤：");
        subpanel.add(lblr);
        subpanel.add(spinr);
        JLabel lblg = new JLabel("緑：");
        subpanel.add(lblg);
        subpanel.add(sping);
        JLabel lblb = new JLabel("青：");
        subpanel.add(lblb);
        subpanel.add(spinb);
        panel.add(subpanel);
        panel.setBorder( BorderFactory.createTitledBorder("RGBで色指定") );
        panel.add(btnrgb);
        add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CreateColor");
        setSize(350, 140);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CreateColor();
    }
}

