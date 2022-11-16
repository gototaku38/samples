/*
 * ScrollLabel.java
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ScrollLabel extends JFrame {

    ScrollLabel() {

        // ラベルを作成する
        JLabel label = new JLabel(new ImageIcon("images/mari.gif"));
        // ラベルをスクロールできるようにする
        JScrollPane scr = new JScrollPane(label);
        add(scr);

        // ウィンドウを閉じたら終了するようにする
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ScrollLabel");
        setSize(360, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollLabel();
    }
}

