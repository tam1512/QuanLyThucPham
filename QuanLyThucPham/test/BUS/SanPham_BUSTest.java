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
     * Test of docSanPham method, of class SanPham_BUS.
     */
/*
    @Test
    public void testDocSanPham() {
        System.out.println("docSanPham");
        SanPham_BUS instance = new SanPham_BUS();
        instance.docSanPham();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docSanPham_edit method, of class SanPham_BUS.
     */
/*
    @Test
    public void testDocSanPham_edit() {
        System.out.println("docSanPham_edit");
        SanPham_BUS instance = new SanPham_BUS();
        instance.docSanPham_edit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capNhatSlSp method, of class SanPham_BUS.
     */
/*
    @Test
    public void testCapNhatSlSp() {
        System.out.println("capNhatSlSp");
        String soluong = "";
        String id = "";
        SanPham_BUS instance = new SanPham_BUS();
        instance.capNhatSlSp(soluong, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capNhatSlSp_cong method, of class SanPham_BUS.
     */
/*
    @Test
    public void testCapNhatSlSp_cong() {
        System.out.println("capNhatSlSp_cong");
        String soluong = "";
        String id = "";
        SanPham_BUS instance = new SanPham_BUS();
        instance.capNhatSlSp_cong(soluong, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of docSanPham_loai method, of class SanPham_BUS.
     */
/*
    @Test
    public void testDocSanPham_loai() {
        System.out.println("docSanPham_loai");
        String loai = "";
        SanPham_BUS instance = new SanPham_BUS();
        instance.docSanPham_loai(loai);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sua_sp method, of class SanPham_BUS.
     */
/*
    @Test
    public void testSua_sp() {
        System.out.println("sua_sp");
        String id_sp = "";
        String id_loai = "";
        String id_ncc = "";
        String ten_sp = "";
        String mota = "";
        String giaban = "";
        String soluong = "";
        SanPham_BUS instance = new SanPham_BUS();
        instance.sua_sp(id_sp, id_loai, id_ncc, ten_sp, mota, giaban, soluong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of them_sp method, of class SanPham_BUS.
     */
/*
    @Test
    public void testThem_sp() {
        System.out.println("them_sp");
        String id_sp = "";
        String id_loai = "";
        String id_ncc = "";
        String ten_sp = "";
        String mota = "";
        String giaban = "";
        String soluong = "";
        SanPham_BUS instance = new SanPham_BUS();
        instance.them_sp(id_sp, id_loai, id_ncc, ten_sp, mota, giaban, soluong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of xoa_sp method, of class SanPham_BUS.
     */
/*
    @Test
    public void testXoa_sp() {
        System.out.println("xoa_sp");
        String id_sp = "";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = false;
        boolean result = instance.xoa_sp(id_sp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TimSanPham_masp method, of class SanPham_BUS.
     */
    
    @Test
    public void testTimSanPham_masp() {
        System.out.println("TimSanPham_masp");
        String masp = "1001";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_masp(masp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of TimSanPham_ID_loai method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_ID_loai() {
        System.out.println("TimSanPham_ID_loai");
        String idloai = "2000";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_ID_loai(idloai);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of TimSanPham_id_ncc method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_id_ncc() {
        System.out.println("TimSanPham_id_ncc");
        String idncc = "200";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_id_ncc(idncc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of TimSanPham_tensp method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_tensp() {
        System.out.println("TimSanPham_tensp");
        String tensp = "Cà";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_tensp(tensp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of TimSanPham_dongia method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_dongia() {
        System.out.println("TimSanPham_dongia");
        String dongia = "15000";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_dongia(dongia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of TimSanPham_soluong method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_soluong() {
        System.out.println("TimSanPham_soluong");
        String soluong = "10";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_soluong(soluong);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of TimSanPham_stt method, of class SanPham_BUS.
     */
    @Test
    public void testTimSanPham_stt() {
        System.out.println("TimSanPham_stt");
        String stt = "1";
        SanPham_BUS instance = new SanPham_BUS();
        boolean expResult = true;
        boolean result = instance.TimSanPham_stt(stt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
