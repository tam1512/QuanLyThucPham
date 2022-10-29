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
import java.util.ArrayList;
/**
 *
 * @author blemb
 */
public class NhanVien_DAO {
   Connection conn = null;
    MyConnect mysql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
  
    public NhanVien_DAO(){
        try {
             conn = mysql.Open();
                    } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
    public NhanVien_DTO DangNhap(String TenDangNhap, String MatKhau){
        NhanVien_DTO nv = new NhanVien_DTO();
        try {
            st = conn.createStatement();
            String query = "SELECT * FROM nhanvien where TenDangNhap='" + TenDangNhap + "' AND MatKhau='" + MatKhau + "'";
            rs = st.executeQuery(query);
            rs.next();
            nv.ID_NhanVien = rs.getString(1);
            nv.TenDangNhap = rs.getString(2);
            nv.MatKhau = rs.getString(3);
        } catch (SQLException e) {
        }
         return nv;
    }
    public void themNV(String tenDN, String matKhau,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
        try{
            String query = "INSERT INTO `nhanvien`(`TenDangNhap`, `MatKhau`, `Email`, `HoVaTen`, `DiaChi`, `SoDienThoai`) "
                    + "VALUES ('"+tenDN+"','"+matKhau+"','"+Email+"','"+HoVaTen+"','"+DiaChi+"','"+SoDienThoai+"')";
            st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docNhanVien(){
        ArrayList dsnv = new ArrayList<NhanVien_DTO>();
        try{
            String query = "Select * FROM nhanvien ";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                nv.ID_NhanVien = rs.getString(1);
                nv.TenDangNhap = rs.getString(2);
                nv.MatKhau = rs.getString(3);
                nv.Email = rs.getString(4);
                nv.HoVaTen = rs.getString(5);
                nv.DiaChi = rs.getString(6);
                nv.SoDienThoai = rs.getString(7);
                dsnv.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
    }
      public ArrayList docNhanVien_edit(){
        ArrayList dsnv = new ArrayList<NhanVien_DTO>();
        try{
            String query = "Select ID_NhanVien,HoVaTen,Email,DiaChi,SoDienThoai,TenDangNhap,MatKhau FROM Nhanvien";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                NhanVien_DTO tv = new NhanVien_DTO();
                tv.ID_NhanVien = rs.getString(1);
                tv.HoVaTen = rs.getString(2);
                tv.Email = rs.getString(3);
                tv.DiaChi = rs.getString(4);
                tv.SoDienThoai = rs.getString(5);
                tv.TenDangNhap = rs.getString(6);
                tv.MatKhau = rs.getString(7); 
                dsnv.add(tv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
    }
      
      public void suaNhanVien(String ID_NhanVien,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
          try {
               String query = "UPDATE `nhanvien` SET `HoVaTen`='"+HoVaTen+"',`Email`='"+Email+"',`DiaChi`='"+DiaChi+"',`SoDienThoai`='"+SoDienThoai+"' WHERE ID_NhanVien='"+ID_NhanVien+"'" ;
            st = conn.createStatement();
            st.executeUpdate(query);
          } catch (SQLException ex) {
              Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
         public void xoa_NhanVien(String ID_NhanVien){
        try{
            String query = "DELETE FROM nhanvien WHERE ID_NhanVien='" + ID_NhanVien + "'";
            st = conn.createStatement();
            st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         public ArrayList timNhanVien_ten(String TenNhanVien){
        ArrayList dsnv = new ArrayList<NhanVien_DTO>();
        try{
            String query = "Select * FROM nhanvien WHERE HoVaTen LIKE'%" +TenNhanVien+"%' ";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                nv.ID_NhanVien = rs.getString(1);
                nv.TenDangNhap = rs.getString(2);
                nv.MatKhau = rs.getString(3);
                nv.Email = rs.getString(4);
                nv.HoVaTen = rs.getString(5);
                nv.DiaChi = rs.getString(6);
                nv.SoDienThoai = rs.getString(7);
                dsnv.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
         }
          public ArrayList timNhanVien_ID(String ID_NhanVien){
        ArrayList dsnv = new ArrayList<NhanVien_DTO>();
        try{
            String query = "Select * FROM nhanvien WHERE ID_NhanVien='" +ID_NhanVien+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                nv.ID_NhanVien = rs.getString(1);
                nv.TenDangNhap = rs.getString(2);
                nv.MatKhau = rs.getString(3);
                nv.Email = rs.getString(4);
                nv.HoVaTen = rs.getString(5);
                nv.DiaChi = rs.getString(6);
                nv.SoDienThoai = rs.getString(7);
                dsnv.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
         }
     public ArrayList timNhanVien_TenDangNhap(String TenDangNhap){
        ArrayList dsnv = new ArrayList<NhanVien_DTO>();
        try{
            String query = "Select * FROM nhanvien WHERE TenDangNhap='" +TenDangNhap+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                NhanVien_DTO nv = new NhanVien_DTO();
                nv.ID_NhanVien = rs.getString(1);
                nv.TenDangNhap = rs.getString(2);
                nv.MatKhau = rs.getString(3);
                nv.Email = rs.getString(4);
                nv.HoVaTen = rs.getString(5);
                nv.DiaChi = rs.getString(6);
                nv.SoDienThoai = rs.getString(7);
                dsnv.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsnv;
         }
}
