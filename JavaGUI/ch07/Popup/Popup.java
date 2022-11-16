/*
 * Popup.java
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class Popup extends JFrame {

    JPopupMenu Popup;
    JMenuItem menuItemGreen;
    JMenuItem menuItemBlue;
    JTextArea output;

    class PopupListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            maybeShowPopup(e);
        }

        public void mouseReleased(MouseEvent e) {
            maybeShowPopup(e);
        }

        private void maybeShowPopup(MouseEvent e) {
            if (e.isPopupTrigger()) {
                Popup.show(e.getComponent(), e.getX(), e.getY());
            }
        }
    }

    Popup() {
        output = new JTextArea(5, 30);
        // ポップアップメニューを作る
        JMenuBar menuBar = new JMenuBar();
        Popup = new JPopupMenu();

        ActionListener listener = new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                JMenuItem source = (JMenuItem)(e.getSource());
                if (source.equals(menuItemGreen))
                    output.setBackground(Color.green);
                if (source.equals(menuItemBlue))
                    output.setBackground(Color.blue);
                String s = "イベントソース: " + source.getText() + "\n";
                output.append(s);
                output.setCaretPosition(output.getDocument().getLength());
            }
        };

        menuItemGreen = new JMenuItem("背景をグリーンに");
        menuItemGreen.addActionListener(listener);
        Popup.add(menuItemGreen);
        menuItemBlue = new JMenuItem("背景をブルーに");
        menuItemBlue.addActionListener(listener);
        Popup.add(menuItemBlue);
        // ポップアップメニューを表示するためのリスナー
        MouseListener popupListener = new PopupListener();
        output.addMouseListener(popupListener);
        menuBar.addMouseListener(popupListener);
        this.getContentPane().add(output);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Popup");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Popup();
    }
}
