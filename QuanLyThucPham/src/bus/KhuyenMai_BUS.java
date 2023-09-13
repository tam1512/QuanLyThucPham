/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import DTO.*;
import DAO.KhuyenMai_DAO;

import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class KhuyenMai_BUS {
    public static ArrayList<KhuyenMai_DTO> dskm;
    public KhuyenMai_BUS(){};
    public void docDSKM(){
        dskm = new KhuyenMai_DAO().docDSKM();
    }
    public void themKM(String id, String ten, String batdau, String ketthuc){
        new KhuyenMai_DAO().themKM(id, ten, batdau, ketthuc);
    }
    public void xoaKM(String id){
        new KhuyenMai_DAO().xoaKM(id);
    }
    public void suaKM(String id_new, String ten, String batdau, String ketthuc, String id){
        new KhuyenMai_DAO().suaKM(id_new, ten, batdau, ketthuc, id);
    }
    public void timKM_ma(String ma){
        dskm = new KhuyenMai_DAO().timKM_ma(ma);
    }
    public void timKM_ten(String ten){
        dskm = new KhuyenMai_DAO().timKM_ten(ten);
    }
    public void timKM_ngaybd(String ngaybd){
        dskm = new KhuyenMai_DAO().timKM_ngaybd(ngaybd);
    }
    public void timKM_ngaykt(String ngaykt){
        dskm = new KhuyenMai_DAO().timKM_ngaykt(ngaykt);
    }
    public void timKM_khoangtg(String ngaybd, String ngaykt){
        dskm = new KhuyenMai_DAO().timKM_khoangtg(ngaybd, ngaykt);
    }
}
