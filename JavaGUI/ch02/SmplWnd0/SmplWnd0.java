
/*
 * SmplWnd0.java
 */
import javax.swing.JFrame;

public class SmplWnd0 extends JFrame {

    SmplWnd0() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setTitle("SmplWnd0");
        setSize(300, 220);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SmplWnd0();
    }

}

