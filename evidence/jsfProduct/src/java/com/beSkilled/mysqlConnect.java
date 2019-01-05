/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beSkilled;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mostafizur
 */
public class mysqlConnect {
    Connection con;
    String url="jdbc:mysql://localhost:3306/jdbcproduct";
    String usre="root";
    String password="1234";
    public Connection doConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, usre, password);
        } catch (Exception e) {
        }
        return con;
    }
}
