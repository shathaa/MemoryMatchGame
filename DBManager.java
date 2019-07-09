
package memorymatchgame;

import java.sql.*;


public class DBManager {
    
    
     public static final String USER_NAME ="MMG" ; 
    public static final String PSSWORD = "MMG"; 
    public static final String URL ="jdbc:mysql://127.0.0.1:3306/memorymatchgame?useSSL=false";
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            System.out.println("Exception :"+ex.getMessage());
        }
        
        try{
             
                
                con =  DriverManager.getConnection(URL,USER_NAME,PSSWORD);
//                System.out.println("DON");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return con;
    }
    
}
