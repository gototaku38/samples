/*
 * Table.java
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class Table extends JFrame implements TableModelListener {

    JTable tbl = null;
    JPanel panel = new JPanel();
    JLabel lbl = new JLabel( "セルをダブルクリックして変更してください" );
    JButton btn = new JButton("印刷");

    String[] columnNames = {"氏名(姓)","氏名(名)", "郵便番号", "Eメール", "年齢"};
    Object[][] data = { {"山田", "太郎", "232-0011", "taro@xx.ca.jp", "17"},
        {"天井", "香織", "232-1011", "amaikaori@xx.ca.jp", "24"},
        {"神尾", "睦月", "212-0211", "kamio@xx.ca.jp", "38"},
        {"花岡", "実太", "122-0031", "hanao@xx.ca.jp", "52"},
        {"海野", "浜子", "101-0104", "hamako@xx.ca.jp", "21"},};

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int col = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String colName = model.getColumnName(col);
        Object data = model.getValueAt(row, col);
        String s = String.format("[%d,%d(%s)]は%s", row, col, colName,  (String)data);
        lbl.setText(s);
    }

    Table() {
        tbl = new JTable(data, columnNames);
        tbl.setPreferredScrollableViewportSize(new Dimension(500, 70));
        tbl.setFillsViewportHeight(true);
        JScrollPane scrollpane = new JScrollPane(tbl);
        tbl.getModel().addTableModelListener(this);
        this.setLayout( new BorderLayout() );
        this.add(scrollpane, "Center");
        panel.setLayout( new FlowLayout() );
        panel.add(lbl);
        panel.add(btn);
        btn.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e ){
                try {
                    tbl.print();
                } catch (PrinterException ex) {
                    JOptionPane.showMessageDialog(null, "印刷できません。");
                }
            }
        });
        this.add(panel, "South");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Table");
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}
