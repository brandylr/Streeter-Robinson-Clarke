package view;

import app.CityOfAaron;
import exceptions.PopulationControlException;

public class AnnualReportView extends ViewBase {

    /**
     * Constructor
     */
    public AnnualReportView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "\n\n\n"
                + "**********************************************************\n"
                + "**********************Annual Report***********************\n"
                + "**********************************************************\n"
                + "Current Year: " + "\n"
                + "How Many People Starved: " + "\n"
                + "New Move Ins: " + "\n"
                + "Current Population: " + CityOfAaron.getCurrentGame().getCurrentPopulation() + "\n"
                + "Acres Owned: " + CityOfAaron.getCurrentGame().getAcresOwned() + "\n"
                + "Bushels per Acre For Yearly Harvest: " + "\n"
                + "Number of Bushels Paid In Offerings: " + "\n"
                + "Year's Loss to Rats: " + "\n"
                + "Total Bushels of Wheat In Store: " + CityOfAaron.getCurrentGame().getWheatInStorage() + "\n"
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

        AnnualReportView();

        return false;
    }

    private void AnnualReportView() {
        pause(3000);
        /** 
         * This is where we would include some if statement to determine if
         * the game would continue or end depending on yearly performance.
         */ 
        View gameMenu = new GameMenuView();
        gameMenu.displayView();
    }
}

