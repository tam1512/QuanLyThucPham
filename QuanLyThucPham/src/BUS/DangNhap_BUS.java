/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.NhanVien_DAO;
import DTO.NhanVien_DTO;
/**
 *
 * @author DELL
 */
public class DangNhap_BUS {
    public boolean DangNhap(String TenDangNhap,String MatKhau){
        DAO.NhanVien_DAO nv= new DAO.NhanVien_DAO();
        if(nv.DangNhap(TenDangNhap, MatKhau)!=null){
            return true;
        }
        return false;
    }
}
