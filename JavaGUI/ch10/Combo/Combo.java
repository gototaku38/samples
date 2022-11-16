/*
 * Combo.java
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Combo extends JFrame {

    String data[] = {"Dog", "Cat", "Pony", "cow",};
    JComboBox<String> combobox = new JComboBox<String>(data);;
    JLabel lbl = new JLabel();

    Combo() {
        this.setLayout( new BorderLayout() );
        // combobox.setEditable(true); // 編集領域を編集可能にするとき

        combobox.addActionListener( new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String)combobox.getSelectedItem();
                lbl.setText(s + "が選択されました");
            }
        });
        this.add(combobox, BorderLayout.NORTH);
        this.add(lbl, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Combo");
        setSize(250, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Combo();
    }
}
