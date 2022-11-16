/*
 * GetKeys.java
 */
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GetKeys  extends JFrame {

    static TextArea txtarea ;

    void DispKey(String eventname, KeyEvent e) {
        char ch = e.getKeyChar();
        String s;
        if (Character.isLetterOrDigit(ch))
            s = String.format("%s:[%c] KeyCode=%d\n", eventname, ch, e.getKeyCode());
        else
            s = String.format("%s:KeyCode=%d\n", eventname, e.getKeyCode());
        txtarea.append(s);
    }

    class MyKeyLisner implements KeyListener {
        public void keyPressed(KeyEvent e) {
            DispKey("keyPressed", e);
        }
        public void keyReleased(KeyEvent e)  {
            DispKey("keyReleased", e);
        }
        public void keyTyped(KeyEvent e)  {
            DispKey("keyTyped", e);
        }
    }

    public GetKeys() {
    	txtarea = new TextArea(20, 15);
    	getContentPane().add(txtarea);
        txtarea.addKeyListener(new MyKeyLisner());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setTitle("GetKeys");
        setVisible(true);
    }

    public static void main(String[] args) {
        new GetKeys();
    }
}

