
package control;

import app.CityOfAaron;
import exceptions.GameControlException;
import exceptions.PopulationControlException;

/**
 *
 * @author brobinson
 */
public class PopulationControl {
    
    /**
     *
     * @param bushelsForFood
     * @throws PopulationControlException
     */
    public static void feedThePeople(int bushelsForFood) 
            throws PopulationControlException {
        
        if ( bushelsForFood < 0) {
                throw new PopulationControlException("Please enter a positive number");
            }
        
        if (bushelsForFood > CityOfAaron.getCurrentGame().getWheatInStorage()) {
            System.out.println("You do not have enough wheat to feed the people.\n");
        }
        
        if (bushelsForFood <= CityOfAaron.getCurrentGame().getWheatInStorage()) {
            CityOfAaron.getCurrentGame().setWheatInStorage(CityOfAaron.getCurrentGame().getWheatInStorage() - bushelsForFood);
            System.out.println("You now have " + CityOfAaron.getCurrentGame().getWheatInStorage() + " bushels of wheat left.\n");
        }
        
    }
    
    // Calculate the number of people who are not fed the amount required to 
    // sustain life (20 bushels per person). They die. It is sad. 
    
    public static int calculateMortality(int bushelsForFood, int currentPopulation) 
        throws PopulationControlException {
        
        // if bushelsForFood < 0 then return -1
        if (bushelsForFood < 0){
            throw new PopulationControlException("The value cannot be negative.");
        }
        
        // if currentPopulation < 0 then return -1
        if (currentPopulation < 0){
            throw new PopulationControlException("The value cannot be negative.");
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
    
    public static int calculateNewMoveIns(int currentPopulation) 
        throws GameControlException {
        
        int newMoveIns = currentPopulation * GameControl.getRandomNumber(3,5);
                
        return newMoveIns;
    }
    
}
