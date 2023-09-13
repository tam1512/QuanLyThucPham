/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import DAO.SanPham_DAO;
import DTO.*;

import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class SanPham_BUS {
    public static ArrayList<SanPham_DTO> dssp;
    public static ArrayList<SanPham_DTO> dssp_loai;
    public SanPham_BUS(){};
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
    public void TimSanPham_masp(String masp){      
        dssp = new SanPham_DAO().TimSanPham_masp(masp);
    }
    public void TimSanPham_tenloai(String tenloai){      
        dssp = new SanPham_DAO().TimSanPham_tenloai(tenloai);
    }
    public void TimSanPham_tenncc(String tenncc){      
        dssp = new SanPham_DAO().TimSanPham_tenncc(tenncc);
    }
    public void TimSanPham_tensp(String tensp){      
        dssp = new SanPham_DAO().TimSanPham_tensp(tensp);
    }
    public void TimSanPham_dongia(String dongia){      
        dssp = new SanPham_DAO().TimSanPham_dongia(dongia);
    }
    public void TimSanPham_soluong(String soluong){      
        dssp = new SanPham_DAO().TimSanPham_soluong(soluong);
    }
    public void TimSanPham_stt(String stt){
        int x = Integer.parseInt(stt);
        dssp = new SanPham_DAO().TimSanPham_stt(x);
    }
}
