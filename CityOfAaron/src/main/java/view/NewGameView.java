package view;

import model.Player;
import model.Game;
import app.CityOfAaron;
import control.GameControl;
import exceptions.GameControlException;
import exceptions.MapControlException;


public class NewGameView extends ViewBase {

    /**
     * Constructor
     */
    public NewGameView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Starting a new game...\n\n";

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

        inputs[0] = getUserInput("Please enter your name, or press 'Enter to return to the Main Menu:", true);

        // Repeat for each input you need, putting it into its proper slot in the array.
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
        //Initialize the Game.
        //Set it in the main CityofAaron class.

        //If the user merely hit 'enter', exit out without
        //doing the action. Returning false will take us back
        //to the main menu.
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No player name entered. Returning to the Main Menu...");
            return false;
        }

        String playerName = inputs[0];
        try {
            createAndStartGame(playerName);
        } catch (GameControlException | MapControlException gce) {
            System.out.println(gce.getMessage());
        } 

        //return false so a loop doesn't occur.
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void createAndStartGame(String playerName)
            throws GameControlException, MapControlException {


        Game game = GameControl.createNewGame(playerName);

        CityOfAaron.setCurrentGame(game);

        GameMenuView view = new GameMenuView();
        view.displayView();

    }

}
