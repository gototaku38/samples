/*
 * SmplWnd00.java
 */
import javax.swing.JFrame;

public class SmplWnd00 extends JFrame {

    SmplWnd00() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setTitle("SmplWnd00");
        this.setSize(300, 220);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SmplWnd00();
    }

}
