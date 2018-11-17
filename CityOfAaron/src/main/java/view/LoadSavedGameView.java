package view;

public class LoadSavedGameView extends ViewBase {
    
    /**
     * Constructor
     */
      public LoadSavedGameView(){
        super();
     
                
    }
    @Override
    protected String getMessage() {
       return "Loading a saved game...\n\n";
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
        
        inputs[0] = getUserInput("You have selected to enter a file name");
        
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
        System.out.println("Thank you for your selection.\n"
                + "This function is not ready. Coming soon");
        return false;
  
    }
    
    
  
}
