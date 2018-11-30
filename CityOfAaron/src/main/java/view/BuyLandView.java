package view;

import control.LandControl;
import static control.LandControl.getCurrentLandPrice;
import exceptions.GameControlException;
import exceptions.LandControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyLandView extends ViewBase {

    /**
     * Constructor
     */
    public BuyLandView() {
        super();
    }

    @Override
    protected String getMessage() {
        try {
            return "\n\n"
                    + "You have chosen to buy some acres of land.\n"
                    + "----------------------------------------------\n"
                    + "Price of land is currently " + LandControl.getCurrentLandPrice() + " bushels per acre.\n";
        } catch (GameControlException | LandControlException gce) {
            System.out.println(gce.getMessage());
        }
        return null;
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter How many acres of land to buy: ");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No amount entered. Returning to Game Menu...");
            return false;
        }
        
        try {
        int amountDesired = Integer.parseInt(inputs[0]);
        if (amountDesired < 0){
            LandControl.buyLand(amountDesired, getCurrentLandPrice());
            return true;
        }
            LandControl.buyLand(amountDesired, getCurrentLandPrice());
        } catch(NumberFormatException ex){
            System.out.println("Please enter a number.");
            return true;
        } catch (LandControlException | GameControlException lce) {
            Logger.getLogger(BuyLandView.class.getName()).log(Level.SEVERE, null, lce);
        }
        
        
       
        
        return false;
    }

}
