/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import static BUS.SanPham_BUS.dssp;
import DAO.ThanhVien_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author Thanh Tam
 */
public class ThanhVien_BUS {
    public static ArrayList<ThanhVien_DTO> dstv;
    public ThanhVien_BUS(){}
     public void docThanhVien(){
        dstv = new ThanhVien_DAO().docThanhVien();
    }
      public void docThanhVien_edit(){
        dstv = new ThanhVien_DAO().docThanhVien_edit();
    }
     public void sua_ThanhVien(String ID_ThanhVien,String HoVaTen,String DiaChi,String Email,String SoDienThoai){
         new ThanhVien_DAO().suaThanhVien(ID_ThanhVien, HoVaTen, DiaChi, Email, SoDienThoai);
     }
     public void xoa_ThanhVien(String ID_ThanhVien){
         new ThanhVien_DAO().xoa_ThanhVien(ID_ThanhVien);
     }
     public String docThanhVien_SDT(String sdt){
         return new ThanhVien_DAO().docThanhVien_SDT(sdt);   
     }
     public void timThanhVien_ten(String TenThanhVien){
         dstv = new ThanhVien_DAO().timThanhVien_ten(TenThanhVien);
     }
      public void timThanhVien_ma(String  ID_ThanhVien){
           dstv = new ThanhVien_DAO().timThanhVien_ma(ID_ThanhVien);
     }
       public void timThanhVien_SDT(String SoDienThoai){
           dstv = new ThanhVien_DAO().timThanhVien_SDT(SoDienThoai);
     }
        public void timThanhVien_NgayDK(String NgayDangKi){
         dstv = new ThanhVien_DAO().timThanhVien_NgayDK(NgayDangKi);
     }
}
