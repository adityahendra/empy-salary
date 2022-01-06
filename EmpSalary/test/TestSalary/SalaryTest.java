package TestSalary;

import empsalary.Salary;
import empsalary.Gol1;
import empsalary.Gol2;
import empsalary.Gol3;
import empsalary.Gol4;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SalaryTest {
    
    public SalaryTest() {
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
    
    @Test
    public void testGol1() {
        System.out.println("Testing Golongan 1");
        Salary instance = new Salary();
        double expResult = 1795175.0;
        Gol1 gol1 = new Gol1(180);
        double result = instance.calculateSalary(gol1);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGol2() {
        System.out.println("Testing Golongan 2");
        Salary instance = new Salary();
        double expResult = 2262700.0;
        Gol2 gol2 = new Gol2(180);
        double result = instance.calculateSalary(gol2);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGol3() {
        System.out.println("Testing Golongan 3");
        Salary instance = new Salary();
        double expResult = 2816865.0;
        Gol3 gol3 = new Gol3(180);
        double result = instance.calculateSalary(gol3);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGol4() {
        System.out.println("Testing Golongan 4");
        Salary instance = new Salary();
        double expResult = 3287525.0;
        Gol4 gol4 = new Gol4(180);
        double result = instance.calculateSalary(gol4);
        assertEquals(expResult, result, 0.0);
    }
}
