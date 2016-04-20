/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Arian Nurrifqhi
 */
public class Database {
     public Connection c = null;
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
     static final String URL = "jdbc:mysql://localhost/birojasa";
     static final String USER = "root";
     static final String PASS = "";
   
     public Database(){
         try{
             Class.forName("com.mysql.jdbc.Driver");
             c = (Connection) DriverManager.getConnection(URL, USER, PASS);
             if(c==null){
                 System.out.println("Connection Failed");
             }else{
                 System.out.println("Connection Success");
             }
         }catch(ClassNotFoundException e){
             e.printStackTrace();
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
}
