package view;

import app.CityOfAaron;

public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "\n\n\n"
                + "**********************************************************\n"
                + "****************Current Inventory Report******************\n"
                + "**********************************************************\n"
                + "Current Population: " + CityOfAaron.getCurrentGame().getCurrentPopulation() + "\n"
                + "Acres Owned: " + CityOfAaron.getCurrentGame().getAcresOwned() + "\n"
                + "Wheat In Storage: " + CityOfAaron.getCurrentGame().getWheatInStorage() + "\n"
                + "Storehouse Inventory \n"
                + "Animals: " + "\n"
                + "Tools: " + "\n"
                + "Provisions: " + "\n"
                + "Authors: " + "\n"
                + "**********************************************************\n"
                + "**********************************************************\n"
                + "Would you like to save this report to file?";

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

        inputs[0] = getUserInput("Y/N :");

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
            case "Y":
                saveReport();
                break;
            case "Yes":
                saveReport();
                break;
            case "N":
                return false;
            case "No":
                return false;
            default:
                System.out.println(
                        "\n*********************************\n"
                        + "Invalid option chosen, try again.\n"
                        + "*********************************");
                pause(1000);
                return true;
        }

        return true;
    }


    private void saveReport() {
        System.out.println("*** saveReport() called. Coming soon.");
        pause(3000);
    }
}
