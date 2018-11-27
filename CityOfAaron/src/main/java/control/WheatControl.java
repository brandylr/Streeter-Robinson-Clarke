/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author arthu
 */
public class WheatControl {

    
    public static int calculateLossToRats(int tithesPercent, int totalWheat){
       if (tithesPercent < 0 || totalWheat < 0) {
           return -1;
       }
       
       int chanceForRats = GameControl.getRandomNumber(1,100);
       
       int lossToRats = 0;
       
       double tithingMultiplier = 0.01;
       
       if (chanceForRats >= 0 && chanceForRats <= 30) {
                if (tithesPercent > 12) {
                    tithingMultiplier *= GameControl.getRandomNumber(3,5);
                    lossToRats = (int) Math.round(totalWheat * tithingMultiplier);
                return lossToRats;
                }

                if (tithesPercent >= 8 && tithesPercent <= 12) {
                    tithingMultiplier *= GameControl.getRandomNumber( 3, 7);
                    lossToRats = (int) Math.round(totalWheat * tithingMultiplier);
                return lossToRats;
                }

                if (tithesPercent < 8) {
                    tithingMultiplier *= GameControl.getRandomNumber( 6, 10);
                    lossToRats = (int) Math.round(totalWheat * tithingMultiplier);
                return lossToRats;
                }
           
       }
       return lossToRats;
    }
    
}
