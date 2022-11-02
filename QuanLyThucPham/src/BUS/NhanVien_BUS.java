/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVien_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class NhanVien_BUS {
     public static ArrayList<NhanVien_DTO> dsnv;
    public NhanVien_BUS(){
    dsnv = new NhanVien_DAO().docNhanVien();}
     public void docNhanVien(){
        dsnv = new NhanVien_DAO().docNhanVien();
    }
      public void docNhanVien_edit(){
        dsnv = new NhanVien_DAO().docNhanVien_edit();
    }
    public boolean them_NhanVien(String tenDN, String matKhau,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
        boolean flag = true;
        NhanVien_BUS nv1 = new NhanVien_BUS();
        for (NhanVien_DTO nv : NhanVien_BUS.dsnv){
            if(nv.TenDangNhap.equals(tenDN)){
                flag = false;
            }
        }
        if(flag == true){
         new NhanVien_DAO().themNV(tenDN, matKhau, HoVaTen, DiaChi, Email, SoDienThoai);
         return flag;
        } else return flag;
     }
     public void sua_NhanVien(String ID_NhanVien,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
         new NhanVien_DAO().suaNhanVien(ID_NhanVien, HoVaTen, DiaChi, Email, SoDienThoai);
     }
     public void xoa_NhanVien(String ID_NhanVien){
         new NhanVien_DAO().xoa_NhanVien(ID_NhanVien);
     }
    public void timNhanVien_ten(String TenNhanVien){
        dsnv =  new NhanVien_DAO().timNhanVien_ten(TenNhanVien);
    } 
    public void timNhanVien_ID(String ID_NhanVien){
        dsnv = new NhanVien_DAO().timNhanVien_ID(ID_NhanVien);
    }
    public void timNhanVien_TenDangNhap(String TenDangNhap){
        dsnv = new NhanVien_DAO().timNhanVien_TenDangNhap(TenDangNhap);
    }
}
