/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author brobinson
 */
public class CalculateMortality {
    
    // Calculate the number of people who are not fed the amount required to 
    // sustain life (20 bushels per person). They die. It is sad. 
    
    public static int calculateMortality(int bushelsForFood, int currentPopulation) {
        
        // if bushelsForFood < 0 then return -1
        if (bushelsForFood < 0){
            return -1;
        }
        
        // if currentPopulation < 0 then return -1
        if (currentPopulation < 0){
            return -1;
        }
        
        // numberOfPeopleFed = bushelsForFood / 20
        int numberOfPeopleFed = bushelsForFood/20;
        
        // if numberOfPeopleFed > currentPopulation then return 0
        // everyone got fed
        if (numberOfPeopleFed > currentPopulation){
            return 0;
        }
        
        // otherwise return currentPopulation - numberOfPeopleFed
        return currentPopulation - numberOfPeopleFed;
    }
    
}
