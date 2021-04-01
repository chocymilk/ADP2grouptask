/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iyatiti
 */
public class bankingTest {
    private Acount acount1;
    private Acount acount2;
    private Acount acount3;
    
    
    
    @Before
    public void setUp() {
        acount1= new Acount();
        acount2= new Acount();
        acount2= new Acount();
    }
    
   @Test
 public  void testIdentity(){
       assertSame(acount1, acount3);
   }
   @Test
  public void testEquality(){
       assertEquals(acount1, acount3);
   }


    /**
     * Test of setId method, of class banking.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        banking instance = new banking();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class banking.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        banking instance = new banking();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcountType method, of class banking.
     */
    @Test
    public void testSetAcountType() {
        System.out.println("setAcountType");
        String acountType = "";
        banking instance = new banking();
        instance.setAcountType(acountType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class banking.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        banking instance = new banking();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class banking.
     */
    @Test
    @Ignore
    public void testGetName() {
        System.out.println("getName");
        banking instance = new banking();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcountType method, of class banking.
     */
    @Test
    public void testGetAcountType() {
        System.out.println("getAcountType");
        banking instance = new banking();
        String expResult = "";
        String result = instance.getAcountType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class banking.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        banking instance = new banking();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
