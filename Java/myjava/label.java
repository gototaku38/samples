import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class label extends JFrame {  
      ImageIcon image;

      public static void main(String[] args) {
		new label();
	}
      
	label() {

            image=new ImageIcon("daice1.png");
            JLabel label=new JLabel(image);
            //label.setLocation(200,200);
 
            //JPanel panel=new JPanel();
            //panel.add(label);
            this.getContentPane().add(label);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
            setResizable(false);            

	}
}
