/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author blemb
 */
public class SanPham_DTO {
    public String id_sanpham;
    public String id_loai;
    public String id_ncc;
    public String tensp;
    public String mota;
    public String giaban;
    public String soluong;
    public SanPham_DTO(){};
    public SanPham_DTO(String id_sp, String id_loai, String id_ncc, String tensp, String mota, String giaban, String sl){
        this.giaban = giaban;
        this.id_loai = id_loai;
        this.id_ncc = id_ncc;
        this.id_sanpham = id_sp;
        this.mota = mota;
        this.soluong = sl;
        this.tensp = tensp;
    }
    public void setID_sp(String sp){
        this.id_sanpham = sp;
    }
    public void setID_loai(String loai){
        this.id_loai = loai;
    }
    public void setID_ncc(String ncc){
        this.id_ncc = ncc;
    }
}
