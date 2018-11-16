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

        return "Welcome to the City of Aaron!\n"
                + "You have been granted the power to rule the city. With that\n"
                + "power, however, comes great responsibilty. It is up to you\n"
                + "to buy or sell land. As ruler, you are to care for the needs\n"
                + "of your citizens. You need to determine how much wheat to\n"
                + "plant, set aside to feed said citizens, and to pay an annual\n"
                + "tithe on harvested wheat. If you don't plan appropriately,\n"
                + "and there isn't enough wheat for food, some of your citizens\n"
                + "will starve and die. Too many die and you will be kicked out!\n"
                + "There is also the possibility of rats eating some of the wheat.\n"
                + "Good luck!";

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
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
