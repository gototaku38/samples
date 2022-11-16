/*
 * WebBrowse.java
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WebBrowse extends JFrame {

    WebBrowse() {
        JPanel adrspanel = new JPanel();
        JTextField textfield = new JTextField( 20 );
        JButton button = new JButton("表示");
        JEditorPane htmlPane = new JEditorPane();
        button.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        String url = textfield.getText();
		        url.trim();
		        if ( url.length() < 3)
		            return;
		        if ( !url.startsWith("http")) {
		            url = "http://" + url;
		            textfield.setText(url);
		        }
		        try {
		            htmlPane.setPage(url);
		        } catch (IOException ex) {
		            ;
		        }
			}
        });

        this.setLayout( new BorderLayout() );
        adrspanel.setLayout( new FlowLayout());
        adrspanel.add( textfield );
        adrspanel.add( button );
        htmlPane.setEditable(false);
        htmlPane.setContentType("text/html;UTF-8");
        this.add(adrspanel, "North");
        this.add(htmlPane, "Center");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("WebBbrowse");
        setSize(450, 350);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WebBrowse();
    }
}

