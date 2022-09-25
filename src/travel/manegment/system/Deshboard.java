
package travel.manegment.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Deshboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackages, bookpackages, viewpackages, viewhotels, destinations, bookhotel, viewBookedHotel;
    JButton payments,calculator,notepad, about;
    Deshboard(String username){
           this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       // getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel pl = new JPanel();
        pl.setBackground(new Color(0, 0, 102));
        pl.setBounds(0, 0, 1500, 65);
        pl.setLayout(null);
        add(pl);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons2/dest1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);   
        icon.setBounds(5, 0, 70, 70);
        pl.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setFont(new Font("tahoma", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        pl.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(0, 0, 102));
        p2.setLayout(null);
        p2.setBounds(0, 65, 300 ,900);
        add(p2);
        
         addPersonalDetails = new JButton("Add Personal Details");
         addPersonalDetails.setBounds(0, 0, 300, 50);
         addPersonalDetails.setBackground(new Color(0, 0, 102));
         addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
         addPersonalDetails.setForeground(Color.WHITE);
         addPersonalDetails.addActionListener(this);
         p2.add(addPersonalDetails);
         
        updatePersonalDetails = new JButton("Update Personal Details");
         updatePersonalDetails.setBounds(0, 50, 300, 50);
         updatePersonalDetails.setBackground(new Color(0, 0, 102));
         updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
         updatePersonalDetails.setForeground(Color.WHITE);
         updatePersonalDetails.addActionListener(this);
         p2.add(updatePersonalDetails);
         
         viewPersonalDetails = new JButton("View Details");
         viewPersonalDetails.setBounds(0, 95, 300, 50);
         viewPersonalDetails.setBackground(new Color(0, 0, 102));
         viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
         viewPersonalDetails.setForeground(Color.WHITE);
         viewPersonalDetails.addActionListener(this);
         p2.add(viewPersonalDetails);
         
         JButton deletePersonalDetails = new JButton("Delete Personal Details");
         deletePersonalDetails.setBounds(0, 145, 300, 50);
         deletePersonalDetails.setBackground(new Color(0, 0, 102));
         deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
         deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
         deletePersonalDetails.setForeground(Color.WHITE);
         //deletePersonalDetails.addActionListener(this);
         p2.add(deletePersonalDetails);
         
         checkpackages = new JButton("Check Package");
         checkpackages.setBounds(0, 195, 300, 50);
         checkpackages.setBackground(new Color(0, 0, 102));
         checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
         checkpackages.setMargin(new Insets(0, 0, 0, 110));
         checkpackages.setForeground(Color.WHITE);
         checkpackages.addActionListener(this);
         p2.add(checkpackages);
         
         bookpackages = new JButton("Book Package");
         bookpackages.setBounds(0, 240, 300, 50);
         bookpackages.setBackground(new Color(0, 0, 102));
         bookpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
         bookpackages.setMargin(new Insets(0, 0, 0, 120));
         bookpackages.setForeground(Color.WHITE);
         bookpackages.addActionListener(this);
         p2.add(bookpackages);
         
         viewpackages = new JButton("View Package");
         viewpackages.setBounds(0, 285, 300, 40);
         viewpackages.setBackground(new Color(0, 0, 102));
         viewpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
         viewpackages.setMargin(new Insets(0, 0, 0, 120));
         viewpackages.setForeground(Color.WHITE);
         viewpackages.addActionListener(this);
         p2.add(viewpackages);
         
          viewhotels = new JButton("View Hotels");
         viewhotels.setBounds(0, 320, 300, 40);
         viewhotels.setBackground(new Color(0, 0, 102));
         viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
         viewhotels.setMargin(new Insets(0, 0, 0, 130));
         viewhotels.setForeground(Color.WHITE);
         viewhotels.addActionListener(this);
         p2.add(viewhotels);
         
        bookhotel = new JButton("Book Hotel");
          bookhotel.setBounds(0, 355, 300, 40);
          bookhotel.setBackground(new Color(0, 0, 102));
          bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
          bookhotel.setMargin(new Insets(0, 0, 0, 140));
          bookhotel.setForeground(Color.WHITE);
         bookhotel.addActionListener(this);
         p2.add(bookhotel);
         
          viewBookedHotel = new JButton("View Booked Hotel");
          viewBookedHotel.setBounds(0, 390, 300, 40);
          viewBookedHotel.setBackground(new Color(0, 0, 102));
          viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
          viewBookedHotel.setMargin(new Insets(0, 0, 0, 70));
          viewBookedHotel.setForeground(Color.WHITE);
         viewBookedHotel.addActionListener(this);
         p2.add(viewBookedHotel);
         
          destinations = new JButton("Destinations");
          destinations.setBounds(0, 425, 300, 40);
          destinations.setBackground(new Color(0, 0, 102));
          destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
          destinations.setMargin(new Insets(0, 0, 0, 125));
          destinations.setForeground(Color.WHITE);
         destinations.addActionListener(this);
         p2.add(destinations);
         
          payments = new JButton("Payments");
          payments.setBounds(0, 460, 300, 50);
          payments.setBackground(new Color(0, 0, 102));
          payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
          payments.setMargin(new Insets(0, 0, 0, 155));
          payments.setForeground(Color.WHITE);
         payments.addActionListener(this);
         p2.add(payments);
         
          calculator = new JButton("Calculator");
          calculator.setBounds(0, 505, 300, 50);
          calculator.setBackground(new Color(0, 0, 102));
          calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
          calculator.setMargin(new Insets(0, 0, 0, 145));
          calculator.setForeground(Color.WHITE);
         calculator.addActionListener(this);
         p2.add(calculator);
         
         notepad = new JButton("Notepad");
          notepad.setBounds(0, 555, 300, 50);
          notepad.setBackground(new Color(0, 0, 102));
          notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
          notepad.setMargin(new Insets(0, 0, 0, 155));
          notepad.setForeground(Color.WHITE);
         notepad.addActionListener(this);
         p2.add(notepad);
         
           about = new JButton("About");
          about.setBounds(0, 600, 300, 50);
          about.setBackground(new Color(0, 0, 102));
          about.setFont(new Font("Tahoma", Font.PLAIN, 20));
          about.setMargin(new Insets(0, 0, 0, 175));
          about.setForeground(Color.WHITE);
         about.addActionListener(this);
         p2.add(about);
         
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons2/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);   
        image.setBounds(0, 0, 1550, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(350, 70, 1200, 70);
        text.setFont(new Font("Railway", Font.PLAIN, 55));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        } else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        } else if(ae.getSource() ==  updatePersonalDetails){
            new UpdateCustomer(username);
        } else if(ae.getSource() ==  checkpackages){
            new CheckPackage();
        } else if(ae.getSource() ==  bookpackages){
            new BookPackage(username);
        } else if(ae.getSource() ==  viewpackages){
            new ViewPackage(username);
        } else if(ae.getSource() ==  viewhotels){
            new CheckHotels();
        }else if(ae.getSource() ==  destinations){
            new Destinations();
        } else if(ae.getSource() ==  bookhotel){
            new BookHotel(username);
        } else if(ae.getSource() ==  viewBookedHotel){
            new ViewBookedHotel(username);
        } else if(ae.getSource() ==  payments){
            new Payment();
        } else if(ae.getSource() ==  calculator){
           try{
               Runtime.getRuntime().exec("calc.exe");
           } catch(Exception e){
               e.printStackTrace();
           }
        } else if(ae.getSource() == notepad){
            try{
               Runtime.getRuntime().exec("notepad.exe");
           } catch(Exception e){
               e.printStackTrace();
           }
        } else if(ae.getSource() ==  about){
            new About();
        } 
    }
    
    public static void main(String args[]) {
                  new Deshboard("");
            }
}
