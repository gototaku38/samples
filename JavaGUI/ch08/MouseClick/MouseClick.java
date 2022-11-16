/*
 * MouseClick.java
 */
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseClick extends JFrame {

    static TextArea txtbox;

    class MyMouseLisner implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            String s = String.format("mouseClicked (%d,%d)\n", e.getX(), e.getY());
            txtbox.append(s);
        }
        @Override
        public void mouseEntered(MouseEvent e) {
            txtbox.append("mouseEntered\n");
        }
        @Override
        public void mouseReleased(MouseEvent e){
            txtbox.append("mouseReleased\n");
        }
        @Override
        public void mousePressed(MouseEvent e){
            txtbox.append("mousePressed\n");
        }
        @Override
        public void mouseExited(MouseEvent e){
            txtbox.append("mouseExited\n");
        }
    }

    MouseClick () {
        txtbox = new TextArea(20, 15);
        txtbox.addMouseListener(new MyMouseLisner());
        getContentPane().add(txtbox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MouseClick");
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseClick();
    }
}
