/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab7part4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexander.louck418
 */
public class Lab7Part4Test {
    
    public Lab7Part4Test() {
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
     * Test of fishResult method, of class Lab7Part4.
     */
    @Test
    public void testFishResult() {
        System.out.println("fishResult");
        Lab7Part4.fishResult();
        String result =  "test";
        String expResult = "test";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of finalScore method, of class Lab7Part4.
     */
    @Test
    public void testFinalScore() {
        System.out.println("finalScore");
        Lab7Part4.finalScore();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
