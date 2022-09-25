
package travel.manegment.system;

import javax.swing.*;
import java.awt.*;


// multiple inheretance is not allowed in java
// multiple inheretance are allowed in java but with interfaces not with classes 
// for ex- in below line we can't extends more then one class [JFrame only]
//that is why we use multithreading
public  class Splash extends JFrame implements Runnable{
      Thread thread;
    Splash() {       
      //  setSize(1000, 600);
       // setLocation(200, 100);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);     
        add(image);
            
        setVisible(true);
        thread = new Thread(this);
        thread.start();
    }
    public void run() {
        try{
            Thread.sleep(7000);
           // new Login():
           setVisible(false);
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String args[]) {
      Splash frame =  new Splash();
      
      int x = 1;
      for(int i=1; i<=500; x+=7, i+=6){
        frame.setLocation(680 - (x + i)/2, 400 - (i/2));
        frame.setSize(x + i, i);
        try{
            Thread.sleep(10);
        } catch (Exception e) {
            
        }
        
      }
    }
}
