
package view;

/**
 *
 * @author kanderson
 */
public class HelpMenuView extends ViewBase {
 
    /**
     * Constructor
     */
    public HelpMenuView(){
       super (); 
    }
    
    @Override
    protected String getMessage() {
        return "Select a topic for more information:\n"
                + "1 - What are the goals of the game?\n"
                + "2 - Where is the City of Aaron?\n"
                + "3 - How do I view the Map?\n"
                + "4 - How do I move to another location?\n"
                + "5 - How do I display a list of animals, provisions and tools in the city Storehouse?\n"
                + "6 - Back to the Main Menu.";
                
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
        
        inputs[0] = getUserInput("Type the number: ");
        
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
        
        switch (inputs[0].trim().toUpperCase()){
            case "1":
                helpGoals();
                break;
            case "2":
                helpCityOfAaron();
                break;
            case "3":
                helpMap();
                break;
            case "4":
                helpMove();
                break;
            case "5":
                helpDisplay();
                break;
            case "6":
                this.console.println("Back to Main Menu...");
                pause(1000);
                return false;
            default: 
                ErrorView.display(HelpMenuView.class.getName(), 
                "\n*********************************\n"
                + "Invalid option chosen, try again.\n"
                + "*********************************\n\n");
                pause(1000);
                return true;  
        }
        return true;
    }
    
    private boolean helpGoals(){
        this.console.println("What are the goals of the game?\n"
                + "Goals of the game are to survive every year.\n");
        
        return true;
    }
    private boolean helpCityOfAaron(){
        this.console.println("Where is the city of Aaron?\n"
                + "The City of Aaron is in the vicinity of Ammonihah, near the cities of Moroni and Nephihah.\n");
        
        return true;
    }
    private boolean helpMap(){
        this.console.println("How do I view the map?\n"
                + "You view the map by selecting option 2 in the Game Menu.\n");
        
        return true;
    }
    private boolean helpMove(){
        this.console.println("How do I move to another location?\n"
                + "You will be prompted to enter in the location of the coordinates on the map that you want to move to.\n");
        
        return true;
    }
    private boolean helpDisplay(){
        this.console.println("How do I display a list of animals, provisions, and tools in the City Storehouse?\n"
                + "You can see a list of animals, provisions, and tools by going to the Reports Menu.\n");
        
        return true;
    }
}
