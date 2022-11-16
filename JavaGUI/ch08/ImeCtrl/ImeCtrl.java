/*
 * ImeCtrl.java
 */
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.im.InputSubset;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class FocusImeCtrl extends FocusAdapter {
    // フォーカスを得たら全角入力にする
    public void focusGained(FocusEvent e) {
        JTextField compo = (JTextField) (e.getSource());
            compo.getInputContext().setCharacterSubsets(
                        new Character.Subset[] { InputSubset.KANJI });
    }
    // フォーカスを失ったら半角入力にする
    public void focusLost(FocusEvent e) {
        JTextField compo = (JTextField) (e.getSource());
        compo.getInputContext().setCharacterSubsets(null);
    }
}

class ImeCtrl extends JFrame  {

    JLabel lbl1 = new JLabel("住所:");
    JTextField txt1 = new JTextField(25);
    JLabel lbl2 = new JLabel("氏名:");
    JTextField txt2 = new JTextField(25);
    JLabel lbl3 = new JLabel("電話番号:");
    JTextField txt3 = new JTextField(18);

    ImeCtrl() {
        this.setLayout( new GridLayout(3, 2) );
        add(lbl1);
        add(txt1);
        txt1.addFocusListener(new FocusImeCtrl());
        add(lbl2);
        add(txt2);
        txt2.addFocusListener(new FocusImeCtrl());
        add(lbl3);
        add(txt3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setTitle("ImeCtrl");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ImeCtrl();
    }
}
