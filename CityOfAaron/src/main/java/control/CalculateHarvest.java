/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exceptions.CalculateHarvestException;
import exceptions.GameControlException;

/**
 *
 * @author jonclarkes
 */
public class CalculateHarvest {

    public static int calculateHarvest(int acresPlanted, int tithesPercent)
            throws CalculateHarvestException, GameControlException {

// Calculate the amount of wheat harvested, based on the percentage
        // of tithing paid. Assume that GameControl.getRandomNumber(low, high)
        // is available to be called.
        if (acresPlanted < 0) {
            throw new CalculateHarvestException("The acresPlanted cannot be negative.");
        }
        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new CalculateHarvestException("The tithesPercent value cannot be negative or greater than 100.");
        }
        int low = 1;
        int high = 5;
        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }
        if (tithesPercent >= 8 && tithesPercent < 12) {
            low = 2;
            high = 4;
        }
        if (tithesPercent >= 12) {
            low = 2;
            high = 5;
        }
        int harvest = GameControl.getRandomNumber(low, high);
        int yield;
        yield = (harvest * acresPlanted);
        System.out.println("Harvest Yield:" + yield);
        return yield;
    }

}
