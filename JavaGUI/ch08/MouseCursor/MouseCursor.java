/*
 * MouseCursor.java
 */

import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseCursor extends JFrame {

    class MyMouseLisner implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            Toolkit.getDefaultToolkit().beep();
            // マウスの左（第1）ボタンで手のカーソルにする
            if (e.getButton() == MouseEvent.BUTTON1)
                setCursor( new Cursor(Cursor.HAND_CURSOR) );
            // マウスの中央（第2ボタン）で待ちカーソルにする
            if (e.getButton() == MouseEvent.BUTTON2)
                setCursor( new Cursor(Cursor.WAIT_CURSOR) );
            // マウスの右（第2）ボタンでデフォルトカーソルに戻す
            if (e.getButton() == MouseEvent.BUTTON3)
                setCursor( new Cursor(Cursor.DEFAULT_CURSOR) );
        }
        public void mouseEntered(MouseEvent e) { ; }
        public void mouseReleased(MouseEvent e){ ; }
        public void mousePressed(MouseEvent e) { ; }
        public void mouseExited(MouseEvent e) { ; }
	}

    MouseCursor () {
        addMouseListener(new MyMouseLisner());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MouseCursor");
        setSize(300, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseCursor();
    }
}
