/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPham_DAO;
import DTO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blemb
 */
public class SanPham_BUS {
    public static ArrayList<SanPham_DTO> dssp;
    public static ArrayList<SanPham_DTO> dssp_loai;
    public SanPham_BUS(){
        if(dssp == null){
            dssp = new SanPham_DAO().docSanPham();
        }
    };
    public void docSanPham(){
        dssp = new SanPham_DAO().docSanPham();
    }
    public void docSanPham_edit(){
        dssp = new SanPham_DAO().docSanPham_edit();
    }
    public void capNhatSlSp(String soluong, String id){
        new SanPham_DAO().capNhatSlSp(soluong, id);
    }
    public void capNhatSlSp_cong(String soluong, String id){
        new SanPham_DAO().capNhatSlSp_cong(soluong, id);
    }
    public void docSanPham_loai(String loai){
        dssp_loai = new SanPham_DAO().docSanPham_loai(loai);
    }
    public void sua_sp(String id_sp, String id_loai,String id_ncc,String ten_sp,String mota, String giaban, String soluong){
        new SanPham_DAO().sua_sp(id_sp, id_loai, id_ncc, ten_sp, mota, giaban, soluong);
    }
    public void them_sp(String id_sp, String id_loai,String id_ncc,String ten_sp,String mota, String giaban, String soluong){
        new SanPham_DAO().them_sp(id_sp, id_loai, id_ncc, ten_sp, mota, giaban, soluong);
    }
    public boolean xoa_sp(String id_sp){
        if(!new SanPham_DAO().xoa_sp(id_sp)){
            return false;
        }
        return true;
    }
    
    public static ArrayList result = new ArrayList<SanPham_DTO>();
    public boolean TimSanPham_masp(String masp){ 
       result.clear();
        for(DTO.SanPham_DTO sp : dssp){
           if(sp.id_sanpham.equals(masp)){
               result.add(sp);
               return true;
           }
        }
        return false;
    }
    public boolean TimSanPham_ID_loai(String idloai){  
        docSanPham_edit();
        result.clear();
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
           if(sp.id_loai.equals(idloai)){
               result.add(sp);
               k++;
           }
        }
        if (k<=0) return false;
        return true;
    }
    public boolean TimSanPham_id_ncc(String idncc){      
        result.clear();
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
           if(sp.id_ncc.contains(idncc)){
               result.add(sp);
            k++;
           }
        }
        if (k<=0) return false;
        return true;
    }
    public boolean TimSanPham_tensp(String tensp){   
        result.clear();
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
           if(sp.tensp.contains(tensp)){
               result.add(sp);
           k++;
           }
        }
        if (k<=0) return false;
        return true;
    }
    public boolean TimSanPham_dongia(String dongia){   
        result.clear();
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
            double dg1 = Double.parseDouble(dongia);
            double dg2 = Double.parseDouble(sp.giaban);
           if(dg2 <= dg1){
               result.add(sp);
           k++;
           }
        }
        if (k<=0) return false;
        return true;
    }
    public boolean TimSanPham_soluong(String soluong){    
        result.clear();
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
            double sl1 = Double.parseDouble(sp.soluong);
            double sl2 = Double.parseDouble(soluong);
           if(sl1 >= sl2){
               result.add(sp);
            k++;
           }
        }
        if (k<=0) return false;
        return true;
    }
    public boolean TimSanPham_stt(String stt){
        result.clear();
        int x = Integer.parseInt(stt);
        int k = 0;
        for(DTO.SanPham_DTO sp : dssp){
           if( k == x){
               result.add(sp);
               return true;
           }
           k++;
        }
        return false;
    }
}
