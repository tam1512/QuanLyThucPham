/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author blemb
 */
public class KhuyenMai_DTO {
    public String id_km;
    public String ten_km;
    public String batdau;
    public String ketthuc;
    
    public KhuyenMai_DTO(){};
    public KhuyenMai_DTO(String id_km, String ten_km, String batdau,String ketthuc){
        this.id_km = id_km;
        this.ten_km = ten_km;
        this.batdau = batdau;
        this.ketthuc = ketthuc;
    }
    
}
