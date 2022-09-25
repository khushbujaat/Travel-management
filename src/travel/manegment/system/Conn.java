
package travel.manegment.system;

import java.sql.*;

public class Conn {
    
   // database  connectivity by using jdbc concept
    Connection c;
    Statement s;
    Conn() {
        // st-1: register the driver
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "kj9079838506#"); //st-2 connection string
           // st-3 creating the statement
            s = c.createStatement();
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
