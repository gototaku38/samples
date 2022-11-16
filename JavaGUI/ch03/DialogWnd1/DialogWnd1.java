/*
 * DialogWnd1.java
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class DialogWnd1 extends JFrame {

    public static void main(String[] args) {
        new DialogWnd1();
    }

    public DialogWnd1(){

        this.setTitle("DialogWnd1");
        // ウィンドウを閉じたの時の設定
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 最小サイズを設定する
        this.setMinimumSize(new java.awt.Dimension(250, 160));
        JFrame frame = this;

        // ダイアログボックスを表示するためのボタン
        JButton button = new JButton("表示");
        // ActionListenerを作成する
        ActionListener listener = new ActionListener () {
            public void actionPerformed ( ActionEvent e){
                JDialog dlg = new JDialog(frame, "Dialog", true);
                dlg.setMinimumSize(new java.awt.Dimension(200, 140));
                JButton dlgbtn = new JButton("閉じる");
                dlgbtn.addActionListener( new ActionListener() {
                    public void actionPerformed ( ActionEvent e){
                        dlg.setVisible(false);
                        dlg.dispose();
                    }
                });
                dlg.getContentPane().add(dlgbtn);
                dlg.setVisible(true);
            }
        };
        // ActionListenerを登録する
        button.addActionListener( listener );

        getContentPane().add(button);
        setVisible(true);
    }
}


