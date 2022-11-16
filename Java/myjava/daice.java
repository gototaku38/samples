import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class daice {	
      public static void main(String[] args) {
		new mou();
	}
}

class mou extends JFrame implements MouseListener,Runnable {
        boolean flag=false;
        JLabel label;
        ImageIcon icon;
        ImageIcon image[]=new ImageIcon[6];      

     mou(){
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

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
            setResizable(false);
            addMouseListener(this); 
                                 
      }

      public void mouseClicked(MouseEvent e){         
      flag=!flag;
      if(flag){
      Thread th= new Thread(this);
      th.start();}
      }
  
      public void mouseReleased(MouseEvent e){}
      public void mouseEntered(MouseEvent e){}
      public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}

      public void run(){
         try{    
             while(flag){
             Random rand = new Random();
             int num = rand.nextInt(6);
             label.setIcon(image[num]);
             }              
             }
         catch(Exception e){}
      }
}





