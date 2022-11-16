/*
 * Group.java
 */
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Group extends JFrame {

    Group() {

        JPanel panel = new JPanel();
        JLabel lbl1 = new JLabel("ID:");
        JLabel lbl2 = new JLabel("パスワード:");
        JTextField tf1 = new JTextField( 20 );
        JTextField tf2 = new JTextField( 20 );
        GroupLayout layout =new GroupLayout( panel );

        layout.setAutoCreateGaps(true);
        panel.setLayout( layout );
        layout.setAutoCreateContainerGaps(true);
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup().
            addComponent(lbl1).addComponent(lbl2));
        hGroup.addGroup(layout.createParallelGroup().
            addComponent(tf1).addComponent(tf2));
        layout.setHorizontalGroup(hGroup);
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(lbl1).addComponent(tf1));
        vGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).
            addComponent(lbl2).addComponent(tf2));
        layout.setVerticalGroup(vGroup);

        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Group");
        this.pack();
        this.setSize(280, 105);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Group();
    }
}
