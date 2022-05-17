/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;


import DAO.PhieuNhap_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class PhieuNhap_BUS {
    public static ArrayList<PhieuNhap_DTO> dspn;
    public PhieuNhap_BUS(){};
    public void docDSPN(){
        dspn = new PhieuNhap_DAO().docPN();
    }
    
}
