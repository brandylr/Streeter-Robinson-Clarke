/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.InventoryItem;
import model.Condition;
import model.Storehouse;
import model.Provision;
import model.Animal;
import model.ItemType;

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
}
