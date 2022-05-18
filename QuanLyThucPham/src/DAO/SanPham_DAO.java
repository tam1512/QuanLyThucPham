/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import static java.lang.Integer.parseInt;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blemb
 */
public class SanPham_DAO {
    Connection conn = null;
    MyConnect mysql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public SanPham_DAO(){
        try {
            conn = mysql.Open();
                    } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docSanPham(){
        ArrayList dssp = new ArrayList<SanPham_DTO>();
        try{
            String query = "Select sp.ID_SanPham, l.TenLoai, ncc.TenNCC, sp.TenSanPham, sp.MoTa, sp.GiaBan, sp.SoLuong from sanpham sp, loai l, nhacungcap ncc where sp.ID_Loai = l.ID_Loai and ncc.ID_NCC = sp.ID_NhaCungCap";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                SanPham_DTO sp = new SanPham_DTO();
                sp.id_sanpham = rs.getString(1);
                sp.id_loai = rs.getString(2);
                sp.id_ncc = rs.getString(3);
                sp.tensp = rs.getString(4);
                sp.mota = rs.getString(5);
                sp.giaban = rs.getString(6);
                sp.soluong = rs.getString(7);
                dssp.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dssp;
    }
    public ArrayList docSanPham_edit(){
        ArrayList dssp = new ArrayList<SanPham_DTO>();
        try{
            String query = "Select sp.ID_SanPham, l.ID_Loai, ncc.ID_NCC, sp.TenSanPham, sp.MoTa, sp.GiaBan, sp.SoLuong from sanpham sp, loai l, nhacungcap ncc where sp.ID_Loai = l.ID_Loai and ncc.ID_NCC = sp.ID_NhaCungCap";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                SanPham_DTO sp = new SanPham_DTO();
                sp.id_sanpham = rs.getString(1);
                sp.id_loai = rs.getString(2);
                sp.id_ncc = rs.getString(3);
                sp.tensp = rs.getString(4);
                sp.mota = rs.getString(5);
                sp.giaban = rs.getString(6);
                sp.soluong = rs.getString(7);
                dssp.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dssp;
    }
    public void capNhatSlSp(String soluong, String id){
        try {
            st = conn.createStatement();
            String query1 = "select sv.soluong from sanpham sv where ID_SanPham = '" + id + "'";
            rs = st.executeQuery(query1);
            rs.next();
            
            String query = "update sanpham set SoLuong='" + (parseInt(rs.getString(1))- parseInt(soluong)) + "' where ID_SanPham='" + id + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void capNhatSlSp_cong(String soluong, String id){
        try {
            st = conn.createStatement();
            String query1 = "select sv.soluong from sanpham sv where ID_SanPham = '" + id + "'";
            rs = st.executeQuery(query1);
            rs.next();
            
            String query = "update sanpham set SoLuong='" + (parseInt(rs.getString(1))+ parseInt(soluong)) + "' where ID_SanPham='" + id + "'";
            st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docSanPham_loai(String loai){
        ArrayList dssp_loai = new ArrayList<SanPham_DTO>();
        try{
            String query = "Select sp.ID_SanPham, l.TenLoai, ncc.TenNCC, sp.TenSanPham, sp.MoTa, sp.GiaBan, sp.SoLuong from sanpham sp, loai l, nhacungcap ncc where sp.ID_Loai = l.ID_Loai and ncc.ID_NCC = sp.ID_NhaCungCap and l.ID_Loai ='" + loai + "'" ;
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                SanPham_DTO sp = new SanPham_DTO();
                sp.id_sanpham = rs.getString(1);
                sp.id_loai = rs.getString(2);
                sp.id_ncc = rs.getString(3);
                sp.tensp = rs.getString(4);
                sp.mota = rs.getString(5);
                sp.giaban = rs.getString(6);
                sp.soluong = rs.getString(7);
                dssp_loai.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dssp_loai;
    }
    public void sua_sp(String id_sp, String id_loai,String id_ncc,String ten_sp,String mota, String giaban, String soluong){
        try{
            String query = "UPDATE `sanpham` SET `ID_SanPham`='" + id_sp + "',`ID_Loai`='" + id_loai + "',`ID_NhaCungCap`='"+id_ncc+"',"
                    + "`TenSanPham`='"+ ten_sp +"',`MoTa`='"+ mota +"',`GiaBan`='"+giaban+"',`SoLuong`='"+soluong+"',`Img`='IMG11' WHERE ID_SanPham = '" + id_sp + "'" ;
            st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void them_sp(String id_sp, String id_loai,String id_ncc,String ten_sp,String mota, String giaban, String soluong){
        try{
            String query = "INSERT INTO `sanpham`(`ID_SanPham`, `ID_Loai`, `ID_NhaCungCap`, `TenSanPham`, `MoTa`, `GiaBan`, `SoLuong`, `Img`) "
                    + "VALUES ('"+id_sp+"','"+id_loai+"','"+id_ncc+"','" +ten_sp+"','"+mota+"','"+giaban+"','"+soluong+"','IMG11')";
            st = conn.createStatement();
            st.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void xoa_sp(String id_sp){
        try{
            String query = "DELETE FROM sanpham WHERE ID_SanPham='" + id_sp + "'";
            st = conn.createStatement();
            st.executeUpdate(query);           
        } catch (SQLException ex) {
            Logger.getLogger(SanPham_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
