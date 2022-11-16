/*
 * Toolbar.java
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class Toolbar extends JFrame {

    Toolbar() {
        JToolBar tbar = new JToolBar(JToolBar.HORIZONTAL);
        JCheckBox chk = new JCheckBox("フローティング");
        JButton btnBlue = new JButton("");
        JButton btnRed = new JButton("");
        JButton btnGreen = new JButton("");
        JLabel lbl = new JLabel("ツールバーのカラーを選択してください。");

        chk.addActionListener( new ActionListener() {
        	public void actionPerformed ( ActionEvent e){
            if (chk.isSelected())
                tbar.setFloatable(true);
            else
                tbar.setFloatable(false);
        	}
        });
        btnBlue.setBackground(Color.BLUE);
        tbar.add(btnBlue);
        btnBlue.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 lbl.setText("選択されている色はブルー");
            }
        });
        btnRed.setBackground(Color.RED);
        tbar.setFloatable(false);
        tbar.add(btnRed);
        btnRed.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 lbl.setText("選択されている色は赤");
            }
        });
        btnGreen.setBackground(Color.GREEN);
        tbar.add(btnGreen);
        btnGreen.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 lbl.setText("選択されている色はグリーン");
            }
        });
        this.setLayout( new BorderLayout() );
        this.add(tbar, "North");
        this.add(chk, "Center");
        this.add(lbl, "South");
        setTitle("Toolbar");
        setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Toolbar();
    }
}
