package view;

public class StartProgramView extends ViewBase {

    /**
     * Constructor
     */
    public StartProgramView() {
        super();
    }

    @Override
    protected String getMessage() {

        return "-------------------------------------------------------------\n"
                + "-                                                           -\n"
                + "-              Welcome to the City of Aaron!                -\n"
                + "-                                                           -\n"
                + "-------------------------------------------------------------\n\n"
                + "You have been granted the power to rule the city.\n"
                + "With that power, however, comes great responsibilty.\n"
                + "As ruler, you are to care for the needs of your citizens.\n"
                + "You need to determine how much wheat to plant,\n"
                + "set aside to feed said citizens, and to pay an annual\n"
                + "tithe on harvested wheat. It is up to you to buy or sell land.\n"
                + "If you don't plan appropriately, and there isn't enough wheat\n"
                + "for food, some of your citizens will starve and die.\n"
                + "Too many die and you will be kicked out!\n"
                + "There is also the possibility of rats eating some of the wheat.\n"
                + "Good luck!\n";

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

        startMainMenuView();

        return false;
    }

    private void startMainMenuView() {
        // Pause for a time.
        pause(1000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
