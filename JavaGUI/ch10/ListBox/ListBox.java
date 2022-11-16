/*
 * ListBox.java
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListBox extends JFrame implements ActionListener {

    String data[] = {"Dog", "Cat", "Pony", "Cow", "Fish"};
    JList<String> list = new JList<String>(data);
    JScrollPane pane = new JScrollPane();
    JPanel panel = new JPanel();
    JPanel toppanel = new JPanel();
    JButton btnall = new JButton("全選択");
    JButton btnnone = new JButton("選択解除");
    JLabel label = new JLabel(" ");

    public void actionPerformed ( ActionEvent e){
        if (e.getSource().equals(btnall))  // 全項目選択
            list.setSelectionInterval(0, 4);
        if (e.getSource().equals(btnnone))  // 選択解除
            list.clearSelection();
    }

    ListBox() {
        pane.getViewport().setView(list);
        btnall.addActionListener( this );
        btnnone.addActionListener( this );
        list.addListSelectionListener( new ListSelectionListener()  {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (list.getSelectedIndices().length == 1) {
                    // 選択された項目はひとつ
                    label.setText(list.getSelectedValue());
                } else {
                    label.setText(list.getSelectedValuesList().toString());
                }
            }
        });
        panel.setLayout( new BorderLayout() );
        toppanel.setLayout( new GridLayout(1, 2) );
        toppanel.add( btnall );
        toppanel.add( btnnone );
        panel.add(toppanel, BorderLayout.NORTH);
        panel.add(pane, BorderLayout.CENTER);
        panel.add(label, BorderLayout.SOUTH);
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ListBox");
        setSize(260, 160);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListBox();
    }
}
