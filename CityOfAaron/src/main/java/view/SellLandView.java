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
public class SellLandView extends ViewBase {
    
    /**
     * Constructor
     */
    public SellLandView(){
        super();
    }
    
    @Override
    protected String getMessage() {
        return "You have chosen to sell some acres of land.\n";
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
        
        inputs[0] = getUserInput("Enter the number of acres you want to sell:");
        
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
        this.console.println("Thank you for your selection.\n"
                + "This function is not ready. Coming soon");
        return false;
        
    }
    
}
