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
}
