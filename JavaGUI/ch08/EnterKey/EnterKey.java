/*
 * EnterKey.java
 */
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnterKey  extends JFrame {

    JTextField txt1 = new JTextField(30);
    JTextField txt2 = new JTextField(30);
    JTextField txt3 = new JTextField(30);

    class MyKeyLisner implements KeyListener {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                Object src = e.getSource();
                if (src.equals(txt1))
                    txt2.requestFocus();
                if (src.equals(txt2))
                    txt3.requestFocus();
                if (src.equals(txt3))
                    txt1.requestFocus();
            }
        }
        public void keyReleased(KeyEvent e)  {;}
        public void keyTyped(KeyEvent e)  {;}
    }

    public EnterKey() {
        JPanel panel = new JPanel();
        panel.setLayout( new GridLayout(3, 2, 2, 2));
        JLabel lbl1 = new JLabel("なんとか:");
        panel.add(lbl1);
        panel.add(txt1);
        JLabel lbl2 = new JLabel("かんとか:");
        panel.add(lbl2);
        panel.add(txt2);
        JLabel lbl3 = new JLabel("うんとか:");
        panel.add(lbl3);
        panel.add(txt3);
        txt1.addKeyListener(new MyKeyLisner());
        txt2.addKeyListener(new MyKeyLisner());
        txt3.addKeyListener(new MyKeyLisner());
        add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 100);
        setTitle("EnterKey");
        setVisible(true);
    }

    public static void main(String[] args) {
        new EnterKey();
    }
}

