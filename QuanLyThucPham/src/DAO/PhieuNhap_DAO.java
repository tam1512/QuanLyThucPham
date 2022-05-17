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
}
