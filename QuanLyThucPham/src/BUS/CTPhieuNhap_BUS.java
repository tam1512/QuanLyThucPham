/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.CTPhieuNhap_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class CTPhieuNhap_BUS {
    public static ArrayList<CTPhieuNhap_DTO> ds_ctpn;
    public static ArrayList<CTPhieuNhap_DTO> ds_ctpn_id;
    public CTPhieuNhap_BUS(){}
    public void docDS_CTPN(){
        ds_ctpn = new CTPhieuNhap_DAO().docCTPN();
    }
    public void docDS_CTPN_ID(String id_phieunhap){
        ds_ctpn_id = new CTPhieuNhap_DAO().docCTPN_ID(id_phieunhap);
    }
}
