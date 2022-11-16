/*
 * Card.java
 */
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Card extends JFrame {

    Card() {

        JPanel upperpanel = new JPanel();
        CardLayout layout = new CardLayout( 5, 5 );

        JPanel lowerpanel = new JPanel();
        upperpanel.setLayout( layout );

        JLabel lbl[] = new JLabel[5];
        JButton btn[] = new JButton[5];
        JPanel pnl[] = new JPanel[5];
        for (int i=0; i<5; i++) {
            lbl[i] = new JLabel("Label:" + Integer.toString(i));
            btn[i] = new JButton("Button:" + Integer.toString(i));
            pnl[i] = new JPanel();
            pnl[i].setLayout( new BoxLayout( pnl[i], BoxLayout.Y_AXIS));
            pnl[i].add(lbl[i]);
            pnl[i].add(btn[i]);
        }
        for (int i=0; i<5; i++) {
            upperpanel.add("p" + Integer.toString(i), pnl[i]);
        }

        JButton btnPrevious = new JButton("Previous");
        btnPrevious.setMinimumSize(new Dimension(120, 36));
        btnPrevious.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 layout.previous(upperpanel);
            }
        });
        JButton btnNext = new JButton("Next");
        btnNext.setMinimumSize(new Dimension(120, 36));
        btnNext.addActionListener( new ActionListener() {
            public void actionPerformed ( ActionEvent e){
                 layout.next(upperpanel);
            }
        });
        upperpanel.setBorder(
                BorderFactory.createRaisedBevelBorder());
        lowerpanel.add(btnPrevious);
        lowerpanel.add(btnNext);
        JPanel panel = new JPanel();
        panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS));
        panel.add(upperpanel);
        panel.add(lowerpanel);

        this.getContentPane().add(panel);
        this.setTitle("card");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(240,160);;
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Card();
    }
}
