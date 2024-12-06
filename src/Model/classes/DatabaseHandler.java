package Model.classes;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class DatabaseHandler {
    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/data_penduduk?serverTimezone=" + TimeZone.getDefault().getID();
    private String username = "root";
    private String password = ""; 
 
    private Connection loginOn(){
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex){
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return con;
    }

    private void loginOff(){
        try{
            con.close();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Eror" + ex);
        }
    }

    public void disconnect(){
        try{
            loginOff();
        }catch(Exception ex){
            System.out.println("Error when connecting to database");
        }
    }
}
