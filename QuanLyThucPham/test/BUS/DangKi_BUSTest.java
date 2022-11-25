/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BUS;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blemb
 */
public class DangKi_BUSTest {
    
    public DangKi_BUSTest() {
    }
    
    /**
     * Test of check_DangKi method, of class DangKi_BUS.
     * 
     */
    
    @Test
    public void testCase1() {
        System.out.println("testCase1");
         String userName = "DauPhan1101";
        String pass = "123";
        String repeat_pass = "123";
        DangKi_BUS instance = new DangKi_BUS();
        String expResult = "Đăng kí thành công";
        String result = instance.check_DangKi(pass, repeat_pass, userName);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase2() {
        System.out.println("testCase2");
        String userName = "DauPhan1101";
        String pass = "";
        String repeat_pass = "";
        DangKi_BUS instance = new DangKi_BUS();
        String expResult = "Mật khẩu trống";
        String result = instance.check_DangKi(pass, repeat_pass, userName);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase3() {
        System.out.println("testCase3");
        String userName = "nhanvien1";
        String pass = "123";
        String repeat_pass = "1234";
        DangKi_BUS instance = new DangKi_BUS();
        String expResult = "Tên người dùng đã tồn tại";
        String result = instance.check_DangKi(pass, repeat_pass, userName);
        assertEquals(expResult, result);
        
    }
       
}
