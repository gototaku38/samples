/**
 * PassWord.java
 */

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class PasswordDlg extends JDialog {

    public boolean fSuccess;

    PasswordDlg(Frame owner, String title, boolean modal) {
    	super(owner, title, modal);
        JLabel lbl1 = new JLabel("ID:");
        JTextField txtf = new JTextField(12);
        JLabel lbl2 = new JLabel("パスワード:");
        JPasswordField passf = new JPasswordField(18);
        JButton buttonOk = new JButton("OK");
        JButton buttonCancel = new JButton("キャンセル");
        this.setLayout( new GridLayout(3, 2) );
        add(lbl1);
        add(txtf);
        add(lbl2);
        add(passf);
        add(buttonOk);
        add(buttonCancel);
        buttonOk.addActionListener( new  ActionListener() {
            public void actionPerformed ( ActionEvent e){
                String pwd = new String((passf.getPassword()));
                if ( pwd.equals("password") ) {
                    fSuccess = true;
                } else {
                    Toolkit.getDefaultToolkit().beep();
                    fSuccess = false;
                }
                getParent().setVisible(false);
            }
        });
        buttonCancel.addActionListener( new  ActionListener() {
            public void actionPerformed ( ActionEvent e){
                getParent().setVisible(false);
            }
        });
        this.setSize(220, 120);
        this.setTitle("パスワード入力");
        this.setResizable(false);
        this.setVisible(true);
    }
}

public class PassWord extends JFrame {

    public PassWord() {
        JPanel panel =new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("ログインしてください。");
        JButton button = new JButton("ログイン");
        button.addActionListener( new ActionListener() {
			@Override
            public void actionPerformed ( ActionEvent e){
                PasswordDlg dlg = new PasswordDlg(null, "パスワード", true);
                if (dlg.fSuccess == true) {
                    label.setText("ログインしました。");;
                } else {
                    label.setText("パスワードが不正です。");
                }
            }
        });
        panel.add(label);
        panel.add(button);
        this.getContentPane().add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PassWord");
        this.setSize(380, 240);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new PassWord();
    }
}
