/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BUS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blemb
 */
public class DangNhap_BUSTest {
    
    public DangNhap_BUSTest() {
    }
    
   
    /**
     * Test of DangNhap method, of class DangNhap_BUS.
     */
    @Test
    public void testCase1() {
        System.out.println("DangNhap_testCase1");
        String TenDangNhap = "nhanvien1";
        String MatKhau = "123";
        DangNhap_BUS instance = new DangNhap_BUS();
        String expResult = "Đăng nhập thành công";
        String result = instance.DangNhap(TenDangNhap, MatKhau);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase2() {
        System.out.println("DangNhap_testCase2");
        String TenDangNhap = "-DauPhan1101";
        String MatKhau = "dau123";
        DangNhap_BUS instance = new DangNhap_BUS();
        String expResult = "Tên người dùng không hợp lệ";
        String result = instance.DangNhap(TenDangNhap, MatKhau);
        assertEquals(expResult, result);
    }

  
    @Test
    public void testCase3() {
        System.out.println("DangNhap_testCase3");
        String TenDangNhap = "DauPhan1101";
        String MatKhau = "dau1101";
        DangNhap_BUS instance = new DangNhap_BUS();
        String expResult = "Tên người dùng chưa được đăng kí";
        String result = instance.DangNhap(TenDangNhap, MatKhau);
        assertEquals(expResult, result);
    }
    
}
