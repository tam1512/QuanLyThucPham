/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bus;

import DAO.CTHoaDon_DAO;
import DTO.*;

import java.util.List;

/**
 *
 * @author blemb
 */
public class CTHoaDonBUS {
    static List<CTHoaDon_DTO> dscthd;
    public static void docDSCTHD(){
        dscthd = new CTHoaDon_DAO().docCTHD();
    }
    public void themCthd(){
        throw new UnsupportedOperationException();
    }

}
