 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.dao;

import beSkilled.connection.MyConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mostafizur
 */
public class UserDAO {
    static Connection con=MyConnectionDB.getConnection();
    public static boolean login(){
        String sql="select uname, pass from usres where uname=?,and password=? ";
        
        
        try {
           PreparedStatement  ps = con.prepareStatement(sql);
             ps.setString(1, login());
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        if (rs.next()) {            
            return true;
            
        }else{
        return false;
        }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return true;
    
    
    }
    
}
