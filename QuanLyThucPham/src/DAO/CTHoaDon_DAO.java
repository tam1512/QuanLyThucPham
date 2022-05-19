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
public class CTHoaDon_DAO
{
    Connection conn = null;
    MyConnect sql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public CTHoaDon_DAO
        (){
        try {
            conn = sql.Open();
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docCTHD(){
        ArrayList ds_cthd = new ArrayList<CTHoaDon_DTO>();
        try{
            String query = "SELECT * FROM chitiethoadon cthd, hoadon hd, sanpham sp, nhanvien nv, thanhvien tv WHERE hd.ID_HoaDon = cthd.ID_HoaDon AND hd.ID_ThanhVien = tv.ID_ThanhVien AND hd.ID_NhanVien = nv.ID_NhanVien AND sp.ID_SanPham = cthd.ID_SanPham;";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTHoaDon_DTO cthd = new CTHoaDon_DTO();
                cthd.id_hoadon = rs.getString(1);
                cthd.id_sp = rs.getString(2);                
                cthd.dongia = rs.getString(3);
                cthd.soluong = rs.getString(4); 
                cthd.ngaylap = rs.getString(8);
                cthd.ghichu = rs.getString(9);
                cthd.tongtien = rs.getString(10);
                cthd.tensp = rs.getString(14);
                cthd.tennv = rs.getString(23);
                cthd.tentv = rs.getString(27);
                ds_cthd.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_cthd;
    }
    public ArrayList docCTHD_ID(String id_cthd){
        ArrayList ds_cthd = new ArrayList<CTHoaDon_DTO>();
        try{
            String query = "Select * from chitiethoadon where ID_HoaDon ='" + id_cthd + "'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTHoaDon_DTO cthd = new CTHoaDon_DTO();
                cthd.id_hoadon = rs.getString(1);
                cthd.id_sp = rs.getString(2);
                cthd.dongia = rs.getString(3);
                cthd.soluong = rs.getString(4);            
                ds_cthd.add(cthd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_cthd;
    }
    public boolean them_CTHD(String id_cthd, String id_sp, String dongia,String soluong){
        
        try{
            String query = "INSERT INTO `chitiethoadon`(`ID_HoaDon`, `ID_SanPham`, `DonGia`, `SoLuong`) VALUES ('"+id_cthd+"','"+id_sp+"','"+dongia+"','"+soluong+"')";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean xoa_CTHD(String id_cthd, String id_sp){
        
        try{
            String query = "DELETE FROM `chitiethoadon` WHERE ID_HoaDon = '" + id_cthd + "' AND ID_SanPham='" + id_sp + "'";
            st = conn.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    public boolean sua_HD(String id_cthd, String id_sp, String dongia,String soluong){
        
        try{
            String query = "UPDATE `chitiethoadon` SET `ID_HoaDon`='"+id_cthd+"',`ID_SanPham`='"+id_sp+"',`DonGia`='"+dongia+"',`SoLuong`='"+soluong+"' WHERE ID_HoaDon='"+id_cthd+"'";
            st.executeUpdate(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(CTHoaDon_DAO
                    .class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
