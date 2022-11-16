/*
 * SmplBtn.java
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SmplBtn extends JFrame {

    SmplBtn() {
        JLabel label = new JLabel("ボタンをクリックして！");
        label.setPreferredSize(new Dimension(220, 40));
        JButton button1 = new JButton("ボタン1");
        button1.setPreferredSize(new Dimension(220, 40));
        JButton button2 = new JButton("ボタン2");
        button2.setPreferredSize(new Dimension(220, 40));

        button1.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                label.setText("ボタン1がクリックされました");
            }
        });
        button2.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                label.setText("ボタン2がクリックされました");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout( new BorderLayout() );
        panel.add(label, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.SOUTH);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SmplBtn");
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new SmplBtn();
    }
}

