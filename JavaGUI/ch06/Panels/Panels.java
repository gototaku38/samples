/*
* Panels.java
*/
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Panels extends JFrame {

    Panels() {

        // ウィンドウを閉じたら終了するようにする
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	// コンポーネントを作る
		JPanel panel = new JPanel();
		JPanel lpanel = new JPanel();
        JButton button12 = new JButton("12");
        button12.setPreferredSize(new Dimension(80, 36));;
        JButton button16= new JButton("16");
        button16.setPreferredSize(new Dimension(80, 36));;
        JButton button20= new JButton("20");
        button20.setPreferredSize(new Dimension(80, 36));;
        JTextArea textarea = new JTextArea();
        textarea.setText("サンプルテキスト\n2行目だよ。");

    	// panelにコンポーネントを配置する
        panel.setLayout( new BorderLayout( 5, 5) );
        panel.add(lpanel, BorderLayout.WEST);
        panel.add(textarea,BorderLayout.CENTER);

    	// lpanelにコンポーネントを配置する
        lpanel.setLayout( new GridLayout( 3, 1, 5, 5) );
        lpanel.add(button12);
        lpanel.add(button16);
        lpanel.add(button20);

        // イベントハンドラ
        button12.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                textarea.setFont(new Font("Serif", Font.BOLD, 12));
            }
        });
        button16.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                textarea.setFont(new Font("Serif", Font.BOLD, 16));
            }
        });
        button20.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                textarea.setFont(new Font("Serif", Font.BOLD, 20));
            }
        });

        this.getContentPane().add(panel);
        this.setTitle("Panels");
        this.setSize(260, 160);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Panels();
    }
}
