package view;

public class MainMenuView extends ViewBase {

    /**
     * Constructor
     */
    public MainMenuView() {
    }

    @Override
    protected String getMessage() {
        return "Main Menu\n"
                + "-------------\n"
                + "N - Start a New Game\n"
                + "L - Load a Saved Game\n"
                + "H - Help Menu\n"
                + "Q - Quit\n";
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

        inputs[0] = getUserInput("Please choose an option:");

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
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        switch (inputs[0].trim().toUpperCase()) {
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
                System.out.println("Thanks for playing. Until next time!");
                return false;
            default:
                pause(3000);
                return true;
        }

        return true;
        // return false if you want this view to exit and return
        // to the view that called it.
    }

    private void startNewGame() {
        NewGameView view = new NewGameView();
        view.displayView();
    }

    private void helpMenu() {
        HelpMenuView view = new HelpMenuView();
        view.displayView();
    }

    private void loadSavedGame() {
        System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }
}
