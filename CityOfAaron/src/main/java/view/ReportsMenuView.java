package view;

import app.CityOfAaron;
import control.StorehouseControl;
import static control.StorehouseControl.provisions;
import exceptions.GameControlException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import model.Animal;
import model.InventoryItem;
import model.Provision;
import view.ErrorView;
import static view.ViewBase.pause;

public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {
        super();
    }

    @Override
    protected String getMessage() {
        return "Select which report you would like to view:\n"
                + "1 - Authors of Game\n"
                + "2 - The Animals in the Storehouse\n"
                + "3 - The Provisions in the Storehouse\n"
                + "4 - The Tools in the Storehouse\n"
                + "5 - Return to the Game Menu\n";

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
                StorehouseControl.animals();
                String animalsFileName = getUserInput("Type in what you would like to name the report file: ", true);
                if (animalsFileName != null || animalsFileName.equals("")) {
                    printAnimalReport(CityOfAaron.getCurrentGame().getTheStorehouse().animals, animalsFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    System.out.println("Saving report as: " + animalsFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    pause(500);
                    System.out.println("Report has been saved!");
                }
                break;
            case "3":
                StorehouseControl.provisions();
                String provisionsFileName = getUserInput("Type in what you would like to name the report file: ", true);
                if (provisionsFileName != null || provisionsFileName.equals("")) {
                    printProvisionReport(CityOfAaron.getCurrentGame().getTheStorehouse().provisions, provisionsFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    System.out.println("Saving report " + provisionsFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    pause(500);
                    System.out.println("Report has been saved");
                }
                break;
            case "4":
                StorehouseControl.tools();
                String toolFileName = getUserInput("Type in what you would like to name the report file: ", true);
                if (toolFileName != null || toolFileName.equals("")) {
                    printToolReport(CityOfAaron.getCurrentGame().getTheStorehouse().tools, toolFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    System.out.println("Saving report as: " + toolFileName.replaceAll("\\s+", "").toLowerCase() + ".txt");
                    System.out.println("Report has been saved!");
                }
                break;
            case "5":
                this.console.println("Back to Game Menu...");
                        
                return false;
            default:
                ErrorView.display(ReportsMenuView.class.getName(),
                        "\n*********************************\n"
                        + "Invalid option chosen, try again.\n"
                        + "*********************************");
                pause(1000);
                return true;
        }

        return true;
    }

    private void authors() {
        this.console.println("Authors coming soon");
    }

    public void printToolReport(InventoryItem[] item, String fileName) {

        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

            // print title and column headings
            out.println("\n\n           Tool Report           ");
            out.printf("%n%-10s%10s%10s", "Tool Name", "Quantity", "Condition");
            out.printf("%n%-10s%10s%10s", "---------", "--------", "---------");

            //print the description, quatity and condition of each tool
            for (InventoryItem inventoryItem : item) {
                out.printf("%n%-10s%10d%10s", inventoryItem.getName(),
                        inventoryItem.getQuantity(),
                        inventoryItem.getCondition());
            }
        } catch (IOException ex) {
            ErrorView.display(ReportsMenuView.class.getName(), ex.getMessage());
        }
    }

    public void printAnimalReport(Animal[] animals, String fileName) {

        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

            // print title and column headings
            out.println("\n\n      Animal Report     ");
            out.printf("%n%-15s%10s", "Animal Name", "Age");
            out.printf("%n%-15s%10s", "-----------", "----");

            //print the name and age of each animal
            for (Animal animal : animals) {
                out.printf("%n%-15s%10d", animal.getType(),
                        animal.getAge());
            }
        } catch (IOException ex) {
            ErrorView.display(ReportsMenuView.class.getName(), ex.getMessage());
        }
    }

    private void printProvisionReport(Provision[] provisions, String fileName) {
        // create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

            // print title and column headings
            out.println("\n\n         Provision Report");
            out.printf("%n%-15s%10s", "Provision Name", "Age");
            out.printf("%n%-15s%10s%", "--------------", "---");

            //print the name and age of each provision
            for (Provision provision : provisions) {
                out.printf("%n%-15s%10d%", provision.getType(),
                        provision.getAge());

            }
        } catch (IOException ex) {
            ErrorView.display(ReportsMenuView.class.getName(), ex.getMessage());
        }
    }

}
