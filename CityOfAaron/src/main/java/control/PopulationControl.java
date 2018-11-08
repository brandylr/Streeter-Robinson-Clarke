
package control;

/**
 *
 * @author brobinson
 */
public class PopulationControl {
    
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
    
    public static int calculateNewMoveIns(int currentPopulation){
        
        int newMoveIns = currentPopulation * GameControl.getRandomNumber(3,5);
                
        return newMoveIns;
    }
    
}
