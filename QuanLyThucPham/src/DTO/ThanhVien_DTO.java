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
    public String HoVaTen;
    public String NgayDangKi;
    public String SoDienThoai;
    
    public ThanhVien_DTO(){
    
    }
    public ThanhVien_DTO(String ID_ThanhVien,String HoVaTen,String SoDienThoai, String NgayDangKi){
        this.ID_ThanhVien=ID_ThanhVien;
        this.HoVaTen=HoVaTen;
        this.SoDienThoai=SoDienThoai;
        this.NgayDangKi=NgayDangKi;
    }
    
    
}
