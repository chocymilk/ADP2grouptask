/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenproject;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;


/**
 *
 * @author Ameer 220005060
 */
public class Students {
    
    public class Students {
    
    private Students student1, student2, student3;
    
    public Students() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        student1 = new Students();
        student2 = new Students();
        student3 = new Students();
        student1 = student3;
        
    }
    
    @Test
    void testIdentity()
    {
        assertSame(student1, student3);
    }

    @Test
     void testEquality()
    {
        assertEquals(student1, student3);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(student1, student3);

    }

    @Test
    void testFailures()
    {
        assertSame(student1, student2);
    }
    
    @Test
    @Timeout(15)
    void timeoutCheck()
    {
        for (int i =0 ; i<30 ; i++)
            System.out.println(i);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
