
package control;

import exceptions.PopulationControlException;
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
    public void testCalculateMortality() throws PopulationControlException {
        System.out.println("calculateMortality");
        int bushelsForFood = 0;
        int currentPopulation = 0;
        int expResult = 0;
        int result = PopulationControl.calculateMortality(bushelsForFood, currentPopulation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCase1() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(2400, 120);
        assertEquals(0, result);
    }
    
    @Test
    public void testCase2() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(-10, 120);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase3() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(2400, -10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase4() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(-10, -10);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase5() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(2000, 100);
        assertEquals(0, result);
    }
    
    @Test
    public void testCase6() throws PopulationControlException{
        int result = PopulationControl.calculateMortality(1020, 100);
        assertEquals(49, result);
    }
    
}
