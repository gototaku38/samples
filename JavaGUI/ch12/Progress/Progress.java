/*
 * Progress.java
 */
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Progress extends JFrame {

    int counter = 0;

    Progress() {
        setLayout(new BorderLayout());
        JProgressBar pbar = new JProgressBar(0, 100);
        JLabel label = new JLabel("0");
        pbar.setOrientation(SwingConstants.HORIZONTAL) ;
        pbar.setValue(0);
        pbar.setStringPainted(true);
        pbar.addChangeListener( new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText(String.format("%d%%完了", counter));
            }
        });
        add(pbar, "North");
        add(label, "South");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Progress");
        setSize(250, 140);
        setVisible(true);

        for (counter=0; counter <= 100; ) {
            try{
                Thread.sleep(200);  //スリープ
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            pbar.setValue( counter );
            counter += 5;
        }
    }

    public static void main(String[] args) {
        new Progress();
    }
}

