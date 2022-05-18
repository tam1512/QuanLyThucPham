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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blemb
 */
public class HoaDon_DAO {
    Connection conn = null;
    MyConnect sql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public HoaDon_DAO(){
        try {
            conn = sql.Open();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docHD(){
        ArrayList ds_hd = new ArrayList<HoaDon_DTO>();
        try{
            String query = "Select * from hoadon";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                HoaDon_DTO hd = new HoaDon_DTO();
                hd.id_hoadon = rs.getString(1);
                hd.id_thanhvien = rs.getString(2);
                hd.id_nhanvien = rs.getString(3);
                hd.ngaythanhlap = rs.getString(4);
                hd.ghichu = rs.getString(5);
                hd.tongtien = rs.getString(6);
                
                ds_hd.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_hd;
    }
    public ArrayList docHD_ID(String id_hd){
        ArrayList ds_hd = new ArrayList<HoaDon_DTO>();
        try{
            String query = "Select * from hoadon where ID_HoaDon ='" + id_hd + "'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                HoaDon_DTO hd = new HoaDon_DTO();
                hd.id_hoadon = rs.getString(1);
                hd.id_thanhvien = rs.getString(2);
                hd.id_nhanvien = rs.getString(3);
                hd.ngaythanhlap = rs.getString(4);
                hd.ghichu = rs.getString(5);
                hd.tongtien = rs.getString(6);              
                ds_hd.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_hd;
    }
    public boolean them_HD(String id_hd, String id_tv, String id_nv,String ngaylap,String ghichu, String tongtien){
        
        try{
            String query = "INSERT INTO `hoadon`(`ID_HoaDon`, `ID_ThanhVien`, `ID_NhanVien`, `NgayThanhLap`, `GhiChu`, `TongTien`) "
                    + "VALUES ('"+id_hd+"','"+id_tv+"','"+id_nv+"','"+ngaylap+"','"+ghichu+"','"+tongtien+"')";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean xoa_HD(String id_hd){
        
        try{
            String query = "DELETE FROM `hoadon` WHERE ID_HoaDon = '" + id_hd + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean sua_HD(String id_hd, String id_tv, String id_nv,String ngaylap,String ghichu, String tongtien){
        
        try{
            String query = "UPDATE `hoadon` SET `ID_HoaDon`='"+id_hd+"',`ID_ThanhVien`='"+id_tv+"',`ID_NhanVien`='"+id_nv
                    +"',`NgayThanhLap`='"+ngaylap+"',`GhiChu`='"+ghichu+"',`TongTien`='"+tongtien+"' WHERE ID_HoaDon='" +id_hd+"'";
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
