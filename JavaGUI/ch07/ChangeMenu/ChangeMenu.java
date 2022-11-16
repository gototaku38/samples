/*
 * ChangeMenu.java
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ChangeMenu extends JFrame implements ActionListener {

    JMenuItem menuColor;

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if (cmd.equals("Color"))
        {
            if (getContentPane().getBackground() == Color.green) {
                getContentPane().setBackground(Color.blue);
                menuColor.setText("背景色を緑に");
            } else {
                getContentPane().setBackground(Color.green);
                menuColor.setText("背景色を青に");
            }
        }
        if (cmd.equals("Exit")) {
            System.exit(0);
        }
    }

    ChangeMenu() {
    	// メニューを作る
        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("ファイル");
        menuColor = new JMenuItem("背景色を緑に");
        menuColor.setActionCommand("Color");
        menuColor.addActionListener( this );
        filemenu.add(menuColor);
        filemenu.addSeparator();
        JMenuItem menuExit = new JMenuItem("終了", KeyEvent.VK_X);
        menuExit.setActionCommand("Exit");
        menuExit.addActionListener( this );
        filemenu.add(menuExit);
        menubar.add(filemenu);
        this.setJMenuBar(menubar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ChangeMenu");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChangeMenu();
    }
}

