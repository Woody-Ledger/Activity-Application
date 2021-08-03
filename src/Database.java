
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Woody
 */
public class Database {
    Connection conn = null;
    
    public Connection conexion(){
        String bd = "mydb";
        String username = "woody";
        String password = "";
        String url = "jdbc:mysql://localhost/:3306"+bd+"?userTimezone=true&serverTimezone=UTC";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection(url, username, password);
        } catch(Exception e){
                    System.out.println(e);
                    }
        return conn;
        }
    }
