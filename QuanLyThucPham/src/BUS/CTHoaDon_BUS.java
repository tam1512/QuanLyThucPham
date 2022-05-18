/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTHoaDon_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class CTHoaDon_BUS {
    public static ArrayList<CTHoaDon_DTO> ds_cthd;
    public void docDS_CTHD(){
        ds_cthd = new CTHoaDon_DAO().docCTHD();
    }
    public boolean them_CTHD(String id_cthd, String id_sp, String dongia,String soluong){
        boolean flag = new CTHoaDon_DAO().them_CTHD(id_cthd, id_sp, dongia, soluong);
        
            if(flag == false)
            {
                return false;
            }       
        return true;
    }
    public boolean xoa_CTHD(String id_cthd, String id_sp){
        boolean flag = new CTHoaDon_DAO().xoa_CTHD(id_cthd, id_sp);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public boolean sua_CTHD(String id_cthd, String id_sp, String dongia,String soluong){
        boolean flag = new CTHoaDon_DAO().sua_HD(id_cthd, id_sp, dongia, soluong);
       
            if(flag == true){
                return true;
            }
        return false;
    }
}
