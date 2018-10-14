/*
 * Main class. This is the first code that will be executed when 
 * the program starts.
 */
package app;
import java.util.ArrayList;
import model.Game; 
import model.Player;
import model.Map;
import model.Storehouse;
import model.InventoryItem;
import model.Location;
import model.Provision;
import model.Author;




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
        
        
        /* Streeter's checks*/
        
        Author theAuthor = new Author();
        theAuthor.setName("Gregory");
        theAuthor.setTitle("Chief");
        System.out.println(theAuthor.toString());
        
        Map currentMap = new Map();
        System.out.println(currentMap.toString());
        
        Location mapInfo = new Location();
        mapInfo.setDescription(new String("This is the place that once was."));
        mapInfo.setName(new String("Outskirts"));
        mapInfo.setMapSymbol(new String("Question Mark"));
        mapInfo.setGameTips(new String[]{
            "Map Tip 1",
            "Map Tip 2",
            "Map Tip 3"
            });
        
        System.out.println(mapInfo.toString());
        


        
        
        /* ------ */
        
        /* Robinson's Checks*/
        InventoryItem theInventoryItem = new InventoryItem();
        
        System.out.println(theInventoryItem.toString());
        
        Provision theProvision = new Provision();
        
        System.out.println(theProvision.toString());
        /* ------ */
        

    }

}