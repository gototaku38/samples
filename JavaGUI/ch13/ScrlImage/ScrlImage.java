/*
 * ScrlImage.java
 */
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ScrlImage extends JFrame {

    ScrlImage() {
        ImageIcon image = new ImageIcon("images/mari.gif");
        JLabel label = new JLabel(image);
        JScrollPane spane =new JScrollPane(label);
        this.getContentPane().add(spane);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ScrlImage");
        this.setSize(320, 240);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrlImage();
    }
}

