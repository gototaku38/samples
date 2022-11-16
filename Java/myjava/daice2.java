import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class daice2 {
public static void main(String[] args) {
		new daice();
	}
}

class daice extends JFrame implements MouseListener,Runnable {	
      JLabel label;
      ImageIcon icon;
      ImageIcon image[]=new ImageIcon[6];
      Thread th=new Thread(this);
     
	daice() {

            icon = new ImageIcon("daice1.png");
            label = new JLabel(icon);
            label.setLayout(null);
            label.setBounds(50,50,400,400);
            this.getContentPane().add(BorderLayout.CENTER,label);

            image[0]=new ImageIcon("daice1.png");
            image[1]=new ImageIcon("daice2.png");
            image[2]=new ImageIcon("daice3.png");
            image[3]=new ImageIcon("daice4.png");
            image[4]=new ImageIcon("daice5.png");
            image[5]=new ImageIcon("daice6.png");

            th.start();

 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
            setResizable(false);
            addMouseListener(this);
      
	}

      public void mouseClicked(MouseEvent e){         

             }
  
      public void mouseReleased(MouseEvent e){}
      public void mouseEntered(MouseEvent e){}
      public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}     

      public void me(){             
             Random rand = new Random();
             int num = rand.nextInt(6);
             label.setIcon(image[num]);
      }


      public void run(){
        try{
            for(int i=0;i<5;i++){
               for(int j=0;j<6;j++){
                label.setIcon(image[j]);
                Thread.sleep(250);
              }
              }
           }catch(Exception e){}

      }


}

