/*
 * WebSource.java
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WebSource extends JFrame {

    WebSource() {
    	WebSource frame = this;
        JPanel adrspanel = new JPanel();
        JTextField txt = new JTextField( 20 );
        JButton button = new JButton("表示");
        JButton btnsrc = new JButton("ソース表示");
        JEditorPane htmlPane = new JEditorPane();
        ActionListener listener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(button)) {
                    String url = txt.getText();
                    url.trim();
                    if ( url.length() < 3)
                        return;
                    if ( !url.startsWith("http")) {
                        url = "http://" + url;
                        txt.setText(url);
                    }
                    try {
                        htmlPane.setPage(url);
                    } catch (IOException ex) {
                        ;
                    }
                } else { // ソース表示
                    JTextArea stxt = new JTextArea(20, 80);
                    stxt.setText( htmlPane.getText() );
                    JScrollPane sp = new JScrollPane(stxt);
                    JDialog dlg = new JDialog(frame, "ソース", true);
                    dlg.getContentPane().add(sp);
                    dlg.setSize(400, 360);
                    dlg.setVisible(true);
                }
            }
        };
        button.addActionListener(listener);
        btnsrc.addActionListener(listener );
        this.setLayout( new BorderLayout() );
        adrspanel.setLayout( new FlowLayout());
        adrspanel.add( txt );
        adrspanel.add( button );
        adrspanel.add( btnsrc );
        htmlPane.setEditable(false);
        htmlPane.setContentType("text/html;UTF-8");
        this.add(adrspanel, "North");
        this.add(htmlPane, "Center");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("WebSource");
        setSize(450, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WebSource();
    }
}


