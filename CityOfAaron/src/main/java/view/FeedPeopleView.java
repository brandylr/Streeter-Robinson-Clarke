package view;

import app.CityOfAaron;
import control.PopulationControl;
import exceptions.PopulationControlException;


public class FeedPeopleView extends ViewBase {

    /**
     * Constructor
     */
    public FeedPeopleView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "You have selected to feed the people.\n";

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

        inputs[0] = getUserInput("How many bushels of grain do you want to feed the people?");

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
            ErrorView.display(FeedPeopleView.class.getName(), "No amount entered. Returning to Game Menu...");
            
            return false;
        }
        
        try {
        int bushelsForFood = Integer.parseInt(inputs[0]);
        if (bushelsForFood < 0) {
            PopulationControl.feedThePeople(bushelsForFood);
            return true;
        }
        if (bushelsForFood > CityOfAaron.getCurrentGame().getWheatInStorage()) {
            PopulationControl.feedThePeople(bushelsForFood);
            return true;
        }
        
            PopulationControl.feedThePeople(bushelsForFood);
        
        } catch(NumberFormatException ex) {
            ErrorView.display(FeedPeopleView.class.getName(), "Please enter a number. ");
            return true;
        } catch (PopulationControlException pce) {
            ErrorView.display(FeedPeopleView.class.getName(), pce.getMessage());
            return true;
        }
        return false;
    }

}
