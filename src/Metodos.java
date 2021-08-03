
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Woody
 */
public class Metodos {
    
    Database database = new Database();
    Connection conn = null;
    ResultSet rs = null;
    Statement stmt = null;
    
    public void fillDataJList(JList jList){
        try{
            DefaultListModel model = new DefaultListModel();
            conn = database.conexion();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM country");
            while(rs.next()){
                String country = rs.getString("country");
                model.addElement(country);
            }
            jList.setModel(model);
        } catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
}
