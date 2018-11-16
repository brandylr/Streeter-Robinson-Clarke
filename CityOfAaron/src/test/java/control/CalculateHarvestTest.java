/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonclarkes
 */
public class CalculateHarvestTest {
    
    public CalculateHarvestTest() {
    }
    
   
    /**
     * Test of calcHarvest method, of class CalculateHarvest.
     */
    @Test
    public void testCalculateHarvest() {
        System.out.println("calculateHarvest");
        int acresPlanted = 0;
        int tithesPercent = 0;
        int expResult = 0;
        int result = CalculateHarvest.calculateHarvest(acresPlanted, tithesPercent);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCase1(){
       int result = CalculateHarvest.calculateHarvest(-1, 10);
        assertEquals(-1, result);  
    }
    @Test
    public void testCase2(){
       int result = CalculateHarvest.calculateHarvest(-10, 40);
        assertEquals(-1, result);  
    }
    @Test
    public void testCase3(){
       int result = CalculateHarvest.calculateHarvest(40, -10);
        assertEquals(-2, result);  
    }
    @Test
    public void testCase4(){
       int result = CalculateHarvest.calculateHarvest(-1, -1);
        assertEquals(-1, result);  
    }
    @Test
    public void testCase5(){
       int result = CalculateHarvest.calculateHarvest((int) 0.001, 10);
        assertEquals(0, result);  
    }
    @Test
    public void testCase6(){
       int result = CalculateHarvest.calculateHarvest(10, (int) 0.001);
        assertEquals(20, result);  
    }
}
