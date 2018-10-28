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
    
    public static int calculateLossToRats(double tithesPaid, int totalWheat){
       if (tithesPaid < 0) {
           return -1;
       }
       if (totalWheat < 0){
           return -1;
       }
       
       int chanceForRats = GameControl.getRandomNumber(1,100);
       
       double tithingMultiplier = 0.01;
       
       if (chanceForRats >= 1 && chanceForRats <= 30) {
                if (tithesPaid > 0.12) {
                    tithingMultiplier *= GameControl.getRandomNumber(3,5);
                    totalWheat -= (totalWheat * tithingMultiplier);
                return totalWheat;
                }

                if (tithesPaid > .08 && tithesPaid < 0.12) {
                    tithingMultiplier *= GameControl.getRandomNumber( 3, 7);
                    totalWheat -= (totalWheat * tithingMultiplier);
                return totalWheat;
                }

                if (tithesPaid < 0.08) {
                    tithingMultiplier *= GameControl.getRandomNumber( 6, 10);
                    totalWheat -= (totalWheat * tithingMultiplier);
                return totalWheat;
                }
           
       }
       else {
           return totalWheat;
       }
       return totalWheat;
    }
    
}
