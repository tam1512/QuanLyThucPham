/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTKhuyenMai_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class CTKhuyenMai_BUS {
    public static ArrayList<CTKhuyenMai_DTO> ds_ctkm;
    public CTKhuyenMai_BUS(){}
    public void docDS_CTKM(){
        ds_ctkm = new CTKhuyenMai_DAO().docDS_CTKM();
    }
    public void docDS_CTKM_ID(String id_km){
        ds_ctkm = new CTKhuyenMai_DAO().docDS_CTKM_ID(id_km);
    }
    public void sua_CTKM(String id_km, String id_sp, String gtkm){
        new CTKhuyenMai_DAO().suaCTKM(id_km, id_sp, gtkm);
    }
    public void them_CTKM(String id_km, String id_sp, String gtkm){
        new CTKhuyenMai_DAO().themCTKM(id_km, id_sp, gtkm);
    }
    public void xoa_CTKM(String id_km, String id_sp){
        new CTKhuyenMai_DAO().xoaCTKM(id_km, id_sp);
    }
}
