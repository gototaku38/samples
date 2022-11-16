/*
 * MainMenu.java
*/
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainMenu extends JFrame {

    MainMenu() {
        // メニューを作成する
        JMenuBar menubar = new JMenuBar();
        // [ファイル]メニュー
        JMenu filemenu = new JMenu("ファイル");
        JMenu menuBkColor = new JMenu("背景色");
        JMenuItem menuRed = new JMenuItem("赤");

        ActionListener listener = new ActionListener () {
            public void actionPerformed(ActionEvent e){
                String cmd = e.getActionCommand();
                if (cmd.equals("Red"))
                    getContentPane().setBackground(Color.red);
                if (cmd.equals("Blue"))
                    getContentPane().setBackground(Color.blue);
                if (cmd.equals("Exit")) {
                    System.exit(0);
                }
                if (cmd.equals("About")) {
                    JDialog dlg = new JDialog() ;
                    JLabel lbl1 = new JLabel("=== MainMenu ====");
                    JLabel lbl2 = new JLabel("ver.1.0");
                    JPanel panel = new JPanel();
                    panel.add(lbl1);
                    panel.add(lbl2);
                    dlg.setTitle("MainMenuについて");
                    dlg.setSize(150, 100);
                    dlg.getContentPane().add(panel);
                    dlg.setVisible(true);
                }
            }
        };

        menuRed.setActionCommand("Red");
        menuRed.addActionListener( listener );
        menuBkColor.add(menuRed);
        JMenuItem menuRlue = new JMenuItem("青");
        menuRlue.setActionCommand("Blue");
        menuRlue.addActionListener( listener );
        menuBkColor.add(menuRlue);
        filemenu.add(menuBkColor);
        filemenu.addSeparator();
        JMenuItem menuExit = new JMenuItem("終了", KeyEvent.VK_X);
        menuExit.setActionCommand("Exit");
        menuExit.addActionListener( listener );
        filemenu.add(menuExit);
        menubar.add(filemenu);
        // [ヘルプ]メニュー
        JMenu helpmenu = new JMenu("ヘルプ");
        JMenuItem menuAbout = new JMenuItem("MainMenuについて");
        menuAbout.setActionCommand("About");
        menuAbout.addActionListener( listener );
        menubar.add(helpmenu);
        helpmenu.add(menuAbout);
        this.setJMenuBar(menubar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MainMenu");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

