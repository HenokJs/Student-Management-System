
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class databaseConnection {
   final static String DB_URL = "jdbc:mysql://localhost:3307/student";
   
   final static String USER = "root";
   final static String PASS ="";
   
   public static Connection connection(){
       try{
           Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
           
           return con;
       }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
          
   }
       
}
}
