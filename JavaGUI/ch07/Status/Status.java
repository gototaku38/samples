/*
 * Status.java
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Status extends JFrame {

    Status() {
    	// ステータスバーを作る
        JPanel upperpanel = new JPanel();
        JButton btn = new JButton("クリック！");
        JCheckBox chk = new JCheckBox("チェック！");
        JPanel statuspanel = new JPanel();
        JLabel statuslbl = new JLabel("ステータスバー");
    	upperpanel.add(btn);
        btn.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 statuslbl.setText("ボタンがクリックされました");
            }
        });
        upperpanel.add(chk);
        chk.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 statuslbl.setText("チェックボックスが変更されました");
            }
        });
        setLayout(new BorderLayout());
        add(upperpanel, "Center");
        statuspanel.setBorder( BorderFactory.createEtchedBorder() );
        statuspanel.setLayout( new FlowLayout() );
        statuspanel.add(statuslbl);
        add(statuspanel, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Status");
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Status();
    }
}

