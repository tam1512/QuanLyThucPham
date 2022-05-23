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
}
