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
public class PhieuNhap_DAO {
    Connection conn = null;
    MyConnect sql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public PhieuNhap_DAO(){
        try {
            conn = sql.Open();
        } catch (SQLException ex) {
            Logger.getLogger(CTPhieuNhap_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docPN(){
        ArrayList ds_pn = new ArrayList<PhieuNhap_DTO>();
        try{
            String query = "Select * from phieunhap";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.id_phieunhap = rs.getString(1);
                pn.id_ncc = rs.getString(2);
                pn.ngaynhap = rs.getString(3);
                pn.id_nhanvien = rs.getString(4);
                ds_pn.add(pn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_pn;
    }
    public boolean them_PN(String id_pn, String id_ncc, String ngaynhap, String id_nhanvien){
        
        try{
            String query = "INSERT INTO `phieunhap`(`ID_PhieuNhap`, `ID_NCC`, `NgayNhap`, `ID_NhanVien`) VALUES ('"+id_pn+"','"+id_ncc+"','"+ngaynhap+"','"+id_nhanvien+"')";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean xoa_PN(String id_pn){
        
        try{
            String query = "DELETE FROM `phieunhap` WHERE ID_PhieuNhap='" +id_pn+ "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean sua_PN(String id_pn, String id_ncc, String ngaynhap, String id_nhanvien){
        
        try{
            String query = "UPDATE `phieunhap` SET `ID_PhieuNhap`='"+id_pn+"',`ID_NCC`='"+id_ncc+"',`NgayNhap`='"+ngaynhap+"',`ID_NhanVien`='"+id_nhanvien+"' WHERE ID_PhieuNhap='"+id_pn+"'";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public ArrayList timPN_ma(String ID_PhieuNhap){
        ArrayList ds_pn = new ArrayList<PhieuNhap_DTO>();
        try{
            String query = "Select * from phieunhap WHERE ID_PhieuNhap='"+ID_PhieuNhap+"'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.id_phieunhap = rs.getString(1);
                pn.id_ncc = rs.getString(2);
                pn.ngaynhap = rs.getString(3);
                pn.id_nhanvien = rs.getString(4);
                ds_pn.add(pn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_pn;
    }
    public ArrayList timPN_IDNCC(String ID_NCC){
        ArrayList ds_pn = new ArrayList<PhieuNhap_DTO>();
        try{
            String query = "Select * from phieunhap WHERE ID_NCC='"+ID_NCC+"'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.id_phieunhap = rs.getString(1);
                pn.id_ncc = rs.getString(2);
                pn.ngaynhap = rs.getString(3);
                pn.id_nhanvien = rs.getString(4);
                ds_pn.add(pn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_pn;
    }
    public ArrayList timPN_NgayNhap(String NgayNhap){
        ArrayList ds_pn = new ArrayList<PhieuNhap_DTO>();
        try{
            String query = "Select * from phieunhap WHERE NgayNhap LIKE '%"+NgayNhap+"%'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.id_phieunhap = rs.getString(1);
                pn.id_ncc = rs.getString(2);
                pn.ngaynhap = rs.getString(3);
                pn.id_nhanvien = rs.getString(4);
                ds_pn.add(pn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_pn;
    }
    public ArrayList timPN_IDNV(String ID_NhanVien){
        ArrayList ds_pn = new ArrayList<PhieuNhap_DTO>();
        try{
            String query = "Select * from phieunhap WHERE ID_NhanVien='"+ID_NhanVien+"'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.id_phieunhap = rs.getString(1);
                pn.id_ncc = rs.getString(2);
                pn.ngaynhap = rs.getString(3);
                pn.id_nhanvien = rs.getString(4);
                ds_pn.add(pn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_pn;
    }
}
