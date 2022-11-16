/*
* Box.java
*/
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Box extends JFrame {

    Box() {

    	// パネルを作ってレイアウトを設定する
        JPanel panel = new JPanel();
        panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS) );

        // ウィンドウを閉じたら終了するようにする
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	// コンポーネントを作る
        JButton btn[] = new JButton[5];
        for (int i=0; i<5; i++)
            btn[i] = new JButton("Button:" + Integer.toString(i));
        for (int i=0; i<5; i++)
            panel.add(btn[i]);

        this.getContentPane().add(panel);
        this.setTitle("Box");
        this.pack();
        this.setSize(220, 180);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Box();
    }
}
