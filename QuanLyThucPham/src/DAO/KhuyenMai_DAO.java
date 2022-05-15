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
public class KhuyenMai_DAO {
    Connection conn = null;
    MyConnect mysql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public KhuyenMai_DAO(){
        try {
            conn = mysql.Open();
                    } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docDSKM(){
        ArrayList dskm = new ArrayList<KhuyenMai_DTO>();
        try{
            String query = "Select * from khuyenmai";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                KhuyenMai_DTO sp = new KhuyenMai_DTO();
                sp.id_km = rs.getString(1);
                sp.ten_km = rs.getString(2);
                sp.batdau = rs.getString(3);
                sp.ketthuc = rs.getString(4);
                dskm.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dskm;
    }
    
    public void themKM(String id, String ten, String batdau, String ketthuc){
        try{
            String query = "INSERT INTO `khuyenmai`(`ID_KhuyenMai`, `TenCTKhuyenMai`, `ThoiGianBatDau`, `ThoiGianKetThuc`) VALUES ('" + id
                    + "','" + ten + "','" + batdau + "','" + ketthuc + "')";
            st = conn.createStatement();
            st.executeUpdate(query);
    }   catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoaKM(String id){
        try{
            String query = "DELETE FROM `khuyenmai` WHERE ID_KhuyenMai='" + id + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
    }   catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void suaKM(String id_new, String ten, String batdau, String ketthuc, String id){
        try{
            String query = "UPDATE `khuyenmai` SET `ID_KhuyenMai`='" + id_new + "',`TenCTKhuyenMai`='" + ten 
                    + "',`ThoiGianBatDau`='" + batdau + "',`ThoiGianKetThuc`=' "+ ketthuc +"' WHERE ID_KhuyenMai='" + id + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
    }   catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
