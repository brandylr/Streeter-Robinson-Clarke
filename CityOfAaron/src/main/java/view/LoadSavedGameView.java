package view;

import static control.GameControl.getGame;
import exceptions.GameControlException;
import java.io.IOException;

public class LoadSavedGameView extends ViewBase {

    /**
     * Constructor
     */
    public LoadSavedGameView() {
        super();

    }

    @Override
    protected String getMessage() {
        return "Load your saved game.\n\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Type in the name of your saved game: ");

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String filePath = inputs[0];
        try{
            getGame(filePath);
        }   catch(GameControlException | ClassNotFoundException | IOException ex) {
            ErrorView.display(LoadSavedGameView.class.getName(), ex.getMessage());
        }
        GameMenuView view = new GameMenuView();
        view.displayView();
        
        return false;

    }

}
