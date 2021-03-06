package view;

import app.CityOfAaron;
import control.WheatControl;
import exceptions.GameControlException;
import exceptions.LandControlException;
import exceptions.WheatControlException;

public class GameMenuView extends ViewBase {

    /**
     * Constructor
     */
    public GameMenuView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "\n\n\n"
                + "**********************************************************\n"
                + "**********************Current Year************************\n"
                + "**********************************************************\n"
                + "Player Name: " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "\n"
                + "Map: " + CityOfAaron.getCurrentGame().getTheMap().getCurrentLocation().toString() + "\n"
                + "Acres Owned: " + CityOfAaron.getCurrentGame().getAcresOwned() + "\n"
                + "Wheat In Storage: " + CityOfAaron.getCurrentGame().getWheatInStorage() + "\n"
                + "Current Population: " + CityOfAaron.getCurrentGame().getCurrentPopulation() + "\n"
                + "**********************************************************\n"
                + "**********************************************************\n"
                + "What would you like to do?\n"
                + "--------------------------\n"
                + "1 - Manage Crops\n"
                + "2 - View the Map\n"
                + "3 - Move to a New Location\n"
                + "4 - View Inventory\n"
                + "5 - Live the Year\n"
                + "6 - Save Game\n"
                + "7 - Return to the Main Menu\n";

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

        inputs[0] = getUserInput("Choose your action: ");

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

        // return false if you want this view to exit and return
        // to the view that called it.
        switch (inputs[0].trim().toUpperCase()) {
            case "1":
                manageCrops();
                break;
            case "2":
                viewMap();
                break;
            case "3":
                moveLocation();
                break;
            case "4":
                viewReport();
                break;
            case "5":
                //Core method of game
                try {
                    liveTheYear();
                } catch (WheatControlException | GameControlException | LandControlException ce) {
                    ErrorView.display(GameMenuView.class.getName(), "Please enter a number");
                    ErrorView.display(GameMenuView.class.getName(), ce.getMessage());
                }

                break;
            case "6":
                saveGame();
                break;
            case "7":
                this.console.println("Exiting back to the Main Menu.\n\n");
                return false;
            default:
                ErrorView.display(GameMenuView.class.getName(),
                        "\n*********************************\n"
                        + "Invalid option chosen, try again.\n"
                        + "*********************************\n\n");
                pause(1000);
                return true;
        }

        return true;
        // return false if you want this view to exit and return
        // to the view that called it.
    }

    private void manageCrops() {
        pause(300);
        ManageCropsView view = new ManageCropsView();
        view.displayView();
    }

    private void viewMap() {
        pause(300);
        MapView view = new MapView();
        view.displayView();
    }

    private void moveLocation() {
        pause(300);
        MoveLocationView view = new MoveLocationView();
        view.displayView();
    }

    private void viewReport() {
        ReportsMenuView view = new ReportsMenuView();
        view.displayView();
    }

    private void liveTheYear() throws WheatControlException, GameControlException, LandControlException {
        this.console.println(
                "\n-------------------------------------------------"
                + "Calling point for methods in wheat control\n"
                + "Let's test functions for Live The Year\n");
        WheatControl.calculateLossToRats(5, 10);
        WheatControl.calculateLossToRats(6, 10);

        pause(300);
        View annualReport = new AnnualReportView();
        annualReport.displayView();
    }

    private void saveGame() {
        pause(300);
        View saveGame = new SaveGameView();
        saveGame.displayView();
    }

    private void mainMenu() {
        pause(300);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }

    private void endGame() {
        pause(300);
        View endGame = new EndGameView();
        endGame.displayView();
    }
}
