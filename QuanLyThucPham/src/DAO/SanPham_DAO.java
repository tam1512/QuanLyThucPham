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
            String query = "Select * from sanpham";
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
}
