/*
 * Main class. This is the first code that will be executed when 
 * the program starts.
 */
package app;

import model.Game; 
import view.StartProgramView;



public class CityOfAaron {
    
    // Keep a copy of the current Game object in the main class.
    public static Game currentGame = null;
    
    public static Game getCurrentGame(){
        return currentGame;
    }
    
    public static void setCurrentGame(Game game){
        currentGame = game;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayView();
        }
        catch (Throwable te){
            System.out.println("Exception caught from the main method");
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        
    }
}