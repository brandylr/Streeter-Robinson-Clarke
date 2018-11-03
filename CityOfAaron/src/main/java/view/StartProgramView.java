
package view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class StartProgramView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public StartProgramView(){
        
        message = "Welcome to the City of Aaron!\n"
                + "You have been granted the power to rule the city. With that\n"
                + "power, however, comes great responsibilty. It is up to you\n"
                + "to buy or sell land. As ruler, you are to care for the needs\n"
                + "of your citizens. You need to determine how much wheat to\n"
                + "plant, set aside to feed said citizens, and to pay an annual\n"
                + "tithe on harvested wheat. If you don't plan appropriately,\n"
                + "and there isn't enough wheat for food, some of your citizens\n"
                + "will starve and die. Too many die and you will be kicked out!\n"
                + "There is also the possibility of rats eating some of the wheat.\n"
                + "Good luck!";
                
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
        
        // This view is not interactive. All it does is shows the 
        // game description.
        return null;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){

        startMainMenuView();
        
        return false;
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
    

    
    
    private void startMainMenuView(){
        // Pause for a time.
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException exception) {
                // ignore this exception for now.
        }
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
