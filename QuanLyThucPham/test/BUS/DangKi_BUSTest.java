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
public class DangKi_BUSTest {
    
    public DangKi_BUSTest() {
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
     * Test of check_passwrd method, of class DangKi_BUS.
     */
    @Test
    public void testCheck_passwrd() {
        System.out.println("check_passwrd");
        String pass = "123";
        String repeat_pass = "123";
        DangKi_BUS instance = new DangKi_BUS();
        boolean expResult = true;
        boolean result = instance.check_passwrd(pass, repeat_pass);
        assertEquals(expResult, result);
    }
    
}
