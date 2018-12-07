package view;

public class PlantCropsView extends ViewBase {
    
     /**
     * Constructor
     */
    public PlantCropsView() {
        super();
    }
      @Override
    protected String getMessage() {
        return "You have selected to plant the crops?.\n";

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
        
        inputs[0] = getUserInput("Please enter how many crops you want to plant?"); 
        
      
        
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
