/*
* TxtArea.java
*/
import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TxtArea extends JFrame {

    public static void main(String[] args) {

    	TxtArea frame = new TxtArea();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel( new BorderLayout(3, 1) );
        JLabel label = new JLabel("TextAreaのサンプル");
        TextArea textarea = new TextArea("", 5, 40);
        textarea.setText("テキストエリアに表示したテキスト\n");
        textarea.append("2行目のテキスト");

        JButton button = new JButton("Close");
        button.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 System.exit(0);
            }
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(textarea, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(panel);
        frame.setTitle("TxtArea");
        frame.pack();
        frame.setVisible(true);
    }
}
