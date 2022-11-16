/*
 * MenuIcon.java
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuIcon extends JFrame implements ActionListener {

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if (cmd.equals("Exit")) {
            System.exit(0);
        }
    }

    MenuIcon() {
    	// メニューを作る
        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("ファイル");
        JMenuItem menuExit = new JMenuItem("終了", new ImageIcon("images/exit.gif"));
        menuExit.setActionCommand("Exit");
        menuExit.addActionListener( this );
        filemenu.add(menuExit);
        menubar.add(filemenu);
        this.setJMenuBar(menubar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MenuIcon");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuIcon();
    }
}

