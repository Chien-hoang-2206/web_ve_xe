
package context;


import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return  DriverManager.getConnection("jdbc:mysql://localhost:3306/vexe", "root", "bestwish123");
     }  
}
 