/*
 * ListIcon.java
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// イメージと文字列を表示するためにJLabelを拡張したクラス
class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {

    public Component getListCellRendererComponent(
      JList<?> list,           // リスト
      Object value,            // 表示する値（この場合は文字列）
      int index,               // セルのインデックス
      boolean isSelected,      // セルが選択されていたらtrue
      boolean cellHasFocus)    // フォーカスが設定されていたらtrue
    {
        String s = value.toString();
        setText(s);
        String fname = "icon" + Integer.toBinaryString(index);
        ImageIcon icon = new ImageIcon(fname + ".gif");
        setIcon(icon);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(list.isEnabled());
        setFont(list.getFont());
        setOpaque(true);
        return this;
    }
}
public class ListIcon extends JFrame implements ActionListener {

    String[] data = {"Pochi", "Tama", "Lucky", "太郎", "Kitty"};
    JList<String> list = new JList<String>(data);
    JScrollPane pane = new JScrollPane();
    JPanel panel = new JPanel();
    JPanel toppanel = new JPanel();
    JButton btnall = new JButton("全選択");
    JButton btnnone = new JButton("選択解除");
    JLabel label = new JLabel(" ");

    public void actionPerformed ( ActionEvent e){
        if (e.getSource().equals(btnall))
            list.setSelectionInterval(0,4);
        if (e.getSource().equals(btnnone))
            list.clearSelection();
    }

    ListIcon() {
        list.setCellRenderer(new MyCellRenderer());
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
        setTitle("ListIcon");
        setSize(260, 220);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListIcon();
    }
}
