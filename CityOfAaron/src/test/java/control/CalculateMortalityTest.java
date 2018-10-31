
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brobinson
 */
public class CalculateMortalityTest {
    
    public CalculateMortalityTest() {
    }

    /**
     * Test of calculateMortality method, of class CalculateMortality.
     */
    @Test
    public void testCalculateMortality() {
        System.out.println("calculateMortality");
        int bushelsForFood = 0;
        int currentPopulation = 0;
        int expResult = -1;
        int result = CalculateMortality.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase1(){
        int result = CalculateMortality.calculateMortality(-1, 10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase2(){
        int result = CalculateMortality.calculateMortality(-10, 120);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase3(){
        int result = CalculateMortality.calculateMortality(2400, -10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase4(){
        int result = CalculateMortality.calculateMortality(-10, -10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase5(){
        int result = CalculateMortality.calculateMortality(2000, 100);
        assertEquals(0, result);
    }
    
    @Test
    public void testCase6(){
        int result = CalculateMortality.calculateMortality(1020, 100);
        assertEquals(49, result);
    }
    
}
