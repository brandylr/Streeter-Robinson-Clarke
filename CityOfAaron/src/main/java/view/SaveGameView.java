package view;


public class SaveGameView extends ViewBase {

    /**
     * Constructor
     */
    public SaveGameView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Please type what you would like to name your saved game as...\n\n";

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

        inputs[0] = getUserInput("File Name: ", true);

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
            System.out.println("No save game name entered. Returning to the Game Menu...");
            return false;
        }

        String saveGameName = inputs[0];
        saveGame(saveGameName);

        //return false so a loop doesn't occur.
        return false;
    }

    private void saveGame(String saveGameName) {

        System.out.println("Saving game as: " + saveGameName.replaceAll("\\s+","").toLowerCase() + ".save" ); 
        pause(1000);
        System.out.println("Once the function saveGame() is implemented, your game will have saved as: " + saveGameName.replaceAll("\\s+","").toLowerCase() + ".save" ); 

    }

}
