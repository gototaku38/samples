/*
* Grid.java
*/
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid extends JFrame {

    Grid() {
        GridLayout layout =new GridLayout( 3, 4, 5, 5 );
        this.setLayout( layout );
        JButton btn[] = new JButton[10];
        for (int i=0; i<10; i++)
            btn[i] = new JButton("Button:" + Integer.toString(i));
        for (int i=0; i<10; i++)
            add(btn[i]);

        // ウィンドウを閉じたら終了するようにする
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Grid");
        this.setSize(380, 180);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Grid();
    }
}
