/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arthu
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of getThePlayer method, of class Game.
     */
    @Test
    public void testGetThePlayer() {
        System.out.println("getThePlayer");
        Game instance = new Game();
        Player expResult = null;
        Player result = instance.getThePlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThePlayer method, of class Game.
     */
    @Test
    public void testSetThePlayer() {
        System.out.println("setThePlayer");
        Player thePlayer = null;
        Game instance = new Game();
        instance.setThePlayer(thePlayer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheMap method, of class Game.
     */
    @Test
    public void testGetTheMap() {
        System.out.println("getTheMap");
        Game instance = new Game();
        Map expResult = null;
        Map result = instance.getTheMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheMap method, of class Game.
     */
    @Test
    public void testSetTheMap() {
        System.out.println("setTheMap");
        Map theMap = null;
        Game instance = new Game();
        instance.setTheMap(theMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTheStorehouse method, of class Game.
     */
    @Test
    public void testGetTheStorehouse() {
        System.out.println("getTheStorehouse");
        Game instance = new Game();
        Storehouse expResult = null;
        Storehouse result = instance.getTheStorehouse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheStorehouse method, of class Game.
     */
    @Test
    public void testSetTheStorehouse() {
        System.out.println("setTheStorehouse");
        Storehouse theStorehouse = null;
        Game instance = new Game();
        instance.setTheStorehouse(theStorehouse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPopulation method, of class Game.
     */
    @Test
    public void testGetCurrentPopulation() {
        System.out.println("getCurrentPopulation");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getCurrentPopulation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentPopulation method, of class Game.
     */
    @Test
    public void testSetCurrentPopulation() {
        System.out.println("setCurrentPopulation");
        int currentPopulation = 0;
        Game instance = new Game();
        instance.setCurrentPopulation(currentPopulation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAcresOwned method, of class Game.
     */
    @Test
    public void testGetAcresOwned() {
        System.out.println("getAcresOwned");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getAcresOwned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAcresOwned method, of class Game.
     */
    @Test
    public void testSetAcresOwned() {
        System.out.println("setAcresOwned");
        int acresOwned = 0;
        Game instance = new Game();
        instance.setAcresOwned(acresOwned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWheatInStorage method, of class Game.
     */
    @Test
    public void testGetWheatInStorage() {
        System.out.println("getWheatInStorage");
        Game instance = new Game();
        int expResult = 0;
        int result = instance.getWheatInStorage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWheatInStorage method, of class Game.
     */
    @Test
    public void testSetWheatInStorage() {
        System.out.println("setWheatInStorage");
        int wheatInStorage = 0;
        Game instance = new Game();
        instance.setWheatInStorage(wheatInStorage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Game.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Game instance = new Game();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
