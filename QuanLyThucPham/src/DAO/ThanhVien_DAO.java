/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Tam
 */
public class ThanhVien_DAO {
     Connection conn = null;
    MyConnect mysql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
     public ThanhVien_DAO(){
        try {
            conn = mysql.Open();
                    } catch (SQLException ex) {
            Logger.getLogger(ThanhVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public ArrayList docThanhVien(){
        ArrayList dstv = new ArrayList<ThanhVien_DTO>();
        try{
            String query = "Select * FROM thanhvien ";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                ThanhVien_DTO tv = new ThanhVien_DTO();
                tv.ID_ThanhVien = rs.getString(1);
                tv.TenDangNhap = rs.getString(2);
                tv.MatKhau = rs.getString(3);
                tv.Email = rs.getString(4);
                tv.HoVaTen = rs.getString(5);
                tv.DiaChi = rs.getString(6);
                tv.SoDienThoai = rs.getString(7);
                dstv.add(tv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanhVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstv;
    }
      public ArrayList docThanhVien_edit(){
        ArrayList dstv = new ArrayList<ThanhVien_DTO>();
        try{
            String query = "Select ID_ThanhVien,HoVaTen,Email,DiaChi,SoDienThoai,TenDangNhap FROM thanhvien";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                ThanhVien_DTO tv = new ThanhVien_DTO();
                tv.ID_ThanhVien = rs.getString(1);
                 tv.HoVaTen = rs.getString(2);
                tv.Email = rs.getString(3);
                tv.DiaChi = rs.getString(4);
                tv.SoDienThoai = rs.getString(5);
                 tv.TenDangNhap = rs.getString(6);
                dstv.add(tv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThanhVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dstv;
    }
      
      public void suaThanhVien(String ID_ThanhVien,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
          try {
               String query = "UPDATE `thanhvien` SET `HoVaTen`='"+HoVaTen+"',`Email`='"+Email+"',`DiaChi`='"+DiaChi+"',`SoDienThoai`='"+SoDienThoai+"' WHERE ID_ThanhVien='"+ID_ThanhVien+"'" ;
            st = conn.createStatement();
            st.executeUpdate(query);
          } catch (SQLException ex) {
              Logger.getLogger(ThanhVien_DTO.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
         public void xoa_ThanhVien(String ID_ThanhVien){
        try{
            String query = "DELETE FROM thanhvien WHERE ID_ThanhVien='" + ID_ThanhVien + "'";
            st = conn.createStatement();
            st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(ThanhVien_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
