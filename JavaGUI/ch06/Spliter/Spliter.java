/*
 * Spliter.java
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class Spliter extends JFrame {

    Spliter() {

        // ウィンドウを閉じたら終了するようにする
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // テキストエリアとラベルを作成する
        JTextArea larea = new JTextArea(15, 10);
        larea.setText("こちらはテキスト");
        JLabel rlbl = new JLabel(new ImageIcon("images/mari.gif"));
		// ラベルをスクロールできるようにする
        JScrollPane scr = new JScrollPane(rlbl);
		// スプリッターを作成する
        JSplitPane Spliter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, larea, scr);
        add(Spliter);
        setTitle("Spliter");
        setSize(230, 180);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Spliter();
    }
}

