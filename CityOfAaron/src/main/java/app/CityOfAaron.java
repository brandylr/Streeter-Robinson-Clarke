/*
 * Main class. This is the first code that will be executed when 
 * the program starts.
 */
package app;
import model.Game; 
import model.Player;
import model.Map;
import model.Storehouse;
import model.InventoryItem;
import model.Provision;




public class CityOfAaron {

    /**
     * The starting point for our application. 
     * 
     * @param args Any parameters passed on the command line will be 
     * contained in this array.
     */
    public static void main(String[] args) {
        
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(10000);
        
        System.out.println(theGame.toString());
        
        InventoryItem theInventoryItem = new InventoryItem();
        
        System.out.println(theInventoryItem.toString());
        
        Provision theProvision = new Provision();
        
        System.out.println(theProvision.toString());
        
        

    }

}