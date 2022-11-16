/*
* TxtPane.java
*/
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class TxtPane extends JFrame {

    TxtPane(){
        JTextPane textPane = new JTextPane();
        JScrollPane scroll = new JScrollPane(textPane);
        getContentPane().add(scroll);

        StyleContext sc = new StyleContext();
        DefaultStyledDocument doc = new DefaultStyledDocument(sc);
        textPane.setDocument(doc);

        // ドキュメントを表示する
        StringBuffer sb = new StringBuffer();
        sb.append("テキストをボールドにしたりイタリックにしたり。\n");
        sb.append("これは2行目です。\n");
        sb.append("タブを使うと\tこうなります。");
        try{
            doc.insertString(0, new String(sb),
                sc.getStyle(StyleContext.DEFAULT_STYLE));
        }catch (BadLocationException e){
            e.printStackTrace();
        }

        // スタイルを変更する
        MutableAttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setBold(attr, true);
        doc.setCharacterAttributes(5, 4, attr, false);
        StyleConstants.setItalic(attr, true);
        StyleConstants.setForeground(attr,  Color.RED);
        doc.setCharacterAttributes(13, 5, attr, false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TxtPane");
        setSize(360, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new TxtPane();
    }
}
