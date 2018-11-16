
package view;

import app.CityOfAaron;
import java.util.Scanner;



/**
 *
 * @author jonclarkes
 */
public class MoveLocationView {
    
     /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public MoveLocationView(){
        
        message = "Moving to a new location...\n\n";
        message = "Name of Location...\n\n";
        message = "Tips of the City...\n\n";        
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
        String[] inputs = new String[2];
        
        //The following string is printed to the console by the statement 'system.out.println(prompt)'
        // included in the getUserInput method
        
        inputs[0] = getUserInput("Please enter the row coordiante", true);
        inputs[1] = getUserInput("Please enter the column coordiante", true);
        
        // repeat for each input you need, putting it in its proper slot in the array.
        
        return inputs;
    }
     /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        
        if ((inputs[0] == null && inputs[1] == null) || (inputs[0].equals("") && inputs[1].equals(""))) {
            System.out.println("No coordiantes entered. Returning to game menu");
            return false;
        }
        
        int row, column;
        try {
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException exception) {
            System.out.println("Row and Column values must be whole numbers");
            return true; //keep going
        }     
        
        // to interrupt loop of display method
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
}
