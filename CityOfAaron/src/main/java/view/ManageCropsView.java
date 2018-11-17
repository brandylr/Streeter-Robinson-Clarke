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
public class ManageCropsView extends ViewBase {
    
    /**
     * Constructor
     */
    public ManageCropsView(){
        super();       
    }
    
    @Override
    protected String getMessage() {
        return "Select which option you want to use in managing your crops.\n"
                + "B - Buy Land\n"
                + "S - Sell Land\n"
                + "F - Feed the People\n"
                + "P - Plant Crops\n"
                + "T - Pay Tithes and Offerings\n"
                + "G - Return to Game Menu";
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
    @Override
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
    
    private void buyLand(){
        System.out.println("*** buyLand() called. Coming soon");
        pause(2000);
    }
    
    private void sellLand(){
        SellLandView view = new SellLandView();
        view.displayView();
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
        PayTithingView view = new PayTithingView();
        view.displayView();
        pause(2000);
    }
    
}

    
