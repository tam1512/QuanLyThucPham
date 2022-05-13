/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.SanPham_DAO;
import DTO.*;
import java.util.ArrayList;

/**
 *
 * @author blemb
 */
public class SanPham_BUS {
    public static ArrayList<SanPham_DTO> dssp;
    public static ArrayList<SanPham_DTO> dssp_loai;
    public SanPham_BUS(){};
    public void docSanPham(){
        dssp = new SanPham_DAO().docSanPham();
    }
    public void capNhatSlSp(String soluong, String id){
        new SanPham_DAO().capNhatSlSp(soluong, id);
    }
    public void docSanPham_loai(String loai){
        dssp_loai = new SanPham_DAO().docSanPham_loai(loai);
    }
    public static void main(String[] args){
        
    }
}
