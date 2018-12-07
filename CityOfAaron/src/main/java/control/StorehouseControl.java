/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import app.CityOfAaron;
import static control.GameControl.getRandomNumber;
import exceptions.GameControlException;
import model.InventoryItem;
import model.Condition;
import model.Animal;
import model.ItemType;
import static view.ViewBase.pause;

/**
 *
 * @author brobinson
 */
public class StorehouseControl {

    public StorehouseControl() {

    }

    public static InventoryItem[] createTools() {
        // Create InventoryItem object and assign values to it.
        InventoryItem[] tool = new InventoryItem[5];

        tool[0] = new InventoryItem("Shovel ", ItemType.Tools, 10, Condition.GOOD);
        tool[1] = new InventoryItem("Rake ", ItemType.Tools, 6, Condition.GOOD);
        tool[2] = new InventoryItem("Lumber ", ItemType.Tools, 30, Condition.GOOD);
        tool[3] = new InventoryItem("Scythe ", ItemType.Tools, 3, Condition.FAIR);
        tool[4] = new InventoryItem("Hammer ", ItemType.Tools, 4, Condition.FAIR);

        return tool;

    }

    public static InventoryItem[] createProvisions() {
        InventoryItem[] provision = new InventoryItem[7];

        provision[0] = new InventoryItem("bread ", ItemType.Provisions, 10, Condition.GOOD);
        provision[1] = new InventoryItem("meats ", ItemType.Provisions, 30, Condition.GOOD);
        provision[2] = new InventoryItem("milk ", ItemType.Provisions, 10, Condition.GOOD);
        provision[3] = new InventoryItem("water ", ItemType.Provisions, 30, Condition.GOOD);
        provision[4] = new InventoryItem("bedding ", ItemType.Provisions, 20, Condition.GOOD);
        provision[5] = new InventoryItem("tents ", ItemType.Provisions, 8, Condition.FAIR);
        provision[6] = new InventoryItem("clothes ", ItemType.Provisions, 30, Condition.FAIR);

        return provision;
    }

    public static Animal[] createAnimals()
            throws GameControlException {
        Animal[] animal = new Animal[10];

        animal[0] = new Animal("Ox", getRandomNumber(3, 10));
        animal[1] = new Animal("Goat", getRandomNumber(3, 10));
        animal[2] = new Animal("Lamb", getRandomNumber(3, 10));
        animal[3] = new Animal("Dog", getRandomNumber(3, 10));
        animal[4] = new Animal("Chicken", getRandomNumber(3, 10));
        animal[5] = new Animal("Lamb", getRandomNumber(3, 10));
        animal[6] = new Animal("Horse", getRandomNumber(3, 10));
        animal[7] = new Animal("Eagle", getRandomNumber(3, 10));
        animal[8] = new Animal("Cow", getRandomNumber(3, 10));
        animal[9] = new Animal("Fish", getRandomNumber(3, 10));

        return animal;

    }

    public static void animals() {
        Animal[] animals;
        animals = CityOfAaron.getCurrentGame().getTheStorehouse().getAnimals();

        for (int i = 0; i < animals.length - 1; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if ((animals[i].getAge() - animals[j].getAge()) > 0) {
                    Animal temp = animals[i];
                    animals[i] = animals[j];
                    animals[j] = temp;
                }
            }
        }
        System.out.println("The following animals are stored in the Storehouse, sorted by age:");
        for (Animal animal : animals) {
            char vowel = animal.getType().charAt(0);
            String article = "A ";

            if (vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
                article = "An ";
            }

            System.out.println(article + animal.getType() + " at age: " + animal.getAge());
        }
        pause(3000);
    }

    public static void provisions() {

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

    public static void tools() {

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
}
