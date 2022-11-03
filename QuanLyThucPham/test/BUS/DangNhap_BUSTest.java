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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of DangNhap method, of class DangNhap_BUS.
     */
    @Test
    public void testDangNhap() {
        System.out.println("DangNhap");
        String TenDangNhap = "nhanvien1";
        String MatKhau = "123";
        DangNhap_BUS instance = new DangNhap_BUS();
        boolean expResult = true;
        boolean result = instance.DangNhap(TenDangNhap, MatKhau);
        assertEquals(expResult, result);
        
    }

    
}
