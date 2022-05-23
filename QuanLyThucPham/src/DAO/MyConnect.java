/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author blemb
 */
public class MyConnect {
    String user = "root";
    String password = "";
    String host = "localhost";

    String database = "ql_banhang";

    String url = "jdbc:mysql://" + host + ":3306/" + database;
    Connection conn = null;
    public MyConnect(){}
    public Connection Open() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connect Susscesful !");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public void Close() throws SQLException{
        conn.close();
    }
    public static void main(String[]args) throws SQLException{
        MyConnect m = new MyConnect();
        Connection connn = null;
        connn = m.Open();
    }
}
