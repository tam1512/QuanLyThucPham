/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author blemb
 */
public class CTPhieuNhap_DAO {
    Connection conn = null;
    MyConnect sql = new MyConnect();
    Statement st = null;
    ResultSet rs = null;
    public CTPhieuNhap_DAO(){
        try {
            conn = sql.Open();
        } catch (SQLException ex) {
            Logger.getLogger(CTPhieuNhap_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docCTPN(){
        ArrayList ds_ctpn = new ArrayList<CTPhieuNhap_DTO>();
        try{
            String query = "Select * from chitietphieunhap";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTPhieuNhap_DTO ctpn = new CTPhieuNhap_DTO();
                ctpn.id_phieunhap = rs.getString(1);
                ctpn.id_sp = rs.getString(2);
                ctpn.soluong = rs.getString(3);
                ds_ctpn.add(ctpn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_ctpn;
    }
    public ArrayList docCTPN_ID(String id_phieunhap){
        ArrayList ds_ctpn_id = new ArrayList<CTPhieuNhap_DTO>();
        try{
            String query = "Select * from chitietphieunhap where ID_PhieuNhap ='" + id_phieunhap + "'";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTPhieuNhap_DTO ctpn = new CTPhieuNhap_DTO();
                ctpn.id_phieunhap = rs.getString(1);
                ctpn.id_sp = rs.getString(2);
                ctpn.soluong = rs.getString(3);
                ds_ctpn_id.add(ctpn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_ctpn_id;
    }
}
