/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import DAO.CTPhieuNhap_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class CTPhieuNhap_BUS {
    public static ArrayList<CTPhieuNhap_DTO> ds_ctpn;
    public static ArrayList<CTPhieuNhap_DTO> ds_ctpn_id;
    public CTPhieuNhap_BUS(){}
    public void docDS_CTPN(){
        ds_ctpn = new CTPhieuNhap_DAO().docCTPN();
    }
    public void docDS_CTPN_ID(String id_phieunhap){
        ds_ctpn_id = new CTPhieuNhap_DAO().docCTPN_ID(id_phieunhap);
    }
    public boolean them_CTPN(String id_pn, String id_sp, String soluong){
        boolean flag = new CTPhieuNhap_DAO().them_CTPN(id_pn, id_sp, soluong);
        
            if(flag == false)
            {
                return false;
            }       
        return true;
    }
    public boolean xoa_CTPN(String id_pn, String id_sp){
        boolean flag = new CTPhieuNhap_DAO().xoa_CTPN(id_pn, id_sp);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public boolean sua_CTPN(String id_pn, String id_sp, String soluong){
        boolean flag = new CTPhieuNhap_DAO().sua_CTPN(id_pn, id_sp, soluong);
       
            if(flag == true){
                return true;
            }
        return false;
    }
}
