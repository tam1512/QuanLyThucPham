/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.NhanVien_DTO;

/**
 *
 * @author blemb
 */
public class DangKi_BUS {
    public DangKi_BUS(){}
    public String check_DangKi(String pass, String repeat_pass, String userName){
        NhanVien_BUS nv = new NhanVien_BUS();
        boolean flag = true;
        for(NhanVien_DTO nvdto : NhanVien_BUS.dsnv){
            if(nvdto.TenDangNhap.equals(userName)){
                flag = false;
            }
        }
        if(pass.equals(repeat_pass)){
            if(flag == true)
               return "Đăng kí thành công";
        } else return "Mật khẩu không trùng nhau";
        return "Tên người dùng đã tồn tại";    
    }

}

