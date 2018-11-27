package view;

import app.CityOfAaron;
import control.StorehouseControl;
import java.util.Arrays;
import model.InventoryItem;

public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Select which report you would like to view:n\""
                + "1 - Authors of Game\n"
                + "2 - The Animals in the Storehouse\n"
                + "3 - The Provisions in the Storehouse\n"
                + "4 - The Tools in the Storehouse\n"
                + "5 - Return to the Game Menu";

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

        inputs[0] = getUserInput("Type in the number: ");

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
                authors();
                break;
            case "2":
                animals();
                break;
            case "3":
                provisions();
                break;
            case "4":
                tools();
                break;
            case "5":
                System.out.println("Back to Game Menu...");
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

    private void authors() {
        System.out.println("Authors coming soon");
    }

    private void animals() {
        System.out.println("Animals coming soon");
    }

    private void provisions() {
        InventoryItem[] provision = StorehouseControl.createProvisions();

        for (int i = 0; i < provision.length - 1; i++) {
            for (int j = i + 1; j < provision.length; j++) {
                if (provision[i].getName().compareTo(provision[j].getName()) > 0) {
                    InventoryItem temp = provision[i];
                    provision[i] = provision[j];
                    provision[j] = temp;
                }
            }
        }
        for (InventoryItem inventoryItem : provision) {
            System.out.println(inventoryItem);
        }
    }

    private void tools() {
        InventoryItem[] tool = StorehouseControl.createTools();

        for (int i = 0; i < tool.length - 1; i++) {
            for (int j = i + 1; j < tool.length; j++) {
                if (tool[i].getName().compareTo(tool[j].getName()) > 0) {
                    InventoryItem temp = tool[i];
                    tool[i] = tool[j];
                    tool[j] = temp;
                }
            }
        }
        for (InventoryItem inventoryItem : tool) {
            System.out.println(inventoryItem);
        }

    }

    private void saveReport() {
        System.out.println("*** saveReport() called. Coming soon.");
        pause(3000);
    }
}
