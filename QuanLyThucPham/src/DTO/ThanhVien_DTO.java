/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Thanh Tam
 */
public class ThanhVien_DTO {
    public String ID_ThanhVien;
    public String TenDangNhap;
    public String MatKhau;
    public String Email;
    public String HoVaTen;
    public String DiaChi;
    public String SoDienThoai;
    
    public ThanhVien_DTO(){
    
    }
    public ThanhVien_DTO(String ID_ThanhVien,String TenDangNhap,String MatKhau,String Email,String HoVaTen,String DiaChi,String SoDienThoai){
        this.ID_ThanhVien=ID_ThanhVien;
        this.TenDangNhap=TenDangNhap;
        this.MatKhau=MatKhau;
        this.Email=Email;
        this.HoVaTen=HoVaTen;
        this.DiaChi=DiaChi;
        this.SoDienThoai=SoDienThoai;
    }
    public String getID_ThanhVien(){
        return this.ID_ThanhVien;
    }
    public void setID_ThanhVien(String ID_ThanhVien){
        this.ID_ThanhVien=ID_ThanhVien;
    }
    public String getTenDangNhap(){
        return TenDangNhap;
    }
    public void setTenDangNhap(String TenDangNhap){
        this.TenDangNhap=TenDangNhap;
    }
    public String getMatKhau(){
        return MatKhau;
    }
    public void setMatKhau(String MatKhau){
        this.MatKhau=MatKhau;   
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
    public String getHoVaTen(){
        return HoVaTen;
    }
    public void setHoVaTen(String HoVaTen){
        this.HoVaTen=HoVaTen;
    }
    public String getDiaChi(){
        return this.DiaChi;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi=DiaChi;
    }
    public String getSoDienThoai(){
        return this.SoDienThoai;
    }
    public void setSoDienThoai(String SoDienThoai){
        this.SoDienThoai=SoDienThoai;
    }
    
}
