/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author brobinson
 */
public class PayTithingView extends ViewBase {
    
    /**
     * Constructor
     */
    public PayTithingView() {
        super();
    }
    
    @Override
    protected String getMessage() {
        return "When you pay tihes and offerings you receive blessings from the Lord.";
    }
    
    /**
     * Get the set of inputs from the user.
     * @return
     */
    @Override
    public String[] getInputs() {
    
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Enter the amount you want to pay for Tithes and Offerings.");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        System.out.println("Thank you for entering your selection.\n"
                + "This function is not ready. Coming soon\n");
        return false;
        
    }  
    
}
