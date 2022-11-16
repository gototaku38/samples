/*
 * ChkBox.java
 */
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChkBox extends JFrame {

    JPanel panel = new JPanel();
    JTextArea textarea = new JTextArea("こんにちは、Java");
    JCheckBox checkbox = new JCheckBox("ボールド", false);

    ChkBox() {
        panel.setLayout( new BorderLayout());
        panel.add(checkbox, BorderLayout.NORTH);
        panel.add(textarea,BorderLayout.CENTER);
        Font font = textarea.getFont();
        String fontname = font.getName();
        int fontsize = font.getSize();
        Font fontbold = new Font(fontname, Font.BOLD, fontsize);
        this.add(panel);

        checkbox.addChangeListener( new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if (checkbox.isSelected())
					textarea.setFont(fontbold);
				else
					textarea.setFont(font);
			}
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ChkBox");
        this.setSize(300, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChkBox();
    }
}
