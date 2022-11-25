/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DTO.NhanVien_DTO;
/**
 *
 * @author DELL
 */
public class DangNhap_BUS {
    public String DangNhap(String TenDangNhap,String MatKhau){
        NhanVien_BUS nv_bus = new NhanVien_BUS();
        for (NhanVien_DTO nv : NhanVien_BUS.dsnv){
            if(nv.TenDangNhap.equals(TenDangNhap) && nv.MatKhau.equals(MatKhau)){
               return "Đăng nhập thành công";
            }
        }
        return "Tài khoản hoặc mật khẩu không đúng";
    }
    public int check_account(String TenDangNhap,String MatKhau){
        int check = 0;
            DAO.NhanVien_DAO nv_DAO= new DAO.NhanVien_DAO();
        NhanVien_DTO nv_DTO = new NhanVien_DTO();
        nv_DTO = nv_DAO.DangNhap(TenDangNhap, MatKhau);
        if(nv_DTO.ID_NhanVien.equals("1")){
            check = 1;
        }
        return check;
    }
    public String getID_nv(String TenDangNhap,String MatKhau){
        DAO.NhanVien_DAO nv_DAO= new DAO.NhanVien_DAO();
        NhanVien_DTO nv_DTO = new NhanVien_DTO();
        nv_DTO = nv_DAO.DangNhap(TenDangNhap, MatKhau);
        return nv_DTO.ID_NhanVien;
    }
}
