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
    public void testCase1() {
        int result = CalculateHarvest.calculateHarvest(10, 10);
        int lowHarvest = 10 * 2;
        int highHarvest = 10 * 4;
        assertTrue(result >= lowHarvest && result <= highHarvest);;
    }

    @Test
    public void testCase2() {
        int result = CalculateHarvest.calculateHarvest(-10, 40);
        int lowHarvest = 10 * -10;
        int highHarvest = 10 * 40;
        assertTrue(result >= lowHarvest && result <= highHarvest);
    }

    @Test
    public void testCase3() {
        int result = CalculateHarvest.calculateHarvest(-14, 7);
        int lowHarvest = 10 * -14;
        int highHarvest = 10 * 7;
        assertTrue(result >= lowHarvest && result <= highHarvest);
    }

    @Test
    public void testCase4() {
        int result = CalculateHarvest.calculateHarvest(-1, 10);
        int lowHarvest = 10 * -1;
        int highHarvest = 10 * 10;
        assertTrue(result >= lowHarvest && result <= highHarvest);
    }

    @Test
    public void testCase5() {
        int result = CalculateHarvest.calculateHarvest((int) 0.001, 10);
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testCase6() {
        int result = CalculateHarvest.calculateHarvest(10, 10);
        int lowHarvest = 10 * 2;
        int highHarvest = 10 * 4;
        assertTrue(result >= lowHarvest && result <= highHarvest);

    }
}
