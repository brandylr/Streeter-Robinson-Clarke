
package view;

import java.util.Scanner;

/**
 *
 * @author kanderson
 */
public class HelpMenuView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Select a topic for more information:\n"
                + "1 - What are the goals of the game?\n"
                + "2 - Where is the City of Aaron?\n"
                + "3 - How do I view the Map?\n"
                + "4 - How do I move to another location?\n"
                + "5 - How do I display a list of animals, provisions and tools in the city Storehouse?\n"
                + "6 - Back to the Main Menu.";
                
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
    public boolean doAction(String[] inputs){
        
        switch (inputs[0].trim().toUpperCase()){
            case "1":
                helpGoals();
                break;
            case "2":
                helpCityOfArron();
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
                System.out.println("Back to Main Menu...");
                return false;
        }
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
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private void helpGoals(){
        System.out.println("What are the goals of the game?\n"
                + "Goals of the game are to survive every year.\n");
        HelpMenuView view = new HelpMenuView();
         view.displayView();
    }
    private void helpCityOfArron(){
        System.out.println("Where is the city of Aaron?\n"
                + "In an important place.\n");
        HelpMenuView view = new HelpMenuView();
         view.displayView();
    }
    private void helpMap(){
        System.out.println("How do I view the map?\n"
                + "By selecting the correct option.\n");
        HelpMenuView view = new HelpMenuView();
         view.displayView();
    }
    private void helpMove(){
        System.out.println("How do I move to another location?\n"
                + "The user will be prompted to enter in the location of the coordinates on the map that they want to move to.\n");
        HelpMenuView view = new HelpMenuView();
         view.displayView();
    }
    private void helpDisplay(){
        System.out.println("How do I display a list of animals, provisions and tools in the City Storehouse?\n"
                + "By selecting the correct option, of course.\n");
        HelpMenuView view = new HelpMenuView();
         view.displayView();
    }
}
