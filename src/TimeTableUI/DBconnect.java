/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeTableUI;

/**
 *
 * @author Harith
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author thishantj
 */
public class DBconnect {
    
    public static Connection getConnection()
    {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
    
    static Connection con;
    static void Connect(){
       try
        {
            String host = "jdbc:mysql://localhost:3306/collegetimetable?" + "user=root&password=root";
            String usn ="root";
            String pwd = "root";
            
            con = DriverManager.getConnection(host,usn,pwd);
            //JOptionPane.showMessageDialog(null,"Database Connection is Succesfull");
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            
        } 
    }
}
