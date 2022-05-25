/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author blemb
 */
public class CTKhuyenMai_DAO {
    Statement st = null;
    Connection conn = null;
    ResultSet rs = null;
    MyConnect sql = new MyConnect();
    public CTKhuyenMai_DAO(){
        try {
            conn = sql.Open();
        } catch (SQLException ex) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList docDS_CTKM(){
        ArrayList ds_ctkm = new ArrayList<KhuyenMai_DTO>();
        try{
            String query = "SELECT km.ID_KhuyenMai,sp.ID_SanPham, sp.TenSanPham, ctkm.PhanTramKM, sp.GiaBan, (sp.GiaBan - sp.GiaBan*(ctkm.PhanTramKM*0.01)) as GiamCon "
                    + "FROM chitietkhuyenmai ctkm, khuyenmai km, sanpham sp WHERE km.ID_KhuyenMai = ctkm.ID_KhuyenMai && ctkm.ID_SanPham = sp.ID_SanPham ORDER BY `ctkm`.`PhanTramKM` DESC";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTKhuyenMai_DTO ctkm = new CTKhuyenMai_DTO();
                ctkm.id_km = rs.getString(1);
                ctkm.id_sp = rs.getString(2);
                ctkm.ten_sp = rs.getString(3);
                ctkm.gtkm = rs.getString(4);
                ctkm.giaban = rs.getString(5);
                ctkm.giamcon = rs.getString(6);
                ds_ctkm.add(ctkm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_ctkm;
    }
    public ArrayList docDS_CTKM_ID(String id_km){
        ArrayList ds_ctkm_id = new ArrayList<KhuyenMai_DTO>();
        try{
            String query = "SELECT km.ID_KhuyenMai,sp.ID_SanPham, sp.TenSanPham, ctkm.PhanTramKM, sp.GiaBan, (sp.GiaBan - sp.GiaBan*(ctkm.PhanTramKM*0.01)) as GiamCon "
                    + "FROM chitietkhuyenmai ctkm, khuyenmai km, sanpham sp WHERE km.ID_KhuyenMai = ctkm.ID_KhuyenMai AND ctkm.ID_SanPham = sp.ID_SanPham AND ctkm.ID_KhuyenMai = '"+id_km+"' ORDER BY `ctkm`.`PhanTramKM` DESC";
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                CTKhuyenMai_DTO ctkm = new CTKhuyenMai_DTO();
                ctkm.id_km = rs.getString(1);
                ctkm.id_sp = rs.getString(2);
                ctkm.ten_sp = rs.getString(3);
                ctkm.gtkm = rs.getString(4);
                ctkm.giaban = rs.getString(5);
                ctkm.giamcon = rs.getString(6);
                ds_ctkm_id.add(ctkm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds_ctkm_id;
    }
    
}
