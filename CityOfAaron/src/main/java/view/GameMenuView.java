
package view;

import java.util.Scanner;
import model.Player;
import model.Game;
import app.CityOfAaron;
import control.GameControl;

/**
 *
 * @author kanderson
 */
public class GameMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public GameMenuView(){
        
        message = "\n\n\n**********************************************************\n"
                + "**********************Current Year************************\n"
                + "**********************************************************\n"
                + "Player Name: " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "\n"
                + "Map: " + CityOfAaron.getCurrentGame().getTheMap() + "\n"
                + "Acres Owned: " + CityOfAaron.getCurrentGame().getAcresOwned() + "\n"
                + "Wheat In Storage: " + CityOfAaron.getCurrentGame().getWheatInStorage() + "\n"
                + "Current Population: " + CityOfAaron.getCurrentGame().getCurrentPopulation() + "\n"
                + "**********************************************************\n"
                + "**********************************************************\n"
                + "What would you like to do?\n"
                + "--------------------------\n"
                + "1 - Manage Crops\n"
                + "2 - View the Map\n"
                + "3 - Move to a New Location\n"
                + "4 - View Annual Report\n"
                + "5 - Live the Year\n"
                + "6 - Save Game\n"
                + "7 - Return to the Main Menu\n";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Choose your action: ");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        switch (inputs[0].trim().toUpperCase()){
            case "1":
                manageCrops();
                break;
            case "2":
                viewMap();
                break;
            case "3":
                moveLocation();
                break;
            case "4":
                viewReport();
                break;
            case "5":
//                GameControl.liveTheYear(CityOfAaron.getCurrentGame(), CityOfAaron.getCurrentGame().getTithingAmount(), bushelsForFood, acresToPlant);
                liveTheYearTemp();
                break;
            case "6":
                saveGame();
                break;
            case "7":
                System.out.println("Exiting back to the Main Menu.\n\n");
                pause(1000);
                return false;
            default :
                System.out.println(
                "\n*********************************\n"
                + "Invalid option chosen, try again.\n"
                + "*********************************\n\n");
                pause(3000);
                return true;
        }
        
        return true;
        // return false if you want this view to exit and return
        // to the view that called it.
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean someActionHandler(){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        return true;
    }
    private void pause(int time){
        try {
                    Thread.sleep(time / 3);
                }
                catch (InterruptedException exception) {
                        // ignore this exception for now.
                }
        System.out.println(".");
        try {
                    Thread.sleep(time / 3);
                }
                catch (InterruptedException exception) {
                        // ignore this exception for now.
                }
        System.out.println(".");
        try {
                    Thread.sleep(time / 3);
                }
                catch (InterruptedException exception) {
                        // ignore this exception for now.
                }
        System.out.println(".");
    }
    private void  manageCrops(){
        System.out.println("*** manageCrops() called. Coming soon.\n\n");
        pause(3000);
    }
    private void viewMap(){
        System.out.println("*** viewMap() called. Coming soon.\n\n");
        pause(3000);
    }
    private void moveLocation(){
        System.out.println("*** moveLocation() called. Coming soon.\n\n");
        pause(3000);
    }
    private void viewReport(){
        ReportsMenuView view = new ReportsMenuView();
         view.displayView();
    }
    private void liveTheYearTemp(){
        System.out.println("*** liveTheYear() called. Coming soon.\n\n");
        pause(3000);
    }
    private void saveGame(){
        System.out.println("*** saveGame() called. Coming soon.\n\n");
        pause(3000);
    }
}
