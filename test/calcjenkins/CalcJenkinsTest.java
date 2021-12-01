/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calcjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author doria
 */
public class CalcJenkinsTest {
    
    public CalcJenkinsTest() {
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
     * Test of somme method, of class CalcJenkins.
     */
    @Test
    public void testSomme() {
        System.out.println("somme");
        int a = 1;
        int b = 1;
        CalcJenkins instance = new CalcJenkins();
        int expResult = 2;
        int result = instance.somme(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of soustraction method, of class CalcJenkins.
     */
    @Test
    public void testSoustraction() {
        System.out.println("soustraction");
        int a = 1;
        int b = 1;
        CalcJenkins instance = new CalcJenkins();
        int expResult = 0;
        int result = instance.soustraction(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of division method, of class CalcJenkins.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int diviseur = 4;
        int diviser = 4;
        CalcJenkins instance = new CalcJenkins();
        int expResult = 1;
        int result = instance.division(diviseur, diviser);
        assertEquals(expResult, result);
    }

    /**
     * Test of mutiplication method, of class CalcJenkins.
     */
    @Test
    public void testMutiplication() {
        System.out.println("mutiplication");
        int a = 2;
        int b = 2;
        CalcJenkins instance = new CalcJenkins();
        int expResult = 4;
        int result = instance.mutiplication(a, b);
        assertEquals(expResult, result);
    }
    
}
