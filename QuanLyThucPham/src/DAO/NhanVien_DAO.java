/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;    
import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author blemb
 */
public class NhanVien_DAO {
    public static Connection conn = null;
    MyConnect mysql = new MyConnect();
    public static ResultSet rs=null;
    public static Statement st=null;
  
    public NhanVien_DAO(){
        try {
             conn = mysql.Open();
                    } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
    public ResultSet DangNhap(String TenDangNhap, String MatKhau){
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM nhanvien where TenDangNhap='" + TenDangNhap + "' AND MatKhau='" + MatKhau + "'";
            rs = st.executeQuery(query);
            rs.next();
            return rs;
        } catch (Exception e) {
        }
         return rs=null;
    }
}
