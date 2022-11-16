/*
 * Spring.java
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Spring extends JFrame {

    Spring() {

        SpringLayout layout =new SpringLayout();
        JPanel panel = new JPanel(layout);
        JLabel lbl = new JLabel("Dog name:");
        JTextField txtField = new JTextField(20);
        panel.add(lbl);
        panel.add(txtField);
        layout.putConstraint(SpringLayout.WEST, lbl, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lbl, 25, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.NORTH, txtField, 25, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, txtField, 20, SpringLayout.EAST, lbl);

        this.getContentPane().add(panel);
        this.setTitle("Spring");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(330, 120);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Spring();
    }
}
