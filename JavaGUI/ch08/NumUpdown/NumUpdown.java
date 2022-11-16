/*
 * NumUpdown.java
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class NumUpdown extends JFrame {

    JSpinner spinh = new JSpinner();
    JSpinner spinw = new JSpinner();
    JLabel lblh = new JLabel("身長(cm)：");
    JLabel lblw = new JLabel("体重(kg)：");
    JLabel lblbmi = new JLabel("BMI:");

    class MyChangeLisner implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int h = (Integer) (spinh.getValue());
            int w = (Integer) (spinw.getValue());
            double bmi = w / (h * h / 10000.0);
            String s = String.format("BMI=%5.2f", bmi);
            lblbmi.setText(s);
        }
    }

    NumUpdown() {
        SpinnerModel modelh =  new SpinnerNumberModel(0, 0, 210, 1);
        SpinnerModel modelw =  new SpinnerNumberModel(55, 0, 120, 1);
        spinh.setModel( modelh );
        spinw.setModel( modelw );
        spinh.addChangeListener(new MyChangeLisner());
        spinw.addChangeListener(new MyChangeLisner());
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout );
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        layout.setConstraints(lblh, gbc);
        add(lblh);
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        layout.setConstraints(spinh, gbc);
        add(spinh);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        layout.setConstraints(lblw, gbc);
        add(lblw);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        layout.setConstraints(spinw, gbc);
        add(spinw);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        layout.setConstraints(lblbmi, gbc);
        add(lblbmi);
        // 初期値を計算するためにイベントを発生させる
        spinh.setValue(160);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 150);
        setTitle("NumUpdown");
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumUpdown();
    }
}
