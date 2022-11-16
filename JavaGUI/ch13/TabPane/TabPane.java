/*
 * TabPane.java
 */
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabPane extends JFrame {

    TabPane() {
        JTabbedPane tabpane = new JTabbedPane();
        tabpane.addChangeListener( new ChangeListener()  {
			@Override
			public void stateChanged(ChangeEvent e) {
				// タブが変わったことを音で通知する
		        Toolkit.getDefaultToolkit().beep();
			}
        });
        JPanel panel1 = new JPanel();
        JTextArea txtarea = new JTextArea(5, 10);
        txtarea.setText("タブの1ページ目");
        panel1.add(txtarea);
        tabpane.addTab("1ページ", panel1);
        JPanel panel2 = new JPanel();
        JLabel lbl = new JLabel("タブの2ページ目");
        panel2.add(lbl);
        tabpane.addTab("2ページ", panel2);
        String lst[] = {"カツどん", "うどん", "天丼", "ライス", "カレー"};
        JList<String> lstbox = new JList<String>(lst);
        JPanel panel3 = new JPanel();
        panel3.add(lstbox);
        tabpane.addTab("3ページ", panel3);
        add(tabpane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TabPane");
        setSize(250, 160);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabPane();
    }
}
