/*
 * ColorDlg.java
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorDlg extends JFrame {

    ColorDlg() {
    	JFrame frame = this;
        JPanel panel = new JPanel();
        panel.setLayout( new FlowLayout() );
        JButton button = new JButton("色の選択");
        button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		         JColorChooser cc = new JColorChooser();
		         Color col = cc.showDialog(frame, "色の選択", Color.WHITE);
		         panel.setBackground( col );
			}
        });
        panel.add(button);
        getContentPane().add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ColorDlg");
        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorDlg();
    }
}
