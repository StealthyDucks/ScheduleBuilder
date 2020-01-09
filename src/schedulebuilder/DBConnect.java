/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulebuilder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;



/**
 *
 * @author Braden
 */
public class DBConnect {
    private static final String url ="";
    private static final String username="root";
    private static final String password="";
    
    public static String getUrl(){
        return url;
    }
    public static String getUsername(){
        return username;
    }
    public static String getPassword(){
        return password;
    }
   
    
}
