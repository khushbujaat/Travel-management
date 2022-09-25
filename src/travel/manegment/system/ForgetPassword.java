
package travel.manegment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JLabel lblusername, lblname, lblquestion, lblanswer, lblpassword;
    JButton search, retrieve, back;
    JTextField tfusername, tfname, tfquestion, tfanswer, tfpassword;
    
    ForgetPassword() {
        
        setBounds(350, 200, 850, 380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  
           
        JPanel pl = new JPanel();
        pl.setBounds(30, 30, 500 ,280);
        pl.setLayout(null);
        add(pl);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);   
        image.setBounds(580, 70, 200 ,200);
        add(image);
           
        lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 25);
        lblusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(220, 20, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfusername);
        
         search = new JButton("Search");
         search.setBounds(380, 20, 100, 25);
         search.setBackground(Color.GRAY);
         search.setForeground(Color.WHITE);
         search.addActionListener(this);
         pl.add(search);
        
        lblname = new JLabel("Name");
        lblname.setBounds(40, 60, 100, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(220, 60, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfname);
        
        lblquestion = new JLabel("Security Question");
        lblquestion.setBounds(40, 100, 105, 25);
        lblquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl.add(lblquestion);
        
        tfquestion = new JTextField();
        tfquestion.setBounds(220, 100, 150, 25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfquestion);
        
        lblanswer = new JLabel("Answer");
        lblanswer.setBounds(40, 140, 105, 25);
        lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(220, 140, 150, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfanswer);
         
         retrieve = new JButton("Retrieve");
         retrieve.setBounds(380, 140, 100, 25);
         retrieve.setBackground(Color.GRAY);
         retrieve.setForeground(Color.WHITE);
         retrieve.addActionListener(this);
         pl.add(retrieve);
        
         lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 180, 105, 25);
        lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        pl.add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(220, 180, 150, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        pl.add(tfpassword);
        
         back = new JButton("Back");
         back.setBounds(150, 230, 100, 25);
         back.setBackground(Color.GRAY);
         back.setForeground(Color.WHITE);
         back.addActionListener(this);
         pl.add(back);
         
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {           
            try {               
                    String query ="select * from account where username = '"+tfusername.getText()+"' "; 
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        tfname.setText(rs.getString("name"));
                        tfquestion.setText(rs.getString("security"));
                        
                    }
                   } catch(Exception e){
                       e.printStackTrace();
                   }
            
        } else if (ae.getSource() == retrieve){
            try {               
                    String query ="select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"' "; 
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery(query);
                    while(rs.next()){
                        tfpassword.setText(rs.getString("password"));                      
                    }
                   } catch(Exception e){
                       e.printStackTrace();
                   }
        } else {
              setVisible(false);
              new Login();
        }
        
    }
    
    public static void main(String args[]) {
        new ForgetPassword();
    }
}




