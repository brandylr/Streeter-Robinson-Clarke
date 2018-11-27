package view;

public class MoveLocationView extends ViewBase {

    /**
     * Constructor
     */
    public MoveLocationView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Moving to a new location...\n\n";

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
        String[] inputs = new String[2];

        //The following string is printed to the console by the statement 'system.out.println(prompt)'
        // included in the getUserInput method
        inputs[0] = getUserInput("Please enter the row coordiante", true);
        inputs[1] = getUserInput("Please enter the column coordiante", true);

        // repeat for each input you need, putting it in its proper slot in the array.
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

        if ((inputs[0] == null && inputs[1] == null) || (inputs[0].equals("") && inputs[1].equals(""))) {
            System.out.println("No coordiantes entered. Returning to game menu");
            return false;
        }

        int row, column;
        try {
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
        } catch (NumberFormatException exception) {
            System.out.println("Row and Column values must be whole numbers");
            return true; //keep going
        }

        // to interrupt loop of display method
        return true;
    }

}
