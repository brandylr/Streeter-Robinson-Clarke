package view;

import app.CityOfAaron;

public class EndGameView extends ViewBase {

    /**
     * Constructor
     */
    public EndGameView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "\n\n\n"
                + "**********************************************************\n"
                + "************************Game Over*************************\n"
                + "**********************************************************\n"
                + "The Reign of King " + CityOfAaron.getCurrentGame().getThePlayer().getName() + " has ended.\n"
                + "Highest Population during Reign: " + "\n"
                + "Highest Amount of Total Wheat: " + "\n"
                + "Total Amount of People Fed: " + "\n"
                + "Length of Reign: " + "\n"
                + "**********************************************************\n"
                + "**********************************************************\n";

    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // This view is not interactive. All it does is shows the 
        // game description.
        return null;
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

        EndGameView();

        return false;
    }

    private void EndGameView() {
        pause(2000);
        /** 
         * This is where we would include some if statement to determine if
         * the game would continue or end depending on yearly performance.
         */ 
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}

