/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;


import DAO.PhieuNhap_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class PhieuNhap_BUS {
    public static ArrayList<PhieuNhap_DTO> dspn;
    public PhieuNhap_BUS(){};
    public void docDSPN(){
        dspn = new PhieuNhap_DAO().docPN();
    }
    public boolean them_PN(String id_pn, String id_ncc, String ngaynhap, String id_nhanvien){
        boolean flag = new PhieuNhap_DAO().them_PN(id_pn, id_ncc, ngaynhap, id_nhanvien);
        
            if(flag == false)
            {
                return false;
            }       
        return true;
    }
    public boolean xoa_PN(String id_pn){
        boolean flag = new PhieuNhap_DAO().xoa_PN(id_pn);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public boolean sua_PN(String id_pn, String id_ncc, String ngaynhap, String id_nhanvien){
        boolean flag = new PhieuNhap_DAO().sua_PN(id_pn, id_ncc, ngaynhap, id_nhanvien);
       
            if(flag == true){
                return true;
            }
        return false;
    }
    public void timPN_ma(String ID_PhieuNhap){
        dspn= new PhieuNhap_DAO().timPN_ma(ID_PhieuNhap);
    }
     public void timPN_IDNCC(String ID_NCC){
        dspn= new PhieuNhap_DAO().timPN_IDNCC(ID_NCC);
    }
      public void timPN_NgayNhap(String NgayNhap){
        dspn= new PhieuNhap_DAO().timPN_NgayNhap(NgayNhap);
    }
       public void timPN_IDNV(String ID_NhanVien){
        dspn= new PhieuNhap_DAO().timPN_IDNV(ID_NhanVien);
    }
}
