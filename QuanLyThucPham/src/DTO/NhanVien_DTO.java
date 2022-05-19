/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author blemb
 */
public class NhanVien_DTO {
       public String ID_NhanVien;
    public String TenDangNhap;
    public String MatKhau;
    public String Email;
    public String HoVaTen;
    public String DiaChi;
    public String SoDienThoai;
    
    public NhanVien_DTO(){
    
    }
    public NhanVien_DTO(String ID_NhanVien,String TenDangNhap,String MatKhau,String Email,String HoVaTen,String DiaChi,String SoDienThoai){
        this.ID_NhanVien=ID_NhanVien;
        this.TenDangNhap=TenDangNhap;
        this.MatKhau=MatKhau;
        this.Email=Email;
        this.HoVaTen=HoVaTen;
        this.DiaChi=DiaChi;
        this.SoDienThoai=SoDienThoai;
    }
    public String getID_NhanVien(){
        return this.ID_NhanVien;
    }
    public void setID_NhanVien(String ID_NhanVien){
        this.ID_NhanVien=ID_NhanVien;
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
