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
 * @author arthu
 */
public class CalculateLossToRatsTests {
    @Test
    public void testCase1(){
        double tithesPaid = 0.13;
        int totalWheat = 1000;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(0.13, 1000);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#1: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#1: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#1: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
    
    @Test
    public void testCase2(){
        double tithesPaid = -0.03;
        int totalWheat = 1000;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(-0.03, 1000);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#2: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#2: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#2: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
    @Test
    public void testCase3(){
        double tithesPaid = 0.03;
        int totalWheat = -1000;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(0.03, -1000);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#3: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#3: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#3: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
    @Test
    public void testCase4(){
        double tithesPaid = -0.03;
        int totalWheat = -1000;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(-0.03, -1000);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#4: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#4: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#4: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
    @Test
    public void testCase5(){
        double tithesPaid = 0;
        int totalWheat = 1;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(0, 1);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#5: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#5: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#5: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
    @Test
    public void testCase6(){
        double tithesPaid = 0;
        int totalWheat = 100000000;
        int afterRats;
        afterRats = WheatControl.calculateLossToRats(0, 100000000);
        
        if (totalWheat >= 0 && tithesPaid >= 0) {
        System.out.printf("Test#6: Having paid %d%% in tithing and having %d total wheat in the Storehouse,"
                + " after potential losses they have %d total wheat after the year. \n",
                Math.round(tithesPaid*100), totalWheat, afterRats);
        }
        else {
            System.out.printf("Test#6: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#6: The tithesPaid value (%d), the initial totalWheat value (%d) and the totalWheat value after potential loss (%d) cannot be less than or equal to 0.",
                Math.round(tithesPaid*100), totalWheat, afterRats), tithesPaid >= 0 && totalWheat >= 0 && afterRats >= 0);
    }
}
