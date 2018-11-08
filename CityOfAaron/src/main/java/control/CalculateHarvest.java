/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


/**
 *
 * @author jonclarkes
 */
public class CalculateHarvest {
    public static int calculateHarvest(int acresPlanted, int tithesPercent){
       // Calculate the amount of wheat harvested, based on the percentage
        // of tithing paid. Assume that GameControl.getRandomNumber(low, high)
        // is available to be called.
        if (acresPlanted < 0) {
            return -1;
        }
        if (tithesPercent < 0 || tithesPercent > 100) {
            return -2;
        }
        int low = 1;
        int high = 5;
        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }
        if (tithesPercent >= 8 && tithesPercent < 12){
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
    
