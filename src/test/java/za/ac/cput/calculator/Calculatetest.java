
package za.ac.cput.calculator;

import java.util.concurrent.TimeUnit;
import org.graalvm.compiler.loop.MathUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Author: Raeece Samuels
 * Student number: 217283764
 * Declaration: I hereby declare that all work that has been put into this program is my own
 */
public class Calculatetest {
    
    private Calculate Addition;
    private Calculate Subtraction;
    private Calculate Division;
    private Calculate Multiplication;
    
    
    
    @Before
    public void setUp() throws InterruptedException {
         TimeUnit.SECONDS.sleep(10); // waits 10 seconds
    System.out.println("@BeforeEach");
    System.out.println("-------------------------");
        Addition = new Calculate();
        Division = new Calculate();
        Subtraction = new Calculate();
        Multiplication = new Calculate();
    }
    
    
    
     @Test
    public void testIdentity(){
    assertSame(Addition, Division);
    assertSame(Subtraction, Multiplication);
    }
    
    @Test
    public void testEquality(){
    assertSame(Addition, Division);
    }

    /**
     * Test of getAddition method, of class Calculate.
     */
    @Test
    public void testGetAddition() {
        System.out.println("getAddition");
        Calculate instance = new Calculate();
        String expResult = "";
        String result = instance.getAddition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddition method, of class Calculate.
     */
    @Test
    public void testSetAddition() {
        System.out.println("setAddition");
        String Addition = "";
        Calculate instance = new Calculate();
        instance.setAddition(Addition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtraction method, of class Calculate.
     */
    @Test
    public void testGetSubtraction() {
        System.out.println("getSubtraction");
        Calculate instance = new Calculate();
        String expResult = "";
        String result = instance.getSubtraction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtraction method, of class Calculate.
     */
    @Test
    
    public void testSetSubtraction() {
        System.out.println("setSubtraction");
        String Subtraction = "";
        Calculate instance = new Calculate();
        instance.setSubtraction(Subtraction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDivision method, of class Calculate.
     */
    @Test
    public void testGetDivision() {
        System.out.println("getDivision");
        Calculate instance = new Calculate();
        String expResult = "";
        String result = instance.getDivision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDivision method, of class Calculate.
     */
    @Test
    public void testSetDivision() {
        System.out.println("setDivision");
        String Division = "";
        Calculate instance = new Calculate();
        instance.setDivision(Division);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMultiplication method, of class Calculate.
     */
    @Test
    public void testGetMultiplication() {
        System.out.println("getMultiplication");
        Calculate instance = new Calculate();
        String expResult = "";
        String result = instance.getMultiplication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMultiplication method, of class Calculate.
     */
    @Test
    public void testSetMultiplication() {
        System.out.println("setMultiplication");
        String Multiplication = "";
        Calculate instance = new Calculate();
        instance.setMultiplication(Multiplication);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Calculate instance = new Calculate();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
   
  
  @Test
  void test_Multiply() throws Exception {
    
    TimeUnit.SECONDS.sleep(5); // waits 5 seconds
    System.out.println("test_Multiply()");
  }
}
