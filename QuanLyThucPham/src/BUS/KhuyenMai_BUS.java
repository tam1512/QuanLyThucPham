/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.*;
import DAO.KhuyenMai_DAO;
import DAO.SanPham_DAO;
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
}
