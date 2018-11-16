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
    public void testCase1() {
        double tithesPaid = 13;
        int totalWheat = 1000;
        int afterRats;
        double lowLoss = 0.03;
        double highLoss = 0.05;
        afterRats = WheatControl.calculateLossToRats(13, 1000);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#1: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#1: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#1: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }

    @Test
    public void testCase2() {
        double tithesPaid = -3;
        int totalWheat = 1000;
        int afterRats;
        double lowLoss = 0.06;
        double highLoss = 0.10;
        afterRats = WheatControl.calculateLossToRats(-3, 1000);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#2: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#2: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#2: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }

    @Test
    public void testCase3() {
        double tithesPaid = 3;
        int totalWheat = -1000;
        int afterRats;
        double lowLoss = 0.06;
        double highLoss = 0.10;
        afterRats = WheatControl.calculateLossToRats(3, -1000);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#3: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#3: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#3: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }

    @Test
    public void testCase4() {
        double tithesPaid = -3;
        int totalWheat = -1000;
        int afterRats;
        double lowLoss = 0.06;
        double highLoss = 0.10;
        afterRats = WheatControl.calculateLossToRats(-3, -1000);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#4: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#4: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#4: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }

    @Test
    public void testCase5() {
        double tithesPaid = 0;
        int totalWheat = 1;
        int afterRats;
        double lowLoss = 0.06;
        double highLoss = 0.10;
        afterRats = WheatControl.calculateLossToRats(0, 1);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#5: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#5: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#5: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }

    @Test
    public void testCase6() {
        double tithesPaid = 0;
        int totalWheat = 100000000;
        int afterRats;
        double lowLoss = 0.06;
        double highLoss = 0.10;
        afterRats = WheatControl.calculateLossToRats(0, 100000000);

        if (totalWheat >= 0 && tithesPaid >= 0) {
            System.out.printf("Test#6: Total wheat after loss to rats: %d\n",
                    afterRats);
        } else {
            System.out.printf("Test#6: Error '-1' \n");
        }
        assertTrue(
                String.format("Test#6: afterRats = (%d).",
                         afterRats), afterRats == 0 || (afterRats >= lowLoss * totalWheat && afterRats <= highLoss * totalWheat));
    }
}
