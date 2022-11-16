/*
 * MouseBtn.java
 */
import java.awt.TextArea;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseBtn extends JFrame {

    static TextArea txtbox;

    class MyMouseLisner implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            StringBuffer s = new StringBuffer("");
            // 押されているマウスボタン
            int button = e.getButton();
            if (button == MouseEvent.BUTTON1) {
                s.append("左ボタン ");
            }
            if (button == MouseEvent.BUTTON2) {
                s.append("中央ボタン ");
            }
            if (button == MouseEvent.BUTTON3) {
                s.append("右ボタン ");
            }
            // 押されているキー
            int modifier = e.getModifiersEx();
            if ((modifier & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK) {
                s.append("SHIFT ");
            }
            if ((modifier & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK) {
                s.append("CTRL ");
            }
            if ((modifier & InputEvent.ALT_DOWN_MASK) == InputEvent.ALT_DOWN_MASK) {
                s.append("ALT ");
            }
            if ((modifier & InputEvent.META_DOWN_MASK) == InputEvent.META_DOWN_MASK) {
                s.append("META ");
            }
            s.append("\n");
            txtbox.append(s.toString());
        }

        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }

    MouseBtn () {
        txtbox = new TextArea(20, 15);
        txtbox.addMouseListener(new MyMouseLisner());
        getContentPane().add(txtbox);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MouseBtn");
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseBtn();
    }
}
