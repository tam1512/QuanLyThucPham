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
public class SanPham_BUSTest {
    
    public SanPham_BUSTest() {
    }

    
    @Test
    public void testCase_1() {
        System.out.println("testCase_1");
        String tensp = "Cải";
        SanPham_BUS instance = new SanPham_BUS();
        String expResult = "Đã tìm thấy sản phẩm";
        String result = instance.TimSanPham_tensp(tensp);
        assertEquals(expResult, result);
    }

    /**
     * Test of TimSanPham_stt method, of class SanPham_BUS.
     */
    @Test
    public void testCase_2() {
        System.out.println("testCase_2");
        String tensp = "_@@";
        SanPham_BUS instance = new SanPham_BUS();
        String expResult = "Dữ liệu đầu vào không được chứa kí tự đặc biệt";
        String result = instance.TimSanPham_tensp(tensp);
        assertEquals(expResult, result);
    }
    @Test
    public void testCase_3() {
        System.out.println("testCase_3");
        String tensp = "";
        SanPham_BUS instance = new SanPham_BUS();
        String expResult = "Không tìm thấy sản phẩm nào";
        String result = instance.TimSanPham_tensp(tensp);
        assertEquals(expResult, result);
    }
    
}
