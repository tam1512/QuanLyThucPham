/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.HoaDon_DAO;
import DTO.*;

/**
 *
 * @author blemb
 */
public class HoaDon_BUS {
    public boolean them_HD(String id_hd, String id_tv, String id_nv,String ngaylap,String ghichu, String tongtien){
        boolean flag = new HoaDon_DAO().them_HD(id_hd, id_tv, id_nv, ngaylap, ghichu, tongtien);
        
            if(flag == false)
            {
                return false;
            }       
        return true;
    }
    public boolean xoa_HD(String id_hd){
        boolean flag = new HoaDon_DAO().xoa_HD(id_hd);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public boolean sua_HD(String id_hd, String id_tv, String id_nv,String ngaylap,String ghichu, String tongtien){
        boolean flag = new HoaDon_DAO().sua_HD(id_hd, id_tv, id_nv, ngaylap, ghichu, tongtien);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public String dem_slnv(){
         String sl_hd = new HoaDon_DAO().dem_slhd();
        return sl_hd;
     }
}
