
package view;

import app.CityOfAaron;
import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class ReportsMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public ReportsMenuView(){
        
        message = "\n\n\n"
                + "**********************************************************\n"
                + "**********************Annual Report***********************\n"
                + "**********************************************************\n"
                + "Current Population: " + CityOfAaron.getCurrentGame().getCurrentPopulation() + "\n"
                + "Acres Owned: " + CityOfAaron.getCurrentGame().getAcresOwned() + "\n"
                + "Wheat In Storage: " + CityOfAaron.getCurrentGame().getWheatInStorage() + "\n"
                + "Last Year's Loss to Rats: " + "\n"
                + "New Move Ins: " + "\n"
                + "Last Year's Deaths: " + "\n"
                + "Storehouse Inventory \n"
                + "Animals: " + "\n"
                + "Tools: " + "\n"
                + "Provisions: " + "\n"
                + "Authors: " + "\n"
                + "**********************************************************\n"
                + "**********************************************************\n"
                + "Would you like to save this report to file?";
                
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
        
        inputs[0] = getUserInput("Y/N :");
        
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
            case "Y":
                saveReport();
                break;
            case "Yes":
                saveReport();
                break;
            case "N":
                return false;
            case "No":
                return false;
            default :
                System.out.println(
                "\n*********************************\n"
                + "Invalid option chosen, try again.\n"
                + "*********************************");
                pause(1000);
                return true;
        }
        
                return true;
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
    
    private void saveReport(){
        System.out.println("*** saveReport() called. Coming soon.");
        pause(3000);
    }
}
