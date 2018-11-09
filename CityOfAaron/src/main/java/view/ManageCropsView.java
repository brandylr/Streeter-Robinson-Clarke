/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author brobinson
 */
public class ManageCropsView {
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public ManageCropsView(){
        
        message = "Select which option you want to use in managing your crops.\n"
                + "B - Buy Land\n"
                + "S - Sell Land\n"
                + "F - Feed the People\n"
                + "P - Plant Crops\n"
                + "T - Pay Tithes and Offerings\n"
                + "G - Return to Game Menu";
                
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
        
        inputs[0] = getUserInput("Please type the letter for the option you want: ");
        
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
        
        switch (inputs[0].trim().toUpperCase()) {
            case "B":
                buyLand();
                break;
            case "S":
                sellLand();
                break;
            case "F":
                feedPeople();
                break;
            case "P":
                plantCrops();
                break;
            case "T":
                payTithesOfferings();
                break;
            case "G":
                System.out.println("Return to Game Menu");
                return false;
            default: 
                System.out.println(
                "\n*********************************\n"
                + "Invalid option chosen, try again.\n"
                + "*********************************\n\n");
                pause(2000);
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
    
    private void pause(int time){
        // Pause for a time.
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException exception) {
                // ignore this exception for now.
        }
    }
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void buyLand(){
        System.out.println("*** buyLand() called. Coming soon");
        pause(2000);
    }
    
    private void sellLand(){
        System.out.println("*** sellLand() called. Coming soon");
        pause(2000);
    }
    
    private void feedPeople(){
        System.out.println("*** feedPeople() called. Coming soon");
        pause(2000);
    }
    
    private void plantCrops(){
        System.out.println("*** PlantCrops() called. Coming soon");
        pause(2000);
    }
    
    private void payTithesOfferings(){
        System.out.println("*** payTithesOfferings() called. Coming soon");
        pause(2000);
    }
    
}

    
